/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Core.ConnectivityNode;
import CIM.IEC61970.Core.CorePackage;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.NodeConstraintTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Constraint Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.NodeConstraintTermImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeConstraintTermImpl extends ConstraintTermImpl implements NodeConstraintTerm {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeConstraintTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.NODE_CONSTRAINT_TERM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.NODE_CONSTRAINT_TERM__CONNECTIVITY_NODE, oldConnectivityNode, connectivityNode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.NODE_CONSTRAINT_TERM__CONNECTIVITY_NODE, oldConnectivityNode, newConnectivityNode);
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
				msgs = ((InternalEObject)connectivityNode).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE__NODE_CONSTRAINT_TERMS, ConnectivityNode.class, msgs);
			if (newConnectivityNode != null)
				msgs = ((InternalEObject)newConnectivityNode).eInverseAdd(this, CorePackage.CONNECTIVITY_NODE__NODE_CONSTRAINT_TERMS, ConnectivityNode.class, msgs);
			msgs = basicSetConnectivityNode(newConnectivityNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.NODE_CONSTRAINT_TERM__CONNECTIVITY_NODE, newConnectivityNode, newConnectivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.NODE_CONSTRAINT_TERM__CONNECTIVITY_NODE:
				if (connectivityNode != null)
					msgs = ((InternalEObject)connectivityNode).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE__NODE_CONSTRAINT_TERMS, ConnectivityNode.class, msgs);
				return basicSetConnectivityNode((ConnectivityNode)otherEnd, msgs);
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
			case MarketOperationsPackage.NODE_CONSTRAINT_TERM__CONNECTIVITY_NODE:
				return basicSetConnectivityNode(null, msgs);
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
			case MarketOperationsPackage.NODE_CONSTRAINT_TERM__CONNECTIVITY_NODE:
				if (resolve) return getConnectivityNode();
				return basicGetConnectivityNode();
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
			case MarketOperationsPackage.NODE_CONSTRAINT_TERM__CONNECTIVITY_NODE:
				setConnectivityNode((ConnectivityNode)newValue);
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
			case MarketOperationsPackage.NODE_CONSTRAINT_TERM__CONNECTIVITY_NODE:
				setConnectivityNode((ConnectivityNode)null);
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
			case MarketOperationsPackage.NODE_CONSTRAINT_TERM__CONNECTIVITY_NODE:
				return connectivityNode != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeConstraintTermImpl
