/**
 */
package CIM.IEC61968.Common.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.PostalAddress;
import CIM.IEC61968.Common.StreetDetail;
import CIM.IEC61968.Common.TownDetail;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postal Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.impl.PostalAddressImpl#getTownDetail <em>Town Detail</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.PostalAddressImpl#getStreetDetail <em>Street Detail</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.PostalAddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.PostalAddressImpl#getPoBox <em>Po Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostalAddressImpl extends ElementImpl implements PostalAddress {
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
	 * The cached value of the '{@link #getStreetDetail() <em>Street Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetDetail()
	 * @generated
	 * @ordered
	 */
	protected StreetDetail streetDetail;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoBox() <em>Po Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoBox()
	 * @generated
	 * @ordered
	 */
	protected static final String PO_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoBox() <em>Po Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoBox()
	 * @generated
	 * @ordered
	 */
	protected String poBox = PO_BOX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.POSTAL_ADDRESS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL, oldTownDetail, townDetail));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL, oldTownDetail, townDetail));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.POSTAL_ADDRESS__STREET_DETAIL, oldStreetDetail, streetDetail));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.POSTAL_ADDRESS__STREET_DETAIL, oldStreetDetail, streetDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.POSTAL_ADDRESS__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPoBox() {
		return poBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoBox(String newPoBox) {
		String oldPoBox = poBox;
		poBox = newPoBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.POSTAL_ADDRESS__PO_BOX, oldPoBox, poBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL:
				if (resolve) return getTownDetail();
				return basicGetTownDetail();
			case CommonPackage.POSTAL_ADDRESS__STREET_DETAIL:
				if (resolve) return getStreetDetail();
				return basicGetStreetDetail();
			case CommonPackage.POSTAL_ADDRESS__POSTAL_CODE:
				return getPostalCode();
			case CommonPackage.POSTAL_ADDRESS__PO_BOX:
				return getPoBox();
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
			case CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL:
				setTownDetail((TownDetail)newValue);
				return;
			case CommonPackage.POSTAL_ADDRESS__STREET_DETAIL:
				setStreetDetail((StreetDetail)newValue);
				return;
			case CommonPackage.POSTAL_ADDRESS__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case CommonPackage.POSTAL_ADDRESS__PO_BOX:
				setPoBox((String)newValue);
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
			case CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL:
				setTownDetail((TownDetail)null);
				return;
			case CommonPackage.POSTAL_ADDRESS__STREET_DETAIL:
				setStreetDetail((StreetDetail)null);
				return;
			case CommonPackage.POSTAL_ADDRESS__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case CommonPackage.POSTAL_ADDRESS__PO_BOX:
				setPoBox(PO_BOX_EDEFAULT);
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
			case CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL:
				return townDetail != null;
			case CommonPackage.POSTAL_ADDRESS__STREET_DETAIL:
				return streetDetail != null;
			case CommonPackage.POSTAL_ADDRESS__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case CommonPackage.POSTAL_ADDRESS__PO_BOX:
				return PO_BOX_EDEFAULT == null ? poBox != null : !PO_BOX_EDEFAULT.equals(poBox);
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
		result.append(" (postalCode: ");
		result.append(postalCode);
		result.append(", poBox: ");
		result.append(poBox);
		result.append(')');
		return result.toString();
	}

} //PostalAddressImpl
