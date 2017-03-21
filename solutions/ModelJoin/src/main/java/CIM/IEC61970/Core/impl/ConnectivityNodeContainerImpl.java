/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.Core.ConnectivityNode;
import CIM.IEC61970.Core.ConnectivityNodeContainer;
import CIM.IEC61970.Core.CorePackage;

import CIM.IEC61970.Topology.TopologicalNode;
import CIM.IEC61970.Topology.TopologyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectivity Node Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.impl.ConnectivityNodeContainerImpl#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConnectivityNodeContainerImpl#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectivityNodeContainerImpl extends PowerSystemResourceImpl implements ConnectivityNodeContainer {
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
	 * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologicalNode()
	 * @generated
	 * @ordered
	 */
	protected EList<TopologicalNode> topologicalNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectivityNodeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONNECTIVITY_NODE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectivityNode> getConnectivityNodes() {
		if (connectivityNodes == null) {
			connectivityNodes = new EObjectWithInverseResolvingEList<ConnectivityNode>(ConnectivityNode.class, this, CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER);
		}
		return connectivityNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopologicalNode> getTopologicalNode() {
		if (topologicalNode == null) {
			topologicalNode = new EObjectWithInverseResolvingEList<TopologicalNode>(TopologicalNode.class, this, CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE, TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER);
		}
		return topologicalNode;
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
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectivityNodes()).basicAdd(otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopologicalNode()).basicAdd(otherEnd, msgs);
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
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
				return ((InternalEList<?>)getConnectivityNodes()).basicRemove(otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
				return ((InternalEList<?>)getTopologicalNode()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
				return getConnectivityNodes();
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
				return getTopologicalNode();
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
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
				getConnectivityNodes().clear();
				getConnectivityNodes().addAll((Collection<? extends ConnectivityNode>)newValue);
				return;
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
				getTopologicalNode().clear();
				getTopologicalNode().addAll((Collection<? extends TopologicalNode>)newValue);
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
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
				getConnectivityNodes().clear();
				return;
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
				getTopologicalNode().clear();
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
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
				return connectivityNodes != null && !connectivityNodes.isEmpty();
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
				return topologicalNode != null && !topologicalNode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectivityNodeContainerImpl
