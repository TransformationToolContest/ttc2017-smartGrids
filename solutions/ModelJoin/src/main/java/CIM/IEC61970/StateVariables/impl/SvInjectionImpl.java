/**
 */
package CIM.IEC61970.StateVariables.impl;

import CIM.IEC61970.StateVariables.StateVariablesPackage;
import CIM.IEC61970.StateVariables.SvInjection;

import CIM.IEC61970.Topology.TopologicalNode;
import CIM.IEC61970.Topology.TopologyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sv Injection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvInjectionImpl#getQNetInjection <em>QNet Injection</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvInjectionImpl#getPNetInjection <em>PNet Injection</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvInjectionImpl#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvInjectionImpl extends StateVariableImpl implements SvInjection {
	/**
	 * The default value of the '{@link #getQNetInjection() <em>QNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQNetInjection()
	 * @generated
	 * @ordered
	 */
	protected static final float QNET_INJECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQNetInjection() <em>QNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQNetInjection()
	 * @generated
	 * @ordered
	 */
	protected float qNetInjection = QNET_INJECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPNetInjection() <em>PNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPNetInjection()
	 * @generated
	 * @ordered
	 */
	protected static final float PNET_INJECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPNetInjection() <em>PNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPNetInjection()
	 * @generated
	 * @ordered
	 */
	protected float pNetInjection = PNET_INJECTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvInjectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.SV_INJECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQNetInjection() {
		return qNetInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQNetInjection(float newQNetInjection) {
		float oldQNetInjection = qNetInjection;
		qNetInjection = newQNetInjection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_INJECTION__QNET_INJECTION, oldQNetInjection, qNetInjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPNetInjection() {
		return pNetInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPNetInjection(float newPNetInjection) {
		float oldPNetInjection = pNetInjection;
		pNetInjection = newPNetInjection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_INJECTION__PNET_INJECTION, oldPNetInjection, pNetInjection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE, oldTopologicalNode, topologicalNode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE, oldTopologicalNode, newTopologicalNode);
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
				msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION, TopologicalNode.class, msgs);
			if (newTopologicalNode != null)
				msgs = ((InternalEObject)newTopologicalNode).eInverseAdd(this, TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION, TopologicalNode.class, msgs);
			msgs = basicSetTopologicalNode(newTopologicalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE, newTopologicalNode, newTopologicalNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE:
				if (topologicalNode != null)
					msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION, TopologicalNode.class, msgs);
				return basicSetTopologicalNode((TopologicalNode)otherEnd, msgs);
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
			case StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE:
				return basicSetTopologicalNode(null, msgs);
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
			case StateVariablesPackage.SV_INJECTION__QNET_INJECTION:
				return getQNetInjection();
			case StateVariablesPackage.SV_INJECTION__PNET_INJECTION:
				return getPNetInjection();
			case StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE:
				if (resolve) return getTopologicalNode();
				return basicGetTopologicalNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StateVariablesPackage.SV_INJECTION__QNET_INJECTION:
				setQNetInjection((Float)newValue);
				return;
			case StateVariablesPackage.SV_INJECTION__PNET_INJECTION:
				setPNetInjection((Float)newValue);
				return;
			case StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)newValue);
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
			case StateVariablesPackage.SV_INJECTION__QNET_INJECTION:
				setQNetInjection(QNET_INJECTION_EDEFAULT);
				return;
			case StateVariablesPackage.SV_INJECTION__PNET_INJECTION:
				setPNetInjection(PNET_INJECTION_EDEFAULT);
				return;
			case StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)null);
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
			case StateVariablesPackage.SV_INJECTION__QNET_INJECTION:
				return qNetInjection != QNET_INJECTION_EDEFAULT;
			case StateVariablesPackage.SV_INJECTION__PNET_INJECTION:
				return pNetInjection != PNET_INJECTION_EDEFAULT;
			case StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE:
				return topologicalNode != null;
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
		result.append(" (qNetInjection: ");
		result.append(qNetInjection);
		result.append(", pNetInjection: ");
		result.append(pNetInjection);
		result.append(')');
		return result.toString();
	}

} //SvInjectionImpl
