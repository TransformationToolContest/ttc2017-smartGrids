/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations;

import gluemodel.CIM.IEC61968.Common.ActivityRecord;

import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSR Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PSREvent#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PSREvent#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getPSREvent()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Event recording the change in operational status of a PowerSystemResource.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Event recording the change in operational status of a PowerSystemResource.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Event recording the change in operational status of a PowerSystemResource.' Profile\040documentation='Event recording the change in operational status of a PowerSystemResource.'"
 * @generated
 */
public interface PSREvent extends ActivityRecord {
	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getPSREvent <em>PSR Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference.
	 * @see #setPowerSystemResource(PowerSystemResource)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getPSREvent_PowerSystemResource()
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getPSREvent
	 * @model opposite="PSREvent"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Power system resource that generated this event.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Power system resource that generated this event.'"
	 * @generated
	 */
	PowerSystemResource getPowerSystemResource();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PSREvent#getPowerSystemResource <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power System Resource</em>' reference.
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	void setPowerSystemResource(PowerSystemResource value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfOperations.PSREventKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.PSREventKind
	 * @see #setKind(PSREventKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getPSREvent_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of event.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of event.'"
	 * @generated
	 */
	PSREventKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.PSREvent#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.PSREventKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PSREventKind value);

} // PSREvent
