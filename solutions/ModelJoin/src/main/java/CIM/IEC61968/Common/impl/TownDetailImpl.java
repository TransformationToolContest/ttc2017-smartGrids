/**
 */
package CIM.IEC61968.Common.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.TownDetail;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Town Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.impl.TownDetailImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TownDetailImpl#getCode <em>Code</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TownDetailImpl#getName <em>Name</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TownDetailImpl#getSection <em>Section</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TownDetailImpl#getStateOrProvince <em>State Or Province</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TownDetailImpl extends ElementImpl implements TownDetail {
	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected String section = SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOrProvince()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_OR_PROVINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOrProvince()
	 * @generated
	 * @ordered
	 */
	protected String stateOrProvince = STATE_OR_PROVINCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TownDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TOWN_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TOWN_DETAIL__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TOWN_DETAIL__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TOWN_DETAIL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSection() {
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(String newSection) {
		String oldSection = section;
		section = newSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TOWN_DETAIL__SECTION, oldSection, section));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateOrProvince() {
		return stateOrProvince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateOrProvince(String newStateOrProvince) {
		String oldStateOrProvince = stateOrProvince;
		stateOrProvince = newStateOrProvince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TOWN_DETAIL__STATE_OR_PROVINCE, oldStateOrProvince, stateOrProvince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.TOWN_DETAIL__COUNTRY:
				return getCountry();
			case CommonPackage.TOWN_DETAIL__CODE:
				return getCode();
			case CommonPackage.TOWN_DETAIL__NAME:
				return getName();
			case CommonPackage.TOWN_DETAIL__SECTION:
				return getSection();
			case CommonPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
				return getStateOrProvince();
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
			case CommonPackage.TOWN_DETAIL__COUNTRY:
				setCountry((String)newValue);
				return;
			case CommonPackage.TOWN_DETAIL__CODE:
				setCode((String)newValue);
				return;
			case CommonPackage.TOWN_DETAIL__NAME:
				setName((String)newValue);
				return;
			case CommonPackage.TOWN_DETAIL__SECTION:
				setSection((String)newValue);
				return;
			case CommonPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
				setStateOrProvince((String)newValue);
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
			case CommonPackage.TOWN_DETAIL__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case CommonPackage.TOWN_DETAIL__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CommonPackage.TOWN_DETAIL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonPackage.TOWN_DETAIL__SECTION:
				setSection(SECTION_EDEFAULT);
				return;
			case CommonPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
				setStateOrProvince(STATE_OR_PROVINCE_EDEFAULT);
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
			case CommonPackage.TOWN_DETAIL__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case CommonPackage.TOWN_DETAIL__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case CommonPackage.TOWN_DETAIL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommonPackage.TOWN_DETAIL__SECTION:
				return SECTION_EDEFAULT == null ? section != null : !SECTION_EDEFAULT.equals(section);
			case CommonPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
				return STATE_OR_PROVINCE_EDEFAULT == null ? stateOrProvince != null : !STATE_OR_PROVINCE_EDEFAULT.equals(stateOrProvince);
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
		result.append(" (country: ");
		result.append(country);
		result.append(", code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", section: ");
		result.append(section);
		result.append(", stateOrProvince: ");
		result.append(stateOrProvince);
		result.append(')');
		return result.toString();
	}

} //TownDetailImpl
