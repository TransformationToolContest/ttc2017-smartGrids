/**
 */
package CIM.IEC61970.Informative.Financial;

import CIM.IEC61970.Informative.EnergyScheduling.HostControlArea;
import CIM.IEC61970.Informative.EnergyScheduling.TieLine;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import CIM.IEC61970.Informative.Reservation.AncillaryService;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Area Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.Financial.ControlAreaOperator#getAncillaryService <em>Ancillary Service</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.ControlAreaOperator#getTieLines <em>Tie Lines</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.Financial.ControlAreaOperator#getControlledBy <em>Controlled By</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getControlAreaOperator()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Operates the Control Area. Approves and implements energy transactions. Verifies both Inter-Control Area and Intra-Control Area transactions for the power system before granting approval (and implementing) the transactions.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Operates the Control Area. Approves and implements energy transactions. Verifies both Inter-Control Area and Intra-Control Area transactions for the power system before granting approval (and implementing) the transactions.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Operates the Control Area. Approves and implements energy transactions. Verifies both Inter-Control Area and Intra-Control Area transactions for the power system before granting approval (and implementing) the transactions.' Profile\040documentation='Operates the Control Area. Approves and implements energy transactions. Verifies both Inter-Control Area and Intra-Control Area transactions for the power system before granting approval (and implementing) the transactions.'"
 * @generated
 */
public interface ControlAreaOperator extends ErpOrganisation {
	/**
	 * Returns the value of the '<em><b>Ancillary Service</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Reservation.AncillaryService}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Reservation.AncillaryService#getControlAreaOperator <em>Control Area Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancillary Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancillary Service</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getControlAreaOperator_AncillaryService()
	 * @see CIM.IEC61970.Informative.Reservation.AncillaryService#getControlAreaOperator
	 * @model opposite="ControlAreaOperator"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Sale of ancillary services provided by ControlAreaOperators.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Sale of ancillary services provided by ControlAreaOperators.'"
	 * @generated
	 */
	EList<AncillaryService> getAncillaryService();

	/**
	 * Returns the value of the '<em><b>Tie Lines</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.TieLine}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getControlAreaOperators <em>Control Area Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Lines</em>' reference list.
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getControlAreaOperator_TieLines()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.TieLine#getControlAreaOperators
	 * @model opposite="ControlAreaOperators"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A ControlAreaOperator has a collection of tie points that ring the ControlArea, called a TieLine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A ControlAreaOperator has a collection of tie points that ring the ControlArea, called a TieLine.'"
	 * @generated
	 */
	EList<TieLine> getTieLines();

	/**
	 * Returns the value of the '<em><b>Controlled By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled By</em>' reference.
	 * @see #setControlledBy(HostControlArea)
	 * @see CIM.IEC61970.Informative.Financial.FinancialPackage#getControlAreaOperator_ControlledBy()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getControls
	 * @model opposite="Controls"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A ControlAreaCompany controls a ControlArea.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A ControlAreaCompany controls a ControlArea.'"
	 * @generated
	 */
	HostControlArea getControlledBy();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.Financial.ControlAreaOperator#getControlledBy <em>Controlled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled By</em>' reference.
	 * @see #getControlledBy()
	 * @generated
	 */
	void setControlledBy(HostControlArea value);

} // ControlAreaOperator
