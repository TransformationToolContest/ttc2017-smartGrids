/**
 */
package CIM.IEC61970.Informative.InfCommon.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.Organisation;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import CIM.IEC61970.Informative.InfCommon.MarketRole;
import CIM.IEC61970.Informative.InfCommon.MarketRoleKind;

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
 * An implementation of the model object '<em><b>Market Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.MarketRoleImpl#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.MarketRoleImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.MarketRoleImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketRoleImpl extends IdentifiedObjectImpl implements MarketRole {
	/**
	 * The cached value of the '{@link #getOrganisations() <em>Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Organisation> organisations;

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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final MarketRoleKind KIND_EDEFAULT = MarketRoleKind.COMPETITIVE_RETAILER;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected MarketRoleKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.MARKET_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organisation> getOrganisations() {
		if (organisations == null) {
			organisations = new EObjectWithInverseResolvingEList.ManyInverse<Organisation>(Organisation.class, this, InfCommonPackage.MARKET_ROLE__ORGANISATIONS, CommonPackage.ORGANISATION__MARKET_ROLES);
		}
		return organisations;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.MARKET_ROLE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.MARKET_ROLE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketRoleKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(MarketRoleKind newKind) {
		MarketRoleKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.MARKET_ROLE__KIND, oldKind, kind));
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
			case InfCommonPackage.MARKET_ROLE__ORGANISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganisations()).basicAdd(otherEnd, msgs);
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
			case InfCommonPackage.MARKET_ROLE__ORGANISATIONS:
				return ((InternalEList<?>)getOrganisations()).basicRemove(otherEnd, msgs);
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
			case InfCommonPackage.MARKET_ROLE__ORGANISATIONS:
				return getOrganisations();
			case InfCommonPackage.MARKET_ROLE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfCommonPackage.MARKET_ROLE__KIND:
				return getKind();
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
			case InfCommonPackage.MARKET_ROLE__ORGANISATIONS:
				getOrganisations().clear();
				getOrganisations().addAll((Collection<? extends Organisation>)newValue);
				return;
			case InfCommonPackage.MARKET_ROLE__STATUS:
				setStatus((Status)newValue);
				return;
			case InfCommonPackage.MARKET_ROLE__KIND:
				setKind((MarketRoleKind)newValue);
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
			case InfCommonPackage.MARKET_ROLE__ORGANISATIONS:
				getOrganisations().clear();
				return;
			case InfCommonPackage.MARKET_ROLE__STATUS:
				setStatus((Status)null);
				return;
			case InfCommonPackage.MARKET_ROLE__KIND:
				setKind(KIND_EDEFAULT);
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
			case InfCommonPackage.MARKET_ROLE__ORGANISATIONS:
				return organisations != null && !organisations.isEmpty();
			case InfCommonPackage.MARKET_ROLE__STATUS:
				return status != null;
			case InfCommonPackage.MARKET_ROLE__KIND:
				return kind != KIND_EDEFAULT;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //MarketRoleImpl
