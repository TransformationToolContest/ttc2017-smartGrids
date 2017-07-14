/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfWork.AccessPermit;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Permit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.AccessPermitImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.AccessPermitImpl#getApplicationNumber <em>Application Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.AccessPermitImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.AccessPermitImpl#getPermitID <em>Permit ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.AccessPermitImpl#getPayment <em>Payment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessPermitImpl extends DocumentImpl implements AccessPermit {
	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected String expirationDate = EXPIRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationNumber() <em>Application Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationNumber() <em>Application Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationNumber()
	 * @generated
	 * @ordered
	 */
	protected String applicationNumber = APPLICATION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected String effectiveDate = EFFECTIVE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermitID() <em>Permit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermitID()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMIT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermitID() <em>Permit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermitID()
	 * @generated
	 * @ordered
	 */
	protected String permitID = PERMIT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayment() <em>Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected static final float PAYMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected float payment = PAYMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessPermitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.ACCESS_PERMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(String newExpirationDate) {
		String oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.ACCESS_PERMIT__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationNumber() {
		return applicationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationNumber(String newApplicationNumber) {
		String oldApplicationNumber = applicationNumber;
		applicationNumber = newApplicationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.ACCESS_PERMIT__APPLICATION_NUMBER, oldApplicationNumber, applicationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDate(String newEffectiveDate) {
		String oldEffectiveDate = effectiveDate;
		effectiveDate = newEffectiveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.ACCESS_PERMIT__EFFECTIVE_DATE, oldEffectiveDate, effectiveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPermitID() {
		return permitID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermitID(String newPermitID) {
		String oldPermitID = permitID;
		permitID = newPermitID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.ACCESS_PERMIT__PERMIT_ID, oldPermitID, permitID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayment(float newPayment) {
		float oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.ACCESS_PERMIT__PAYMENT, oldPayment, payment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfWorkPackage.ACCESS_PERMIT__EXPIRATION_DATE:
				return getExpirationDate();
			case InfWorkPackage.ACCESS_PERMIT__APPLICATION_NUMBER:
				return getApplicationNumber();
			case InfWorkPackage.ACCESS_PERMIT__EFFECTIVE_DATE:
				return getEffectiveDate();
			case InfWorkPackage.ACCESS_PERMIT__PERMIT_ID:
				return getPermitID();
			case InfWorkPackage.ACCESS_PERMIT__PAYMENT:
				return getPayment();
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
			case InfWorkPackage.ACCESS_PERMIT__EXPIRATION_DATE:
				setExpirationDate((String)newValue);
				return;
			case InfWorkPackage.ACCESS_PERMIT__APPLICATION_NUMBER:
				setApplicationNumber((String)newValue);
				return;
			case InfWorkPackage.ACCESS_PERMIT__EFFECTIVE_DATE:
				setEffectiveDate((String)newValue);
				return;
			case InfWorkPackage.ACCESS_PERMIT__PERMIT_ID:
				setPermitID((String)newValue);
				return;
			case InfWorkPackage.ACCESS_PERMIT__PAYMENT:
				setPayment((Float)newValue);
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
			case InfWorkPackage.ACCESS_PERMIT__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
				return;
			case InfWorkPackage.ACCESS_PERMIT__APPLICATION_NUMBER:
				setApplicationNumber(APPLICATION_NUMBER_EDEFAULT);
				return;
			case InfWorkPackage.ACCESS_PERMIT__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
				return;
			case InfWorkPackage.ACCESS_PERMIT__PERMIT_ID:
				setPermitID(PERMIT_ID_EDEFAULT);
				return;
			case InfWorkPackage.ACCESS_PERMIT__PAYMENT:
				setPayment(PAYMENT_EDEFAULT);
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
			case InfWorkPackage.ACCESS_PERMIT__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
			case InfWorkPackage.ACCESS_PERMIT__APPLICATION_NUMBER:
				return APPLICATION_NUMBER_EDEFAULT == null ? applicationNumber != null : !APPLICATION_NUMBER_EDEFAULT.equals(applicationNumber);
			case InfWorkPackage.ACCESS_PERMIT__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null ? effectiveDate != null : !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
			case InfWorkPackage.ACCESS_PERMIT__PERMIT_ID:
				return PERMIT_ID_EDEFAULT == null ? permitID != null : !PERMIT_ID_EDEFAULT.equals(permitID);
			case InfWorkPackage.ACCESS_PERMIT__PAYMENT:
				return payment != PAYMENT_EDEFAULT;
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
		result.append(" (expirationDate: ");
		result.append(expirationDate);
		result.append(", applicationNumber: ");
		result.append(applicationNumber);
		result.append(", effectiveDate: ");
		result.append(effectiveDate);
		result.append(", permitID: ");
		result.append(permitID);
		result.append(", payment: ");
		result.append(payment);
		result.append(')');
		return result.toString();
	}

} //AccessPermitImpl
