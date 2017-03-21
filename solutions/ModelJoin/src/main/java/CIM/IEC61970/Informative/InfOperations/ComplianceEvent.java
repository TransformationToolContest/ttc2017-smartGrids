/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61968.Common.ActivityRecord;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compliance Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ComplianceEvent#getComplianceType <em>Compliance Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ComplianceEvent#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getComplianceEvent()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Compliance events are used for reporting regulatory or contract compliance issues and/or variances. These might be created as a consequence of local business processes and associated rules. It is anticipated that this class will be customised extensively to meet local implementation needs.\nUse inherited \'category\' to indicate that, for example, expected performance will not be met or reported as mandated.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Compliance events are used for reporting regulatory or contract compliance issues and/or variances. These might be created as a consequence of local business processes and associated rules. It is anticipated that this class will be customised extensively to meet local implementation needs.\nUse inherited \'category\' to indicate that, for example, expected performance will not be met or reported as mandated.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Compliance events are used for reporting regulatory or contract compliance issues and/or variances. These might be created as a consequence of local business processes and associated rules. It is anticipated that this class will be customised extensively to meet local implementation needs.\nUse inherited \'category\' to indicate that, for example, expected performance will not be met or reported as mandated.' Profile\040documentation='Compliance events are used for reporting regulatory or contract compliance issues and/or variances. These might be created as a consequence of local business processes and associated rules. It is anticipated that this class will be customised extensively to meet local implementation needs.\nUse inherited \'category\' to indicate that, for example, expected performance will not be met or reported as mandated.'"
 * @generated
 */
public interface ComplianceEvent extends ActivityRecord {
	/**
	 * Returns the value of the '<em><b>Compliance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliance Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliance Type</em>' attribute.
	 * @see #setComplianceType(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getComplianceEvent_ComplianceType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of compliance event indicating, for example, types of regulatory and/or contractual compliance events where expected performance will not be met or reported as mandated.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of compliance event indicating, for example, types of regulatory and/or contractual compliance events where expected performance will not be met or reported as mandated.'"
	 * @generated
	 */
	String getComplianceType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ComplianceEvent#getComplianceType <em>Compliance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance Type</em>' attribute.
	 * @see #getComplianceType()
	 * @generated
	 */
	void setComplianceType(String value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(Date)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getComplianceEvent_Deadline()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The deadline for compliance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The deadline for compliance.'"
	 * @generated
	 */
	Date getDeadline();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ComplianceEvent#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(Date value);

} // ComplianceEvent
