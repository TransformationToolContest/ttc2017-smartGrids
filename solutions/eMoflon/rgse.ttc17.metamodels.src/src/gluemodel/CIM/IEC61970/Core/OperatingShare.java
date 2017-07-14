/**
 */
package gluemodel.CIM.IEC61970.Core;

import gluemodel.CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating Share</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.OperatingShare#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.OperatingShare#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.OperatingShare#getOperatingParticipant <em>Operating Participant</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getOperatingShare()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies the contract relationship between a PowerSystemResource and a contract participant.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Specifies the contract relationship between a PowerSystemResource and a contract participant.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the contract relationship between a PowerSystemResource and a contract participant.' Profile\040documentation='Specifies the contract relationship between a PowerSystemResource and a contract participant.'"
 * @generated
 */
public interface OperatingShare extends Element {
	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(float)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getOperatingShare_Percentage()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Percentage ownership for this device.   The percentage indicates the percentage ownership of the PSROwner for the PowerSystemResource.  The total percentage ownership for a PowerSystemResource should add to 100%.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Percentage ownership for this device.   The percentage indicates the percentage ownership of the PSROwner for the PowerSystemResource.  The total percentage ownership for a PowerSystemResource should add to 100%.'"
	 * @generated
	 */
	float getPercentage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.OperatingShare#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(float value);

	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getOperatingShare <em>Operating Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference.
	 * @see #setPowerSystemResource(PowerSystemResource)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getOperatingShare_PowerSystemResource()
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getOperatingShare
	 * @model opposite="OperatingShare"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The PowerSystemResource to which the attribues apply.   The percentage ownership of all owners of a PowerSystemResource should add to 100%.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The PowerSystemResource to which the attribues apply.   The percentage ownership of all owners of a PowerSystemResource should add to 100%.'"
	 * @generated
	 */
	PowerSystemResource getPowerSystemResource();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.OperatingShare#getPowerSystemResource <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power System Resource</em>' reference.
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	void setPowerSystemResource(PowerSystemResource value);

	/**
	 * Returns the value of the '<em><b>Operating Participant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.OperatingParticipant#getOperatingShare <em>Operating Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Participant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Participant</em>' reference.
	 * @see #setOperatingParticipant(OperatingParticipant)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getOperatingShare_OperatingParticipant()
	 * @see gluemodel.CIM.IEC61970.Core.OperatingParticipant#getOperatingShare
	 * @model opposite="OperatingShare"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The linkage to a owners  and its linkage attributes like percentage ownership.   The ownership percentage should add to 100% for all owners of a PowerSystemResource, but a PSROwner may own any percentage of any number of PowerSystemResource objects.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The linkage to a owners  and its linkage attributes like percentage ownership.   The ownership percentage should add to 100% for all owners of a PowerSystemResource, but a PSROwner may own any percentage of any number of PowerSystemResource objects.'"
	 * @generated
	 */
	OperatingParticipant getOperatingParticipant();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.OperatingShare#getOperatingParticipant <em>Operating Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Participant</em>' reference.
	 * @see #getOperatingParticipant()
	 * @generated
	 */
	void setOperatingParticipant(OperatingParticipant value);

} // OperatingShare
