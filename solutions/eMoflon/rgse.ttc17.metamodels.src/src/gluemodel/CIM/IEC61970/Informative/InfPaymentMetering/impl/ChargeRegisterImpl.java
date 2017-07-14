/**
 */
package gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit;
import gluemodel.CIM.IEC61968.PaymentMetering.ChargeKind;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister;
import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;
import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charge Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.ChargeRegisterImpl#getChargeKind <em>Charge Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.ChargeRegisterImpl#getSPAccountingFunction <em>SP Accounting Function</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.ChargeRegisterImpl#getChargeAmount <em>Charge Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeRegisterImpl extends IdentifiedObjectImpl implements ChargeRegister {
	/**
	 * The default value of the '{@link #getChargeKind() <em>Charge Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeKind()
	 * @generated
	 * @ordered
	 */
	protected static final ChargeKind CHARGE_KIND_EDEFAULT = ChargeKind.AUXILIARY_CHARGE;

	/**
	 * The cached value of the '{@link #getChargeKind() <em>Charge Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeKind()
	 * @generated
	 * @ordered
	 */
	protected ChargeKind chargeKind = CHARGE_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSPAccountingFunction() <em>SP Accounting Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPAccountingFunction()
	 * @generated
	 * @ordered
	 */
	protected SDPAccountingFunction spAccountingFunction;

	/**
	 * The cached value of the '{@link #getChargeAmount() <em>Charge Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeAmount()
	 * @generated
	 * @ordered
	 */
	protected AccountingUnit chargeAmount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargeRegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfPaymentMeteringPackage.Literals.CHARGE_REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeKind getChargeKind() {
		return chargeKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeKind(ChargeKind newChargeKind) {
		ChargeKind oldChargeKind = chargeKind;
		chargeKind = newChargeKind == null ? CHARGE_KIND_EDEFAULT : newChargeKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.CHARGE_REGISTER__CHARGE_KIND, oldChargeKind, chargeKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDPAccountingFunction getSPAccountingFunction() {
		if (spAccountingFunction != null && spAccountingFunction.eIsProxy()) {
			InternalEObject oldSPAccountingFunction = (InternalEObject)spAccountingFunction;
			spAccountingFunction = (SDPAccountingFunction)eResolveProxy(oldSPAccountingFunction);
			if (spAccountingFunction != oldSPAccountingFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.CHARGE_REGISTER__SP_ACCOUNTING_FUNCTION, oldSPAccountingFunction, spAccountingFunction));
			}
		}
		return spAccountingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDPAccountingFunction basicGetSPAccountingFunction() {
		return spAccountingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPAccountingFunction(SDPAccountingFunction newSPAccountingFunction, NotificationChain msgs) {
		SDPAccountingFunction oldSPAccountingFunction = spAccountingFunction;
		spAccountingFunction = newSPAccountingFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.CHARGE_REGISTER__SP_ACCOUNTING_FUNCTION, oldSPAccountingFunction, newSPAccountingFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPAccountingFunction(SDPAccountingFunction newSPAccountingFunction) {
		if (newSPAccountingFunction != spAccountingFunction) {
			NotificationChain msgs = null;
			if (spAccountingFunction != null)
				msgs = ((InternalEObject)spAccountingFunction).eInverseRemove(this, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CHARGE_REGISTERS, SDPAccountingFunction.class, msgs);
			if (newSPAccountingFunction != null)
				msgs = ((InternalEObject)newSPAccountingFunction).eInverseAdd(this, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CHARGE_REGISTERS, SDPAccountingFunction.class, msgs);
			msgs = basicSetSPAccountingFunction(newSPAccountingFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.CHARGE_REGISTER__SP_ACCOUNTING_FUNCTION, newSPAccountingFunction, newSPAccountingFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit getChargeAmount() {
		if (chargeAmount != null && chargeAmount.eIsProxy()) {
			InternalEObject oldChargeAmount = (InternalEObject)chargeAmount;
			chargeAmount = (AccountingUnit)eResolveProxy(oldChargeAmount);
			if (chargeAmount != oldChargeAmount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.CHARGE_REGISTER__CHARGE_AMOUNT, oldChargeAmount, chargeAmount));
			}
		}
		return chargeAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit basicGetChargeAmount() {
		return chargeAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeAmount(AccountingUnit newChargeAmount) {
		AccountingUnit oldChargeAmount = chargeAmount;
		chargeAmount = newChargeAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.CHARGE_REGISTER__CHARGE_AMOUNT, oldChargeAmount, chargeAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfPaymentMeteringPackage.CHARGE_REGISTER__SP_ACCOUNTING_FUNCTION:
				if (spAccountingFunction != null)
					msgs = ((InternalEObject)spAccountingFunction).eInverseRemove(this, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CHARGE_REGISTERS, SDPAccountingFunction.class, msgs);
				return basicSetSPAccountingFunction((SDPAccountingFunction)otherEnd, msgs);
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
			case InfPaymentMeteringPackage.CHARGE_REGISTER__SP_ACCOUNTING_FUNCTION:
				return basicSetSPAccountingFunction(null, msgs);
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
			case InfPaymentMeteringPackage.CHARGE_REGISTER__CHARGE_KIND:
				return getChargeKind();
			case InfPaymentMeteringPackage.CHARGE_REGISTER__SP_ACCOUNTING_FUNCTION:
				if (resolve) return getSPAccountingFunction();
				return basicGetSPAccountingFunction();
			case InfPaymentMeteringPackage.CHARGE_REGISTER__CHARGE_AMOUNT:
				if (resolve) return getChargeAmount();
				return basicGetChargeAmount();
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
			case InfPaymentMeteringPackage.CHARGE_REGISTER__CHARGE_KIND:
				setChargeKind((ChargeKind)newValue);
				return;
			case InfPaymentMeteringPackage.CHARGE_REGISTER__SP_ACCOUNTING_FUNCTION:
				setSPAccountingFunction((SDPAccountingFunction)newValue);
				return;
			case InfPaymentMeteringPackage.CHARGE_REGISTER__CHARGE_AMOUNT:
				setChargeAmount((AccountingUnit)newValue);
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
			case InfPaymentMeteringPackage.CHARGE_REGISTER__CHARGE_KIND:
				setChargeKind(CHARGE_KIND_EDEFAULT);
				return;
			case InfPaymentMeteringPackage.CHARGE_REGISTER__SP_ACCOUNTING_FUNCTION:
				setSPAccountingFunction((SDPAccountingFunction)null);
				return;
			case InfPaymentMeteringPackage.CHARGE_REGISTER__CHARGE_AMOUNT:
				setChargeAmount((AccountingUnit)null);
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
			case InfPaymentMeteringPackage.CHARGE_REGISTER__CHARGE_KIND:
				return chargeKind != CHARGE_KIND_EDEFAULT;
			case InfPaymentMeteringPackage.CHARGE_REGISTER__SP_ACCOUNTING_FUNCTION:
				return spAccountingFunction != null;
			case InfPaymentMeteringPackage.CHARGE_REGISTER__CHARGE_AMOUNT:
				return chargeAmount != null;
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
		result.append(" (chargeKind: ");
		result.append(chargeKind);
		result.append(')');
		return result.toString();
	}

} //ChargeRegisterImpl
