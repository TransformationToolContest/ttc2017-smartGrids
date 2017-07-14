/**
 */
package gluemodel.CIM.IEC61970.Topology;

import gluemodel.CIM.IEC61970.Core.CorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Topology.TopologyFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An extension to the Core Package that in association with the Terminal class models Connectivity, that is the physical definition of how equipment is connected together. In addition it models Topology, that is the logical definition of how equipment is connected via closed switches. The Topology definition is independent of the other electrical characteristics.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An extension to the Core Package that in association with the Terminal class models Connectivity, that is the physical definition of how equipment is connected together. In addition it models Topology, that is the logical definition of how equipment is connected via closed switches. The Topology definition is independent of the other electrical characteristics.'"
 * @generated
 */
public interface TopologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Topology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Topology";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimTopology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopologyPackage eINSTANCE = gluemodel.CIM.IEC61970.Topology.impl.TopologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl <em>Topological Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl
	 * @see gluemodel.CIM.IEC61970.Topology.impl.TopologyPackageImpl#getTopologicalNode()
	 * @generated
	 */
	int TOPOLOGICAL_NODE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__REPORTING_GROUP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topological Island</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sv Injection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__SV_INJECTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connectivity Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__CONNECTIVITY_NODES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__BASE_VOLTAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sv Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__SV_VOLTAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sv Short Circuit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Angle Ref Topological Island</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Topological Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Topological Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_NODE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Topology.impl.BusNameMarkerImpl <em>Bus Name Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Topology.impl.BusNameMarkerImpl
	 * @see gluemodel.CIM.IEC61970.Topology.impl.TopologyPackageImpl#getBusNameMarker()
	 * @generated
	 */
	int BUS_NAME_MARKER = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NAME_MARKER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NAME_MARKER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NAME_MARKER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NAME_MARKER__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NAME_MARKER__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NAME_MARKER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NAME_MARKER__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NAME_MARKER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NAME_MARKER__REPORTING_GROUP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectivity Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NAME_MARKER__CONNECTIVITY_NODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus Name Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NAME_MARKER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bus Name Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NAME_MARKER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topological Node</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode
	 * @generated
	 */
	EClass getTopologicalNode();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reporting Group</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getReportingGroup()
	 * @see #getTopologicalNode()
	 * @generated
	 */
	EReference getTopologicalNode_ReportingGroup();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topological Island</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getTopologicalIsland()
	 * @see #getTopologicalNode()
	 * @generated
	 */
	EReference getTopologicalNode_TopologicalIsland();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvInjection <em>Sv Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sv Injection</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvInjection()
	 * @see #getTopologicalNode()
	 * @generated
	 */
	EReference getTopologicalNode_SvInjection();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminal</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getTerminal()
	 * @see #getTopologicalNode()
	 * @generated
	 */
	EReference getTopologicalNode_Terminal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectivity Node Container</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getConnectivityNodeContainer()
	 * @see #getTopologicalNode()
	 * @generated
	 */
	EReference getTopologicalNode_ConnectivityNodeContainer();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectivity Nodes</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getConnectivityNodes()
	 * @see #getTopologicalNode()
	 * @generated
	 */
	EReference getTopologicalNode_ConnectivityNodes();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getBaseVoltage()
	 * @see #getTopologicalNode()
	 * @generated
	 */
	EReference getTopologicalNode_BaseVoltage();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sv Voltage</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvVoltage()
	 * @see #getTopologicalNode()
	 * @generated
	 */
	EReference getTopologicalNode_SvVoltage();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvShortCircuit <em>Sv Short Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sv Short Circuit</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getSvShortCircuit()
	 * @see #getTopologicalNode()
	 * @generated
	 */
	EReference getTopologicalNode_SvShortCircuit();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Topology.TopologicalNode#getAngleRef_TopologicalIsland <em>Angle Ref Topological Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Angle Ref Topological Island</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.TopologicalNode#getAngleRef_TopologicalIsland()
	 * @see #getTopologicalNode()
	 * @generated
	 */
	EReference getTopologicalNode_AngleRef_TopologicalIsland();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Topology.BusNameMarker <em>Bus Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Name Marker</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.BusNameMarker
	 * @generated
	 */
	EClass getBusNameMarker();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Topology.BusNameMarker#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reporting Group</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.BusNameMarker#getReportingGroup()
	 * @see #getBusNameMarker()
	 * @generated
	 */
	EReference getBusNameMarker_ReportingGroup();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Topology.BusNameMarker#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectivity Node</em>'.
	 * @see gluemodel.CIM.IEC61970.Topology.BusNameMarker#getConnectivityNode()
	 * @see #getBusNameMarker()
	 * @generated
	 */
	EReference getBusNameMarker_ConnectivityNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TopologyFactory getTopologyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl <em>Topological Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl
		 * @see gluemodel.CIM.IEC61970.Topology.impl.TopologyPackageImpl#getTopologicalNode()
		 * @generated
		 */
		EClass TOPOLOGICAL_NODE = eINSTANCE.getTopologicalNode();

		/**
		 * The meta object literal for the '<em><b>Reporting Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGICAL_NODE__REPORTING_GROUP = eINSTANCE.getTopologicalNode_ReportingGroup();

		/**
		 * The meta object literal for the '<em><b>Topological Island</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND = eINSTANCE.getTopologicalNode_TopologicalIsland();

		/**
		 * The meta object literal for the '<em><b>Sv Injection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGICAL_NODE__SV_INJECTION = eINSTANCE.getTopologicalNode_SvInjection();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGICAL_NODE__TERMINAL = eINSTANCE.getTopologicalNode_Terminal();

		/**
		 * The meta object literal for the '<em><b>Connectivity Node Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER = eINSTANCE.getTopologicalNode_ConnectivityNodeContainer();

		/**
		 * The meta object literal for the '<em><b>Connectivity Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGICAL_NODE__CONNECTIVITY_NODES = eINSTANCE.getTopologicalNode_ConnectivityNodes();

		/**
		 * The meta object literal for the '<em><b>Base Voltage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGICAL_NODE__BASE_VOLTAGE = eINSTANCE.getTopologicalNode_BaseVoltage();

		/**
		 * The meta object literal for the '<em><b>Sv Voltage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGICAL_NODE__SV_VOLTAGE = eINSTANCE.getTopologicalNode_SvVoltage();

		/**
		 * The meta object literal for the '<em><b>Sv Short Circuit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT = eINSTANCE.getTopologicalNode_SvShortCircuit();

		/**
		 * The meta object literal for the '<em><b>Angle Ref Topological Island</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND = eINSTANCE.getTopologicalNode_AngleRef_TopologicalIsland();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Topology.impl.BusNameMarkerImpl <em>Bus Name Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Topology.impl.BusNameMarkerImpl
		 * @see gluemodel.CIM.IEC61970.Topology.impl.TopologyPackageImpl#getBusNameMarker()
		 * @generated
		 */
		EClass BUS_NAME_MARKER = eINSTANCE.getBusNameMarker();

		/**
		 * The meta object literal for the '<em><b>Reporting Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_NAME_MARKER__REPORTING_GROUP = eINSTANCE.getBusNameMarker_ReportingGroup();

		/**
		 * The meta object literal for the '<em><b>Connectivity Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_NAME_MARKER__CONNECTIVITY_NODE = eINSTANCE.getBusNameMarker_ConnectivityNode();

	}

} //TopologyPackage
