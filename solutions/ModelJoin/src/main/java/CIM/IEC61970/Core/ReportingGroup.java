/**
 */
package CIM.IEC61970.Core;

import CIM.IEC61970.Topology.BusNameMarker;
import CIM.IEC61970.Topology.TopologicalNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reporting Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.ReportingGroup#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.ReportingGroup#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Core.CorePackage#getReportingGroup()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A reporting group is used for various ad-hoc groupings used for reporting.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A reporting group is used for various ad-hoc groupings used for reporting.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reporting group is used for various ad-hoc groupings used for reporting.' Profile\040documentation='A reporting group is used for various ad-hoc groupings used for reporting.'"
 * @generated
 */
public interface ReportingGroup extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.PowerSystemResource#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getReportingGroup_PowerSystemResource()
	 * @see CIM.IEC61970.Core.PowerSystemResource#getReportingGroup
	 * @model opposite="ReportingGroup"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='PSR\'s which belong to this reporting group.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='PSR\'s which belong to this reporting group.'"
	 * @generated
	 */
	EList<PowerSystemResource> getPowerSystemResource();

	/**
	 * Returns the value of the '<em><b>Bus Name Marker</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Topology.BusNameMarker}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Topology.BusNameMarker#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Name Marker</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Name Marker</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getReportingGroup_BusNameMarker()
	 * @see CIM.IEC61970.Topology.BusNameMarker#getReportingGroup
	 * @model opposite="ReportingGroup"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The BusNameMarkers that belong to this reporting group.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The BusNameMarkers that belong to this reporting group.'"
	 * @generated
	 */
	EList<BusNameMarker> getBusNameMarker();

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Topology.TopologicalNode}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Topology.TopologicalNode#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getReportingGroup_TopologicalNode()
	 * @see CIM.IEC61970.Topology.TopologicalNode#getReportingGroup
	 * @model opposite="ReportingGroup"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The topological nodes that belong to the reporting group.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The topological nodes that belong to the reporting group.'"
	 * @generated
	 */
	EList<TopologicalNode> getTopologicalNode();

	/**
	 * Returns the value of the '<em><b>Reporting Super Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.ReportingSuperGroup#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporting Super Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Super Group</em>' reference.
	 * @see #setReportingSuperGroup(ReportingSuperGroup)
	 * @see CIM.IEC61970.Core.CorePackage#getReportingGroup_ReportingSuperGroup()
	 * @see CIM.IEC61970.Core.ReportingSuperGroup#getReportingGroup
	 * @model opposite="ReportingGroup"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reporting super group to which this reporting group belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reporting super group to which this reporting group belongs.'"
	 * @generated
	 */
	ReportingSuperGroup getReportingSuperGroup();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting Super Group</em>' reference.
	 * @see #getReportingSuperGroup()
	 * @generated
	 */
	void setReportingSuperGroup(ReportingSuperGroup value);

} // ReportingGroup
