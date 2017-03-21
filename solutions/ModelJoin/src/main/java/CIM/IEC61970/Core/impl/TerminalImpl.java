/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.ControlArea.ControlAreaPackage;
import CIM.IEC61970.ControlArea.TieFlow;

import CIM.IEC61970.Core.ConductingEquipment;
import CIM.IEC61970.Core.ConnectivityNode;
import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.Terminal;

import CIM.IEC61970.Informative.InfAssets.BushingInfo;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm;

import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.Measurement;

import CIM.IEC61970.OperationalLimits.BranchGroupTerminal;
import CIM.IEC61970.OperationalLimits.OperationalLimitSet;
import CIM.IEC61970.OperationalLimits.OperationalLimitsPackage;

import CIM.IEC61970.StateVariables.StateVariablesPackage;
import CIM.IEC61970.StateVariables.SvPowerFlow;

import CIM.IEC61970.Topology.TopologicalNode;
import CIM.IEC61970.Topology.TopologyPackage;

import CIM.IEC61970.Wires.MutualCoupling;
import CIM.IEC61970.Wires.RegulatingControl;
import CIM.IEC61970.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getSvPowerFlow <em>Sv Power Flow</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getHasFirst_MutualCoupling <em>Has First Mutual Coupling</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getTerminalConstraints <em>Terminal Constraints</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getBranchGroupTerminal <em>Branch Group Terminal</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getBushingInfo <em>Bushing Info</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getHasSecond_MutualCoupling <em>Has Second Mutual Coupling</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.TerminalImpl#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminalImpl extends IdentifiedObjectImpl implements Terminal {
	/**
	 * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityNode()
	 * @generated
	 * @ordered
	 */
	protected ConnectivityNode connectivityNode;

	/**
	 * The cached value of the '{@link #getSvPowerFlow() <em>Sv Power Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvPowerFlow()
	 * @generated
	 * @ordered
	 */
	protected SvPowerFlow svPowerFlow;

	/**
	 * The cached value of the '{@link #getHasFirst_MutualCoupling() <em>Has First Mutual Coupling</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFirst_MutualCoupling()
	 * @generated
	 * @ordered
	 */
	protected EList<MutualCoupling> hasFirst_MutualCoupling;

	/**
	 * The cached value of the '{@link #getTerminalConstraints() <em>Terminal Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminalConstraintTerm> terminalConstraints;

	/**
	 * The cached value of the '{@link #getRegulatingControl() <em>Regulating Control</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingControl()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulatingControl> regulatingControl;

	/**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean connected = CONNECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurements;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTieFlow() <em>Tie Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<TieFlow> tieFlow;

	/**
	 * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologicalNode()
	 * @generated
	 * @ordered
	 */
	protected TopologicalNode topologicalNode;

	/**
	 * The cached value of the '{@link #getBranchGroupTerminal() <em>Branch Group Terminal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchGroupTerminal()
	 * @generated
	 * @ordered
	 */
	protected EList<BranchGroupTerminal> branchGroupTerminal;

	/**
	 * The cached value of the '{@link #getBushingInfo() <em>Bushing Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBushingInfo()
	 * @generated
	 * @ordered
	 */
	protected BushingInfo bushingInfo;

	/**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
	protected ConductingEquipment conductingEquipment;

	/**
	 * The cached value of the '{@link #getHasSecond_MutualCoupling() <em>Has Second Mutual Coupling</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSecond_MutualCoupling()
	 * @generated
	 * @ordered
	 */
	protected EList<MutualCoupling> hasSecond_MutualCoupling;

	/**
	 * The cached value of the '{@link #getOperationalLimitSet() <em>Operational Limit Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimitSet()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalLimitSet> operationalLimitSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNode getConnectivityNode() {
		if (connectivityNode != null && connectivityNode.eIsProxy()) {
			InternalEObject oldConnectivityNode = (InternalEObject)connectivityNode;
			connectivityNode = (ConnectivityNode)eResolveProxy(oldConnectivityNode);
			if (connectivityNode != oldConnectivityNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TERMINAL__CONNECTIVITY_NODE, oldConnectivityNode, connectivityNode));
			}
		}
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNode basicGetConnectivityNode() {
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectivityNode(ConnectivityNode newConnectivityNode, NotificationChain msgs) {
		ConnectivityNode oldConnectivityNode = connectivityNode;
		connectivityNode = newConnectivityNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TERMINAL__CONNECTIVITY_NODE, oldConnectivityNode, newConnectivityNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectivityNode(ConnectivityNode newConnectivityNode) {
		if (newConnectivityNode != connectivityNode) {
			NotificationChain msgs = null;
			if (connectivityNode != null)
				msgs = ((InternalEObject)connectivityNode).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs);
			if (newConnectivityNode != null)
				msgs = ((InternalEObject)newConnectivityNode).eInverseAdd(this, CorePackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs);
			msgs = basicSetConnectivityNode(newConnectivityNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TERMINAL__CONNECTIVITY_NODE, newConnectivityNode, newConnectivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvPowerFlow getSvPowerFlow() {
		if (svPowerFlow != null && svPowerFlow.eIsProxy()) {
			InternalEObject oldSvPowerFlow = (InternalEObject)svPowerFlow;
			svPowerFlow = (SvPowerFlow)eResolveProxy(oldSvPowerFlow);
			if (svPowerFlow != oldSvPowerFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TERMINAL__SV_POWER_FLOW, oldSvPowerFlow, svPowerFlow));
			}
		}
		return svPowerFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvPowerFlow basicGetSvPowerFlow() {
		return svPowerFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSvPowerFlow(SvPowerFlow newSvPowerFlow, NotificationChain msgs) {
		SvPowerFlow oldSvPowerFlow = svPowerFlow;
		svPowerFlow = newSvPowerFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TERMINAL__SV_POWER_FLOW, oldSvPowerFlow, newSvPowerFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvPowerFlow(SvPowerFlow newSvPowerFlow) {
		if (newSvPowerFlow != svPowerFlow) {
			NotificationChain msgs = null;
			if (svPowerFlow != null)
				msgs = ((InternalEObject)svPowerFlow).eInverseRemove(this, StateVariablesPackage.SV_POWER_FLOW__TERMINAL, SvPowerFlow.class, msgs);
			if (newSvPowerFlow != null)
				msgs = ((InternalEObject)newSvPowerFlow).eInverseAdd(this, StateVariablesPackage.SV_POWER_FLOW__TERMINAL, SvPowerFlow.class, msgs);
			msgs = basicSetSvPowerFlow(newSvPowerFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TERMINAL__SV_POWER_FLOW, newSvPowerFlow, newSvPowerFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MutualCoupling> getHasFirst_MutualCoupling() {
		if (hasFirst_MutualCoupling == null) {
			hasFirst_MutualCoupling = new EObjectWithInverseResolvingEList<MutualCoupling>(MutualCoupling.class, this, CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING, WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL);
		}
		return hasFirst_MutualCoupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminalConstraintTerm> getTerminalConstraints() {
		if (terminalConstraints == null) {
			terminalConstraints = new EObjectWithInverseResolvingEList<TerminalConstraintTerm>(TerminalConstraintTerm.class, this, CorePackage.TERMINAL__TERMINAL_CONSTRAINTS, MarketOperationsPackage.TERMINAL_CONSTRAINT_TERM__TERMINAL);
		}
		return terminalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegulatingControl> getRegulatingControl() {
		if (regulatingControl == null) {
			regulatingControl = new EObjectWithInverseResolvingEList<RegulatingControl>(RegulatingControl.class, this, CorePackage.TERMINAL__REGULATING_CONTROL, WiresPackage.REGULATING_CONTROL__TERMINAL);
		}
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnected(boolean newConnected) {
		boolean oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TERMINAL__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectWithInverseResolvingEList<Measurement>(Measurement.class, this, CorePackage.TERMINAL__MEASUREMENTS, MeasPackage.MEASUREMENT__TERMINAL);
		}
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		int oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TERMINAL__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TieFlow> getTieFlow() {
		if (tieFlow == null) {
			tieFlow = new EObjectWithInverseResolvingEList<TieFlow>(TieFlow.class, this, CorePackage.TERMINAL__TIE_FLOW, ControlAreaPackage.TIE_FLOW__TERMINAL);
		}
		return tieFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalNode getTopologicalNode() {
		if (topologicalNode != null && topologicalNode.eIsProxy()) {
			InternalEObject oldTopologicalNode = (InternalEObject)topologicalNode;
			topologicalNode = (TopologicalNode)eResolveProxy(oldTopologicalNode);
			if (topologicalNode != oldTopologicalNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TERMINAL__TOPOLOGICAL_NODE, oldTopologicalNode, topologicalNode));
			}
		}
		return topologicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalNode basicGetTopologicalNode() {
		return topologicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologicalNode(TopologicalNode newTopologicalNode, NotificationChain msgs) {
		TopologicalNode oldTopologicalNode = topologicalNode;
		topologicalNode = newTopologicalNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TERMINAL__TOPOLOGICAL_NODE, oldTopologicalNode, newTopologicalNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologicalNode(TopologicalNode newTopologicalNode) {
		if (newTopologicalNode != topologicalNode) {
			NotificationChain msgs = null;
			if (topologicalNode != null)
				msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__TERMINAL, TopologicalNode.class, msgs);
			if (newTopologicalNode != null)
				msgs = ((InternalEObject)newTopologicalNode).eInverseAdd(this, TopologyPackage.TOPOLOGICAL_NODE__TERMINAL, TopologicalNode.class, msgs);
			msgs = basicSetTopologicalNode(newTopologicalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TERMINAL__TOPOLOGICAL_NODE, newTopologicalNode, newTopologicalNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BranchGroupTerminal> getBranchGroupTerminal() {
		if (branchGroupTerminal == null) {
			branchGroupTerminal = new EObjectWithInverseResolvingEList<BranchGroupTerminal>(BranchGroupTerminal.class, this, CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL, OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL);
		}
		return branchGroupTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInfo getBushingInfo() {
		if (bushingInfo != null && bushingInfo.eIsProxy()) {
			InternalEObject oldBushingInfo = (InternalEObject)bushingInfo;
			bushingInfo = (BushingInfo)eResolveProxy(oldBushingInfo);
			if (bushingInfo != oldBushingInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TERMINAL__BUSHING_INFO, oldBushingInfo, bushingInfo));
			}
		}
		return bushingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInfo basicGetBushingInfo() {
		return bushingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBushingInfo(BushingInfo newBushingInfo, NotificationChain msgs) {
		BushingInfo oldBushingInfo = bushingInfo;
		bushingInfo = newBushingInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TERMINAL__BUSHING_INFO, oldBushingInfo, newBushingInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBushingInfo(BushingInfo newBushingInfo) {
		if (newBushingInfo != bushingInfo) {
			NotificationChain msgs = null;
			if (bushingInfo != null)
				msgs = ((InternalEObject)bushingInfo).eInverseRemove(this, InfAssetsPackage.BUSHING_INFO__TERMINAL, BushingInfo.class, msgs);
			if (newBushingInfo != null)
				msgs = ((InternalEObject)newBushingInfo).eInverseAdd(this, InfAssetsPackage.BUSHING_INFO__TERMINAL, BushingInfo.class, msgs);
			msgs = basicSetBushingInfo(newBushingInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TERMINAL__BUSHING_INFO, newBushingInfo, newBushingInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment getConductingEquipment() {
		if (conductingEquipment != null && conductingEquipment.eIsProxy()) {
			InternalEObject oldConductingEquipment = (InternalEObject)conductingEquipment;
			conductingEquipment = (ConductingEquipment)eResolveProxy(oldConductingEquipment);
			if (conductingEquipment != oldConductingEquipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TERMINAL__CONDUCTING_EQUIPMENT, oldConductingEquipment, conductingEquipment));
			}
		}
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment basicGetConductingEquipment() {
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductingEquipment(ConductingEquipment newConductingEquipment, NotificationChain msgs) {
		ConductingEquipment oldConductingEquipment = conductingEquipment;
		conductingEquipment = newConductingEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TERMINAL__CONDUCTING_EQUIPMENT, oldConductingEquipment, newConductingEquipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductingEquipment(ConductingEquipment newConductingEquipment) {
		if (newConductingEquipment != conductingEquipment) {
			NotificationChain msgs = null;
			if (conductingEquipment != null)
				msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs);
			if (newConductingEquipment != null)
				msgs = ((InternalEObject)newConductingEquipment).eInverseAdd(this, CorePackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs);
			msgs = basicSetConductingEquipment(newConductingEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TERMINAL__CONDUCTING_EQUIPMENT, newConductingEquipment, newConductingEquipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MutualCoupling> getHasSecond_MutualCoupling() {
		if (hasSecond_MutualCoupling == null) {
			hasSecond_MutualCoupling = new EObjectWithInverseResolvingEList<MutualCoupling>(MutualCoupling.class, this, CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING, WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL);
		}
		return hasSecond_MutualCoupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalLimitSet> getOperationalLimitSet() {
		if (operationalLimitSet == null) {
			operationalLimitSet = new EObjectWithInverseResolvingEList<OperationalLimitSet>(OperationalLimitSet.class, this, CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__TERMINAL);
		}
		return operationalLimitSet;
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
			case CorePackage.TERMINAL__CONNECTIVITY_NODE:
				if (connectivityNode != null)
					msgs = ((InternalEObject)connectivityNode).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs);
				return basicSetConnectivityNode((ConnectivityNode)otherEnd, msgs);
			case CorePackage.TERMINAL__SV_POWER_FLOW:
				if (svPowerFlow != null)
					msgs = ((InternalEObject)svPowerFlow).eInverseRemove(this, StateVariablesPackage.SV_POWER_FLOW__TERMINAL, SvPowerFlow.class, msgs);
				return basicSetSvPowerFlow((SvPowerFlow)otherEnd, msgs);
			case CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasFirst_MutualCoupling()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__TERMINAL_CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminalConstraints()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__REGULATING_CONTROL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegulatingControl()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__TIE_FLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTieFlow()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__TOPOLOGICAL_NODE:
				if (topologicalNode != null)
					msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__TERMINAL, TopologicalNode.class, msgs);
				return basicSetTopologicalNode((TopologicalNode)otherEnd, msgs);
			case CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBranchGroupTerminal()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__BUSHING_INFO:
				if (bushingInfo != null)
					msgs = ((InternalEObject)bushingInfo).eInverseRemove(this, InfAssetsPackage.BUSHING_INFO__TERMINAL, BushingInfo.class, msgs);
				return basicSetBushingInfo((BushingInfo)otherEnd, msgs);
			case CorePackage.TERMINAL__CONDUCTING_EQUIPMENT:
				if (conductingEquipment != null)
					msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs);
				return basicSetConductingEquipment((ConductingEquipment)otherEnd, msgs);
			case CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasSecond_MutualCoupling()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationalLimitSet()).basicAdd(otherEnd, msgs);
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
			case CorePackage.TERMINAL__CONNECTIVITY_NODE:
				return basicSetConnectivityNode(null, msgs);
			case CorePackage.TERMINAL__SV_POWER_FLOW:
				return basicSetSvPowerFlow(null, msgs);
			case CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
				return ((InternalEList<?>)getHasFirst_MutualCoupling()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__TERMINAL_CONSTRAINTS:
				return ((InternalEList<?>)getTerminalConstraints()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__REGULATING_CONTROL:
				return ((InternalEList<?>)getRegulatingControl()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__TIE_FLOW:
				return ((InternalEList<?>)getTieFlow()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__TOPOLOGICAL_NODE:
				return basicSetTopologicalNode(null, msgs);
			case CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL:
				return ((InternalEList<?>)getBranchGroupTerminal()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__BUSHING_INFO:
				return basicSetBushingInfo(null, msgs);
			case CorePackage.TERMINAL__CONDUCTING_EQUIPMENT:
				return basicSetConductingEquipment(null, msgs);
			case CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
				return ((InternalEList<?>)getHasSecond_MutualCoupling()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET:
				return ((InternalEList<?>)getOperationalLimitSet()).basicRemove(otherEnd, msgs);
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
			case CorePackage.TERMINAL__CONNECTIVITY_NODE:
				if (resolve) return getConnectivityNode();
				return basicGetConnectivityNode();
			case CorePackage.TERMINAL__SV_POWER_FLOW:
				if (resolve) return getSvPowerFlow();
				return basicGetSvPowerFlow();
			case CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
				return getHasFirst_MutualCoupling();
			case CorePackage.TERMINAL__TERMINAL_CONSTRAINTS:
				return getTerminalConstraints();
			case CorePackage.TERMINAL__REGULATING_CONTROL:
				return getRegulatingControl();
			case CorePackage.TERMINAL__CONNECTED:
				return isConnected();
			case CorePackage.TERMINAL__MEASUREMENTS:
				return getMeasurements();
			case CorePackage.TERMINAL__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case CorePackage.TERMINAL__TIE_FLOW:
				return getTieFlow();
			case CorePackage.TERMINAL__TOPOLOGICAL_NODE:
				if (resolve) return getTopologicalNode();
				return basicGetTopologicalNode();
			case CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL:
				return getBranchGroupTerminal();
			case CorePackage.TERMINAL__BUSHING_INFO:
				if (resolve) return getBushingInfo();
				return basicGetBushingInfo();
			case CorePackage.TERMINAL__CONDUCTING_EQUIPMENT:
				if (resolve) return getConductingEquipment();
				return basicGetConductingEquipment();
			case CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
				return getHasSecond_MutualCoupling();
			case CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET:
				return getOperationalLimitSet();
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
			case CorePackage.TERMINAL__CONNECTIVITY_NODE:
				setConnectivityNode((ConnectivityNode)newValue);
				return;
			case CorePackage.TERMINAL__SV_POWER_FLOW:
				setSvPowerFlow((SvPowerFlow)newValue);
				return;
			case CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
				getHasFirst_MutualCoupling().clear();
				getHasFirst_MutualCoupling().addAll((Collection<? extends MutualCoupling>)newValue);
				return;
			case CorePackage.TERMINAL__TERMINAL_CONSTRAINTS:
				getTerminalConstraints().clear();
				getTerminalConstraints().addAll((Collection<? extends TerminalConstraintTerm>)newValue);
				return;
			case CorePackage.TERMINAL__REGULATING_CONTROL:
				getRegulatingControl().clear();
				getRegulatingControl().addAll((Collection<? extends RegulatingControl>)newValue);
				return;
			case CorePackage.TERMINAL__CONNECTED:
				setConnected((Boolean)newValue);
				return;
			case CorePackage.TERMINAL__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case CorePackage.TERMINAL__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case CorePackage.TERMINAL__TIE_FLOW:
				getTieFlow().clear();
				getTieFlow().addAll((Collection<? extends TieFlow>)newValue);
				return;
			case CorePackage.TERMINAL__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)newValue);
				return;
			case CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL:
				getBranchGroupTerminal().clear();
				getBranchGroupTerminal().addAll((Collection<? extends BranchGroupTerminal>)newValue);
				return;
			case CorePackage.TERMINAL__BUSHING_INFO:
				setBushingInfo((BushingInfo)newValue);
				return;
			case CorePackage.TERMINAL__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)newValue);
				return;
			case CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
				getHasSecond_MutualCoupling().clear();
				getHasSecond_MutualCoupling().addAll((Collection<? extends MutualCoupling>)newValue);
				return;
			case CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET:
				getOperationalLimitSet().clear();
				getOperationalLimitSet().addAll((Collection<? extends OperationalLimitSet>)newValue);
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
			case CorePackage.TERMINAL__CONNECTIVITY_NODE:
				setConnectivityNode((ConnectivityNode)null);
				return;
			case CorePackage.TERMINAL__SV_POWER_FLOW:
				setSvPowerFlow((SvPowerFlow)null);
				return;
			case CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
				getHasFirst_MutualCoupling().clear();
				return;
			case CorePackage.TERMINAL__TERMINAL_CONSTRAINTS:
				getTerminalConstraints().clear();
				return;
			case CorePackage.TERMINAL__REGULATING_CONTROL:
				getRegulatingControl().clear();
				return;
			case CorePackage.TERMINAL__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
			case CorePackage.TERMINAL__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case CorePackage.TERMINAL__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case CorePackage.TERMINAL__TIE_FLOW:
				getTieFlow().clear();
				return;
			case CorePackage.TERMINAL__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)null);
				return;
			case CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL:
				getBranchGroupTerminal().clear();
				return;
			case CorePackage.TERMINAL__BUSHING_INFO:
				setBushingInfo((BushingInfo)null);
				return;
			case CorePackage.TERMINAL__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)null);
				return;
			case CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
				getHasSecond_MutualCoupling().clear();
				return;
			case CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET:
				getOperationalLimitSet().clear();
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
			case CorePackage.TERMINAL__CONNECTIVITY_NODE:
				return connectivityNode != null;
			case CorePackage.TERMINAL__SV_POWER_FLOW:
				return svPowerFlow != null;
			case CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
				return hasFirst_MutualCoupling != null && !hasFirst_MutualCoupling.isEmpty();
			case CorePackage.TERMINAL__TERMINAL_CONSTRAINTS:
				return terminalConstraints != null && !terminalConstraints.isEmpty();
			case CorePackage.TERMINAL__REGULATING_CONTROL:
				return regulatingControl != null && !regulatingControl.isEmpty();
			case CorePackage.TERMINAL__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
			case CorePackage.TERMINAL__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case CorePackage.TERMINAL__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case CorePackage.TERMINAL__TIE_FLOW:
				return tieFlow != null && !tieFlow.isEmpty();
			case CorePackage.TERMINAL__TOPOLOGICAL_NODE:
				return topologicalNode != null;
			case CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL:
				return branchGroupTerminal != null && !branchGroupTerminal.isEmpty();
			case CorePackage.TERMINAL__BUSHING_INFO:
				return bushingInfo != null;
			case CorePackage.TERMINAL__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null;
			case CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
				return hasSecond_MutualCoupling != null && !hasSecond_MutualCoupling.isEmpty();
			case CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET:
				return operationalLimitSet != null && !operationalLimitSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (connected: ");
		result.append(connected);
		result.append(", sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(')');
		return result.toString();
	}

} //TerminalImpl
