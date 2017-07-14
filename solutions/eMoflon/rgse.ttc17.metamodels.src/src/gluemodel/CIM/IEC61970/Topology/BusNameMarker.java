/**
 */
package gluemodel.CIM.IEC61970.Topology;

import gluemodel.CIM.IEC61970.Core.ConnectivityNode;
import gluemodel.CIM.IEC61970.Core.IdentifiedObject;
import gluemodel.CIM.IEC61970.Core.ReportingGroup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Name Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.BusNameMarker#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.BusNameMarker#getConnectivityNode <em>Connectivity Node</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getBusNameMarker()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used to apply user standard names to topology buses. Typically used for \"bus/branch\" case generation. Associated with one or more ConnectivityNodes that are normally a part of the bus name.    The associated ConnectivityNodes are to be connected by non-retained switches. For a ring bus station configuration, all busbar connectivity nodes in the ring are typically associated.   For a breaker and a half scheme, both busbars would be associated.  For a ring bus, all busbars would be associated.  For a \"straight\" busbar configuration, only the main connectivity node at the busbar would be associated.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Used to apply user standard names to topology buses. Typically used for \"bus/branch\" case generation. Associated with one or more ConnectivityNodes that are normally a part of the bus name.    The associated ConnectivityNodes are to be connected by non-retained switches. For a ring bus station configuration, all busbar connectivity nodes in the ring are typically associated.   For a breaker and a half scheme, both busbars would be associated.  For a ring bus, all busbars would be associated.  For a \"straight\" busbar configuration, only the main connectivity node at the busbar would be associated.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used to apply user standard names to topology buses. Typically used for \"bus/branch\" case generation. Associated with one or more ConnectivityNodes that are normally a part of the bus name.    The associated ConnectivityNodes are to be connected by non-retained switches. For a ring bus station configuration, all busbar connectivity nodes in the ring are typically associated.   For a breaker and a half scheme, both busbars would be associated.  For a ring bus, all busbars would be associated.  For a \"straight\" busbar configuration, only the main connectivity node at the busbar would be associated.' Profile\040documentation='Used to apply user standard names to topology buses. Typically used for \"bus/branch\" case generation. Associated with one or more ConnectivityNodes that are normally a part of the bus name.    The associated ConnectivityNodes are to be connected by non-retained switches. For a ring bus station configuration, all busbar connectivity nodes in the ring are typically associated.   For a breaker and a half scheme, both busbars would be associated.  For a ring bus, all busbars would be associated.  For a \"straight\" busbar configuration, only the main connectivity node at the busbar would be associated.'"
 * @generated
 */
public interface BusNameMarker extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Reporting Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporting Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Group</em>' reference.
	 * @see #setReportingGroup(ReportingGroup)
	 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getBusNameMarker_ReportingGroup()
	 * @see gluemodel.CIM.IEC61970.Core.ReportingGroup#getBusNameMarker
	 * @model opposite="BusNameMarker"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The reporting group to which this BusNameMarker belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The reporting group to which this BusNameMarker belongs.'"
	 * @generated
	 */
	ReportingGroup getReportingGroup();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Topology.BusNameMarker#getReportingGroup <em>Reporting Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting Group</em>' reference.
	 * @see #getReportingGroup()
	 * @generated
	 */
	void setReportingGroup(ReportingGroup value);

	/**
	 * Returns the value of the '<em><b>Connectivity Node</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.ConnectivityNode}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.ConnectivityNode#getBusNameMarker <em>Bus Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Node</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologyPackage#getBusNameMarker_ConnectivityNode()
	 * @see gluemodel.CIM.IEC61970.Core.ConnectivityNode#getBusNameMarker
	 * @model opposite="BusNameMarker"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The list of nodes which have the same bus name in the normal  topology.  Note that this list of ConnectivityNodes should be connected by objects derived from Switch that are normally closed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The list of nodes which have the same bus name in the normal  topology.  Note that this list of ConnectivityNodes should be connected by objects derived from Switch that are normally closed.'"
	 * @generated
	 */
	EList<ConnectivityNode> getConnectivityNode();

} // BusNameMarker
