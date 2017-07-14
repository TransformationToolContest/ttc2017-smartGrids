/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.UserAttribute;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

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
 * An implementation of the model object '<em><b>Bill Determinant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BillDeterminantImpl#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BillDeterminantImpl#getPrecisionLevel <em>Precision Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BillDeterminantImpl#getChargeProfileData <em>Charge Profile Data</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BillDeterminantImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BillDeterminantImpl#getCalculationLevel <em>Calculation Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BillDeterminantImpl#getConfigVersion <em>Config Version</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BillDeterminantImpl#getChargeProfile <em>Charge Profile</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.BillDeterminantImpl#getNumberInterval <em>Number Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillDeterminantImpl extends DocumentImpl implements BillDeterminant {
	/**
	 * The cached value of the '{@link #getUserAttributes() <em>User Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> userAttributes;

	/**
	 * The default value of the '{@link #getPrecisionLevel() <em>Precision Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECISION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecisionLevel() <em>Precision Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionLevel()
	 * @generated
	 * @ordered
	 */
	protected String precisionLevel = PRECISION_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChargeProfileData() <em>Charge Profile Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeProfileData()
	 * @generated
	 * @ordered
	 */
	protected EList<ChargeProfileData> chargeProfileData;

	/**
	 * The default value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasure()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_OF_MEASURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasure()
	 * @generated
	 * @ordered
	 */
	protected String unitOfMeasure = UNIT_OF_MEASURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalculationLevel() <em>Calculation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String CALCULATION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalculationLevel() <em>Calculation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationLevel()
	 * @generated
	 * @ordered
	 */
	protected String calculationLevel = CALCULATION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigVersion() <em>Config Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigVersion() <em>Config Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigVersion()
	 * @generated
	 * @ordered
	 */
	protected String configVersion = CONFIG_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChargeProfile() <em>Charge Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeProfile()
	 * @generated
	 * @ordered
	 */
	protected ChargeProfile chargeProfile;

	/**
	 * The default value of the '{@link #getNumberInterval() <em>Number Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberInterval() <em>Number Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberInterval()
	 * @generated
	 * @ordered
	 */
	protected int numberInterval = NUMBER_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillDeterminantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.BILL_DETERMINANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttribute> getUserAttributes() {
		if (userAttributes == null) {
			userAttributes = new EObjectWithInverseResolvingEList.ManyInverse<UserAttribute>(UserAttribute.class, this, MarketOperationsPackage.BILL_DETERMINANT__USER_ATTRIBUTES, CommonPackage.USER_ATTRIBUTE__BILL_DETERMINANTS);
		}
		return userAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecisionLevel() {
		return precisionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionLevel(String newPrecisionLevel) {
		String oldPrecisionLevel = precisionLevel;
		precisionLevel = newPrecisionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILL_DETERMINANT__PRECISION_LEVEL, oldPrecisionLevel, precisionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChargeProfileData> getChargeProfileData() {
		if (chargeProfileData == null) {
			chargeProfileData = new EObjectWithInverseResolvingEList<ChargeProfileData>(ChargeProfileData.class, this, MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE_DATA, MarketOperationsPackage.CHARGE_PROFILE_DATA__BILL_DETERMINANT);
		}
		return chargeProfileData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitOfMeasure(String newUnitOfMeasure) {
		String oldUnitOfMeasure = unitOfMeasure;
		unitOfMeasure = newUnitOfMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILL_DETERMINANT__UNIT_OF_MEASURE, oldUnitOfMeasure, unitOfMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalculationLevel() {
		return calculationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationLevel(String newCalculationLevel) {
		String oldCalculationLevel = calculationLevel;
		calculationLevel = newCalculationLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILL_DETERMINANT__CALCULATION_LEVEL, oldCalculationLevel, calculationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigVersion() {
		return configVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigVersion(String newConfigVersion) {
		String oldConfigVersion = configVersion;
		configVersion = newConfigVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILL_DETERMINANT__CONFIG_VERSION, oldConfigVersion, configVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeProfile getChargeProfile() {
		if (chargeProfile != null && chargeProfile.eIsProxy()) {
			InternalEObject oldChargeProfile = (InternalEObject)chargeProfile;
			chargeProfile = (ChargeProfile)eResolveProxy(oldChargeProfile);
			if (chargeProfile != oldChargeProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE, oldChargeProfile, chargeProfile));
			}
		}
		return chargeProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeProfile basicGetChargeProfile() {
		return chargeProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeProfile(ChargeProfile newChargeProfile, NotificationChain msgs) {
		ChargeProfile oldChargeProfile = chargeProfile;
		chargeProfile = newChargeProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE, oldChargeProfile, newChargeProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeProfile(ChargeProfile newChargeProfile) {
		if (newChargeProfile != chargeProfile) {
			NotificationChain msgs = null;
			if (chargeProfile != null)
				msgs = ((InternalEObject)chargeProfile).eInverseRemove(this, MarketOperationsPackage.CHARGE_PROFILE__BILL_DETERMINANT, ChargeProfile.class, msgs);
			if (newChargeProfile != null)
				msgs = ((InternalEObject)newChargeProfile).eInverseAdd(this, MarketOperationsPackage.CHARGE_PROFILE__BILL_DETERMINANT, ChargeProfile.class, msgs);
			msgs = basicSetChargeProfile(newChargeProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE, newChargeProfile, newChargeProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberInterval() {
		return numberInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberInterval(int newNumberInterval) {
		int oldNumberInterval = numberInterval;
		numberInterval = newNumberInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.BILL_DETERMINANT__NUMBER_INTERVAL, oldNumberInterval, numberInterval));
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
			case MarketOperationsPackage.BILL_DETERMINANT__USER_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserAttributes()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE_DATA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChargeProfileData()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE:
				if (chargeProfile != null)
					msgs = ((InternalEObject)chargeProfile).eInverseRemove(this, MarketOperationsPackage.CHARGE_PROFILE__BILL_DETERMINANT, ChargeProfile.class, msgs);
				return basicSetChargeProfile((ChargeProfile)otherEnd, msgs);
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
			case MarketOperationsPackage.BILL_DETERMINANT__USER_ATTRIBUTES:
				return ((InternalEList<?>)getUserAttributes()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE_DATA:
				return ((InternalEList<?>)getChargeProfileData()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE:
				return basicSetChargeProfile(null, msgs);
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
			case MarketOperationsPackage.BILL_DETERMINANT__USER_ATTRIBUTES:
				return getUserAttributes();
			case MarketOperationsPackage.BILL_DETERMINANT__PRECISION_LEVEL:
				return getPrecisionLevel();
			case MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE_DATA:
				return getChargeProfileData();
			case MarketOperationsPackage.BILL_DETERMINANT__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case MarketOperationsPackage.BILL_DETERMINANT__CALCULATION_LEVEL:
				return getCalculationLevel();
			case MarketOperationsPackage.BILL_DETERMINANT__CONFIG_VERSION:
				return getConfigVersion();
			case MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE:
				if (resolve) return getChargeProfile();
				return basicGetChargeProfile();
			case MarketOperationsPackage.BILL_DETERMINANT__NUMBER_INTERVAL:
				return getNumberInterval();
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
			case MarketOperationsPackage.BILL_DETERMINANT__USER_ATTRIBUTES:
				getUserAttributes().clear();
				getUserAttributes().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__PRECISION_LEVEL:
				setPrecisionLevel((String)newValue);
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE_DATA:
				getChargeProfileData().clear();
				getChargeProfileData().addAll((Collection<? extends ChargeProfileData>)newValue);
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__UNIT_OF_MEASURE:
				setUnitOfMeasure((String)newValue);
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__CALCULATION_LEVEL:
				setCalculationLevel((String)newValue);
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__CONFIG_VERSION:
				setConfigVersion((String)newValue);
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE:
				setChargeProfile((ChargeProfile)newValue);
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__NUMBER_INTERVAL:
				setNumberInterval((Integer)newValue);
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
			case MarketOperationsPackage.BILL_DETERMINANT__USER_ATTRIBUTES:
				getUserAttributes().clear();
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__PRECISION_LEVEL:
				setPrecisionLevel(PRECISION_LEVEL_EDEFAULT);
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE_DATA:
				getChargeProfileData().clear();
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__UNIT_OF_MEASURE:
				setUnitOfMeasure(UNIT_OF_MEASURE_EDEFAULT);
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__CALCULATION_LEVEL:
				setCalculationLevel(CALCULATION_LEVEL_EDEFAULT);
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__CONFIG_VERSION:
				setConfigVersion(CONFIG_VERSION_EDEFAULT);
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE:
				setChargeProfile((ChargeProfile)null);
				return;
			case MarketOperationsPackage.BILL_DETERMINANT__NUMBER_INTERVAL:
				setNumberInterval(NUMBER_INTERVAL_EDEFAULT);
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
			case MarketOperationsPackage.BILL_DETERMINANT__USER_ATTRIBUTES:
				return userAttributes != null && !userAttributes.isEmpty();
			case MarketOperationsPackage.BILL_DETERMINANT__PRECISION_LEVEL:
				return PRECISION_LEVEL_EDEFAULT == null ? precisionLevel != null : !PRECISION_LEVEL_EDEFAULT.equals(precisionLevel);
			case MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE_DATA:
				return chargeProfileData != null && !chargeProfileData.isEmpty();
			case MarketOperationsPackage.BILL_DETERMINANT__UNIT_OF_MEASURE:
				return UNIT_OF_MEASURE_EDEFAULT == null ? unitOfMeasure != null : !UNIT_OF_MEASURE_EDEFAULT.equals(unitOfMeasure);
			case MarketOperationsPackage.BILL_DETERMINANT__CALCULATION_LEVEL:
				return CALCULATION_LEVEL_EDEFAULT == null ? calculationLevel != null : !CALCULATION_LEVEL_EDEFAULT.equals(calculationLevel);
			case MarketOperationsPackage.BILL_DETERMINANT__CONFIG_VERSION:
				return CONFIG_VERSION_EDEFAULT == null ? configVersion != null : !CONFIG_VERSION_EDEFAULT.equals(configVersion);
			case MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE:
				return chargeProfile != null;
			case MarketOperationsPackage.BILL_DETERMINANT__NUMBER_INTERVAL:
				return numberInterval != NUMBER_INTERVAL_EDEFAULT;
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
		result.append(" (precisionLevel: ");
		result.append(precisionLevel);
		result.append(", unitOfMeasure: ");
		result.append(unitOfMeasure);
		result.append(", calculationLevel: ");
		result.append(calculationLevel);
		result.append(", configVersion: ");
		result.append(configVersion);
		result.append(", numberInterval: ");
		result.append(numberInterval);
		result.append(')');
		return result.toString();
	}

} //BillDeterminantImpl
