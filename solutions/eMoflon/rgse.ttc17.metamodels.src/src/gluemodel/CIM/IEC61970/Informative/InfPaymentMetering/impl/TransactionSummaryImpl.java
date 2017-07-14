/**
 */
package gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.LineDetail;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.Shift;
import gluemodel.CIM.IEC61968.PaymentMetering.TransactionKind;

import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;
import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.TransactionSummaryImpl#getTransactionKind <em>Transaction Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.TransactionSummaryImpl#getLine <em>Line</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.TransactionSummaryImpl#getShift <em>Shift</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionSummaryImpl extends ElementImpl implements TransactionSummary {
	/**
	 * The default value of the '{@link #getTransactionKind() <em>Transaction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransactionKind TRANSACTION_KIND_EDEFAULT = TransactionKind.TOKEN_EXCHANGE;

	/**
	 * The cached value of the '{@link #getTransactionKind() <em>Transaction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionKind()
	 * @generated
	 * @ordered
	 */
	protected TransactionKind transactionKind = TRANSACTION_KIND_EDEFAULT;

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
	 * The cached value of the '{@link #getShift() <em>Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShift()
	 * @generated
	 * @ordered
	 */
	protected Shift shift;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfPaymentMeteringPackage.Literals.TRANSACTION_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionKind getTransactionKind() {
		return transactionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionKind(TransactionKind newTransactionKind) {
		TransactionKind oldTransactionKind = transactionKind;
		transactionKind = newTransactionKind == null ? TRANSACTION_KIND_EDEFAULT : newTransactionKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.TRANSACTION_SUMMARY__TRANSACTION_KIND, oldTransactionKind, transactionKind));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.TRANSACTION_SUMMARY__LINE, oldLine, line));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.TRANSACTION_SUMMARY__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift getShift() {
		if (shift != null && shift.eIsProxy()) {
			InternalEObject oldShift = (InternalEObject)shift;
			shift = (Shift)eResolveProxy(oldShift);
			if (shift != oldShift) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.TRANSACTION_SUMMARY__SHIFT, oldShift, shift));
			}
		}
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift basicGetShift() {
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShift(Shift newShift, NotificationChain msgs) {
		Shift oldShift = shift;
		shift = newShift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.TRANSACTION_SUMMARY__SHIFT, oldShift, newShift);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShift(Shift newShift) {
		if (newShift != shift) {
			NotificationChain msgs = null;
			if (shift != null)
				msgs = ((InternalEObject)shift).eInverseRemove(this, PaymentMeteringPackage.SHIFT__TRANSACTION_SUMMARIES, Shift.class, msgs);
			if (newShift != null)
				msgs = ((InternalEObject)newShift).eInverseAdd(this, PaymentMeteringPackage.SHIFT__TRANSACTION_SUMMARIES, Shift.class, msgs);
			msgs = basicSetShift(newShift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.TRANSACTION_SUMMARY__SHIFT, newShift, newShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__SHIFT:
				if (shift != null)
					msgs = ((InternalEObject)shift).eInverseRemove(this, PaymentMeteringPackage.SHIFT__TRANSACTION_SUMMARIES, Shift.class, msgs);
				return basicSetShift((Shift)otherEnd, msgs);
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
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__SHIFT:
				return basicSetShift(null, msgs);
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
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__TRANSACTION_KIND:
				return getTransactionKind();
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__LINE:
				if (resolve) return getLine();
				return basicGetLine();
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__SHIFT:
				if (resolve) return getShift();
				return basicGetShift();
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
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__TRANSACTION_KIND:
				setTransactionKind((TransactionKind)newValue);
				return;
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__LINE:
				setLine((LineDetail)newValue);
				return;
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__SHIFT:
				setShift((Shift)newValue);
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
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__TRANSACTION_KIND:
				setTransactionKind(TRANSACTION_KIND_EDEFAULT);
				return;
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__LINE:
				setLine((LineDetail)null);
				return;
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__SHIFT:
				setShift((Shift)null);
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
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__TRANSACTION_KIND:
				return transactionKind != TRANSACTION_KIND_EDEFAULT;
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__LINE:
				return line != null;
			case InfPaymentMeteringPackage.TRANSACTION_SUMMARY__SHIFT:
				return shift != null;
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
		result.append(" (transactionKind: ");
		result.append(transactionKind);
		result.append(')');
		return result.toString();
	}

} //TransactionSummaryImpl
