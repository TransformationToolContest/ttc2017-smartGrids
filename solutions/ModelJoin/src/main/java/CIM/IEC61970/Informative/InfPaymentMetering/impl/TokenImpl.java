/**
 */
package CIM.IEC61970.Informative.InfPaymentMetering.impl;

import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM.IEC61968.PaymentMetering.PointOfSale;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;
import CIM.IEC61970.Informative.InfPaymentMetering.Token;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.TokenImpl#getPointOfSale <em>Point Of Sale</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.TokenImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.TokenImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenImpl extends IdentifiedObjectImpl implements Token {
	/**
	 * The cached value of the '{@link #getPointOfSale() <em>Point Of Sale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOfSale()
	 * @generated
	 * @ordered
	 */
	protected PointOfSale pointOfSale;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfPaymentMeteringPackage.Literals.TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfSale getPointOfSale() {
		if (pointOfSale != null && pointOfSale.eIsProxy()) {
			InternalEObject oldPointOfSale = (InternalEObject)pointOfSale;
			pointOfSale = (PointOfSale)eResolveProxy(oldPointOfSale);
			if (pointOfSale != oldPointOfSale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.TOKEN__POINT_OF_SALE, oldPointOfSale, pointOfSale));
			}
		}
		return pointOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfSale basicGetPointOfSale() {
		return pointOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointOfSale(PointOfSale newPointOfSale, NotificationChain msgs) {
		PointOfSale oldPointOfSale = pointOfSale;
		pointOfSale = newPointOfSale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.TOKEN__POINT_OF_SALE, oldPointOfSale, newPointOfSale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOfSale(PointOfSale newPointOfSale) {
		if (newPointOfSale != pointOfSale) {
			NotificationChain msgs = null;
			if (pointOfSale != null)
				msgs = ((InternalEObject)pointOfSale).eInverseRemove(this, PaymentMeteringPackage.POINT_OF_SALE__TOKENS, PointOfSale.class, msgs);
			if (newPointOfSale != null)
				msgs = ((InternalEObject)newPointOfSale).eInverseAdd(this, PaymentMeteringPackage.POINT_OF_SALE__TOKENS, PointOfSale.class, msgs);
			msgs = basicSetPointOfSale(newPointOfSale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.TOKEN__POINT_OF_SALE, newPointOfSale, newPointOfSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.TOKEN__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.TOKEN__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfPaymentMeteringPackage.TOKEN__POINT_OF_SALE:
				if (pointOfSale != null)
					msgs = ((InternalEObject)pointOfSale).eInverseRemove(this, PaymentMeteringPackage.POINT_OF_SALE__TOKENS, PointOfSale.class, msgs);
				return basicSetPointOfSale((PointOfSale)otherEnd, msgs);
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
			case InfPaymentMeteringPackage.TOKEN__POINT_OF_SALE:
				return basicSetPointOfSale(null, msgs);
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
			case InfPaymentMeteringPackage.TOKEN__POINT_OF_SALE:
				if (resolve) return getPointOfSale();
				return basicGetPointOfSale();
			case InfPaymentMeteringPackage.TOKEN__COMMENT:
				return getComment();
			case InfPaymentMeteringPackage.TOKEN__CODE:
				return getCode();
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
			case InfPaymentMeteringPackage.TOKEN__POINT_OF_SALE:
				setPointOfSale((PointOfSale)newValue);
				return;
			case InfPaymentMeteringPackage.TOKEN__COMMENT:
				setComment((String)newValue);
				return;
			case InfPaymentMeteringPackage.TOKEN__CODE:
				setCode((String)newValue);
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
			case InfPaymentMeteringPackage.TOKEN__POINT_OF_SALE:
				setPointOfSale((PointOfSale)null);
				return;
			case InfPaymentMeteringPackage.TOKEN__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case InfPaymentMeteringPackage.TOKEN__CODE:
				setCode(CODE_EDEFAULT);
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
			case InfPaymentMeteringPackage.TOKEN__POINT_OF_SALE:
				return pointOfSale != null;
			case InfPaymentMeteringPackage.TOKEN__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case InfPaymentMeteringPackage.TOKEN__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //TokenImpl
