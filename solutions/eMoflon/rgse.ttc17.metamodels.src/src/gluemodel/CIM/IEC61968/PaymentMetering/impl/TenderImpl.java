/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.Card;
import gluemodel.CIM.IEC61968.PaymentMetering.Cheque;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.Receipt;
import gluemodel.CIM.IEC61968.PaymentMetering.Tender;
import gluemodel.CIM.IEC61968.PaymentMetering.TenderKind;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TenderImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TenderImpl#getChange <em>Change</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TenderImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TenderImpl#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TenderImpl#getCheque <em>Cheque</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TenderImpl#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TenderImpl extends IdentifiedObjectImpl implements Tender {
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getChange() <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected static final float CHANGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getChange() <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected float change = CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TenderKind KIND_EDEFAULT = TenderKind.CASH;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TenderKind kind = KIND_EDEFAULT;

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
	 * The cached value of the '{@link #getCheque() <em>Cheque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheque()
	 * @generated
	 * @ordered
	 */
	protected Cheque cheque;

	/**
	 * The cached value of the '{@link #getCard() <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected Card card;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TenderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.TENDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TENDER__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getChange() {
		return change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChange(float newChange) {
		float oldChange = change;
		change = newChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TENDER__CHANGE, oldChange, change));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TenderKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TenderKind newKind) {
		TenderKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TENDER__KIND, oldKind, kind));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.TENDER__RECEIPT, oldReceipt, receipt));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TENDER__RECEIPT, oldReceipt, newReceipt);
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
				msgs = ((InternalEObject)receipt).eInverseRemove(this, PaymentMeteringPackage.RECEIPT__TENDERS, Receipt.class, msgs);
			if (newReceipt != null)
				msgs = ((InternalEObject)newReceipt).eInverseAdd(this, PaymentMeteringPackage.RECEIPT__TENDERS, Receipt.class, msgs);
			msgs = basicSetReceipt(newReceipt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TENDER__RECEIPT, newReceipt, newReceipt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cheque getCheque() {
		if (cheque != null && cheque.eIsProxy()) {
			InternalEObject oldCheque = (InternalEObject)cheque;
			cheque = (Cheque)eResolveProxy(oldCheque);
			if (cheque != oldCheque) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.TENDER__CHEQUE, oldCheque, cheque));
			}
		}
		return cheque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cheque basicGetCheque() {
		return cheque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheque(Cheque newCheque, NotificationChain msgs) {
		Cheque oldCheque = cheque;
		cheque = newCheque;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TENDER__CHEQUE, oldCheque, newCheque);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheque(Cheque newCheque) {
		if (newCheque != cheque) {
			NotificationChain msgs = null;
			if (cheque != null)
				msgs = ((InternalEObject)cheque).eInverseRemove(this, PaymentMeteringPackage.CHEQUE__TENDER, Cheque.class, msgs);
			if (newCheque != null)
				msgs = ((InternalEObject)newCheque).eInverseAdd(this, PaymentMeteringPackage.CHEQUE__TENDER, Cheque.class, msgs);
			msgs = basicSetCheque(newCheque, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TENDER__CHEQUE, newCheque, newCheque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card getCard() {
		if (card != null && card.eIsProxy()) {
			InternalEObject oldCard = (InternalEObject)card;
			card = (Card)eResolveProxy(oldCard);
			if (card != oldCard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.TENDER__CARD, oldCard, card));
			}
		}
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card basicGetCard() {
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCard(Card newCard, NotificationChain msgs) {
		Card oldCard = card;
		card = newCard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TENDER__CARD, oldCard, newCard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCard(Card newCard) {
		if (newCard != card) {
			NotificationChain msgs = null;
			if (card != null)
				msgs = ((InternalEObject)card).eInverseRemove(this, PaymentMeteringPackage.CARD__TENDER, Card.class, msgs);
			if (newCard != null)
				msgs = ((InternalEObject)newCard).eInverseAdd(this, PaymentMeteringPackage.CARD__TENDER, Card.class, msgs);
			msgs = basicSetCard(newCard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TENDER__CARD, newCard, newCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentMeteringPackage.TENDER__RECEIPT:
				if (receipt != null)
					msgs = ((InternalEObject)receipt).eInverseRemove(this, PaymentMeteringPackage.RECEIPT__TENDERS, Receipt.class, msgs);
				return basicSetReceipt((Receipt)otherEnd, msgs);
			case PaymentMeteringPackage.TENDER__CHEQUE:
				if (cheque != null)
					msgs = ((InternalEObject)cheque).eInverseRemove(this, PaymentMeteringPackage.CHEQUE__TENDER, Cheque.class, msgs);
				return basicSetCheque((Cheque)otherEnd, msgs);
			case PaymentMeteringPackage.TENDER__CARD:
				if (card != null)
					msgs = ((InternalEObject)card).eInverseRemove(this, PaymentMeteringPackage.CARD__TENDER, Card.class, msgs);
				return basicSetCard((Card)otherEnd, msgs);
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
			case PaymentMeteringPackage.TENDER__RECEIPT:
				return basicSetReceipt(null, msgs);
			case PaymentMeteringPackage.TENDER__CHEQUE:
				return basicSetCheque(null, msgs);
			case PaymentMeteringPackage.TENDER__CARD:
				return basicSetCard(null, msgs);
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
			case PaymentMeteringPackage.TENDER__AMOUNT:
				return getAmount();
			case PaymentMeteringPackage.TENDER__CHANGE:
				return getChange();
			case PaymentMeteringPackage.TENDER__KIND:
				return getKind();
			case PaymentMeteringPackage.TENDER__RECEIPT:
				if (resolve) return getReceipt();
				return basicGetReceipt();
			case PaymentMeteringPackage.TENDER__CHEQUE:
				if (resolve) return getCheque();
				return basicGetCheque();
			case PaymentMeteringPackage.TENDER__CARD:
				if (resolve) return getCard();
				return basicGetCard();
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
			case PaymentMeteringPackage.TENDER__AMOUNT:
				setAmount((Float)newValue);
				return;
			case PaymentMeteringPackage.TENDER__CHANGE:
				setChange((Float)newValue);
				return;
			case PaymentMeteringPackage.TENDER__KIND:
				setKind((TenderKind)newValue);
				return;
			case PaymentMeteringPackage.TENDER__RECEIPT:
				setReceipt((Receipt)newValue);
				return;
			case PaymentMeteringPackage.TENDER__CHEQUE:
				setCheque((Cheque)newValue);
				return;
			case PaymentMeteringPackage.TENDER__CARD:
				setCard((Card)newValue);
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
			case PaymentMeteringPackage.TENDER__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case PaymentMeteringPackage.TENDER__CHANGE:
				setChange(CHANGE_EDEFAULT);
				return;
			case PaymentMeteringPackage.TENDER__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case PaymentMeteringPackage.TENDER__RECEIPT:
				setReceipt((Receipt)null);
				return;
			case PaymentMeteringPackage.TENDER__CHEQUE:
				setCheque((Cheque)null);
				return;
			case PaymentMeteringPackage.TENDER__CARD:
				setCard((Card)null);
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
			case PaymentMeteringPackage.TENDER__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case PaymentMeteringPackage.TENDER__CHANGE:
				return change != CHANGE_EDEFAULT;
			case PaymentMeteringPackage.TENDER__KIND:
				return kind != KIND_EDEFAULT;
			case PaymentMeteringPackage.TENDER__RECEIPT:
				return receipt != null;
			case PaymentMeteringPackage.TENDER__CHEQUE:
				return cheque != null;
			case PaymentMeteringPackage.TENDER__CARD:
				return card != null;
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
		result.append(" (amount: ");
		result.append(amount);
		result.append(", change: ");
		result.append(change);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //TenderImpl
