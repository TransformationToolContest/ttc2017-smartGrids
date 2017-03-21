/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Core.impl.RegularIntervalScheduleImpl;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.ReserveReq;
import CIM.IEC61970.Informative.MarketOperations.ReserveReqCurve;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reserve Req Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.ReserveReqCurveImpl#getReserveReq <em>Reserve Req</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReserveReqCurveImpl extends RegularIntervalScheduleImpl implements ReserveReqCurve {
	/**
	 * The cached value of the '{@link #getReserveReq() <em>Reserve Req</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveReq()
	 * @generated
	 * @ordered
	 */
	protected ReserveReq reserveReq;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReserveReqCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.RESERVE_REQ_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReserveReq getReserveReq() {
		if (reserveReq != null && reserveReq.eIsProxy()) {
			InternalEObject oldReserveReq = (InternalEObject)reserveReq;
			reserveReq = (ReserveReq)eResolveProxy(oldReserveReq);
			if (reserveReq != oldReserveReq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.RESERVE_REQ_CURVE__RESERVE_REQ, oldReserveReq, reserveReq));
			}
		}
		return reserveReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReserveReq basicGetReserveReq() {
		return reserveReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserveReq(ReserveReq newReserveReq, NotificationChain msgs) {
		ReserveReq oldReserveReq = reserveReq;
		reserveReq = newReserveReq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESERVE_REQ_CURVE__RESERVE_REQ, oldReserveReq, newReserveReq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserveReq(ReserveReq newReserveReq) {
		if (newReserveReq != reserveReq) {
			NotificationChain msgs = null;
			if (reserveReq != null)
				msgs = ((InternalEObject)reserveReq).eInverseRemove(this, MarketOperationsPackage.RESERVE_REQ__RESERVE_REQ_CURVE, ReserveReq.class, msgs);
			if (newReserveReq != null)
				msgs = ((InternalEObject)newReserveReq).eInverseAdd(this, MarketOperationsPackage.RESERVE_REQ__RESERVE_REQ_CURVE, ReserveReq.class, msgs);
			msgs = basicSetReserveReq(newReserveReq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.RESERVE_REQ_CURVE__RESERVE_REQ, newReserveReq, newReserveReq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.RESERVE_REQ_CURVE__RESERVE_REQ:
				if (reserveReq != null)
					msgs = ((InternalEObject)reserveReq).eInverseRemove(this, MarketOperationsPackage.RESERVE_REQ__RESERVE_REQ_CURVE, ReserveReq.class, msgs);
				return basicSetReserveReq((ReserveReq)otherEnd, msgs);
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
			case MarketOperationsPackage.RESERVE_REQ_CURVE__RESERVE_REQ:
				return basicSetReserveReq(null, msgs);
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
			case MarketOperationsPackage.RESERVE_REQ_CURVE__RESERVE_REQ:
				if (resolve) return getReserveReq();
				return basicGetReserveReq();
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
			case MarketOperationsPackage.RESERVE_REQ_CURVE__RESERVE_REQ:
				setReserveReq((ReserveReq)newValue);
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
			case MarketOperationsPackage.RESERVE_REQ_CURVE__RESERVE_REQ:
				setReserveReq((ReserveReq)null);
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
			case MarketOperationsPackage.RESERVE_REQ_CURVE__RESERVE_REQ:
				return reserveReq != null;
		}
		return super.eIsSet(featureID);
	}

} //ReserveReqCurveImpl
