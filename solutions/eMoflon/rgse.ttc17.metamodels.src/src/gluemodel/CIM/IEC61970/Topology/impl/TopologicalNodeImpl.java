/**
 */
package gluemodel.CIM.IEC61970.Topology.impl;

import gluemodel.CIM.IEC61970.Core.BaseVoltage;
import gluemodel.CIM.IEC61970.Core.ConnectivityNode;
import gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer;
import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.ReportingGroup;
import gluemodel.CIM.IEC61970.Core.Terminal;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage;
import gluemodel.CIM.IEC61970.StateVariables.SvInjection;
import gluemodel.CIM.IEC61970.StateVariables.SvShortCircuit;
import gluemodel.CIM.IEC61970.StateVariables.SvVoltage;
import gluemodel.CIM.IEC61970.StateVariables.TopologicalIsland;

import gluemodel.CIM.IEC61970.Topology.TopologicalNode;
import gluemodel.CIM.IEC61970.Topology.TopologyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topological Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl#getTopologicalIsland <em>Topological Island</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl#getSvInjection <em>Sv Injection</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl#getSvVoltage <em>Sv Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl#getSvShortCircuit <em>Sv Short Circuit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Topology.impl.TopologicalNodeImpl#getAngleRef_TopologicalIsland <em>Angle Ref Topological Island</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologicalNodeImpl extends IdentifiedObjectImpl implements TopologicalNode {
	/**
	 * The cached value of the '{@link #getReportingGroup() <em>Reporting Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingGroup()
	 * @generated
	 * @ordered
	 */
	protected ReportingGroup reportingGroup;

	/**
	 * The cached value of the '{@link #getTopologicalIsland() <em>Topological Island</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologicalIsland()
	 * @generated
	 * @ordered
	 */
	protected TopologicalIsland topologicalIsland;

	/**
	 * The cached value of the '{@link #getSvInjection() <em>Sv Injection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvInjection()
	 * @generated
	 * @ordered
	 */
	protected SvInjection svInjection;

	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected EList<Terminal> terminal;

	/**
	 * The cached value of the '{@link #getConnectivityNodeContainer() <em>Connectivity Node Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityNodeContainer()
	 * @generated
	 * @ordered
	 */
	protected ConnectivityNodeContainer connectivityNodeContainer;

	/**
	 * The cached value of the '{@link #getConnectivityNodes() <em>Connectivity Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectivityNode> connectivityNodes;

	/**
	 * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseVoltage()
	 * @generated
	 * @ordered
	 */
	protected BaseVoltage baseVoltage;

	/**
	 * The cached value of the '{@link #getSvVoltage() <em>Sv Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvVoltage()
	 * @generated
	 * @ordered
	 */
	protected SvVoltage svVoltage;

	/**
	 * The cached value of the '{@link #getSvShortCircuit() <em>Sv Short Circuit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvShortCircuit()
	 * @generated
	 * @ordered
	 */
	protected SvShortCircuit svShortCircuit;

	/**
	 * The cached value of the '{@link #getAngleRef_TopologicalIsland() <em>Angle Ref Topological Island</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleRef_TopologicalIsland()
	 * @generated
	 * @ordered
	 */
	protected TopologicalIsland angleRef_TopologicalIsland;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologicalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.TOPOLOGICAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingGroup getReportingGroup() {
		if (reportingGroup != null && reportingGroup.eIsProxy()) {
			InternalEObject oldReportingGroup = (InternalEObject)reportingGroup;
			reportingGroup = (ReportingGroup)eResolveProxy(oldReportingGroup);
			if (reportingGroup != oldReportingGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyPackage.TOPOLOGICAL_NODE__REPORTING_GROUP, oldReportingGroup, reportingGroup));
			}
		}
		return reportingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingGroup basicGetReportingGroup() {
		return reportingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportingGroup(ReportingGroup newReportingGroup, NotificationChain msgs) {
		ReportingGroup oldReportingGroup = reportingGroup;
		reportingGroup = newReportingGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__REPORTING_GROUP, oldReportingGroup, newReportingGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportingGroup(ReportingGroup newReportingGroup) {
		if (newReportingGroup != reportingGroup) {
			NotificationChain msgs = null;
			if (reportingGroup != null)
				msgs = ((InternalEObject)reportingGroup).eInverseRemove(this, CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE, ReportingGroup.class, msgs);
			if (newReportingGroup != null)
				msgs = ((InternalEObject)newReportingGroup).eInverseAdd(this, CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE, ReportingGroup.class, msgs);
			msgs = basicSetReportingGroup(newReportingGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__REPORTING_GROUP, newReportingGroup, newReportingGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalIsland getTopologicalIsland() {
		if (topologicalIsland != null && topologicalIsland.eIsProxy()) {
			InternalEObject oldTopologicalIsland = (InternalEObject)topologicalIsland;
			topologicalIsland = (TopologicalIsland)eResolveProxy(oldTopologicalIsland);
			if (topologicalIsland != oldTopologicalIsland) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND, oldTopologicalIsland, topologicalIsland));
			}
		}
		return topologicalIsland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalIsland basicGetTopologicalIsland() {
		return topologicalIsland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologicalIsland(TopologicalIsland newTopologicalIsland, NotificationChain msgs) {
		TopologicalIsland oldTopologicalIsland = topologicalIsland;
		topologicalIsland = newTopologicalIsland;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND, oldTopologicalIsland, newTopologicalIsland);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologicalIsland(TopologicalIsland newTopologicalIsland) {
		if (newTopologicalIsland != topologicalIsland) {
			NotificationChain msgs = null;
			if (topologicalIsland != null)
				msgs = ((InternalEObject)topologicalIsland).eInverseRemove(this, StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES, TopologicalIsland.class, msgs);
			if (newTopologicalIsland != null)
				msgs = ((InternalEObject)newTopologicalIsland).eInverseAdd(this, StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES, TopologicalIsland.class, msgs);
			msgs = basicSetTopologicalIsland(newTopologicalIsland, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND, newTopologicalIsland, newTopologicalIsland));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvInjection getSvInjection() {
		if (svInjection != null && svInjection.eIsProxy()) {
			InternalEObject oldSvInjection = (InternalEObject)svInjection;
			svInjection = (SvInjection)eResolveProxy(oldSvInjection);
			if (svInjection != oldSvInjection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION, oldSvInjection, svInjection));
			}
		}
		return svInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvInjection basicGetSvInjection() {
		return svInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSvInjection(SvInjection newSvInjection, NotificationChain msgs) {
		SvInjection oldSvInjection = svInjection;
		svInjection = newSvInjection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION, oldSvInjection, newSvInjection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvInjection(SvInjection newSvInjection) {
		if (newSvInjection != svInjection) {
			NotificationChain msgs = null;
			if (svInjection != null)
				msgs = ((InternalEObject)svInjection).eInverseRemove(this, StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE, SvInjection.class, msgs);
			if (newSvInjection != null)
				msgs = ((InternalEObject)newSvInjection).eInverseAdd(this, StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE, SvInjection.class, msgs);
			msgs = basicSetSvInjection(newSvInjection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION, newSvInjection, newSvInjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Terminal> getTerminal() {
		if (terminal == null) {
			terminal = new EObjectWithInverseResolvingEList<Terminal>(Terminal.class, this, TopologyPackage.TOPOLOGICAL_NODE__TERMINAL, CorePackage.TERMINAL__TOPOLOGICAL_NODE);
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNodeContainer getConnectivityNodeContainer() {
		if (connectivityNodeContainer != null && connectivityNodeContainer.eIsProxy()) {
			InternalEObject oldConnectivityNodeContainer = (InternalEObject)connectivityNodeContainer;
			connectivityNodeContainer = (ConnectivityNodeContainer)eResolveProxy(oldConnectivityNodeContainer);
			if (connectivityNodeContainer != oldConnectivityNodeContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER, oldConnectivityNodeContainer, connectivityNodeContainer));
			}
		}
		return connectivityNodeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNodeContainer basicGetConnectivityNodeContainer() {
		return connectivityNodeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectivityNodeContainer(ConnectivityNodeContainer newConnectivityNodeContainer, NotificationChain msgs) {
		ConnectivityNodeContainer oldConnectivityNodeContainer = connectivityNodeContainer;
		connectivityNodeContainer = newConnectivityNodeContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER, oldConnectivityNodeContainer, newConnectivityNodeContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectivityNodeContainer(ConnectivityNodeContainer newConnectivityNodeContainer) {
		if (newConnectivityNodeContainer != connectivityNodeContainer) {
			NotificationChain msgs = null;
			if (connectivityNodeContainer != null)
				msgs = ((InternalEObject)connectivityNodeContainer).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE, ConnectivityNodeContainer.class, msgs);
			if (newConnectivityNodeContainer != null)
				msgs = ((InternalEObject)newConnectivityNodeContainer).eInverseAdd(this, CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE, ConnectivityNodeContainer.class, msgs);
			msgs = basicSetConnectivityNodeContainer(newConnectivityNodeContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER, newConnectivityNodeContainer, newConnectivityNodeContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectivityNode> getConnectivityNodes() {
		if (connectivityNodes == null) {
			connectivityNodes = new EObjectWithInverseResolvingEList<ConnectivityNode>(ConnectivityNode.class, this, TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE);
		}
		return connectivityNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage getBaseVoltage() {
		if (baseVoltage != null && baseVoltage.eIsProxy()) {
			InternalEObject oldBaseVoltage = (InternalEObject)baseVoltage;
			baseVoltage = (BaseVoltage)eResolveProxy(oldBaseVoltage);
			if (baseVoltage != oldBaseVoltage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE, oldBaseVoltage, baseVoltage));
			}
		}
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage basicGetBaseVoltage() {
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseVoltage(BaseVoltage newBaseVoltage, NotificationChain msgs) {
		BaseVoltage oldBaseVoltage = baseVoltage;
		baseVoltage = newBaseVoltage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseVoltage(BaseVoltage newBaseVoltage) {
		if (newBaseVoltage != baseVoltage) {
			NotificationChain msgs = null;
			if (baseVoltage != null)
				msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE, BaseVoltage.class, msgs);
			if (newBaseVoltage != null)
				msgs = ((InternalEObject)newBaseVoltage).eInverseAdd(this, CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE, BaseVoltage.class, msgs);
			msgs = basicSetBaseVoltage(newBaseVoltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE, newBaseVoltage, newBaseVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvVoltage getSvVoltage() {
		if (svVoltage != null && svVoltage.eIsProxy()) {
			InternalEObject oldSvVoltage = (InternalEObject)svVoltage;
			svVoltage = (SvVoltage)eResolveProxy(oldSvVoltage);
			if (svVoltage != oldSvVoltage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, oldSvVoltage, svVoltage));
			}
		}
		return svVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvVoltage basicGetSvVoltage() {
		return svVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSvVoltage(SvVoltage newSvVoltage, NotificationChain msgs) {
		SvVoltage oldSvVoltage = svVoltage;
		svVoltage = newSvVoltage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, oldSvVoltage, newSvVoltage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvVoltage(SvVoltage newSvVoltage) {
		if (newSvVoltage != svVoltage) {
			NotificationChain msgs = null;
			if (svVoltage != null)
				msgs = ((InternalEObject)svVoltage).eInverseRemove(this, StateVariablesPackage.SV_VOLTAGE__TOPOLOGICAL_NODE, SvVoltage.class, msgs);
			if (newSvVoltage != null)
				msgs = ((InternalEObject)newSvVoltage).eInverseAdd(this, StateVariablesPackage.SV_VOLTAGE__TOPOLOGICAL_NODE, SvVoltage.class, msgs);
			msgs = basicSetSvVoltage(newSvVoltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, newSvVoltage, newSvVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvShortCircuit getSvShortCircuit() {
		if (svShortCircuit != null && svShortCircuit.eIsProxy()) {
			InternalEObject oldSvShortCircuit = (InternalEObject)svShortCircuit;
			svShortCircuit = (SvShortCircuit)eResolveProxy(oldSvShortCircuit);
			if (svShortCircuit != oldSvShortCircuit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT, oldSvShortCircuit, svShortCircuit));
			}
		}
		return svShortCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvShortCircuit basicGetSvShortCircuit() {
		return svShortCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSvShortCircuit(SvShortCircuit newSvShortCircuit, NotificationChain msgs) {
		SvShortCircuit oldSvShortCircuit = svShortCircuit;
		svShortCircuit = newSvShortCircuit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT, oldSvShortCircuit, newSvShortCircuit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvShortCircuit(SvShortCircuit newSvShortCircuit) {
		if (newSvShortCircuit != svShortCircuit) {
			NotificationChain msgs = null;
			if (svShortCircuit != null)
				msgs = ((InternalEObject)svShortCircuit).eInverseRemove(this, StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE, SvShortCircuit.class, msgs);
			if (newSvShortCircuit != null)
				msgs = ((InternalEObject)newSvShortCircuit).eInverseAdd(this, StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE, SvShortCircuit.class, msgs);
			msgs = basicSetSvShortCircuit(newSvShortCircuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT, newSvShortCircuit, newSvShortCircuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalIsland getAngleRef_TopologicalIsland() {
		if (angleRef_TopologicalIsland != null && angleRef_TopologicalIsland.eIsProxy()) {
			InternalEObject oldAngleRef_TopologicalIsland = (InternalEObject)angleRef_TopologicalIsland;
			angleRef_TopologicalIsland = (TopologicalIsland)eResolveProxy(oldAngleRef_TopologicalIsland);
			if (angleRef_TopologicalIsland != oldAngleRef_TopologicalIsland) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, oldAngleRef_TopologicalIsland, angleRef_TopologicalIsland));
			}
		}
		return angleRef_TopologicalIsland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalIsland basicGetAngleRef_TopologicalIsland() {
		return angleRef_TopologicalIsland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleRef_TopologicalIsland(TopologicalIsland newAngleRef_TopologicalIsland, NotificationChain msgs) {
		TopologicalIsland oldAngleRef_TopologicalIsland = angleRef_TopologicalIsland;
		angleRef_TopologicalIsland = newAngleRef_TopologicalIsland;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, oldAngleRef_TopologicalIsland, newAngleRef_TopologicalIsland);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleRef_TopologicalIsland(TopologicalIsland newAngleRef_TopologicalIsland) {
		if (newAngleRef_TopologicalIsland != angleRef_TopologicalIsland) {
			NotificationChain msgs = null;
			if (angleRef_TopologicalIsland != null)
				msgs = ((InternalEObject)angleRef_TopologicalIsland).eInverseRemove(this, StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, TopologicalIsland.class, msgs);
			if (newAngleRef_TopologicalIsland != null)
				msgs = ((InternalEObject)newAngleRef_TopologicalIsland).eInverseAdd(this, StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, TopologicalIsland.class, msgs);
			msgs = basicSetAngleRef_TopologicalIsland(newAngleRef_TopologicalIsland, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, newAngleRef_TopologicalIsland, newAngleRef_TopologicalIsland));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
				if (reportingGroup != null)
					msgs = ((InternalEObject)reportingGroup).eInverseRemove(this, CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE, ReportingGroup.class, msgs);
				return basicSetReportingGroup((ReportingGroup)otherEnd, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
				if (topologicalIsland != null)
					msgs = ((InternalEObject)topologicalIsland).eInverseRemove(this, StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES, TopologicalIsland.class, msgs);
				return basicSetTopologicalIsland((TopologicalIsland)otherEnd, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION:
				if (svInjection != null)
					msgs = ((InternalEObject)svInjection).eInverseRemove(this, StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE, SvInjection.class, msgs);
				return basicSetSvInjection((SvInjection)otherEnd, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__TERMINAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminal()).basicAdd(otherEnd, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
				if (connectivityNodeContainer != null)
					msgs = ((InternalEObject)connectivityNodeContainer).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE, ConnectivityNodeContainer.class, msgs);
				return basicSetConnectivityNodeContainer((ConnectivityNodeContainer)otherEnd, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectivityNodes()).basicAdd(otherEnd, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
				if (baseVoltage != null)
					msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE, BaseVoltage.class, msgs);
				return basicSetBaseVoltage((BaseVoltage)otherEnd, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
				if (svVoltage != null)
					msgs = ((InternalEObject)svVoltage).eInverseRemove(this, StateVariablesPackage.SV_VOLTAGE__TOPOLOGICAL_NODE, SvVoltage.class, msgs);
				return basicSetSvVoltage((SvVoltage)otherEnd, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT:
				if (svShortCircuit != null)
					msgs = ((InternalEObject)svShortCircuit).eInverseRemove(this, StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE, SvShortCircuit.class, msgs);
				return basicSetSvShortCircuit((SvShortCircuit)otherEnd, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
				if (angleRef_TopologicalIsland != null)
					msgs = ((InternalEObject)angleRef_TopologicalIsland).eInverseRemove(this, StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, TopologicalIsland.class, msgs);
				return basicSetAngleRef_TopologicalIsland((TopologicalIsland)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
				return basicSetReportingGroup(null, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
				return basicSetTopologicalIsland(null, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION:
				return basicSetSvInjection(null, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__TERMINAL:
				return ((InternalEList<?>)getTerminal()).basicRemove(otherEnd, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
				return basicSetConnectivityNodeContainer(null, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
				return ((InternalEList<?>)getConnectivityNodes()).basicRemove(otherEnd, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
				return basicSetBaseVoltage(null, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
				return basicSetSvVoltage(null, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT:
				return basicSetSvShortCircuit(null, msgs);
			case TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
				return basicSetAngleRef_TopologicalIsland(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
				if (resolve) return getReportingGroup();
				return basicGetReportingGroup();
			case TopologyPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
				if (resolve) return getTopologicalIsland();
				return basicGetTopologicalIsland();
			case TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION:
				if (resolve) return getSvInjection();
				return basicGetSvInjection();
			case TopologyPackage.TOPOLOGICAL_NODE__TERMINAL:
				return getTerminal();
			case TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
				if (resolve) return getConnectivityNodeContainer();
				return basicGetConnectivityNodeContainer();
			case TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
				return getConnectivityNodes();
			case TopologyPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
				if (resolve) return getBaseVoltage();
				return basicGetBaseVoltage();
			case TopologyPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
				if (resolve) return getSvVoltage();
				return basicGetSvVoltage();
			case TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT:
				if (resolve) return getSvShortCircuit();
				return basicGetSvShortCircuit();
			case TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
				if (resolve) return getAngleRef_TopologicalIsland();
				return basicGetAngleRef_TopologicalIsland();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TopologyPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
				setReportingGroup((ReportingGroup)newValue);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
				setTopologicalIsland((TopologicalIsland)newValue);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION:
				setSvInjection((SvInjection)newValue);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__TERMINAL:
				getTerminal().clear();
				getTerminal().addAll((Collection<? extends Terminal>)newValue);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
				setConnectivityNodeContainer((ConnectivityNodeContainer)newValue);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
				getConnectivityNodes().clear();
				getConnectivityNodes().addAll((Collection<? extends ConnectivityNode>)newValue);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)newValue);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
				setSvVoltage((SvVoltage)newValue);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT:
				setSvShortCircuit((SvShortCircuit)newValue);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
				setAngleRef_TopologicalIsland((TopologicalIsland)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TopologyPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
				setReportingGroup((ReportingGroup)null);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
				setTopologicalIsland((TopologicalIsland)null);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION:
				setSvInjection((SvInjection)null);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__TERMINAL:
				getTerminal().clear();
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
				setConnectivityNodeContainer((ConnectivityNodeContainer)null);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
				getConnectivityNodes().clear();
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)null);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
				setSvVoltage((SvVoltage)null);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT:
				setSvShortCircuit((SvShortCircuit)null);
				return;
			case TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
				setAngleRef_TopologicalIsland((TopologicalIsland)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TopologyPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
				return reportingGroup != null;
			case TopologyPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
				return topologicalIsland != null;
			case TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION:
				return svInjection != null;
			case TopologyPackage.TOPOLOGICAL_NODE__TERMINAL:
				return terminal != null && !terminal.isEmpty();
			case TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
				return connectivityNodeContainer != null;
			case TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
				return connectivityNodes != null && !connectivityNodes.isEmpty();
			case TopologyPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
				return baseVoltage != null;
			case TopologyPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
				return svVoltage != null;
			case TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT:
				return svShortCircuit != null;
			case TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
				return angleRef_TopologicalIsland != null;
		}
		return super.eIsSet(featureID);
	}

} //TopologicalNodeImpl
