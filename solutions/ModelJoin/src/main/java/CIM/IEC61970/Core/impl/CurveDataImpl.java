/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.Curve;
import CIM.IEC61970.Core.CurveData;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveDataImpl#getXvalue <em>Xvalue</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveDataImpl#getCurve <em>Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveDataImpl#getY2value <em>Y2value</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveDataImpl#getY3value <em>Y3value</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.CurveDataImpl#getY1value <em>Y1value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurveDataImpl extends ElementImpl implements CurveData {
	/**
	 * The default value of the '{@link #getXvalue() <em>Xvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXvalue()
	 * @generated
	 * @ordered
	 */
	protected static final float XVALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXvalue() <em>Xvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXvalue()
	 * @generated
	 * @ordered
	 */
	protected float xvalue = XVALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurve() <em>Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected Curve curve;

	/**
	 * The default value of the '{@link #getY2value() <em>Y2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2value()
	 * @generated
	 * @ordered
	 */
	protected static final float Y2VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY2value() <em>Y2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2value()
	 * @generated
	 * @ordered
	 */
	protected float y2value = Y2VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getY3value() <em>Y3value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3value()
	 * @generated
	 * @ordered
	 */
	protected static final float Y3VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY3value() <em>Y3value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3value()
	 * @generated
	 * @ordered
	 */
	protected float y3value = Y3VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getY1value() <em>Y1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1value()
	 * @generated
	 * @ordered
	 */
	protected static final float Y1VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY1value() <em>Y1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1value()
	 * @generated
	 * @ordered
	 */
	protected float y1value = Y1VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CURVE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXvalue() {
		return xvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXvalue(float newXvalue) {
		float oldXvalue = xvalue;
		xvalue = newXvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE_DATA__XVALUE, oldXvalue, xvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curve getCurve() {
		if (curve != null && curve.eIsProxy()) {
			InternalEObject oldCurve = (InternalEObject)curve;
			curve = (Curve)eResolveProxy(oldCurve);
			if (curve != oldCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CURVE_DATA__CURVE, oldCurve, curve));
			}
		}
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curve basicGetCurve() {
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurve(Curve newCurve, NotificationChain msgs) {
		Curve oldCurve = curve;
		curve = newCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CURVE_DATA__CURVE, oldCurve, newCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurve(Curve newCurve) {
		if (newCurve != curve) {
			NotificationChain msgs = null;
			if (curve != null)
				msgs = ((InternalEObject)curve).eInverseRemove(this, CorePackage.CURVE__CURVE_DATAS, Curve.class, msgs);
			if (newCurve != null)
				msgs = ((InternalEObject)newCurve).eInverseAdd(this, CorePackage.CURVE__CURVE_DATAS, Curve.class, msgs);
			msgs = basicSetCurve(newCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE_DATA__CURVE, newCurve, newCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY2value() {
		return y2value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2value(float newY2value) {
		float oldY2value = y2value;
		y2value = newY2value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE_DATA__Y2VALUE, oldY2value, y2value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY3value() {
		return y3value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY3value(float newY3value) {
		float oldY3value = y3value;
		y3value = newY3value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE_DATA__Y3VALUE, oldY3value, y3value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY1value() {
		return y1value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1value(float newY1value) {
		float oldY1value = y1value;
		y1value = newY1value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE_DATA__Y1VALUE, oldY1value, y1value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CURVE_DATA__CURVE:
				if (curve != null)
					msgs = ((InternalEObject)curve).eInverseRemove(this, CorePackage.CURVE__CURVE_DATAS, Curve.class, msgs);
				return basicSetCurve((Curve)otherEnd, msgs);
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
			case CorePackage.CURVE_DATA__CURVE:
				return basicSetCurve(null, msgs);
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
			case CorePackage.CURVE_DATA__XVALUE:
				return getXvalue();
			case CorePackage.CURVE_DATA__CURVE:
				if (resolve) return getCurve();
				return basicGetCurve();
			case CorePackage.CURVE_DATA__Y2VALUE:
				return getY2value();
			case CorePackage.CURVE_DATA__Y3VALUE:
				return getY3value();
			case CorePackage.CURVE_DATA__Y1VALUE:
				return getY1value();
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
			case CorePackage.CURVE_DATA__XVALUE:
				setXvalue((Float)newValue);
				return;
			case CorePackage.CURVE_DATA__CURVE:
				setCurve((Curve)newValue);
				return;
			case CorePackage.CURVE_DATA__Y2VALUE:
				setY2value((Float)newValue);
				return;
			case CorePackage.CURVE_DATA__Y3VALUE:
				setY3value((Float)newValue);
				return;
			case CorePackage.CURVE_DATA__Y1VALUE:
				setY1value((Float)newValue);
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
			case CorePackage.CURVE_DATA__XVALUE:
				setXvalue(XVALUE_EDEFAULT);
				return;
			case CorePackage.CURVE_DATA__CURVE:
				setCurve((Curve)null);
				return;
			case CorePackage.CURVE_DATA__Y2VALUE:
				setY2value(Y2VALUE_EDEFAULT);
				return;
			case CorePackage.CURVE_DATA__Y3VALUE:
				setY3value(Y3VALUE_EDEFAULT);
				return;
			case CorePackage.CURVE_DATA__Y1VALUE:
				setY1value(Y1VALUE_EDEFAULT);
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
			case CorePackage.CURVE_DATA__XVALUE:
				return xvalue != XVALUE_EDEFAULT;
			case CorePackage.CURVE_DATA__CURVE:
				return curve != null;
			case CorePackage.CURVE_DATA__Y2VALUE:
				return y2value != Y2VALUE_EDEFAULT;
			case CorePackage.CURVE_DATA__Y3VALUE:
				return y3value != Y3VALUE_EDEFAULT;
			case CorePackage.CURVE_DATA__Y1VALUE:
				return y1value != Y1VALUE_EDEFAULT;
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
		result.append(" (xvalue: ");
		result.append(xvalue);
		result.append(", y2value: ");
		result.append(y2value);
		result.append(", y3value: ");
		result.append(y3value);
		result.append(", y1value: ");
		result.append(y1value);
		result.append(')');
		return result.toString();
	}

} //CurveDataImpl
