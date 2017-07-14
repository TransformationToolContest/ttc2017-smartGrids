/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import gluemodel.CIM.impl.ElementImpl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charge Profile Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileDataImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileDataImpl#getChargeProfile <em>Charge Profile</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileDataImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.ChargeProfileDataImpl#getBillDeterminant <em>Bill Determinant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeProfileDataImpl extends ElementImpl implements ChargeProfileData {
	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected int sequence = SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date timeStamp = TIME_STAMP_EDEFAULT;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargeProfileDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.CHARGE_PROFILE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(int newSequence) {
		int oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE_DATA__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(Date newTimeStamp) {
		Date oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE_DATA__TIME_STAMP, oldTimeStamp, timeStamp));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.CHARGE_PROFILE_DATA__CHARGE_PROFILE, oldChargeProfile, chargeProfile));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE_DATA__CHARGE_PROFILE, oldChargeProfile, newChargeProfile);
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
				msgs = ((InternalEObject)chargeProfile).eInverseRemove(this, MarketOperationsPackage.CHARGE_PROFILE__CHARGE_PROFILE_DATA, ChargeProfile.class, msgs);
			if (newChargeProfile != null)
				msgs = ((InternalEObject)newChargeProfile).eInverseAdd(this, MarketOperationsPackage.CHARGE_PROFILE__CHARGE_PROFILE_DATA, ChargeProfile.class, msgs);
			msgs = basicSetChargeProfile(newChargeProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE_DATA__CHARGE_PROFILE, newChargeProfile, newChargeProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE_DATA__VALUE, oldValue, value));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.CHARGE_PROFILE_DATA__BILL_DETERMINANT, oldBillDeterminant, billDeterminant));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE_DATA__BILL_DETERMINANT, oldBillDeterminant, newBillDeterminant);
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
				msgs = ((InternalEObject)billDeterminant).eInverseRemove(this, MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE_DATA, BillDeterminant.class, msgs);
			if (newBillDeterminant != null)
				msgs = ((InternalEObject)newBillDeterminant).eInverseAdd(this, MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE_DATA, BillDeterminant.class, msgs);
			msgs = basicSetBillDeterminant(newBillDeterminant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.CHARGE_PROFILE_DATA__BILL_DETERMINANT, newBillDeterminant, newBillDeterminant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__CHARGE_PROFILE:
				if (chargeProfile != null)
					msgs = ((InternalEObject)chargeProfile).eInverseRemove(this, MarketOperationsPackage.CHARGE_PROFILE__CHARGE_PROFILE_DATA, ChargeProfile.class, msgs);
				return basicSetChargeProfile((ChargeProfile)otherEnd, msgs);
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__BILL_DETERMINANT:
				if (billDeterminant != null)
					msgs = ((InternalEObject)billDeterminant).eInverseRemove(this, MarketOperationsPackage.BILL_DETERMINANT__CHARGE_PROFILE_DATA, BillDeterminant.class, msgs);
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
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__CHARGE_PROFILE:
				return basicSetChargeProfile(null, msgs);
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__BILL_DETERMINANT:
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
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__SEQUENCE:
				return getSequence();
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__TIME_STAMP:
				return getTimeStamp();
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__CHARGE_PROFILE:
				if (resolve) return getChargeProfile();
				return basicGetChargeProfile();
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__VALUE:
				return getValue();
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__BILL_DETERMINANT:
				if (resolve) return getBillDeterminant();
				return basicGetBillDeterminant();
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
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__SEQUENCE:
				setSequence((Integer)newValue);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__TIME_STAMP:
				setTimeStamp((Date)newValue);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__CHARGE_PROFILE:
				setChargeProfile((ChargeProfile)newValue);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__VALUE:
				setValue((Float)newValue);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__BILL_DETERMINANT:
				setBillDeterminant((BillDeterminant)newValue);
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
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__CHARGE_PROFILE:
				setChargeProfile((ChargeProfile)null);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__BILL_DETERMINANT:
				setBillDeterminant((BillDeterminant)null);
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
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__SEQUENCE:
				return sequence != SEQUENCE_EDEFAULT;
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__CHARGE_PROFILE:
				return chargeProfile != null;
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__VALUE:
				return value != VALUE_EDEFAULT;
			case MarketOperationsPackage.CHARGE_PROFILE_DATA__BILL_DETERMINANT:
				return billDeterminant != null;
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
		result.append(" (sequence: ");
		result.append(sequence);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ChargeProfileDataImpl
