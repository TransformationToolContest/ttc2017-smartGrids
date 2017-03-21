/**
 */
package CIM.IEC61968.PaymentMetering.impl;

import CIM.IEC61968.Common.impl.AgreementImpl;

import CIM.IEC61968.Customers.CustomerAgreement;
import CIM.IEC61968.Customers.CustomersPackage;

import CIM.IEC61968.PaymentMetering.AuxiliaryAccount;
import CIM.IEC61968.PaymentMetering.AuxiliaryAgreement;
import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;

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
 * An implementation of the model object '<em><b>Auxiliary Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl#getAuxCycle <em>Aux Cycle</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl#getAuxRef <em>Aux Ref</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl#getMinAmount <em>Min Amount</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl#getVendPortion <em>Vend Portion</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl#getAuxPriorityCode <em>Aux Priority Code</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl#getArrearsInterest <em>Arrears Interest</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl#getFixedAmount <em>Fixed Amount</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl#getPayCycle <em>Pay Cycle</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl#getVendPortionArrear <em>Vend Portion Arrear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuxiliaryAgreementImpl extends AgreementImpl implements AuxiliaryAgreement {
	/**
	 * The cached value of the '{@link #getCustomerAgreement() <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreement()
	 * @generated
	 * @ordered
	 */
	protected CustomerAgreement customerAgreement;

	/**
	 * The default value of the '{@link #getAuxCycle() <em>Aux Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxCycle()
	 * @generated
	 * @ordered
	 */
	protected static final String AUX_CYCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxCycle() <em>Aux Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxCycle()
	 * @generated
	 * @ordered
	 */
	protected String auxCycle = AUX_CYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxRef() <em>Aux Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxRef()
	 * @generated
	 * @ordered
	 */
	protected static final String AUX_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxRef() <em>Aux Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxRef()
	 * @generated
	 * @ordered
	 */
	protected String auxRef = AUX_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubCategory() <em>Sub Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubCategory() <em>Sub Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory()
	 * @generated
	 * @ordered
	 */
	protected String subCategory = SUB_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinAmount() <em>Min Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinAmount() <em>Min Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAmount()
	 * @generated
	 * @ordered
	 */
	protected float minAmount = MIN_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendPortion() <em>Vend Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendPortion()
	 * @generated
	 * @ordered
	 */
	protected static final float VEND_PORTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVendPortion() <em>Vend Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendPortion()
	 * @generated
	 * @ordered
	 */
	protected float vendPortion = VEND_PORTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxPriorityCode() <em>Aux Priority Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPriorityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String AUX_PRIORITY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxPriorityCode() <em>Aux Priority Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPriorityCode()
	 * @generated
	 * @ordered
	 */
	protected String auxPriorityCode = AUX_PRIORITY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrearsInterest() <em>Arrears Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrearsInterest()
	 * @generated
	 * @ordered
	 */
	protected static final float ARREARS_INTEREST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getArrearsInterest() <em>Arrears Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrearsInterest()
	 * @generated
	 * @ordered
	 */
	protected float arrearsInterest = ARREARS_INTEREST_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedAmount() <em>Fixed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float FIXED_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFixedAmount() <em>Fixed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAmount()
	 * @generated
	 * @ordered
	 */
	protected float fixedAmount = FIXED_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayCycle() <em>Pay Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayCycle()
	 * @generated
	 * @ordered
	 */
	protected static final String PAY_CYCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayCycle() <em>Pay Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayCycle()
	 * @generated
	 * @ordered
	 */
	protected String payCycle = PAY_CYCLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuxiliaryAccounts() <em>Auxiliary Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryAccount> auxiliaryAccounts;

	/**
	 * The default value of the '{@link #getVendPortionArrear() <em>Vend Portion Arrear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendPortionArrear()
	 * @generated
	 * @ordered
	 */
	protected static final float VEND_PORTION_ARREAR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVendPortionArrear() <em>Vend Portion Arrear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendPortionArrear()
	 * @generated
	 * @ordered
	 */
	protected float vendPortionArrear = VEND_PORTION_ARREAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuxiliaryAgreementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.AUXILIARY_AGREEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAgreement getCustomerAgreement() {
		if (customerAgreement != null && customerAgreement.eIsProxy()) {
			InternalEObject oldCustomerAgreement = (InternalEObject)customerAgreement;
			customerAgreement = (CustomerAgreement)eResolveProxy(oldCustomerAgreement);
			if (customerAgreement != oldCustomerAgreement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT, oldCustomerAgreement, customerAgreement));
			}
		}
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAgreement basicGetCustomerAgreement() {
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerAgreement(CustomerAgreement newCustomerAgreement, NotificationChain msgs) {
		CustomerAgreement oldCustomerAgreement = customerAgreement;
		customerAgreement = newCustomerAgreement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT, oldCustomerAgreement, newCustomerAgreement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerAgreement(CustomerAgreement newCustomerAgreement) {
		if (newCustomerAgreement != customerAgreement) {
			NotificationChain msgs = null;
			if (customerAgreement != null)
				msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS, CustomerAgreement.class, msgs);
			if (newCustomerAgreement != null)
				msgs = ((InternalEObject)newCustomerAgreement).eInverseAdd(this, CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS, CustomerAgreement.class, msgs);
			msgs = basicSetCustomerAgreement(newCustomerAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT, newCustomerAgreement, newCustomerAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuxCycle() {
		return auxCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxCycle(String newAuxCycle) {
		String oldAuxCycle = auxCycle;
		auxCycle = newAuxCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_CYCLE, oldAuxCycle, auxCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuxRef() {
		return auxRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxRef(String newAuxRef) {
		String oldAuxRef = auxRef;
		auxRef = newAuxRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_REF, oldAuxRef, auxRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubCategory() {
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubCategory(String newSubCategory) {
		String oldSubCategory = subCategory;
		subCategory = newSubCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_AGREEMENT__SUB_CATEGORY, oldSubCategory, subCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinAmount() {
		return minAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinAmount(float newMinAmount) {
		float oldMinAmount = minAmount;
		minAmount = newMinAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT, oldMinAmount, minAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVendPortion() {
		return vendPortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendPortion(float newVendPortion) {
		float oldVendPortion = vendPortion;
		vendPortion = newVendPortion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION, oldVendPortion, vendPortion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuxPriorityCode() {
		return auxPriorityCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxPriorityCode(String newAuxPriorityCode) {
		String oldAuxPriorityCode = auxPriorityCode;
		auxPriorityCode = newAuxPriorityCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE, oldAuxPriorityCode, auxPriorityCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getArrearsInterest() {
		return arrearsInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrearsInterest(float newArrearsInterest) {
		float oldArrearsInterest = arrearsInterest;
		arrearsInterest = newArrearsInterest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST, oldArrearsInterest, arrearsInterest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFixedAmount() {
		return fixedAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedAmount(float newFixedAmount) {
		float oldFixedAmount = fixedAmount;
		fixedAmount = newFixedAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT, oldFixedAmount, fixedAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPayCycle() {
		return payCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayCycle(String newPayCycle) {
		String oldPayCycle = payCycle;
		payCycle = newPayCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_AGREEMENT__PAY_CYCLE, oldPayCycle, payCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuxiliaryAccount> getAuxiliaryAccounts() {
		if (auxiliaryAccounts == null) {
			auxiliaryAccounts = new EObjectWithInverseResolvingEList<AuxiliaryAccount>(AuxiliaryAccount.class, this, PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS, PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT);
		}
		return auxiliaryAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVendPortionArrear() {
		return vendPortionArrear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendPortionArrear(float newVendPortionArrear) {
		float oldVendPortionArrear = vendPortionArrear;
		vendPortionArrear = newVendPortionArrear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR, oldVendPortionArrear, vendPortionArrear));
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
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
				if (customerAgreement != null)
					msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS, CustomerAgreement.class, msgs);
				return basicSetCustomerAgreement((CustomerAgreement)otherEnd, msgs);
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuxiliaryAccounts()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
				return basicSetCustomerAgreement(null, msgs);
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
				return ((InternalEList<?>)getAuxiliaryAccounts()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
				if (resolve) return getCustomerAgreement();
				return basicGetCustomerAgreement();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
				return getAuxCycle();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_REF:
				return getAuxRef();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__SUB_CATEGORY:
				return getSubCategory();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
				return getMinAmount();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
				return getVendPortion();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
				return getAuxPriorityCode();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
				return getArrearsInterest();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
				return getFixedAmount();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
				return getPayCycle();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
				return getAuxiliaryAccounts();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
				return getVendPortionArrear();
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
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
				setAuxCycle((String)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_REF:
				setAuxRef((String)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__SUB_CATEGORY:
				setSubCategory((String)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
				setMinAmount((Float)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
				setVendPortion((Float)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
				setAuxPriorityCode((String)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
				setArrearsInterest((Float)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
				setFixedAmount((Float)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
				setPayCycle((String)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
				getAuxiliaryAccounts().clear();
				getAuxiliaryAccounts().addAll((Collection<? extends AuxiliaryAccount>)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
				setVendPortionArrear((Float)newValue);
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
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)null);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
				setAuxCycle(AUX_CYCLE_EDEFAULT);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_REF:
				setAuxRef(AUX_REF_EDEFAULT);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__SUB_CATEGORY:
				setSubCategory(SUB_CATEGORY_EDEFAULT);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
				setMinAmount(MIN_AMOUNT_EDEFAULT);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
				setVendPortion(VEND_PORTION_EDEFAULT);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
				setAuxPriorityCode(AUX_PRIORITY_CODE_EDEFAULT);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
				setArrearsInterest(ARREARS_INTEREST_EDEFAULT);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
				setFixedAmount(FIXED_AMOUNT_EDEFAULT);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
				setPayCycle(PAY_CYCLE_EDEFAULT);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
				getAuxiliaryAccounts().clear();
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
				setVendPortionArrear(VEND_PORTION_ARREAR_EDEFAULT);
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
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
				return customerAgreement != null;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
				return AUX_CYCLE_EDEFAULT == null ? auxCycle != null : !AUX_CYCLE_EDEFAULT.equals(auxCycle);
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_REF:
				return AUX_REF_EDEFAULT == null ? auxRef != null : !AUX_REF_EDEFAULT.equals(auxRef);
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__SUB_CATEGORY:
				return SUB_CATEGORY_EDEFAULT == null ? subCategory != null : !SUB_CATEGORY_EDEFAULT.equals(subCategory);
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
				return minAmount != MIN_AMOUNT_EDEFAULT;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
				return vendPortion != VEND_PORTION_EDEFAULT;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
				return AUX_PRIORITY_CODE_EDEFAULT == null ? auxPriorityCode != null : !AUX_PRIORITY_CODE_EDEFAULT.equals(auxPriorityCode);
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
				return arrearsInterest != ARREARS_INTEREST_EDEFAULT;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
				return fixedAmount != FIXED_AMOUNT_EDEFAULT;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
				return PAY_CYCLE_EDEFAULT == null ? payCycle != null : !PAY_CYCLE_EDEFAULT.equals(payCycle);
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
				return auxiliaryAccounts != null && !auxiliaryAccounts.isEmpty();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
				return vendPortionArrear != VEND_PORTION_ARREAR_EDEFAULT;
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
		result.append(" (auxCycle: ");
		result.append(auxCycle);
		result.append(", auxRef: ");
		result.append(auxRef);
		result.append(", subCategory: ");
		result.append(subCategory);
		result.append(", minAmount: ");
		result.append(minAmount);
		result.append(", vendPortion: ");
		result.append(vendPortion);
		result.append(", auxPriorityCode: ");
		result.append(auxPriorityCode);
		result.append(", arrearsInterest: ");
		result.append(arrearsInterest);
		result.append(", fixedAmount: ");
		result.append(fixedAmount);
		result.append(", payCycle: ");
		result.append(payCycle);
		result.append(", vendPortionArrear: ");
		result.append(vendPortionArrear);
		result.append(')');
		return result.toString();
	}

} //AuxiliaryAgreementImpl
