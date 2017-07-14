/**
 */
package gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit;
import gluemodel.CIM.IEC61968.PaymentMetering.CreditKind;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister;
import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;
import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.CreditRegisterImpl#getCreditAmount <em>Credit Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.CreditRegisterImpl#getCreditKind <em>Credit Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.CreditRegisterImpl#getSDPAccountingFunction <em>SDP Accounting Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreditRegisterImpl extends IdentifiedObjectImpl implements CreditRegister {
	/**
	 * The cached value of the '{@link #getCreditAmount() <em>Credit Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected AccountingUnit creditAmount;

	/**
	 * The default value of the '{@link #getCreditKind() <em>Credit Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditKind()
	 * @generated
	 * @ordered
	 */
	protected static final CreditKind CREDIT_KIND_EDEFAULT = CreditKind.TOKEN_CREDIT;

	/**
	 * The cached value of the '{@link #getCreditKind() <em>Credit Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditKind()
	 * @generated
	 * @ordered
	 */
	protected CreditKind creditKind = CREDIT_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSDPAccountingFunction() <em>SDP Accounting Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDPAccountingFunction()
	 * @generated
	 * @ordered
	 */
	protected SDPAccountingFunction sdpAccountingFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditRegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfPaymentMeteringPackage.Literals.CREDIT_REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit getCreditAmount() {
		if (creditAmount != null && creditAmount.eIsProxy()) {
			InternalEObject oldCreditAmount = (InternalEObject)creditAmount;
			creditAmount = (AccountingUnit)eResolveProxy(oldCreditAmount);
			if (creditAmount != oldCreditAmount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.CREDIT_REGISTER__CREDIT_AMOUNT, oldCreditAmount, creditAmount));
			}
		}
		return creditAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit basicGetCreditAmount() {
		return creditAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditAmount(AccountingUnit newCreditAmount) {
		AccountingUnit oldCreditAmount = creditAmount;
		creditAmount = newCreditAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.CREDIT_REGISTER__CREDIT_AMOUNT, oldCreditAmount, creditAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditKind getCreditKind() {
		return creditKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditKind(CreditKind newCreditKind) {
		CreditKind oldCreditKind = creditKind;
		creditKind = newCreditKind == null ? CREDIT_KIND_EDEFAULT : newCreditKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.CREDIT_REGISTER__CREDIT_KIND, oldCreditKind, creditKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDPAccountingFunction getSDPAccountingFunction() {
		if (sdpAccountingFunction != null && sdpAccountingFunction.eIsProxy()) {
			InternalEObject oldSDPAccountingFunction = (InternalEObject)sdpAccountingFunction;
			sdpAccountingFunction = (SDPAccountingFunction)eResolveProxy(oldSDPAccountingFunction);
			if (sdpAccountingFunction != oldSDPAccountingFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.CREDIT_REGISTER__SDP_ACCOUNTING_FUNCTION, oldSDPAccountingFunction, sdpAccountingFunction));
			}
		}
		return sdpAccountingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDPAccountingFunction basicGetSDPAccountingFunction() {
		return sdpAccountingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSDPAccountingFunction(SDPAccountingFunction newSDPAccountingFunction, NotificationChain msgs) {
		SDPAccountingFunction oldSDPAccountingFunction = sdpAccountingFunction;
		sdpAccountingFunction = newSDPAccountingFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.CREDIT_REGISTER__SDP_ACCOUNTING_FUNCTION, oldSDPAccountingFunction, newSDPAccountingFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDPAccountingFunction(SDPAccountingFunction newSDPAccountingFunction) {
		if (newSDPAccountingFunction != sdpAccountingFunction) {
			NotificationChain msgs = null;
			if (sdpAccountingFunction != null)
				msgs = ((InternalEObject)sdpAccountingFunction).eInverseRemove(this, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_REGISTERS, SDPAccountingFunction.class, msgs);
			if (newSDPAccountingFunction != null)
				msgs = ((InternalEObject)newSDPAccountingFunction).eInverseAdd(this, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_REGISTERS, SDPAccountingFunction.class, msgs);
			msgs = basicSetSDPAccountingFunction(newSDPAccountingFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.CREDIT_REGISTER__SDP_ACCOUNTING_FUNCTION, newSDPAccountingFunction, newSDPAccountingFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfPaymentMeteringPackage.CREDIT_REGISTER__SDP_ACCOUNTING_FUNCTION:
				if (sdpAccountingFunction != null)
					msgs = ((InternalEObject)sdpAccountingFunction).eInverseRemove(this, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_REGISTERS, SDPAccountingFunction.class, msgs);
				return basicSetSDPAccountingFunction((SDPAccountingFunction)otherEnd, msgs);
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
			case InfPaymentMeteringPackage.CREDIT_REGISTER__SDP_ACCOUNTING_FUNCTION:
				return basicSetSDPAccountingFunction(null, msgs);
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
			case InfPaymentMeteringPackage.CREDIT_REGISTER__CREDIT_AMOUNT:
				if (resolve) return getCreditAmount();
				return basicGetCreditAmount();
			case InfPaymentMeteringPackage.CREDIT_REGISTER__CREDIT_KIND:
				return getCreditKind();
			case InfPaymentMeteringPackage.CREDIT_REGISTER__SDP_ACCOUNTING_FUNCTION:
				if (resolve) return getSDPAccountingFunction();
				return basicGetSDPAccountingFunction();
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
			case InfPaymentMeteringPackage.CREDIT_REGISTER__CREDIT_AMOUNT:
				setCreditAmount((AccountingUnit)newValue);
				return;
			case InfPaymentMeteringPackage.CREDIT_REGISTER__CREDIT_KIND:
				setCreditKind((CreditKind)newValue);
				return;
			case InfPaymentMeteringPackage.CREDIT_REGISTER__SDP_ACCOUNTING_FUNCTION:
				setSDPAccountingFunction((SDPAccountingFunction)newValue);
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
			case InfPaymentMeteringPackage.CREDIT_REGISTER__CREDIT_AMOUNT:
				setCreditAmount((AccountingUnit)null);
				return;
			case InfPaymentMeteringPackage.CREDIT_REGISTER__CREDIT_KIND:
				setCreditKind(CREDIT_KIND_EDEFAULT);
				return;
			case InfPaymentMeteringPackage.CREDIT_REGISTER__SDP_ACCOUNTING_FUNCTION:
				setSDPAccountingFunction((SDPAccountingFunction)null);
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
			case InfPaymentMeteringPackage.CREDIT_REGISTER__CREDIT_AMOUNT:
				return creditAmount != null;
			case InfPaymentMeteringPackage.CREDIT_REGISTER__CREDIT_KIND:
				return creditKind != CREDIT_KIND_EDEFAULT;
			case InfPaymentMeteringPackage.CREDIT_REGISTER__SDP_ACCOUNTING_FUNCTION:
				return sdpAccountingFunction != null;
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
		result.append(" (creditKind: ");
		result.append(creditKind);
		result.append(')');
		return result.toString();
	}

} //CreditRegisterImpl
