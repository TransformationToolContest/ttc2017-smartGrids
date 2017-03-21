/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.Point;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.PointImpl#getXVal <em>XVal</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.PointImpl#getYVal <em>YVal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointImpl extends MinimalEObjectImpl.Container implements Point {
	/**
	 * The default value of the '{@link #getXVal() <em>XVal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXVal()
	 * @generated
	 * @ordered
	 */
	protected static final float XVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXVal() <em>XVal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXVal()
	 * @generated
	 * @ordered
	 */
	protected float xVal = XVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getYVal() <em>YVal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYVal()
	 * @generated
	 * @ordered
	 */
	protected static final float YVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getYVal() <em>YVal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYVal()
	 * @generated
	 * @ordered
	 */
	protected float yVal = YVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXVal() {
		return xVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXVal(float newXVal) {
		float oldXVal = xVal;
		xVal = newXVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.POINT__XVAL, oldXVal, xVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYVal() {
		return yVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYVal(float newYVal) {
		float oldYVal = yVal;
		yVal = newYVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.POINT__YVAL, oldYVal, yVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.POINT__XVAL:
				return getXVal();
			case DataclassesPackage.POINT__YVAL:
				return getYVal();
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
			case DataclassesPackage.POINT__XVAL:
				setXVal((Float)newValue);
				return;
			case DataclassesPackage.POINT__YVAL:
				setYVal((Float)newValue);
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
			case DataclassesPackage.POINT__XVAL:
				setXVal(XVAL_EDEFAULT);
				return;
			case DataclassesPackage.POINT__YVAL:
				setYVal(YVAL_EDEFAULT);
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
			case DataclassesPackage.POINT__XVAL:
				return xVal != XVAL_EDEFAULT;
			case DataclassesPackage.POINT__YVAL:
				return yVal != YVAL_EDEFAULT;
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
		result.append(" (xVal: ");
		result.append(xVal);
		result.append(", yVal: ");
		result.append(yVal);
		result.append(')');
		return result.toString();
	}

} //PointImpl
