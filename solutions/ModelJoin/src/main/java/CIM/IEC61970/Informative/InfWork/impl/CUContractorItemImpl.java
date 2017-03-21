/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfWork.CUContractorItem;
import CIM.IEC61970.Informative.InfWork.CompatibleUnit;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;

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
 * An implementation of the model object '<em><b>CU Contractor Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CUContractorItemImpl#getActivityCode <em>Activity Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CUContractorItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CUContractorItemImpl#getBidAmount <em>Bid Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CUContractorItemImpl#getCompatibleUnits <em>Compatible Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CUContractorItemImpl extends IdentifiedObjectImpl implements CUContractorItem {
	/**
	 * The default value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected String activityCode = ACTIVITY_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The default value of the '{@link #getBidAmount() <em>Bid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float BID_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBidAmount() <em>Bid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidAmount()
	 * @generated
	 * @ordered
	 */
	protected float bidAmount = BID_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompatibleUnits() <em>Compatible Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibleUnit> compatibleUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CUContractorItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CU_CONTRACTOR_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityCode() {
		return activityCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityCode(String newActivityCode) {
		String oldActivityCode = activityCode;
		activityCode = newActivityCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_CONTRACTOR_ITEM__ACTIVITY_CODE, oldActivityCode, activityCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CU_CONTRACTOR_ITEM__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_CONTRACTOR_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBidAmount() {
		return bidAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidAmount(float newBidAmount) {
		float oldBidAmount = bidAmount;
		bidAmount = newBidAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_CONTRACTOR_ITEM__BID_AMOUNT, oldBidAmount, bidAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new EObjectWithInverseResolvingEList.ManyInverse<CompatibleUnit>(CompatibleUnit.class, this, InfWorkPackage.CU_CONTRACTOR_ITEM__COMPATIBLE_UNITS, InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS);
		}
		return compatibleUnits;
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
			case InfWorkPackage.CU_CONTRACTOR_ITEM__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CU_CONTRACTOR_ITEM__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.CU_CONTRACTOR_ITEM__ACTIVITY_CODE:
				return getActivityCode();
			case InfWorkPackage.CU_CONTRACTOR_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.CU_CONTRACTOR_ITEM__BID_AMOUNT:
				return getBidAmount();
			case InfWorkPackage.CU_CONTRACTOR_ITEM__COMPATIBLE_UNITS:
				return getCompatibleUnits();
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
			case InfWorkPackage.CU_CONTRACTOR_ITEM__ACTIVITY_CODE:
				setActivityCode((String)newValue);
				return;
			case InfWorkPackage.CU_CONTRACTOR_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.CU_CONTRACTOR_ITEM__BID_AMOUNT:
				setBidAmount((Float)newValue);
				return;
			case InfWorkPackage.CU_CONTRACTOR_ITEM__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
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
			case InfWorkPackage.CU_CONTRACTOR_ITEM__ACTIVITY_CODE:
				setActivityCode(ACTIVITY_CODE_EDEFAULT);
				return;
			case InfWorkPackage.CU_CONTRACTOR_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.CU_CONTRACTOR_ITEM__BID_AMOUNT:
				setBidAmount(BID_AMOUNT_EDEFAULT);
				return;
			case InfWorkPackage.CU_CONTRACTOR_ITEM__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
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
			case InfWorkPackage.CU_CONTRACTOR_ITEM__ACTIVITY_CODE:
				return ACTIVITY_CODE_EDEFAULT == null ? activityCode != null : !ACTIVITY_CODE_EDEFAULT.equals(activityCode);
			case InfWorkPackage.CU_CONTRACTOR_ITEM__STATUS:
				return status != null;
			case InfWorkPackage.CU_CONTRACTOR_ITEM__BID_AMOUNT:
				return bidAmount != BID_AMOUNT_EDEFAULT;
			case InfWorkPackage.CU_CONTRACTOR_ITEM__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
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
		result.append(" (activityCode: ");
		result.append(activityCode);
		result.append(", bidAmount: ");
		result.append(bidAmount);
		result.append(')');
		return result.toString();
	}

} //CUContractorItemImpl
