/**
 */
package gluemodel.CIM.IEC61968.Common.impl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.StreetDetail;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Street Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.StreetDetailImpl#getName <em>Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.StreetDetailImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.StreetDetailImpl#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.StreetDetailImpl#getSuiteNumber <em>Suite Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.StreetDetailImpl#isWithinTownLimits <em>Within Town Limits</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.StreetDetailImpl#getAddressGeneral <em>Address General</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.StreetDetailImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.StreetDetailImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.StreetDetailImpl#getType <em>Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.impl.StreetDetailImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreetDetailImpl extends ElementImpl implements StreetDetail {
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
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildingName() <em>Building Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildingName() <em>Building Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingName()
	 * @generated
	 * @ordered
	 */
	protected String buildingName = BUILDING_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuiteNumber() <em>Suite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuiteNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SUITE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuiteNumber() <em>Suite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuiteNumber()
	 * @generated
	 * @ordered
	 */
	protected String suiteNumber = SUITE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isWithinTownLimits() <em>Within Town Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithinTownLimits()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WITHIN_TOWN_LIMITS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWithinTownLimits() <em>Within Town Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithinTownLimits()
	 * @generated
	 * @ordered
	 */
	protected boolean withinTownLimits = WITHIN_TOWN_LIMITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressGeneral() <em>Address General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressGeneral()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_GENERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressGeneral() <em>Address General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressGeneral()
	 * @generated
	 * @ordered
	 */
	protected String addressGeneral = ADDRESS_GENERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected String suffix = SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreetDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.STREET_DETAIL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_DETAIL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_DETAIL__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuildingName() {
		return buildingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingName(String newBuildingName) {
		String oldBuildingName = buildingName;
		buildingName = newBuildingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_DETAIL__BUILDING_NAME, oldBuildingName, buildingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuiteNumber() {
		return suiteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuiteNumber(String newSuiteNumber) {
		String oldSuiteNumber = suiteNumber;
		suiteNumber = newSuiteNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_DETAIL__SUITE_NUMBER, oldSuiteNumber, suiteNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWithinTownLimits() {
		return withinTownLimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithinTownLimits(boolean newWithinTownLimits) {
		boolean oldWithinTownLimits = withinTownLimits;
		withinTownLimits = newWithinTownLimits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_DETAIL__WITHIN_TOWN_LIMITS, oldWithinTownLimits, withinTownLimits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressGeneral() {
		return addressGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressGeneral(String newAddressGeneral) {
		String oldAddressGeneral = addressGeneral;
		addressGeneral = newAddressGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_DETAIL__ADDRESS_GENERAL, oldAddressGeneral, addressGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_DETAIL__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffix(String newSuffix) {
		String oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_DETAIL__SUFFIX, oldSuffix, suffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_DETAIL__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.STREET_DETAIL__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.STREET_DETAIL__NAME:
				return getName();
			case CommonPackage.STREET_DETAIL__PREFIX:
				return getPrefix();
			case CommonPackage.STREET_DETAIL__BUILDING_NAME:
				return getBuildingName();
			case CommonPackage.STREET_DETAIL__SUITE_NUMBER:
				return getSuiteNumber();
			case CommonPackage.STREET_DETAIL__WITHIN_TOWN_LIMITS:
				return isWithinTownLimits();
			case CommonPackage.STREET_DETAIL__ADDRESS_GENERAL:
				return getAddressGeneral();
			case CommonPackage.STREET_DETAIL__NUMBER:
				return getNumber();
			case CommonPackage.STREET_DETAIL__SUFFIX:
				return getSuffix();
			case CommonPackage.STREET_DETAIL__TYPE:
				return getType();
			case CommonPackage.STREET_DETAIL__CODE:
				return getCode();
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
			case CommonPackage.STREET_DETAIL__NAME:
				setName((String)newValue);
				return;
			case CommonPackage.STREET_DETAIL__PREFIX:
				setPrefix((String)newValue);
				return;
			case CommonPackage.STREET_DETAIL__BUILDING_NAME:
				setBuildingName((String)newValue);
				return;
			case CommonPackage.STREET_DETAIL__SUITE_NUMBER:
				setSuiteNumber((String)newValue);
				return;
			case CommonPackage.STREET_DETAIL__WITHIN_TOWN_LIMITS:
				setWithinTownLimits((Boolean)newValue);
				return;
			case CommonPackage.STREET_DETAIL__ADDRESS_GENERAL:
				setAddressGeneral((String)newValue);
				return;
			case CommonPackage.STREET_DETAIL__NUMBER:
				setNumber((String)newValue);
				return;
			case CommonPackage.STREET_DETAIL__SUFFIX:
				setSuffix((String)newValue);
				return;
			case CommonPackage.STREET_DETAIL__TYPE:
				setType((String)newValue);
				return;
			case CommonPackage.STREET_DETAIL__CODE:
				setCode((String)newValue);
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
			case CommonPackage.STREET_DETAIL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonPackage.STREET_DETAIL__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case CommonPackage.STREET_DETAIL__BUILDING_NAME:
				setBuildingName(BUILDING_NAME_EDEFAULT);
				return;
			case CommonPackage.STREET_DETAIL__SUITE_NUMBER:
				setSuiteNumber(SUITE_NUMBER_EDEFAULT);
				return;
			case CommonPackage.STREET_DETAIL__WITHIN_TOWN_LIMITS:
				setWithinTownLimits(WITHIN_TOWN_LIMITS_EDEFAULT);
				return;
			case CommonPackage.STREET_DETAIL__ADDRESS_GENERAL:
				setAddressGeneral(ADDRESS_GENERAL_EDEFAULT);
				return;
			case CommonPackage.STREET_DETAIL__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case CommonPackage.STREET_DETAIL__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
				return;
			case CommonPackage.STREET_DETAIL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CommonPackage.STREET_DETAIL__CODE:
				setCode(CODE_EDEFAULT);
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
			case CommonPackage.STREET_DETAIL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommonPackage.STREET_DETAIL__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case CommonPackage.STREET_DETAIL__BUILDING_NAME:
				return BUILDING_NAME_EDEFAULT == null ? buildingName != null : !BUILDING_NAME_EDEFAULT.equals(buildingName);
			case CommonPackage.STREET_DETAIL__SUITE_NUMBER:
				return SUITE_NUMBER_EDEFAULT == null ? suiteNumber != null : !SUITE_NUMBER_EDEFAULT.equals(suiteNumber);
			case CommonPackage.STREET_DETAIL__WITHIN_TOWN_LIMITS:
				return withinTownLimits != WITHIN_TOWN_LIMITS_EDEFAULT;
			case CommonPackage.STREET_DETAIL__ADDRESS_GENERAL:
				return ADDRESS_GENERAL_EDEFAULT == null ? addressGeneral != null : !ADDRESS_GENERAL_EDEFAULT.equals(addressGeneral);
			case CommonPackage.STREET_DETAIL__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case CommonPackage.STREET_DETAIL__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
			case CommonPackage.STREET_DETAIL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CommonPackage.STREET_DETAIL__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", buildingName: ");
		result.append(buildingName);
		result.append(", suiteNumber: ");
		result.append(suiteNumber);
		result.append(", withinTownLimits: ");
		result.append(withinTownLimits);
		result.append(", addressGeneral: ");
		result.append(addressGeneral);
		result.append(", number: ");
		result.append(number);
		result.append(", suffix: ");
		result.append(suffix);
		result.append(", type: ");
		result.append(type);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //StreetDetailImpl
