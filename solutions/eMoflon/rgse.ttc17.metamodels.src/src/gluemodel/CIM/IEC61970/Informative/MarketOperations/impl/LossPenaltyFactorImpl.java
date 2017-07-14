/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Core.ConnectivityNode;
import gluemodel.CIM.IEC61970.Core.CorePackage;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.LossPenaltyFactor;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

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
 * An implementation of the model object '<em><b>Loss Penalty Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LossPenaltyFactorImpl#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.LossPenaltyFactorImpl#getLossFactor <em>Loss Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LossPenaltyFactorImpl extends MarketFactorsImpl implements LossPenaltyFactor {
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
	 * The default value of the '{@link #getLossFactor() <em>Loss Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Object LOSS_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLossFactor() <em>Loss Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossFactor()
	 * @generated
	 * @ordered
	 */
	protected Object lossFactor = LOSS_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LossPenaltyFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.LOSS_PENALTY_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectivityNode> getConnectivityNodes() {
		if (connectivityNodes == null) {
			connectivityNodes = new EObjectWithInverseResolvingEList.ManyInverse<ConnectivityNode>(ConnectivityNode.class, this, MarketOperationsPackage.LOSS_PENALTY_FACTOR__CONNECTIVITY_NODES, CorePackage.CONNECTIVITY_NODE__LOSS_PENALTY_FACTORS);
		}
		return connectivityNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLossFactor() {
		return lossFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLossFactor(Object newLossFactor) {
		Object oldLossFactor = lossFactor;
		lossFactor = newLossFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.LOSS_PENALTY_FACTOR__LOSS_FACTOR, oldLossFactor, lossFactor));
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
			case MarketOperationsPackage.LOSS_PENALTY_FACTOR__CONNECTIVITY_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectivityNodes()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.LOSS_PENALTY_FACTOR__CONNECTIVITY_NODES:
				return ((InternalEList<?>)getConnectivityNodes()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.LOSS_PENALTY_FACTOR__CONNECTIVITY_NODES:
				return getConnectivityNodes();
			case MarketOperationsPackage.LOSS_PENALTY_FACTOR__LOSS_FACTOR:
				return getLossFactor();
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
			case MarketOperationsPackage.LOSS_PENALTY_FACTOR__CONNECTIVITY_NODES:
				getConnectivityNodes().clear();
				getConnectivityNodes().addAll((Collection<? extends ConnectivityNode>)newValue);
				return;
			case MarketOperationsPackage.LOSS_PENALTY_FACTOR__LOSS_FACTOR:
				setLossFactor(newValue);
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
			case MarketOperationsPackage.LOSS_PENALTY_FACTOR__CONNECTIVITY_NODES:
				getConnectivityNodes().clear();
				return;
			case MarketOperationsPackage.LOSS_PENALTY_FACTOR__LOSS_FACTOR:
				setLossFactor(LOSS_FACTOR_EDEFAULT);
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
			case MarketOperationsPackage.LOSS_PENALTY_FACTOR__CONNECTIVITY_NODES:
				return connectivityNodes != null && !connectivityNodes.isEmpty();
			case MarketOperationsPackage.LOSS_PENALTY_FACTOR__LOSS_FACTOR:
				return LOSS_FACTOR_EDEFAULT == null ? lossFactor != null : !LOSS_FACTOR_EDEFAULT.equals(lossFactor);
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
		result.append(" (lossFactor: ");
		result.append(lossFactor);
		result.append(')');
		return result.toString();
	}

} //LossPenaltyFactorImpl
