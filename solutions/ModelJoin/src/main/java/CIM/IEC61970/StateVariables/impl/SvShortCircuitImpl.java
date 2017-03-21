/**
 */
package CIM.IEC61970.StateVariables.impl;

import CIM.IEC61970.StateVariables.StateVariablesPackage;
import CIM.IEC61970.StateVariables.SvShortCircuit;

import CIM.IEC61970.Topology.TopologicalNode;
import CIM.IEC61970.Topology.TopologyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sv Short Circuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvShortCircuitImpl#getR0PerR <em>R0 Per R</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvShortCircuitImpl#getSShortCircuit <em>SShort Circuit</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvShortCircuitImpl#getXPerR <em>XPer R</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvShortCircuitImpl#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvShortCircuitImpl#getX0PerX <em>X0 Per X</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvShortCircuitImpl extends StateVariableImpl implements SvShortCircuit {
	/**
	 * The default value of the '{@link #getR0PerR() <em>R0 Per R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0PerR()
	 * @generated
	 * @ordered
	 */
	protected static final float R0_PER_R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR0PerR() <em>R0 Per R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0PerR()
	 * @generated
	 * @ordered
	 */
	protected float r0PerR = R0_PER_R_EDEFAULT;

	/**
	 * The default value of the '{@link #getSShortCircuit() <em>SShort Circuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSShortCircuit()
	 * @generated
	 * @ordered
	 */
	protected static final float SSHORT_CIRCUIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSShortCircuit() <em>SShort Circuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSShortCircuit()
	 * @generated
	 * @ordered
	 */
	protected float sShortCircuit = SSHORT_CIRCUIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXPerR() <em>XPer R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPerR()
	 * @generated
	 * @ordered
	 */
	protected static final float XPER_R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXPerR() <em>XPer R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPerR()
	 * @generated
	 * @ordered
	 */
	protected float xPerR = XPER_R_EDEFAULT;

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
	 * The default value of the '{@link #getX0PerX() <em>X0 Per X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0PerX()
	 * @generated
	 * @ordered
	 */
	protected static final float X0_PER_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX0PerX() <em>X0 Per X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0PerX()
	 * @generated
	 * @ordered
	 */
	protected float x0PerX = X0_PER_X_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvShortCircuitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.SV_SHORT_CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR0PerR() {
		return r0PerR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR0PerR(float newR0PerR) {
		float oldR0PerR = r0PerR;
		r0PerR = newR0PerR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_SHORT_CIRCUIT__R0_PER_R, oldR0PerR, r0PerR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSShortCircuit() {
		return sShortCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSShortCircuit(float newSShortCircuit) {
		float oldSShortCircuit = sShortCircuit;
		sShortCircuit = newSShortCircuit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_SHORT_CIRCUIT__SSHORT_CIRCUIT, oldSShortCircuit, sShortCircuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXPerR() {
		return xPerR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPerR(float newXPerR) {
		float oldXPerR = xPerR;
		xPerR = newXPerR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_SHORT_CIRCUIT__XPER_R, oldXPerR, xPerR));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE, oldTopologicalNode, topologicalNode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE, oldTopologicalNode, newTopologicalNode);
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
				msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT, TopologicalNode.class, msgs);
			if (newTopologicalNode != null)
				msgs = ((InternalEObject)newTopologicalNode).eInverseAdd(this, TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT, TopologicalNode.class, msgs);
			msgs = basicSetTopologicalNode(newTopologicalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE, newTopologicalNode, newTopologicalNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX0PerX() {
		return x0PerX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX0PerX(float newX0PerX) {
		float oldX0PerX = x0PerX;
		x0PerX = newX0PerX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_SHORT_CIRCUIT__X0_PER_X, oldX0PerX, x0PerX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE:
				if (topologicalNode != null)
					msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT, TopologicalNode.class, msgs);
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
			case StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE:
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
			case StateVariablesPackage.SV_SHORT_CIRCUIT__R0_PER_R:
				return getR0PerR();
			case StateVariablesPackage.SV_SHORT_CIRCUIT__SSHORT_CIRCUIT:
				return getSShortCircuit();
			case StateVariablesPackage.SV_SHORT_CIRCUIT__XPER_R:
				return getXPerR();
			case StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE:
				if (resolve) return getTopologicalNode();
				return basicGetTopologicalNode();
			case StateVariablesPackage.SV_SHORT_CIRCUIT__X0_PER_X:
				return getX0PerX();
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
			case StateVariablesPackage.SV_SHORT_CIRCUIT__R0_PER_R:
				setR0PerR((Float)newValue);
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__SSHORT_CIRCUIT:
				setSShortCircuit((Float)newValue);
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__XPER_R:
				setXPerR((Float)newValue);
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)newValue);
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__X0_PER_X:
				setX0PerX((Float)newValue);
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
			case StateVariablesPackage.SV_SHORT_CIRCUIT__R0_PER_R:
				setR0PerR(R0_PER_R_EDEFAULT);
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__SSHORT_CIRCUIT:
				setSShortCircuit(SSHORT_CIRCUIT_EDEFAULT);
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__XPER_R:
				setXPerR(XPER_R_EDEFAULT);
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)null);
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__X0_PER_X:
				setX0PerX(X0_PER_X_EDEFAULT);
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
			case StateVariablesPackage.SV_SHORT_CIRCUIT__R0_PER_R:
				return r0PerR != R0_PER_R_EDEFAULT;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__SSHORT_CIRCUIT:
				return sShortCircuit != SSHORT_CIRCUIT_EDEFAULT;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__XPER_R:
				return xPerR != XPER_R_EDEFAULT;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE:
				return topologicalNode != null;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__X0_PER_X:
				return x0PerX != X0_PER_X_EDEFAULT;
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
		result.append(" (r0PerR: ");
		result.append(r0PerR);
		result.append(", sShortCircuit: ");
		result.append(sShortCircuit);
		result.append(", xPerR: ");
		result.append(xPerR);
		result.append(", x0PerX: ");
		result.append(x0PerX);
		result.append(')');
		return result.toString();
	}

} //SvShortCircuitImpl
