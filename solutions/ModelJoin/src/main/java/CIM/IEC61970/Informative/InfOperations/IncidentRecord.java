/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61968.Common.DateTimeInterval;
import CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incident Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.IncidentRecord#getIncidentCodes <em>Incident Codes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.IncidentRecord#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.IncidentRecord#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getIncidentRecord()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Document describing the incident reported in a TroubleTicket. If the incident has to do with an outage, this will be associated with an OutageRecord. Primary cause of the incident is captured in \'category\'.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Document describing the incident reported in a TroubleTicket. If the incident has to do with an outage, this will be associated with an OutageRecord. Primary cause of the incident is captured in \'category\'.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Document describing the incident reported in a TroubleTicket. If the incident has to do with an outage, this will be associated with an OutageRecord. Primary cause of the incident is captured in \'category\'.' Profile\040documentation='Document describing the incident reported in a TroubleTicket. If the incident has to do with an outage, this will be associated with an OutageRecord. Primary cause of the incident is captured in \'category\'.'"
 * @generated
 */
public interface IncidentRecord extends Document {
	/**
	 * Returns the value of the '<em><b>Incident Codes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.IncidentCode}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.IncidentCode#getIncidentRecords <em>Incident Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incident Codes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incident Codes</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getIncidentRecord_IncidentCodes()
	 * @see CIM.IEC61970.Informative.InfOperations.IncidentCode#getIncidentRecords
	 * @model opposite="IncidentRecords"
	 * @generated
	 */
	EList<IncidentCode> getIncidentCodes();

	/**
	 * Returns the value of the '<em><b>Trouble Tickets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.TroubleTicket}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.TroubleTicket#getIncidentRecord <em>Incident Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trouble Tickets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trouble Tickets</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getIncidentRecord_TroubleTickets()
	 * @see CIM.IEC61970.Informative.InfOperations.TroubleTicket#getIncidentRecord
	 * @model opposite="IncidentRecord"
	 * @generated
	 */
	EList<TroubleTicket> getTroubleTickets();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' reference.
	 * @see #setPeriod(DateTimeInterval)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getIncidentRecord_Period()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Period between the first customer impacted by the incident and the incident resolution for all customers impacted.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Period between the first customer impacted by the incident and the incident resolution for all customers impacted.'"
	 * @generated
	 */
	DateTimeInterval getPeriod();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.IncidentRecord#getPeriod <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(DateTimeInterval value);

} // IncidentRecord
