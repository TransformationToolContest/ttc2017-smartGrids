/**
 */
package gluemodel.CIM.IEC61968.Common.impl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.TelephoneNumber;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telephone Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.TelephoneNumberImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.TelephoneNumberImpl#getCityCode <em>City Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.TelephoneNumberImpl#getLocalNumber <em>Local Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.TelephoneNumberImpl#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.TelephoneNumberImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TelephoneNumberImpl extends ElementImpl implements TelephoneNumber {
	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected String countryCode = COUNTRY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCityCode() <em>City Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCityCode() <em>City Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityCode()
	 * @generated
	 * @ordered
	 */
	protected String cityCode = CITY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalNumber() <em>Local Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalNumber() <em>Local Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalNumber()
	 * @generated
	 * @ordered
	 */
	protected String localNumber = LOCAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaCode()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaCode()
	 * @generated
	 * @ordered
	 */
	protected String areaCode = AREA_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelephoneNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TELEPHONE_NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryCode(String newCountryCode) {
		String oldCountryCode = countryCode;
		countryCode = newCountryCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TELEPHONE_NUMBER__COUNTRY_CODE, oldCountryCode, countryCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCityCode(String newCityCode) {
		String oldCityCode = cityCode;
		cityCode = newCityCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TELEPHONE_NUMBER__CITY_CODE, oldCityCode, cityCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalNumber() {
		return localNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalNumber(String newLocalNumber) {
		String oldLocalNumber = localNumber;
		localNumber = newLocalNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TELEPHONE_NUMBER__LOCAL_NUMBER, oldLocalNumber, localNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaCode(String newAreaCode) {
		String oldAreaCode = areaCode;
		areaCode = newAreaCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TELEPHONE_NUMBER__AREA_CODE, oldAreaCode, areaCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TELEPHONE_NUMBER__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
				return getCountryCode();
			case CommonPackage.TELEPHONE_NUMBER__CITY_CODE:
				return getCityCode();
			case CommonPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
				return getLocalNumber();
			case CommonPackage.TELEPHONE_NUMBER__AREA_CODE:
				return getAreaCode();
			case CommonPackage.TELEPHONE_NUMBER__EXTENSION:
				return getExtension();
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
			case CommonPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
				setCountryCode((String)newValue);
				return;
			case CommonPackage.TELEPHONE_NUMBER__CITY_CODE:
				setCityCode((String)newValue);
				return;
			case CommonPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
				setLocalNumber((String)newValue);
				return;
			case CommonPackage.TELEPHONE_NUMBER__AREA_CODE:
				setAreaCode((String)newValue);
				return;
			case CommonPackage.TELEPHONE_NUMBER__EXTENSION:
				setExtension((String)newValue);
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
			case CommonPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
				return;
			case CommonPackage.TELEPHONE_NUMBER__CITY_CODE:
				setCityCode(CITY_CODE_EDEFAULT);
				return;
			case CommonPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
				setLocalNumber(LOCAL_NUMBER_EDEFAULT);
				return;
			case CommonPackage.TELEPHONE_NUMBER__AREA_CODE:
				setAreaCode(AREA_CODE_EDEFAULT);
				return;
			case CommonPackage.TELEPHONE_NUMBER__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
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
			case CommonPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
				return COUNTRY_CODE_EDEFAULT == null ? countryCode != null : !COUNTRY_CODE_EDEFAULT.equals(countryCode);
			case CommonPackage.TELEPHONE_NUMBER__CITY_CODE:
				return CITY_CODE_EDEFAULT == null ? cityCode != null : !CITY_CODE_EDEFAULT.equals(cityCode);
			case CommonPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
				return LOCAL_NUMBER_EDEFAULT == null ? localNumber != null : !LOCAL_NUMBER_EDEFAULT.equals(localNumber);
			case CommonPackage.TELEPHONE_NUMBER__AREA_CODE:
				return AREA_CODE_EDEFAULT == null ? areaCode != null : !AREA_CODE_EDEFAULT.equals(areaCode);
			case CommonPackage.TELEPHONE_NUMBER__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
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
		result.append(" (countryCode: ");
		result.append(countryCode);
		result.append(", cityCode: ");
		result.append(cityCode);
		result.append(", localNumber: ");
		result.append(localNumber);
		result.append(", areaCode: ");
		result.append(areaCode);
		result.append(", extension: ");
		result.append(extension);
		result.append(')');
		return result.toString();
	}

} //TelephoneNumberImpl
