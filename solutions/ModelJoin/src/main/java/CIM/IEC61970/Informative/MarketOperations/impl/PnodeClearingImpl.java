/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.Pnode;
import CIM.IEC61970.Informative.MarketOperations.PnodeClearing;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pnode Clearing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.PnodeClearingImpl#getCongestLMP <em>Congest LMP</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.PnodeClearingImpl#getCostLMP <em>Cost LMP</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.PnodeClearingImpl#getLossLMP <em>Loss LMP</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.PnodeClearingImpl#getPnode <em>Pnode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PnodeClearingImpl extends MarketFactorsImpl implements PnodeClearing {
	/**
	 * The default value of the '{@link #getCongestLMP() <em>Congest LMP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCongestLMP()
	 * @generated
	 * @ordered
	 */
	protected static final float CONGEST_LMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCongestLMP() <em>Congest LMP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCongestLMP()
	 * @generated
	 * @ordered
	 */
	protected float congestLMP = CONGEST_LMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostLMP() <em>Cost LMP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostLMP()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_LMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCostLMP() <em>Cost LMP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostLMP()
	 * @generated
	 * @ordered
	 */
	protected float costLMP = COST_LMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLossLMP() <em>Loss LMP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossLMP()
	 * @generated
	 * @ordered
	 */
	protected static final float LOSS_LMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLossLMP() <em>Loss LMP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossLMP()
	 * @generated
	 * @ordered
	 */
	protected float lossLMP = LOSS_LMP_EDEFAULT;

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
	protected PnodeClearingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.PNODE_CLEARING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCongestLMP() {
		return congestLMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCongestLMP(float newCongestLMP) {
		float oldCongestLMP = congestLMP;
		congestLMP = newCongestLMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE_CLEARING__CONGEST_LMP, oldCongestLMP, congestLMP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCostLMP() {
		return costLMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostLMP(float newCostLMP) {
		float oldCostLMP = costLMP;
		costLMP = newCostLMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE_CLEARING__COST_LMP, oldCostLMP, costLMP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLossLMP() {
		return lossLMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLossLMP(float newLossLMP) {
		float oldLossLMP = lossLMP;
		lossLMP = newLossLMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE_CLEARING__LOSS_LMP, oldLossLMP, lossLMP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.PNODE_CLEARING__PNODE, oldPnode, pnode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE_CLEARING__PNODE, oldPnode, newPnode);
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
				msgs = ((InternalEObject)pnode).eInverseRemove(this, MarketOperationsPackage.PNODE__PNODE_CLEARING, Pnode.class, msgs);
			if (newPnode != null)
				msgs = ((InternalEObject)newPnode).eInverseAdd(this, MarketOperationsPackage.PNODE__PNODE_CLEARING, Pnode.class, msgs);
			msgs = basicSetPnode(newPnode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.PNODE_CLEARING__PNODE, newPnode, newPnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.PNODE_CLEARING__PNODE:
				if (pnode != null)
					msgs = ((InternalEObject)pnode).eInverseRemove(this, MarketOperationsPackage.PNODE__PNODE_CLEARING, Pnode.class, msgs);
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
			case MarketOperationsPackage.PNODE_CLEARING__PNODE:
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
			case MarketOperationsPackage.PNODE_CLEARING__CONGEST_LMP:
				return getCongestLMP();
			case MarketOperationsPackage.PNODE_CLEARING__COST_LMP:
				return getCostLMP();
			case MarketOperationsPackage.PNODE_CLEARING__LOSS_LMP:
				return getLossLMP();
			case MarketOperationsPackage.PNODE_CLEARING__PNODE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MarketOperationsPackage.PNODE_CLEARING__CONGEST_LMP:
				setCongestLMP((Float)newValue);
				return;
			case MarketOperationsPackage.PNODE_CLEARING__COST_LMP:
				setCostLMP((Float)newValue);
				return;
			case MarketOperationsPackage.PNODE_CLEARING__LOSS_LMP:
				setLossLMP((Float)newValue);
				return;
			case MarketOperationsPackage.PNODE_CLEARING__PNODE:
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
			case MarketOperationsPackage.PNODE_CLEARING__CONGEST_LMP:
				setCongestLMP(CONGEST_LMP_EDEFAULT);
				return;
			case MarketOperationsPackage.PNODE_CLEARING__COST_LMP:
				setCostLMP(COST_LMP_EDEFAULT);
				return;
			case MarketOperationsPackage.PNODE_CLEARING__LOSS_LMP:
				setLossLMP(LOSS_LMP_EDEFAULT);
				return;
			case MarketOperationsPackage.PNODE_CLEARING__PNODE:
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
			case MarketOperationsPackage.PNODE_CLEARING__CONGEST_LMP:
				return congestLMP != CONGEST_LMP_EDEFAULT;
			case MarketOperationsPackage.PNODE_CLEARING__COST_LMP:
				return costLMP != COST_LMP_EDEFAULT;
			case MarketOperationsPackage.PNODE_CLEARING__LOSS_LMP:
				return lossLMP != LOSS_LMP_EDEFAULT;
			case MarketOperationsPackage.PNODE_CLEARING__PNODE:
				return pnode != null;
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
		result.append(" (congestLMP: ");
		result.append(congestLMP);
		result.append(", costLMP: ");
		result.append(costLMP);
		result.append(", lossLMP: ");
		result.append(lossLMP);
		result.append(')');
		return result.toString();
	}

} //PnodeClearingImpl
