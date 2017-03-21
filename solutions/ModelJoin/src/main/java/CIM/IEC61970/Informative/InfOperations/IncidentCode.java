/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incident Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.IncidentCode#getSubCode <em>Sub Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.IncidentCode#getIncidentRecords <em>Incident Records</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getIncidentCode()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Classification of incident types. Multiple incident codes may apply to a given incident. The primary overall incident cause is recorded in \'IncidentRecord.category\', and the main code in \'name\'.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Classification of incident types. Multiple incident codes may apply to a given incident. The primary overall incident cause is recorded in \'IncidentRecord.category\', and the main code in \'name\'.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Classification of incident types. Multiple incident codes may apply to a given incident. The primary overall incident cause is recorded in \'IncidentRecord.category\', and the main code in \'name\'.' Profile\040documentation='Classification of incident types. Multiple incident codes may apply to a given incident. The primary overall incident cause is recorded in \'IncidentRecord.category\', and the main code in \'name\'.'"
 * @generated
 */
public interface IncidentCode extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Code</em>' attribute.
	 * @see #setSubCode(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getIncidentCode_SubCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Additional level of classification detail (as extension to the main code found in \'name\').'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Additional level of classification detail (as extension to the main code found in \'name\').'"
	 * @generated
	 */
	String getSubCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.IncidentCode#getSubCode <em>Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Code</em>' attribute.
	 * @see #getSubCode()
	 * @generated
	 */
	void setSubCode(String value);

	/**
	 * Returns the value of the '<em><b>Incident Records</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.IncidentRecord}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.IncidentRecord#getIncidentCodes <em>Incident Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incident Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incident Records</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getIncidentCode_IncidentRecords()
	 * @see CIM.IEC61970.Informative.InfOperations.IncidentRecord#getIncidentCodes
	 * @model opposite="IncidentCodes"
	 * @generated
	 */
	EList<IncidentRecord> getIncidentRecords();

} // IncidentCode
