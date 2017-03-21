/**
 */
package CIM.IEC61968.Common.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.ElectronicAddress;
import CIM.IEC61968.Common.Organisation;
import CIM.IEC61968.Common.PostalAddress;
import CIM.IEC61968.Common.StreetAddress;
import CIM.IEC61968.Common.TelephoneNumber;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfCommon.BusinessRole;
import CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import CIM.IEC61970.Informative.InfCommon.MarketRole;

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
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.impl.OrganisationImpl#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.OrganisationImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.OrganisationImpl#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.OrganisationImpl#getPhone1 <em>Phone1</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.OrganisationImpl#getPhone2 <em>Phone2</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.OrganisationImpl#getMarketRoles <em>Market Roles</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.OrganisationImpl#getBusinessRoles <em>Business Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationImpl extends IdentifiedObjectImpl implements Organisation {
	/**
	 * The cached value of the '{@link #getStreetAddress() <em>Street Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected StreetAddress streetAddress;

	/**
	 * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicAddress()
	 * @generated
	 * @ordered
	 */
	protected ElectronicAddress electronicAddress;

	/**
	 * The cached value of the '{@link #getPostalAddress() <em>Postal Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalAddress()
	 * @generated
	 * @ordered
	 */
	protected PostalAddress postalAddress;

	/**
	 * The cached value of the '{@link #getPhone1() <em>Phone1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone1()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber phone1;

	/**
	 * The cached value of the '{@link #getPhone2() <em>Phone2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone2()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber phone2;

	/**
	 * The cached value of the '{@link #getMarketRoles() <em>Market Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketRole> marketRoles;

	/**
	 * The cached value of the '{@link #getBusinessRoles() <em>Business Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessRole> businessRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ORGANISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetAddress getStreetAddress() {
		if (streetAddress != null && streetAddress.eIsProxy()) {
			InternalEObject oldStreetAddress = (InternalEObject)streetAddress;
			streetAddress = (StreetAddress)eResolveProxy(oldStreetAddress);
			if (streetAddress != oldStreetAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ORGANISATION__STREET_ADDRESS, oldStreetAddress, streetAddress));
			}
		}
		return streetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetAddress basicGetStreetAddress() {
		return streetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetAddress(StreetAddress newStreetAddress) {
		StreetAddress oldStreetAddress = streetAddress;
		streetAddress = newStreetAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ORGANISATION__STREET_ADDRESS, oldStreetAddress, streetAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicAddress getElectronicAddress() {
		if (electronicAddress != null && electronicAddress.eIsProxy()) {
			InternalEObject oldElectronicAddress = (InternalEObject)electronicAddress;
			electronicAddress = (ElectronicAddress)eResolveProxy(oldElectronicAddress);
			if (electronicAddress != oldElectronicAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS, oldElectronicAddress, electronicAddress));
			}
		}
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicAddress basicGetElectronicAddress() {
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectronicAddress(ElectronicAddress newElectronicAddress) {
		ElectronicAddress oldElectronicAddress = electronicAddress;
		electronicAddress = newElectronicAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS, oldElectronicAddress, electronicAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddress getPostalAddress() {
		if (postalAddress != null && postalAddress.eIsProxy()) {
			InternalEObject oldPostalAddress = (InternalEObject)postalAddress;
			postalAddress = (PostalAddress)eResolveProxy(oldPostalAddress);
			if (postalAddress != oldPostalAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ORGANISATION__POSTAL_ADDRESS, oldPostalAddress, postalAddress));
			}
		}
		return postalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddress basicGetPostalAddress() {
		return postalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalAddress(PostalAddress newPostalAddress) {
		PostalAddress oldPostalAddress = postalAddress;
		postalAddress = newPostalAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ORGANISATION__POSTAL_ADDRESS, oldPostalAddress, postalAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber getPhone1() {
		if (phone1 != null && phone1.eIsProxy()) {
			InternalEObject oldPhone1 = (InternalEObject)phone1;
			phone1 = (TelephoneNumber)eResolveProxy(oldPhone1);
			if (phone1 != oldPhone1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ORGANISATION__PHONE1, oldPhone1, phone1));
			}
		}
		return phone1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber basicGetPhone1() {
		return phone1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone1(TelephoneNumber newPhone1) {
		TelephoneNumber oldPhone1 = phone1;
		phone1 = newPhone1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ORGANISATION__PHONE1, oldPhone1, phone1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber getPhone2() {
		if (phone2 != null && phone2.eIsProxy()) {
			InternalEObject oldPhone2 = (InternalEObject)phone2;
			phone2 = (TelephoneNumber)eResolveProxy(oldPhone2);
			if (phone2 != oldPhone2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ORGANISATION__PHONE2, oldPhone2, phone2));
			}
		}
		return phone2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber basicGetPhone2() {
		return phone2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone2(TelephoneNumber newPhone2) {
		TelephoneNumber oldPhone2 = phone2;
		phone2 = newPhone2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ORGANISATION__PHONE2, oldPhone2, phone2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketRole> getMarketRoles() {
		if (marketRoles == null) {
			marketRoles = new EObjectWithInverseResolvingEList.ManyInverse<MarketRole>(MarketRole.class, this, CommonPackage.ORGANISATION__MARKET_ROLES, InfCommonPackage.MARKET_ROLE__ORGANISATIONS);
		}
		return marketRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessRole> getBusinessRoles() {
		if (businessRoles == null) {
			businessRoles = new EObjectWithInverseResolvingEList.ManyInverse<BusinessRole>(BusinessRole.class, this, CommonPackage.ORGANISATION__BUSINESS_ROLES, InfCommonPackage.BUSINESS_ROLE__ORGANISATIONS);
		}
		return businessRoles;
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
			case CommonPackage.ORGANISATION__MARKET_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMarketRoles()).basicAdd(otherEnd, msgs);
			case CommonPackage.ORGANISATION__BUSINESS_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessRoles()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.ORGANISATION__MARKET_ROLES:
				return ((InternalEList<?>)getMarketRoles()).basicRemove(otherEnd, msgs);
			case CommonPackage.ORGANISATION__BUSINESS_ROLES:
				return ((InternalEList<?>)getBusinessRoles()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.ORGANISATION__STREET_ADDRESS:
				if (resolve) return getStreetAddress();
				return basicGetStreetAddress();
			case CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS:
				if (resolve) return getElectronicAddress();
				return basicGetElectronicAddress();
			case CommonPackage.ORGANISATION__POSTAL_ADDRESS:
				if (resolve) return getPostalAddress();
				return basicGetPostalAddress();
			case CommonPackage.ORGANISATION__PHONE1:
				if (resolve) return getPhone1();
				return basicGetPhone1();
			case CommonPackage.ORGANISATION__PHONE2:
				if (resolve) return getPhone2();
				return basicGetPhone2();
			case CommonPackage.ORGANISATION__MARKET_ROLES:
				return getMarketRoles();
			case CommonPackage.ORGANISATION__BUSINESS_ROLES:
				return getBusinessRoles();
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
			case CommonPackage.ORGANISATION__STREET_ADDRESS:
				setStreetAddress((StreetAddress)newValue);
				return;
			case CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)newValue);
				return;
			case CommonPackage.ORGANISATION__POSTAL_ADDRESS:
				setPostalAddress((PostalAddress)newValue);
				return;
			case CommonPackage.ORGANISATION__PHONE1:
				setPhone1((TelephoneNumber)newValue);
				return;
			case CommonPackage.ORGANISATION__PHONE2:
				setPhone2((TelephoneNumber)newValue);
				return;
			case CommonPackage.ORGANISATION__MARKET_ROLES:
				getMarketRoles().clear();
				getMarketRoles().addAll((Collection<? extends MarketRole>)newValue);
				return;
			case CommonPackage.ORGANISATION__BUSINESS_ROLES:
				getBusinessRoles().clear();
				getBusinessRoles().addAll((Collection<? extends BusinessRole>)newValue);
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
			case CommonPackage.ORGANISATION__STREET_ADDRESS:
				setStreetAddress((StreetAddress)null);
				return;
			case CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)null);
				return;
			case CommonPackage.ORGANISATION__POSTAL_ADDRESS:
				setPostalAddress((PostalAddress)null);
				return;
			case CommonPackage.ORGANISATION__PHONE1:
				setPhone1((TelephoneNumber)null);
				return;
			case CommonPackage.ORGANISATION__PHONE2:
				setPhone2((TelephoneNumber)null);
				return;
			case CommonPackage.ORGANISATION__MARKET_ROLES:
				getMarketRoles().clear();
				return;
			case CommonPackage.ORGANISATION__BUSINESS_ROLES:
				getBusinessRoles().clear();
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
			case CommonPackage.ORGANISATION__STREET_ADDRESS:
				return streetAddress != null;
			case CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS:
				return electronicAddress != null;
			case CommonPackage.ORGANISATION__POSTAL_ADDRESS:
				return postalAddress != null;
			case CommonPackage.ORGANISATION__PHONE1:
				return phone1 != null;
			case CommonPackage.ORGANISATION__PHONE2:
				return phone2 != null;
			case CommonPackage.ORGANISATION__MARKET_ROLES:
				return marketRoles != null && !marketRoles.isEmpty();
			case CommonPackage.ORGANISATION__BUSINESS_ROLES:
				return businessRoles != null && !businessRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganisationImpl
