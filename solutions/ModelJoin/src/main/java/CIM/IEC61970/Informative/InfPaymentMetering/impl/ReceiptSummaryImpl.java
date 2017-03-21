/**
 */
package CIM.IEC61970.Informative.InfPaymentMetering.impl;

import CIM.IEC61968.PaymentMetering.LineDetail;
import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM.IEC61968.PaymentMetering.Shift;
import CIM.IEC61968.PaymentMetering.TenderKind;

import CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;
import CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receipt Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.ReceiptSummaryImpl#getLine <em>Line</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.ReceiptSummaryImpl#getTenderKind <em>Tender Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.ReceiptSummaryImpl#getShift <em>Shift</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiptSummaryImpl extends ElementImpl implements ReceiptSummary {
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
	 * The default value of the '{@link #getTenderKind() <em>Tender Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenderKind()
	 * @generated
	 * @ordered
	 */
	protected static final TenderKind TENDER_KIND_EDEFAULT = TenderKind.CASH;

	/**
	 * The cached value of the '{@link #getTenderKind() <em>Tender Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenderKind()
	 * @generated
	 * @ordered
	 */
	protected TenderKind tenderKind = TENDER_KIND_EDEFAULT;

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
	protected ReceiptSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfPaymentMeteringPackage.Literals.RECEIPT_SUMMARY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.RECEIPT_SUMMARY__LINE, oldLine, line));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.RECEIPT_SUMMARY__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TenderKind getTenderKind() {
		return tenderKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenderKind(TenderKind newTenderKind) {
		TenderKind oldTenderKind = tenderKind;
		tenderKind = newTenderKind == null ? TENDER_KIND_EDEFAULT : newTenderKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.RECEIPT_SUMMARY__TENDER_KIND, oldTenderKind, tenderKind));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.RECEIPT_SUMMARY__SHIFT, oldShift, shift));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.RECEIPT_SUMMARY__SHIFT, oldShift, newShift);
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
				msgs = ((InternalEObject)shift).eInverseRemove(this, PaymentMeteringPackage.SHIFT__RECEIPT_SUMMARIES, Shift.class, msgs);
			if (newShift != null)
				msgs = ((InternalEObject)newShift).eInverseAdd(this, PaymentMeteringPackage.SHIFT__RECEIPT_SUMMARIES, Shift.class, msgs);
			msgs = basicSetShift(newShift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.RECEIPT_SUMMARY__SHIFT, newShift, newShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__SHIFT:
				if (shift != null)
					msgs = ((InternalEObject)shift).eInverseRemove(this, PaymentMeteringPackage.SHIFT__RECEIPT_SUMMARIES, Shift.class, msgs);
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
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__SHIFT:
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
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__LINE:
				if (resolve) return getLine();
				return basicGetLine();
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__TENDER_KIND:
				return getTenderKind();
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__SHIFT:
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
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__LINE:
				setLine((LineDetail)newValue);
				return;
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__TENDER_KIND:
				setTenderKind((TenderKind)newValue);
				return;
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__SHIFT:
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
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__LINE:
				setLine((LineDetail)null);
				return;
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__TENDER_KIND:
				setTenderKind(TENDER_KIND_EDEFAULT);
				return;
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__SHIFT:
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
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__LINE:
				return line != null;
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__TENDER_KIND:
				return tenderKind != TENDER_KIND_EDEFAULT;
			case InfPaymentMeteringPackage.RECEIPT_SUMMARY__SHIFT:
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
		result.append(" (tenderKind: ");
		result.append(tenderKind);
		result.append(')');
		return result.toString();
	}

} //ReceiptSummaryImpl
