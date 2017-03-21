/**
 */
package CIM.IEC61968.Common.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.Status;
import CIM.IEC61968.Common.StreetAddress;
import CIM.IEC61968.Common.StreetDetail;
import CIM.IEC61968.Common.TownDetail;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Street Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.impl.StreetAddressImpl#getStreetDetail <em>Street Detail</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.StreetAddressImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.StreetAddressImpl#getTownDetail <em>Town Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreetAddressImpl extends ElementImpl implements StreetAddress {
	/**
	 * The cached value of the '{@link #getStreetDetail() <em>Street Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetDetail()
	 * @generated
	 * @ordered
	 */
	protected StreetDetail streetDetail;

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
	 * The cached value of the '{@link #getTownDetail() <em>Town Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTownDetail()
	 * @generated
	 * @ordered
	 */
	protected TownDetail townDetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreetAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.STREET_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetDetail getStreetDetail() {
		if (streetDetail != null && streetDetail.eIsProxy()) {
			InternalEObject oldStreetDetail = (InternalEObject)streetDetail;
			streetDetail = (StreetDetail)eResolveProxy(oldStreetDetail);
			if (streetDetail != oldStreetDetail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.STREET_ADDRESS__STREET_DETAIL, oldStreetDetail, streetDetail));
			}
		}
		return streetDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetDetail basicGetStreetDetail() {
		return streetDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetDetail(StreetDetail newStreetDetail) {
		StreetDetail oldStreetDetail = streetDetail;
		streetDetail = newStreetDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_ADDRESS__STREET_DETAIL, oldStreetDetail, streetDetail));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.STREET_ADDRESS__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_ADDRESS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TownDetail getTownDetail() {
		if (townDetail != null && townDetail.eIsProxy()) {
			InternalEObject oldTownDetail = (InternalEObject)townDetail;
			townDetail = (TownDetail)eResolveProxy(oldTownDetail);
			if (townDetail != oldTownDetail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.STREET_ADDRESS__TOWN_DETAIL, oldTownDetail, townDetail));
			}
		}
		return townDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TownDetail basicGetTownDetail() {
		return townDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTownDetail(TownDetail newTownDetail) {
		TownDetail oldTownDetail = townDetail;
		townDetail = newTownDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_ADDRESS__TOWN_DETAIL, oldTownDetail, townDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.STREET_ADDRESS__STREET_DETAIL:
				if (resolve) return getStreetDetail();
				return basicGetStreetDetail();
			case CommonPackage.STREET_ADDRESS__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case CommonPackage.STREET_ADDRESS__TOWN_DETAIL:
				if (resolve) return getTownDetail();
				return basicGetTownDetail();
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
			case CommonPackage.STREET_ADDRESS__STREET_DETAIL:
				setStreetDetail((StreetDetail)newValue);
				return;
			case CommonPackage.STREET_ADDRESS__STATUS:
				setStatus((Status)newValue);
				return;
			case CommonPackage.STREET_ADDRESS__TOWN_DETAIL:
				setTownDetail((TownDetail)newValue);
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
			case CommonPackage.STREET_ADDRESS__STREET_DETAIL:
				setStreetDetail((StreetDetail)null);
				return;
			case CommonPackage.STREET_ADDRESS__STATUS:
				setStatus((Status)null);
				return;
			case CommonPackage.STREET_ADDRESS__TOWN_DETAIL:
				setTownDetail((TownDetail)null);
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
			case CommonPackage.STREET_ADDRESS__STREET_DETAIL:
				return streetDetail != null;
			case CommonPackage.STREET_ADDRESS__STATUS:
				return status != null;
			case CommonPackage.STREET_ADDRESS__TOWN_DETAIL:
				return townDetail != null;
		}
		return super.eIsSet(featureID);
	}

} //StreetAddressImpl
