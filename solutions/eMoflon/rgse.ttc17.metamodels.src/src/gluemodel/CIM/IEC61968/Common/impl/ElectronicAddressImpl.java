/**
 */
package gluemodel.CIM.IEC61968.Common.impl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.ElectronicAddress;
import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electronic Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ElectronicAddressImpl#getLan <em>Lan</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ElectronicAddressImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ElectronicAddressImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ElectronicAddressImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ElectronicAddressImpl#getWeb <em>Web</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ElectronicAddressImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.ElectronicAddressImpl#getRadio <em>Radio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectronicAddressImpl extends ElementImpl implements ElectronicAddress {
	/**
	 * The default value of the '{@link #getLan() <em>Lan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLan()
	 * @generated
	 * @ordered
	 */
	protected static final String LAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLan() <em>Lan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLan()
	 * @generated
	 * @ordered
	 */
	protected String lan = LAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

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
	 * The default value of the '{@link #getWeb() <em>Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeb()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeb() <em>Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeb()
	 * @generated
	 * @ordered
	 */
	protected String web = WEB_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadio() <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadio()
	 * @generated
	 * @ordered
	 */
	protected static final String RADIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRadio() <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadio()
	 * @generated
	 * @ordered
	 */
	protected String radio = RADIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectronicAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ELECTRONIC_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLan() {
		return lan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLan(String newLan) {
		String oldLan = lan;
		lan = newLan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ELECTRONIC_ADDRESS__LAN, oldLan, lan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ELECTRONIC_ADDRESS__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ELECTRONIC_ADDRESS__USER_ID, oldUserID, userID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ELECTRONIC_ADDRESS__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ELECTRONIC_ADDRESS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeb() {
		return web;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeb(String newWeb) {
		String oldWeb = web;
		web = newWeb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ELECTRONIC_ADDRESS__WEB, oldWeb, web));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ELECTRONIC_ADDRESS__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRadio() {
		return radio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadio(String newRadio) {
		String oldRadio = radio;
		radio = newRadio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ELECTRONIC_ADDRESS__RADIO, oldRadio, radio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.ELECTRONIC_ADDRESS__LAN:
				return getLan();
			case CommonPackage.ELECTRONIC_ADDRESS__EMAIL:
				return getEmail();
			case CommonPackage.ELECTRONIC_ADDRESS__USER_ID:
				return getUserID();
			case CommonPackage.ELECTRONIC_ADDRESS__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case CommonPackage.ELECTRONIC_ADDRESS__WEB:
				return getWeb();
			case CommonPackage.ELECTRONIC_ADDRESS__PASSWORD:
				return getPassword();
			case CommonPackage.ELECTRONIC_ADDRESS__RADIO:
				return getRadio();
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
			case CommonPackage.ELECTRONIC_ADDRESS__LAN:
				setLan((String)newValue);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__EMAIL:
				setEmail((String)newValue);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__USER_ID:
				setUserID((String)newValue);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__STATUS:
				setStatus((Status)newValue);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__WEB:
				setWeb((String)newValue);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__PASSWORD:
				setPassword((String)newValue);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__RADIO:
				setRadio((String)newValue);
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
			case CommonPackage.ELECTRONIC_ADDRESS__LAN:
				setLan(LAN_EDEFAULT);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__STATUS:
				setStatus((Status)null);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__WEB:
				setWeb(WEB_EDEFAULT);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__RADIO:
				setRadio(RADIO_EDEFAULT);
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
			case CommonPackage.ELECTRONIC_ADDRESS__LAN:
				return LAN_EDEFAULT == null ? lan != null : !LAN_EDEFAULT.equals(lan);
			case CommonPackage.ELECTRONIC_ADDRESS__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case CommonPackage.ELECTRONIC_ADDRESS__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case CommonPackage.ELECTRONIC_ADDRESS__STATUS:
				return status != null;
			case CommonPackage.ELECTRONIC_ADDRESS__WEB:
				return WEB_EDEFAULT == null ? web != null : !WEB_EDEFAULT.equals(web);
			case CommonPackage.ELECTRONIC_ADDRESS__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case CommonPackage.ELECTRONIC_ADDRESS__RADIO:
				return RADIO_EDEFAULT == null ? radio != null : !RADIO_EDEFAULT.equals(radio);
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
		result.append(" (lan: ");
		result.append(lan);
		result.append(", email: ");
		result.append(email);
		result.append(", userID: ");
		result.append(userID);
		result.append(", web: ");
		result.append(web);
		result.append(", password: ");
		result.append(password);
		result.append(", radio: ");
		result.append(radio);
		result.append(')');
		return result.toString();
	}

} //ElectronicAddressImpl
