/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill;

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
 * An implementation of the model object '<em><b>Charge Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileImpl#getPassTroughBill <em>Pass Trough Bill</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileImpl#getType <em>Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileImpl#getChargeProfileData <em>Charge Profile Data</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileImpl#getBillDeterminant <em>Bill Determinant</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileImpl#getNumberInterval <em>Number Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeProfileImpl extends ProfileImpl implements ChargeProfile {
	/**
	 * The cached value of the '{@link #getPassTroughBill() <em>Pass Trough Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassTroughBill()
	 * @generated
	 * @ordered
	 */
	protected PassThroughBill passTroughBill;

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
	 * The cached value of the '{@link #getBillDeterminant() <em>Bill Determinant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillDeterminant()
	 * @generated
	 * @ordered
	 */
	protected BillDeterminant billDeterminant;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected String frequency = FREQUENCY_EDEFAULT;

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
	protected ChargeProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.CHARGE_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassThroughBill getPassTroughBill() {
		if (passTroughBill != null && passTroughBill.eIsProxy()) {
			InternalEObject oldPassTroughBill = (InternalEObject)passTroughBill;
			passTroughBill = (PassThroughBill)eResolveProxy(oldPassTroughBill);
			if (passTroughBill != oldPassTroughBill) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.CHARGE_PROFILE__PASS_TROUGH_BILL, oldPassTroughBill, passTroughBill));
			}
		}
		return passTroughBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassThroughBill basicGetPassTroughBill() {
		return passTroughBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassTroughBill(PassThroughBill newPassTroughBill, NotificationChain msgs) {
		PassThroughBill oldPassTroughBill = passTroughBill;
		passTroughBill = newPassTroughBill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE__PASS_TROUGH_BILL, oldPassTroughBill, newPassTroughBill);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassTroughBill(PassThroughBill newPassTroughBill) {
		if (newPassTroughBill != passTroughBill) {
			NotificationChain msgs = null;
			if (passTroughBill != null)
				msgs = ((InternalEObject)passTroughBill).eInverseRemove(this, MarketOperationsPackage.PASS_THROUGH_BILL__CHARGE_PROFILES, PassThroughBill.class, msgs);
			if (newPassTroughBill != null)
				msgs = ((InternalEObject)newPassTroughBill).eInverseAdd(this, MarketOperationsPackage.PASS_THROUGH_BILL__CHARGE_PROFILES, PassThroughBill.class, msgs);
			msgs = basicSetPassTroughBill(newPassTroughBill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE__PASS_TROUGH_BILL, newPassTroughBill, newPassTroughBill));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChargeProfileData> getChargeProfileData() {
		if (chargeProfileData == null) {
			chargeProfileData = new EObjectWithInverseResolvingEList<ChargeProfileData>(ChargeProfileData.class, this, MarketOperationsPackage.CHARGE_PROFILE__CHARGE_PROFILE_DATA, MarketOperationsPackage.CHARGE_PROFILE_DATA__CHARGE_PROFILE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE__UNIT_OF_MEASURE, oldUnitOfMeasure, unitOfMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillDeterminant getBillDeterminant() {
		if (billDeterminant != null && billDeterminant.eIsProxy()) {
			InternalEObject oldBillDeterminant = (InternalEObject)billDeterminant;
			billDeterminant = (BillDeterminant)eResolveProxy(oldBillDeterminant);
			if (billDeterminant != oldBillDeterminant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.CHARGE_PROFILE__BILL_DETERMINANT, oldBillDeterminant, billDeterminant));
			}
		}
		return billDeterminant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillDeterminant basicGetBillDeterminant() {
		return billDeterminant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillDeterminant(BillDeterminant newBillDeterminant, NotificationChain msgs) {
		BillDeterminant oldBillDeterminant = billDeterminant;
		billDeterminant = newBillDeterminant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE__BILL_DETERMINANT, oldBillDeterminant, newBillDeterminant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillDeterminant(BillDeterminant newBillDeterminant) {
		if (newBillDeterminant != billDeterminant) {
			NotificationChain msgs = null;
			if (billDeterminant != null)
				msgs = ((InternalEObject)billDeterminant).eInverseRemove(this, MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE, BillDeterminant.class, msgs);
			if (newBillDeterminant != null)
				msgs = ((InternalEObject)newBillDeterminant).eInverseAdd(this, MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE, BillDeterminant.class, msgs);
			msgs = basicSetBillDeterminant(newBillDeterminant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE__BILL_DETERMINANT, newBillDeterminant, newBillDeterminant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(String newFrequency) {
		String oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE__FREQUENCY, oldFrequency, frequency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE__NUMBER_INTERVAL, oldNumberInterval, numberInterval));
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
			case MarketOperationsPackage.CHARGE_PROFILE__PASS_TROUGH_BILL:
				if (passTroughBill != null)
					msgs = ((InternalEObject)passTroughBill).eInverseRemove(this, MarketOperationsPackage.PASS_THROUGH_BILL__CHARGE_PROFILES, PassThroughBill.class, msgs);
				return basicSetPassTroughBill((PassThroughBill)otherEnd, msgs);
			case MarketOperationsPackage.CHARGE_PROFILE__CHARGE_PROFILE_DATA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChargeProfileData()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.CHARGE_PROFILE__BILL_DETERMINANT:
				if (billDeterminant != null)
					msgs = ((InternalEObject)billDeterminant).eInverseRemove(this, MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE, BillDeterminant.class, msgs);
				return basicSetBillDeterminant((BillDeterminant)otherEnd, msgs);
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
			case MarketOperationsPackage.CHARGE_PROFILE__PASS_TROUGH_BILL:
				return basicSetPassTroughBill(null, msgs);
			case MarketOperationsPackage.CHARGE_PROFILE__CHARGE_PROFILE_DATA:
				return ((InternalEList<?>)getChargeProfileData()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.CHARGE_PROFILE__BILL_DETERMINANT:
				return basicSetBillDeterminant(null, msgs);
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
			case MarketOperationsPackage.CHARGE_PROFILE__PASS_TROUGH_BILL:
				if (resolve) return getPassTroughBill();
				return basicGetPassTroughBill();
			case MarketOperationsPackage.CHARGE_PROFILE__TYPE:
				return getType();
			case MarketOperationsPackage.CHARGE_PROFILE__CHARGE_PROFILE_DATA:
				return getChargeProfileData();
			case MarketOperationsPackage.CHARGE_PROFILE__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case MarketOperationsPackage.CHARGE_PROFILE__BILL_DETERMINANT:
				if (resolve) return getBillDeterminant();
				return basicGetBillDeterminant();
			case MarketOperationsPackage.CHARGE_PROFILE__FREQUENCY:
				return getFrequency();
			case MarketOperationsPackage.CHARGE_PROFILE__NUMBER_INTERVAL:
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
			case MarketOperationsPackage.CHARGE_PROFILE__PASS_TROUGH_BILL:
				setPassTroughBill((PassThroughBill)newValue);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE__TYPE:
				setType((String)newValue);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE__CHARGE_PROFILE_DATA:
				getChargeProfileData().clear();
				getChargeProfileData().addAll((Collection<? extends ChargeProfileData>)newValue);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE__UNIT_OF_MEASURE:
				setUnitOfMeasure((String)newValue);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE__BILL_DETERMINANT:
				setBillDeterminant((BillDeterminant)newValue);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE__FREQUENCY:
				setFrequency((String)newValue);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE__NUMBER_INTERVAL:
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
			case MarketOperationsPackage.CHARGE_PROFILE__PASS_TROUGH_BILL:
				setPassTroughBill((PassThroughBill)null);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE__CHARGE_PROFILE_DATA:
				getChargeProfileData().clear();
				return;
			case MarketOperationsPackage.CHARGE_PROFILE__UNIT_OF_MEASURE:
				setUnitOfMeasure(UNIT_OF_MEASURE_EDEFAULT);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE__BILL_DETERMINANT:
				setBillDeterminant((BillDeterminant)null);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE__NUMBER_INTERVAL:
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
			case MarketOperationsPackage.CHARGE_PROFILE__PASS_TROUGH_BILL:
				return passTroughBill != null;
			case MarketOperationsPackage.CHARGE_PROFILE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MarketOperationsPackage.CHARGE_PROFILE__CHARGE_PROFILE_DATA:
				return chargeProfileData != null && !chargeProfileData.isEmpty();
			case MarketOperationsPackage.CHARGE_PROFILE__UNIT_OF_MEASURE:
				return UNIT_OF_MEASURE_EDEFAULT == null ? unitOfMeasure != null : !UNIT_OF_MEASURE_EDEFAULT.equals(unitOfMeasure);
			case MarketOperationsPackage.CHARGE_PROFILE__BILL_DETERMINANT:
				return billDeterminant != null;
			case MarketOperationsPackage.CHARGE_PROFILE__FREQUENCY:
				return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
			case MarketOperationsPackage.CHARGE_PROFILE__NUMBER_INTERVAL:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", unitOfMeasure: ");
		result.append(unitOfMeasure);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", numberInterval: ");
		result.append(numberInterval);
		result.append(')');
		return result.toString();
	}

} //ChargeProfileImpl
