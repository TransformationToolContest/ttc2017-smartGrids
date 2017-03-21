/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.Core.ConnectivityNode;
import CIM.IEC61970.Core.ConnectivityNodeContainer;
import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.Terminal;

import CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm;
import CIM.IEC61970.Informative.MarketOperations.Pnode;

import CIM.IEC61970.Topology.BusNameMarker;
import CIM.IEC61970.Topology.TopologicalNode;
import CIM.IEC61970.Topology.TopologyPackage;

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
 * An implementation of the model object '<em><b>Connectivity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.impl.ConnectivityNodeImpl#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConnectivityNodeImpl#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConnectivityNodeImpl#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConnectivityNodeImpl#getLossPenaltyFactors <em>Loss Penalty Factors</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConnectivityNodeImpl#getNodeConstraintTerms <em>Node Constraint Terms</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConnectivityNodeImpl#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConnectivityNodeImpl#getPnode <em>Pnode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectivityNodeImpl extends IdentifiedObjectImpl implements ConnectivityNode {
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
	 * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologicalNode()
	 * @generated
	 * @ordered
	 */
	protected TopologicalNode topologicalNode;

	/**
	 * The cached value of the '{@link #getBusNameMarker() <em>Bus Name Marker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusNameMarker()
	 * @generated
	 * @ordered
	 */
	protected BusNameMarker busNameMarker;

	/**
	 * The cached value of the '{@link #getLossPenaltyFactors() <em>Loss Penalty Factors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossPenaltyFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<LossPenaltyFactor> lossPenaltyFactors;

	/**
	 * The cached value of the '{@link #getNodeConstraintTerms() <em>Node Constraint Terms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeConstraintTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeConstraintTerm> nodeConstraintTerms;

	/**
	 * The cached value of the '{@link #getTerminals() <em>Terminals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminals()
	 * @generated
	 * @ordered
	 */
	protected EList<Terminal> terminals;

	/**
	 * The cached value of the '{@link #getPnode() <em>Pnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPnode()
	 * @generated
	 * @ordered
	 */
	protected Pnode pnode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONNECTIVITY_NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER, oldConnectivityNodeContainer, connectivityNodeContainer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER, oldConnectivityNodeContainer, newConnectivityNodeContainer);
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
				msgs = ((InternalEObject)connectivityNodeContainer).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class, msgs);
			if (newConnectivityNodeContainer != null)
				msgs = ((InternalEObject)newConnectivityNodeContainer).eInverseAdd(this, CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class, msgs);
			msgs = basicSetConnectivityNodeContainer(newConnectivityNodeContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER, newConnectivityNodeContainer, newConnectivityNodeContainer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE, oldTopologicalNode, topologicalNode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE, oldTopologicalNode, newTopologicalNode);
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
				msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs);
			if (newTopologicalNode != null)
				msgs = ((InternalEObject)newTopologicalNode).eInverseAdd(this, TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs);
			msgs = basicSetTopologicalNode(newTopologicalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE, newTopologicalNode, newTopologicalNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusNameMarker getBusNameMarker() {
		if (busNameMarker != null && busNameMarker.eIsProxy()) {
			InternalEObject oldBusNameMarker = (InternalEObject)busNameMarker;
			busNameMarker = (BusNameMarker)eResolveProxy(oldBusNameMarker);
			if (busNameMarker != oldBusNameMarker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CONNECTIVITY_NODE__BUS_NAME_MARKER, oldBusNameMarker, busNameMarker));
			}
		}
		return busNameMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusNameMarker basicGetBusNameMarker() {
		return busNameMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusNameMarker(BusNameMarker newBusNameMarker, NotificationChain msgs) {
		BusNameMarker oldBusNameMarker = busNameMarker;
		busNameMarker = newBusNameMarker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTIVITY_NODE__BUS_NAME_MARKER, oldBusNameMarker, newBusNameMarker);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusNameMarker(BusNameMarker newBusNameMarker) {
		if (newBusNameMarker != busNameMarker) {
			NotificationChain msgs = null;
			if (busNameMarker != null)
				msgs = ((InternalEObject)busNameMarker).eInverseRemove(this, TopologyPackage.BUS_NAME_MARKER__CONNECTIVITY_NODE, BusNameMarker.class, msgs);
			if (newBusNameMarker != null)
				msgs = ((InternalEObject)newBusNameMarker).eInverseAdd(this, TopologyPackage.BUS_NAME_MARKER__CONNECTIVITY_NODE, BusNameMarker.class, msgs);
			msgs = basicSetBusNameMarker(newBusNameMarker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTIVITY_NODE__BUS_NAME_MARKER, newBusNameMarker, newBusNameMarker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LossPenaltyFactor> getLossPenaltyFactors() {
		if (lossPenaltyFactors == null) {
			lossPenaltyFactors = new EObjectWithInverseResolvingEList.ManyInverse<LossPenaltyFactor>(LossPenaltyFactor.class, this, CorePackage.CONNECTIVITY_NODE__LOSS_PENALTY_FACTORS, MarketOperationsPackage.LOSS_PENALTY_FACTOR__CONNECTIVITY_NODES);
		}
		return lossPenaltyFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeConstraintTerm> getNodeConstraintTerms() {
		if (nodeConstraintTerms == null) {
			nodeConstraintTerms = new EObjectWithInverseResolvingEList<NodeConstraintTerm>(NodeConstraintTerm.class, this, CorePackage.CONNECTIVITY_NODE__NODE_CONSTRAINT_TERMS, MarketOperationsPackage.NODE_CONSTRAINT_TERM__CONNECTIVITY_NODE);
		}
		return nodeConstraintTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Terminal> getTerminals() {
		if (terminals == null) {
			terminals = new EObjectWithInverseResolvingEList<Terminal>(Terminal.class, this, CorePackage.CONNECTIVITY_NODE__TERMINALS, CorePackage.TERMINAL__CONNECTIVITY_NODE);
		}
		return terminals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pnode getPnode() {
		if (pnode != null && pnode.eIsProxy()) {
			InternalEObject oldPnode = (InternalEObject)pnode;
			pnode = (Pnode)eResolveProxy(oldPnode);
			if (pnode != oldPnode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CONNECTIVITY_NODE__PNODE, oldPnode, pnode));
			}
		}
		return pnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pnode basicGetPnode() {
		return pnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPnode(Pnode newPnode, NotificationChain msgs) {
		Pnode oldPnode = pnode;
		pnode = newPnode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTIVITY_NODE__PNODE, oldPnode, newPnode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPnode(Pnode newPnode) {
		if (newPnode != pnode) {
			NotificationChain msgs = null;
			if (pnode != null)
				msgs = ((InternalEObject)pnode).eInverseRemove(this, MarketOperationsPackage.PNODE__CONNECTIVITY_NODE, Pnode.class, msgs);
			if (newPnode != null)
				msgs = ((InternalEObject)newPnode).eInverseAdd(this, MarketOperationsPackage.PNODE__CONNECTIVITY_NODE, Pnode.class, msgs);
			msgs = basicSetPnode(newPnode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONNECTIVITY_NODE__PNODE, newPnode, newPnode));
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
			case CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
				if (connectivityNodeContainer != null)
					msgs = ((InternalEObject)connectivityNodeContainer).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class, msgs);
				return basicSetConnectivityNodeContainer((ConnectivityNodeContainer)otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
				if (topologicalNode != null)
					msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs);
				return basicSetTopologicalNode((TopologicalNode)otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE__BUS_NAME_MARKER:
				if (busNameMarker != null)
					msgs = ((InternalEObject)busNameMarker).eInverseRemove(this, TopologyPackage.BUS_NAME_MARKER__CONNECTIVITY_NODE, BusNameMarker.class, msgs);
				return basicSetBusNameMarker((BusNameMarker)otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE__LOSS_PENALTY_FACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLossPenaltyFactors()).basicAdd(otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE__NODE_CONSTRAINT_TERMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodeConstraintTerms()).basicAdd(otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE__TERMINALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminals()).basicAdd(otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE__PNODE:
				if (pnode != null)
					msgs = ((InternalEObject)pnode).eInverseRemove(this, MarketOperationsPackage.PNODE__CONNECTIVITY_NODE, Pnode.class, msgs);
				return basicSetPnode((Pnode)otherEnd, msgs);
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
			case CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
				return basicSetConnectivityNodeContainer(null, msgs);
			case CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
				return basicSetTopologicalNode(null, msgs);
			case CorePackage.CONNECTIVITY_NODE__BUS_NAME_MARKER:
				return basicSetBusNameMarker(null, msgs);
			case CorePackage.CONNECTIVITY_NODE__LOSS_PENALTY_FACTORS:
				return ((InternalEList<?>)getLossPenaltyFactors()).basicRemove(otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE__NODE_CONSTRAINT_TERMS:
				return ((InternalEList<?>)getNodeConstraintTerms()).basicRemove(otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE__TERMINALS:
				return ((InternalEList<?>)getTerminals()).basicRemove(otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE__PNODE:
				return basicSetPnode(null, msgs);
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
			case CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
				if (resolve) return getConnectivityNodeContainer();
				return basicGetConnectivityNodeContainer();
			case CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
				if (resolve) return getTopologicalNode();
				return basicGetTopologicalNode();
			case CorePackage.CONNECTIVITY_NODE__BUS_NAME_MARKER:
				if (resolve) return getBusNameMarker();
				return basicGetBusNameMarker();
			case CorePackage.CONNECTIVITY_NODE__LOSS_PENALTY_FACTORS:
				return getLossPenaltyFactors();
			case CorePackage.CONNECTIVITY_NODE__NODE_CONSTRAINT_TERMS:
				return getNodeConstraintTerms();
			case CorePackage.CONNECTIVITY_NODE__TERMINALS:
				return getTerminals();
			case CorePackage.CONNECTIVITY_NODE__PNODE:
				if (resolve) return getPnode();
				return basicGetPnode();
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
			case CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
				setConnectivityNodeContainer((ConnectivityNodeContainer)newValue);
				return;
			case CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)newValue);
				return;
			case CorePackage.CONNECTIVITY_NODE__BUS_NAME_MARKER:
				setBusNameMarker((BusNameMarker)newValue);
				return;
			case CorePackage.CONNECTIVITY_NODE__LOSS_PENALTY_FACTORS:
				getLossPenaltyFactors().clear();
				getLossPenaltyFactors().addAll((Collection<? extends LossPenaltyFactor>)newValue);
				return;
			case CorePackage.CONNECTIVITY_NODE__NODE_CONSTRAINT_TERMS:
				getNodeConstraintTerms().clear();
				getNodeConstraintTerms().addAll((Collection<? extends NodeConstraintTerm>)newValue);
				return;
			case CorePackage.CONNECTIVITY_NODE__TERMINALS:
				getTerminals().clear();
				getTerminals().addAll((Collection<? extends Terminal>)newValue);
				return;
			case CorePackage.CONNECTIVITY_NODE__PNODE:
				setPnode((Pnode)newValue);
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
			case CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
				setConnectivityNodeContainer((ConnectivityNodeContainer)null);
				return;
			case CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)null);
				return;
			case CorePackage.CONNECTIVITY_NODE__BUS_NAME_MARKER:
				setBusNameMarker((BusNameMarker)null);
				return;
			case CorePackage.CONNECTIVITY_NODE__LOSS_PENALTY_FACTORS:
				getLossPenaltyFactors().clear();
				return;
			case CorePackage.CONNECTIVITY_NODE__NODE_CONSTRAINT_TERMS:
				getNodeConstraintTerms().clear();
				return;
			case CorePackage.CONNECTIVITY_NODE__TERMINALS:
				getTerminals().clear();
				return;
			case CorePackage.CONNECTIVITY_NODE__PNODE:
				setPnode((Pnode)null);
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
			case CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
				return connectivityNodeContainer != null;
			case CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
				return topologicalNode != null;
			case CorePackage.CONNECTIVITY_NODE__BUS_NAME_MARKER:
				return busNameMarker != null;
			case CorePackage.CONNECTIVITY_NODE__LOSS_PENALTY_FACTORS:
				return lossPenaltyFactors != null && !lossPenaltyFactors.isEmpty();
			case CorePackage.CONNECTIVITY_NODE__NODE_CONSTRAINT_TERMS:
				return nodeConstraintTerms != null && !nodeConstraintTerms.isEmpty();
			case CorePackage.CONNECTIVITY_NODE__TERMINALS:
				return terminals != null && !terminals.isEmpty();
			case CorePackage.CONNECTIVITY_NODE__PNODE:
				return pnode != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectivityNodeImpl
