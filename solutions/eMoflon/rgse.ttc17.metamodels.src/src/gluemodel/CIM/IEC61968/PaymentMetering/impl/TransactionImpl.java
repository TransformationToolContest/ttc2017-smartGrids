/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.UserAttribute;

import gluemodel.CIM.IEC61968.Customers.CustomerAccount;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;
import gluemodel.CIM.IEC61968.Customers.PricingStructure;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;

import gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount;
import gluemodel.CIM.IEC61968.PaymentMetering.CashierShift;
import gluemodel.CIM.IEC61968.PaymentMetering.LineDetail;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.Receipt;
import gluemodel.CIM.IEC61968.PaymentMetering.Transaction;
import gluemodel.CIM.IEC61968.PaymentMetering.TransactionKind;
import gluemodel.CIM.IEC61968.PaymentMetering.VendorShift;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

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
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getServiceUnitsError <em>Service Units Error</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getReversedId <em>Reversed Id</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getMeterAsset <em>Meter Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getLine <em>Line</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getReceiverReference <em>Receiver Reference</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getDonorReference <em>Donor Reference</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getVendorShift <em>Vendor Shift</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getCashierShift <em>Cashier Shift</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getAuxiliaryAccount <em>Auxiliary Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getPricingStructure <em>Pricing Structure</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getServiceUnitsEnergy <em>Service Units Energy</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TransactionImpl#getDiverseReference <em>Diverse Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends IdentifiedObjectImpl implements Transaction {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransactionKind KIND_EDEFAULT = TransactionKind.TOKEN_EXCHANGE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TransactionKind kind = KIND_EDEFAULT;

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
	 * The default value of the '{@link #getServiceUnitsError() <em>Service Units Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUnitsError()
	 * @generated
	 * @ordered
	 */
	protected static final float SERVICE_UNITS_ERROR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getServiceUnitsError() <em>Service Units Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUnitsError()
	 * @generated
	 * @ordered
	 */
	protected float serviceUnitsError = SERVICE_UNITS_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getReversedId() <em>Reversed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReversedId()
	 * @generated
	 * @ordered
	 */
	protected static final String REVERSED_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReversedId() <em>Reversed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReversedId()
	 * @generated
	 * @ordered
	 */
	protected String reversedId = REVERSED_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeterAsset() <em>Meter Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterAsset()
	 * @generated
	 * @ordered
	 */
	protected MeterAsset meterAsset;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected LineDetail line;

	/**
	 * The default value of the '{@link #getReceiverReference() <em>Receiver Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVER_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiverReference() <em>Receiver Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverReference()
	 * @generated
	 * @ordered
	 */
	protected String receiverReference = RECEIVER_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDonorReference() <em>Donor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonorReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DONOR_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDonorReference() <em>Donor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonorReference()
	 * @generated
	 * @ordered
	 */
	protected String donorReference = DONOR_REFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVendorShift() <em>Vendor Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorShift()
	 * @generated
	 * @ordered
	 */
	protected VendorShift vendorShift;

	/**
	 * The cached value of the '{@link #getCashierShift() <em>Cashier Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashierShift()
	 * @generated
	 * @ordered
	 */
	protected CashierShift cashierShift;

	/**
	 * The cached value of the '{@link #getAuxiliaryAccount() <em>Auxiliary Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryAccount()
	 * @generated
	 * @ordered
	 */
	protected AuxiliaryAccount auxiliaryAccount;

	/**
	 * The cached value of the '{@link #getPricingStructure() <em>Pricing Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingStructure()
	 * @generated
	 * @ordered
	 */
	protected PricingStructure pricingStructure;

	/**
	 * The default value of the '{@link #getServiceUnitsEnergy() <em>Service Units Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUnitsEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final float SERVICE_UNITS_ENERGY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getServiceUnitsEnergy() <em>Service Units Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUnitsEnergy()
	 * @generated
	 * @ordered
	 */
	protected float serviceUnitsEnergy = SERVICE_UNITS_ENERGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomerAccount() <em>Customer Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAccount()
	 * @generated
	 * @ordered
	 */
	protected CustomerAccount customerAccount;

	/**
	 * The cached value of the '{@link #getReceipt() <em>Receipt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceipt()
	 * @generated
	 * @ordered
	 */
	protected Receipt receipt;

	/**
	 * The default value of the '{@link #getDiverseReference() <em>Diverse Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiverseReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DIVERSE_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiverseReference() <em>Diverse Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiverseReference()
	 * @generated
	 * @ordered
	 */
	protected String diverseReference = DIVERSE_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TransactionKind newKind) {
		TransactionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttribute> getUserAttributes() {
		if (userAttributes == null) {
			userAttributes = new EObjectWithInverseResolvingEList<UserAttribute>(UserAttribute.class, this, PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES, CommonPackage.USER_ATTRIBUTE__TRANSACTION);
		}
		return userAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getServiceUnitsError() {
		return serviceUnitsError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceUnitsError(float newServiceUnitsError) {
		float oldServiceUnitsError = serviceUnitsError;
		serviceUnitsError = newServiceUnitsError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ERROR, oldServiceUnitsError, serviceUnitsError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReversedId() {
		return reversedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReversedId(String newReversedId) {
		String oldReversedId = reversedId;
		reversedId = newReversedId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__REVERSED_ID, oldReversedId, reversedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset getMeterAsset() {
		if (meterAsset != null && meterAsset.eIsProxy()) {
			InternalEObject oldMeterAsset = (InternalEObject)meterAsset;
			meterAsset = (MeterAsset)eResolveProxy(oldMeterAsset);
			if (meterAsset != oldMeterAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.TRANSACTION__METER_ASSET, oldMeterAsset, meterAsset));
			}
		}
		return meterAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset basicGetMeterAsset() {
		return meterAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeterAsset(MeterAsset newMeterAsset, NotificationChain msgs) {
		MeterAsset oldMeterAsset = meterAsset;
		meterAsset = newMeterAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__METER_ASSET, oldMeterAsset, newMeterAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeterAsset(MeterAsset newMeterAsset) {
		if (newMeterAsset != meterAsset) {
			NotificationChain msgs = null;
			if (meterAsset != null)
				msgs = ((InternalEObject)meterAsset).eInverseRemove(this, MeteringPackage.METER_ASSET__VENDING_TRANSACTIONS, MeterAsset.class, msgs);
			if (newMeterAsset != null)
				msgs = ((InternalEObject)newMeterAsset).eInverseAdd(this, MeteringPackage.METER_ASSET__VENDING_TRANSACTIONS, MeterAsset.class, msgs);
			msgs = basicSetMeterAsset(newMeterAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__METER_ASSET, newMeterAsset, newMeterAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineDetail getLine() {
		if (line != null && line.eIsProxy()) {
			InternalEObject oldLine = (InternalEObject)line;
			line = (LineDetail)eResolveProxy(oldLine);
			if (line != oldLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.TRANSACTION__LINE, oldLine, line));
			}
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineDetail basicGetLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(LineDetail newLine) {
		LineDetail oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceiverReference() {
		return receiverReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiverReference(String newReceiverReference) {
		String oldReceiverReference = receiverReference;
		receiverReference = newReceiverReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__RECEIVER_REFERENCE, oldReceiverReference, receiverReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDonorReference() {
		return donorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDonorReference(String newDonorReference) {
		String oldDonorReference = donorReference;
		donorReference = newDonorReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__DONOR_REFERENCE, oldDonorReference, donorReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorShift getVendorShift() {
		if (vendorShift != null && vendorShift.eIsProxy()) {
			InternalEObject oldVendorShift = (InternalEObject)vendorShift;
			vendorShift = (VendorShift)eResolveProxy(oldVendorShift);
			if (vendorShift != oldVendorShift) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT, oldVendorShift, vendorShift));
			}
		}
		return vendorShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorShift basicGetVendorShift() {
		return vendorShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendorShift(VendorShift newVendorShift, NotificationChain msgs) {
		VendorShift oldVendorShift = vendorShift;
		vendorShift = newVendorShift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT, oldVendorShift, newVendorShift);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendorShift(VendorShift newVendorShift) {
		if (newVendorShift != vendorShift) {
			NotificationChain msgs = null;
			if (vendorShift != null)
				msgs = ((InternalEObject)vendorShift).eInverseRemove(this, PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS, VendorShift.class, msgs);
			if (newVendorShift != null)
				msgs = ((InternalEObject)newVendorShift).eInverseAdd(this, PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS, VendorShift.class, msgs);
			msgs = basicSetVendorShift(newVendorShift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT, newVendorShift, newVendorShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashierShift getCashierShift() {
		if (cashierShift != null && cashierShift.eIsProxy()) {
			InternalEObject oldCashierShift = (InternalEObject)cashierShift;
			cashierShift = (CashierShift)eResolveProxy(oldCashierShift);
			if (cashierShift != oldCashierShift) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT, oldCashierShift, cashierShift));
			}
		}
		return cashierShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashierShift basicGetCashierShift() {
		return cashierShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCashierShift(CashierShift newCashierShift, NotificationChain msgs) {
		CashierShift oldCashierShift = cashierShift;
		cashierShift = newCashierShift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT, oldCashierShift, newCashierShift);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCashierShift(CashierShift newCashierShift) {
		if (newCashierShift != cashierShift) {
			NotificationChain msgs = null;
			if (cashierShift != null)
				msgs = ((InternalEObject)cashierShift).eInverseRemove(this, PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS, CashierShift.class, msgs);
			if (newCashierShift != null)
				msgs = ((InternalEObject)newCashierShift).eInverseAdd(this, PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS, CashierShift.class, msgs);
			msgs = basicSetCashierShift(newCashierShift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT, newCashierShift, newCashierShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryAccount getAuxiliaryAccount() {
		if (auxiliaryAccount != null && auxiliaryAccount.eIsProxy()) {
			InternalEObject oldAuxiliaryAccount = (InternalEObject)auxiliaryAccount;
			auxiliaryAccount = (AuxiliaryAccount)eResolveProxy(oldAuxiliaryAccount);
			if (auxiliaryAccount != oldAuxiliaryAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT, oldAuxiliaryAccount, auxiliaryAccount));
			}
		}
		return auxiliaryAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryAccount basicGetAuxiliaryAccount() {
		return auxiliaryAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuxiliaryAccount(AuxiliaryAccount newAuxiliaryAccount, NotificationChain msgs) {
		AuxiliaryAccount oldAuxiliaryAccount = auxiliaryAccount;
		auxiliaryAccount = newAuxiliaryAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT, oldAuxiliaryAccount, newAuxiliaryAccount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxiliaryAccount(AuxiliaryAccount newAuxiliaryAccount) {
		if (newAuxiliaryAccount != auxiliaryAccount) {
			NotificationChain msgs = null;
			if (auxiliaryAccount != null)
				msgs = ((InternalEObject)auxiliaryAccount).eInverseRemove(this, PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS, AuxiliaryAccount.class, msgs);
			if (newAuxiliaryAccount != null)
				msgs = ((InternalEObject)newAuxiliaryAccount).eInverseAdd(this, PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS, AuxiliaryAccount.class, msgs);
			msgs = basicSetAuxiliaryAccount(newAuxiliaryAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT, newAuxiliaryAccount, newAuxiliaryAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingStructure getPricingStructure() {
		if (pricingStructure != null && pricingStructure.eIsProxy()) {
			InternalEObject oldPricingStructure = (InternalEObject)pricingStructure;
			pricingStructure = (PricingStructure)eResolveProxy(oldPricingStructure);
			if (pricingStructure != oldPricingStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE, oldPricingStructure, pricingStructure));
			}
		}
		return pricingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingStructure basicGetPricingStructure() {
		return pricingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPricingStructure(PricingStructure newPricingStructure, NotificationChain msgs) {
		PricingStructure oldPricingStructure = pricingStructure;
		pricingStructure = newPricingStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE, oldPricingStructure, newPricingStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricingStructure(PricingStructure newPricingStructure) {
		if (newPricingStructure != pricingStructure) {
			NotificationChain msgs = null;
			if (pricingStructure != null)
				msgs = ((InternalEObject)pricingStructure).eInverseRemove(this, CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS, PricingStructure.class, msgs);
			if (newPricingStructure != null)
				msgs = ((InternalEObject)newPricingStructure).eInverseAdd(this, CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS, PricingStructure.class, msgs);
			msgs = basicSetPricingStructure(newPricingStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE, newPricingStructure, newPricingStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getServiceUnitsEnergy() {
		return serviceUnitsEnergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceUnitsEnergy(float newServiceUnitsEnergy) {
		float oldServiceUnitsEnergy = serviceUnitsEnergy;
		serviceUnitsEnergy = newServiceUnitsEnergy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ENERGY, oldServiceUnitsEnergy, serviceUnitsEnergy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAccount getCustomerAccount() {
		if (customerAccount != null && customerAccount.eIsProxy()) {
			InternalEObject oldCustomerAccount = (InternalEObject)customerAccount;
			customerAccount = (CustomerAccount)eResolveProxy(oldCustomerAccount);
			if (customerAccount != oldCustomerAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT, oldCustomerAccount, customerAccount));
			}
		}
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAccount basicGetCustomerAccount() {
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerAccount(CustomerAccount newCustomerAccount, NotificationChain msgs) {
		CustomerAccount oldCustomerAccount = customerAccount;
		customerAccount = newCustomerAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT, oldCustomerAccount, newCustomerAccount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerAccount(CustomerAccount newCustomerAccount) {
		if (newCustomerAccount != customerAccount) {
			NotificationChain msgs = null;
			if (customerAccount != null)
				msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS, CustomerAccount.class, msgs);
			if (newCustomerAccount != null)
				msgs = ((InternalEObject)newCustomerAccount).eInverseAdd(this, CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS, CustomerAccount.class, msgs);
			msgs = basicSetCustomerAccount(newCustomerAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT, newCustomerAccount, newCustomerAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt getReceipt() {
		if (receipt != null && receipt.eIsProxy()) {
			InternalEObject oldReceipt = (InternalEObject)receipt;
			receipt = (Receipt)eResolveProxy(oldReceipt);
			if (receipt != oldReceipt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.TRANSACTION__RECEIPT, oldReceipt, receipt));
			}
		}
		return receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt basicGetReceipt() {
		return receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceipt(Receipt newReceipt, NotificationChain msgs) {
		Receipt oldReceipt = receipt;
		receipt = newReceipt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__RECEIPT, oldReceipt, newReceipt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceipt(Receipt newReceipt) {
		if (newReceipt != receipt) {
			NotificationChain msgs = null;
			if (receipt != null)
				msgs = ((InternalEObject)receipt).eInverseRemove(this, PaymentMeteringPackage.RECEIPT__TRANSACTIONS, Receipt.class, msgs);
			if (newReceipt != null)
				msgs = ((InternalEObject)newReceipt).eInverseAdd(this, PaymentMeteringPackage.RECEIPT__TRANSACTIONS, Receipt.class, msgs);
			msgs = basicSetReceipt(newReceipt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__RECEIPT, newReceipt, newReceipt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiverseReference() {
		return diverseReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiverseReference(String newDiverseReference) {
		String oldDiverseReference = diverseReference;
		diverseReference = newDiverseReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TRANSACTION__DIVERSE_REFERENCE, oldDiverseReference, diverseReference));
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
			case PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserAttributes()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__METER_ASSET:
				if (meterAsset != null)
					msgs = ((InternalEObject)meterAsset).eInverseRemove(this, MeteringPackage.METER_ASSET__VENDING_TRANSACTIONS, MeterAsset.class, msgs);
				return basicSetMeterAsset((MeterAsset)otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT:
				if (vendorShift != null)
					msgs = ((InternalEObject)vendorShift).eInverseRemove(this, PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS, VendorShift.class, msgs);
				return basicSetVendorShift((VendorShift)otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT:
				if (cashierShift != null)
					msgs = ((InternalEObject)cashierShift).eInverseRemove(this, PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS, CashierShift.class, msgs);
				return basicSetCashierShift((CashierShift)otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT:
				if (auxiliaryAccount != null)
					msgs = ((InternalEObject)auxiliaryAccount).eInverseRemove(this, PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS, AuxiliaryAccount.class, msgs);
				return basicSetAuxiliaryAccount((AuxiliaryAccount)otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE:
				if (pricingStructure != null)
					msgs = ((InternalEObject)pricingStructure).eInverseRemove(this, CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS, PricingStructure.class, msgs);
				return basicSetPricingStructure((PricingStructure)otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT:
				if (customerAccount != null)
					msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS, CustomerAccount.class, msgs);
				return basicSetCustomerAccount((CustomerAccount)otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__RECEIPT:
				if (receipt != null)
					msgs = ((InternalEObject)receipt).eInverseRemove(this, PaymentMeteringPackage.RECEIPT__TRANSACTIONS, Receipt.class, msgs);
				return basicSetReceipt((Receipt)otherEnd, msgs);
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
			case PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES:
				return ((InternalEList<?>)getUserAttributes()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__METER_ASSET:
				return basicSetMeterAsset(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT:
				return basicSetVendorShift(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT:
				return basicSetCashierShift(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT:
				return basicSetAuxiliaryAccount(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE:
				return basicSetPricingStructure(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT:
				return basicSetCustomerAccount(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__RECEIPT:
				return basicSetReceipt(null, msgs);
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
			case PaymentMeteringPackage.TRANSACTION__KIND:
				return getKind();
			case PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES:
				return getUserAttributes();
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ERROR:
				return getServiceUnitsError();
			case PaymentMeteringPackage.TRANSACTION__REVERSED_ID:
				return getReversedId();
			case PaymentMeteringPackage.TRANSACTION__METER_ASSET:
				if (resolve) return getMeterAsset();
				return basicGetMeterAsset();
			case PaymentMeteringPackage.TRANSACTION__LINE:
				if (resolve) return getLine();
				return basicGetLine();
			case PaymentMeteringPackage.TRANSACTION__RECEIVER_REFERENCE:
				return getReceiverReference();
			case PaymentMeteringPackage.TRANSACTION__DONOR_REFERENCE:
				return getDonorReference();
			case PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT:
				if (resolve) return getVendorShift();
				return basicGetVendorShift();
			case PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT:
				if (resolve) return getCashierShift();
				return basicGetCashierShift();
			case PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT:
				if (resolve) return getAuxiliaryAccount();
				return basicGetAuxiliaryAccount();
			case PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE:
				if (resolve) return getPricingStructure();
				return basicGetPricingStructure();
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ENERGY:
				return getServiceUnitsEnergy();
			case PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT:
				if (resolve) return getCustomerAccount();
				return basicGetCustomerAccount();
			case PaymentMeteringPackage.TRANSACTION__RECEIPT:
				if (resolve) return getReceipt();
				return basicGetReceipt();
			case PaymentMeteringPackage.TRANSACTION__DIVERSE_REFERENCE:
				return getDiverseReference();
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
			case PaymentMeteringPackage.TRANSACTION__KIND:
				setKind((TransactionKind)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES:
				getUserAttributes().clear();
				getUserAttributes().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ERROR:
				setServiceUnitsError((Float)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__REVERSED_ID:
				setReversedId((String)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__METER_ASSET:
				setMeterAsset((MeterAsset)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__LINE:
				setLine((LineDetail)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__RECEIVER_REFERENCE:
				setReceiverReference((String)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__DONOR_REFERENCE:
				setDonorReference((String)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT:
				setVendorShift((VendorShift)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT:
				setCashierShift((CashierShift)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT:
				setAuxiliaryAccount((AuxiliaryAccount)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE:
				setPricingStructure((PricingStructure)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ENERGY:
				setServiceUnitsEnergy((Float)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__RECEIPT:
				setReceipt((Receipt)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__DIVERSE_REFERENCE:
				setDiverseReference((String)newValue);
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
			case PaymentMeteringPackage.TRANSACTION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES:
				getUserAttributes().clear();
				return;
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ERROR:
				setServiceUnitsError(SERVICE_UNITS_ERROR_EDEFAULT);
				return;
			case PaymentMeteringPackage.TRANSACTION__REVERSED_ID:
				setReversedId(REVERSED_ID_EDEFAULT);
				return;
			case PaymentMeteringPackage.TRANSACTION__METER_ASSET:
				setMeterAsset((MeterAsset)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__LINE:
				setLine((LineDetail)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__RECEIVER_REFERENCE:
				setReceiverReference(RECEIVER_REFERENCE_EDEFAULT);
				return;
			case PaymentMeteringPackage.TRANSACTION__DONOR_REFERENCE:
				setDonorReference(DONOR_REFERENCE_EDEFAULT);
				return;
			case PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT:
				setVendorShift((VendorShift)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT:
				setCashierShift((CashierShift)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT:
				setAuxiliaryAccount((AuxiliaryAccount)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE:
				setPricingStructure((PricingStructure)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ENERGY:
				setServiceUnitsEnergy(SERVICE_UNITS_ENERGY_EDEFAULT);
				return;
			case PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__RECEIPT:
				setReceipt((Receipt)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__DIVERSE_REFERENCE:
				setDiverseReference(DIVERSE_REFERENCE_EDEFAULT);
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
			case PaymentMeteringPackage.TRANSACTION__KIND:
				return kind != KIND_EDEFAULT;
			case PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES:
				return userAttributes != null && !userAttributes.isEmpty();
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ERROR:
				return serviceUnitsError != SERVICE_UNITS_ERROR_EDEFAULT;
			case PaymentMeteringPackage.TRANSACTION__REVERSED_ID:
				return REVERSED_ID_EDEFAULT == null ? reversedId != null : !REVERSED_ID_EDEFAULT.equals(reversedId);
			case PaymentMeteringPackage.TRANSACTION__METER_ASSET:
				return meterAsset != null;
			case PaymentMeteringPackage.TRANSACTION__LINE:
				return line != null;
			case PaymentMeteringPackage.TRANSACTION__RECEIVER_REFERENCE:
				return RECEIVER_REFERENCE_EDEFAULT == null ? receiverReference != null : !RECEIVER_REFERENCE_EDEFAULT.equals(receiverReference);
			case PaymentMeteringPackage.TRANSACTION__DONOR_REFERENCE:
				return DONOR_REFERENCE_EDEFAULT == null ? donorReference != null : !DONOR_REFERENCE_EDEFAULT.equals(donorReference);
			case PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT:
				return vendorShift != null;
			case PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT:
				return cashierShift != null;
			case PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT:
				return auxiliaryAccount != null;
			case PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE:
				return pricingStructure != null;
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ENERGY:
				return serviceUnitsEnergy != SERVICE_UNITS_ENERGY_EDEFAULT;
			case PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT:
				return customerAccount != null;
			case PaymentMeteringPackage.TRANSACTION__RECEIPT:
				return receipt != null;
			case PaymentMeteringPackage.TRANSACTION__DIVERSE_REFERENCE:
				return DIVERSE_REFERENCE_EDEFAULT == null ? diverseReference != null : !DIVERSE_REFERENCE_EDEFAULT.equals(diverseReference);
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", serviceUnitsError: ");
		result.append(serviceUnitsError);
		result.append(", reversedId: ");
		result.append(reversedId);
		result.append(", receiverReference: ");
		result.append(receiverReference);
		result.append(", donorReference: ");
		result.append(donorReference);
		result.append(", serviceUnitsEnergy: ");
		result.append(serviceUnitsEnergy);
		result.append(", diverseReference: ");
		result.append(diverseReference);
		result.append(')');
		return result.toString();
	}

} //TransactionImpl
