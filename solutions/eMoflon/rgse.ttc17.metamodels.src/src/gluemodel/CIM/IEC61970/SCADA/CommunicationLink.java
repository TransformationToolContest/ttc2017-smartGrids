/**
 */
package gluemodel.CIM.IEC61970.SCADA;

import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.SCADA.CommunicationLink#getRemoteUnits <em>Remote Units</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getCommunicationLink()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The connection to remote units is through one or more communication links. Reduntant links may exist. The CommunicationLink class inherit PowerSystemResource. The intention is to allow CommunicationLinks to have Measurements. These Measurements can be used to model link status as operational, out of service, unit failure etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The connection to remote units is through one or more communication links. Reduntant links may exist. The CommunicationLink class inherit PowerSystemResource. The intention is to allow CommunicationLinks to have Measurements. These Measurements can be used to model link status as operational, out of service, unit failure etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The connection to remote units is through one or more communication links. Reduntant links may exist. The CommunicationLink class inherit PowerSystemResource. The intention is to allow CommunicationLinks to have Measurements. These Measurements can be used to model link status as operational, out of service, unit failure etc.' Profile\040documentation='The connection to remote units is through one or more communication links. Reduntant links may exist. The CommunicationLink class inherit PowerSystemResource. The intention is to allow CommunicationLinks to have Measurements. These Measurements can be used to model link status as operational, out of service, unit failure etc.'"
 * @generated
 */
public interface CommunicationLink extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Remote Units</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.SCADA.RemoteUnit}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.SCADA.RemoteUnit#getCommunicationLinks <em>Communication Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Units</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getCommunicationLink_RemoteUnits()
	 * @see gluemodel.CIM.IEC61970.SCADA.RemoteUnit#getCommunicationLinks
	 * @model opposite="CommunicationLinks"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='RTUs may be attached to communication links.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='RTUs may be attached to communication links.'"
	 * @generated
	 */
	EList<RemoteUnit> getRemoteUnits();

} // CommunicationLink
