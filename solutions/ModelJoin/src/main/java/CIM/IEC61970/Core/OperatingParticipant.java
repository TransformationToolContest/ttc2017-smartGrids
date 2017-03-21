/**
 */
package CIM.IEC61970.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.OperatingParticipant#getOperatingShare <em>Operating Share</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Core.CorePackage#getOperatingParticipant()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An operator of multiple PowerSystemResource objects. Note multple OperatingParticipants may operate the same PowerSystemResource object.   This can be used for modeling jointly owned units where each owner operates as a contractual share.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An operator of multiple PowerSystemResource objects. Note multple OperatingParticipants may operate the same PowerSystemResource object.   This can be used for modeling jointly owned units where each owner operates as a contractual share.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An operator of multiple PowerSystemResource objects. Note multple OperatingParticipants may operate the same PowerSystemResource object.   This can be used for modeling jointly owned units where each owner operates as a contractual share.' Profile\040documentation='An operator of multiple PowerSystemResource objects. Note multple OperatingParticipants may operate the same PowerSystemResource object.   This can be used for modeling jointly owned units where each owner operates as a contractual share.'"
 * @generated
 */
public interface OperatingParticipant extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Operating Share</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.OperatingShare}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.OperatingShare#getOperatingParticipant <em>Operating Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Share</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Share</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getOperatingParticipant_OperatingShare()
	 * @see CIM.IEC61970.Core.OperatingShare#getOperatingParticipant
	 * @model opposite="OperatingParticipant"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The operating shares of an operating participant.   An operating participant can be reused for any number of PSR\'s.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The operating shares of an operating participant.   An operating participant can be reused for any number of PSR\'s.'"
	 * @generated
	 */
	EList<OperatingShare> getOperatingShare();

} // OperatingParticipant
