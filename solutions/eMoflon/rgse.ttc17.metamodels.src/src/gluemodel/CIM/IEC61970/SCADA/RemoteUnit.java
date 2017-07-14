/**
 */
package gluemodel.CIM.IEC61970.SCADA;

import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.SCADA.RemoteUnit#getRemotePoints <em>Remote Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.SCADA.RemoteUnit#getRemoteUnitType <em>Remote Unit Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.SCADA.RemoteUnit#getCommunicationLinks <em>Communication Links</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getRemoteUnit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A remote unit can be a RTU, IED, substation control system, control center etc. The communication with the remote unit can be through various standard protocols (e.g. IEC 61870, IEC 61850) or non standard protocols (e.g. DNP, RP570 etc.). A remote unit contain remote data points that might be telemetered, collected or calculated. The RemoteUnit class inherit PowerSystemResource. The intention is to allow RemotUnits to have Measurements. These Measurements can be used to model unit status as operational, out of service, unit failure etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A remote unit can be a RTU, IED, substation control system, control center etc. The communication with the remote unit can be through various standard protocols (e.g. IEC 61870, IEC 61850) or non standard protocols (e.g. DNP, RP570 etc.). A remote unit contain remote data points that might be telemetered, collected or calculated. The RemoteUnit class inherit PowerSystemResource. The intention is to allow RemotUnits to have Measurements. These Measurements can be used to model unit status as operational, out of service, unit failure etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A remote unit can be a RTU, IED, substation control system, control center etc. The communication with the remote unit can be through various standard protocols (e.g. IEC 61870, IEC 61850) or non standard protocols (e.g. DNP, RP570 etc.). A remote unit contain remote data points that might be telemetered, collected or calculated. The RemoteUnit class inherit PowerSystemResource. The intention is to allow RemotUnits to have Measurements. These Measurements can be used to model unit status as operational, out of service, unit failure etc.' Profile\040documentation='A remote unit can be a RTU, IED, substation control system, control center etc. The communication with the remote unit can be through various standard protocols (e.g. IEC 61870, IEC 61850) or non standard protocols (e.g. DNP, RP570 etc.). A remote unit contain remote data points that might be telemetered, collected or calculated. The RemoteUnit class inherit PowerSystemResource. The intention is to allow RemotUnits to have Measurements. These Measurements can be used to model unit status as operational, out of service, unit failure etc.'"
 * @generated
 */
public interface RemoteUnit extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Remote Points</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.SCADA.RemotePoint}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.SCADA.RemotePoint#getRemoteUnit <em>Remote Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Points</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getRemoteUnit_RemotePoints()
	 * @see gluemodel.CIM.IEC61970.SCADA.RemotePoint#getRemoteUnit
	 * @model opposite="RemoteUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Remote points this Remote unit contains.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Remote points this Remote unit contains.'"
	 * @generated
	 */
	EList<RemotePoint> getRemotePoints();

	/**
	 * Returns the value of the '<em><b>Remote Unit Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.SCADA.RemoteUnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Unit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Unit Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.SCADA.RemoteUnitType
	 * @see #setRemoteUnitType(RemoteUnitType)
	 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getRemoteUnit_RemoteUnitType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of remote unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of remote unit.'"
	 * @generated
	 */
	RemoteUnitType getRemoteUnitType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.SCADA.RemoteUnit#getRemoteUnitType <em>Remote Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Unit Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.SCADA.RemoteUnitType
	 * @see #getRemoteUnitType()
	 * @generated
	 */
	void setRemoteUnitType(RemoteUnitType value);

	/**
	 * Returns the value of the '<em><b>Communication Links</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.SCADA.CommunicationLink}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.SCADA.CommunicationLink#getRemoteUnits <em>Remote Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Links</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getRemoteUnit_CommunicationLinks()
	 * @see gluemodel.CIM.IEC61970.SCADA.CommunicationLink#getRemoteUnits
	 * @model opposite="RemoteUnits"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='RTUs may be attached to communication links.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='RTUs may be attached to communication links.'"
	 * @generated
	 */
	EList<CommunicationLink> getCommunicationLinks();

} // RemoteUnit
