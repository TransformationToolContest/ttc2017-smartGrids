/**
 */
package gluemodel.CIM.IEC61970.StateVariables.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage;
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
 * An implementation of the model object '<em><b>Topological Island</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.impl.TopologicalIslandImpl#getAngleRef_TopologicalNode <em>Angle Ref Topological Node</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.impl.TopologicalIslandImpl#getTopologicalNodes <em>Topological Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologicalIslandImpl extends IdentifiedObjectImpl implements TopologicalIsland {
	/**
	 * The cached value of the '{@link #getAngleRef_TopologicalNode() <em>Angle Ref Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleRef_TopologicalNode()
	 * @generated
	 * @ordered
	 */
	protected TopologicalNode angleRef_TopologicalNode;

	/**
	 * The cached value of the '{@link #getTopologicalNodes() <em>Topological Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologicalNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TopologicalNode> topologicalNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologicalIslandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.TOPOLOGICAL_ISLAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalNode getAngleRef_TopologicalNode() {
		if (angleRef_TopologicalNode != null && angleRef_TopologicalNode.eIsProxy()) {
			InternalEObject oldAngleRef_TopologicalNode = (InternalEObject)angleRef_TopologicalNode;
			angleRef_TopologicalNode = (TopologicalNode)eResolveProxy(oldAngleRef_TopologicalNode);
			if (angleRef_TopologicalNode != oldAngleRef_TopologicalNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, oldAngleRef_TopologicalNode, angleRef_TopologicalNode));
			}
		}
		return angleRef_TopologicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalNode basicGetAngleRef_TopologicalNode() {
		return angleRef_TopologicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleRef_TopologicalNode(TopologicalNode newAngleRef_TopologicalNode, NotificationChain msgs) {
		TopologicalNode oldAngleRef_TopologicalNode = angleRef_TopologicalNode;
		angleRef_TopologicalNode = newAngleRef_TopologicalNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, oldAngleRef_TopologicalNode, newAngleRef_TopologicalNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleRef_TopologicalNode(TopologicalNode newAngleRef_TopologicalNode) {
		if (newAngleRef_TopologicalNode != angleRef_TopologicalNode) {
			NotificationChain msgs = null;
			if (angleRef_TopologicalNode != null)
				msgs = ((InternalEObject)angleRef_TopologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, TopologicalNode.class, msgs);
			if (newAngleRef_TopologicalNode != null)
				msgs = ((InternalEObject)newAngleRef_TopologicalNode).eInverseAdd(this, TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, TopologicalNode.class, msgs);
			msgs = basicSetAngleRef_TopologicalNode(newAngleRef_TopologicalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, newAngleRef_TopologicalNode, newAngleRef_TopologicalNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopologicalNode> getTopologicalNodes() {
		if (topologicalNodes == null) {
			topologicalNodes = new EObjectWithInverseResolvingEList<TopologicalNode>(TopologicalNode.class, this, StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES, TopologyPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND);
		}
		return topologicalNodes;
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
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
				if (angleRef_TopologicalNode != null)
					msgs = ((InternalEObject)angleRef_TopologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, TopologicalNode.class, msgs);
				return basicSetAngleRef_TopologicalNode((TopologicalNode)otherEnd, msgs);
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopologicalNodes()).basicAdd(otherEnd, msgs);
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
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
				return basicSetAngleRef_TopologicalNode(null, msgs);
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
				return ((InternalEList<?>)getTopologicalNodes()).basicRemove(otherEnd, msgs);
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
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
				if (resolve) return getAngleRef_TopologicalNode();
				return basicGetAngleRef_TopologicalNode();
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
				return getTopologicalNodes();
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
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
				setAngleRef_TopologicalNode((TopologicalNode)newValue);
				return;
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
				getTopologicalNodes().clear();
				getTopologicalNodes().addAll((Collection<? extends TopologicalNode>)newValue);
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
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
				setAngleRef_TopologicalNode((TopologicalNode)null);
				return;
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
				getTopologicalNodes().clear();
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
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
				return angleRef_TopologicalNode != null;
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
				return topologicalNodes != null && !topologicalNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TopologicalIslandImpl
