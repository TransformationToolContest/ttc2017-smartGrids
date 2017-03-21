/**
 */
package CIM.IEC61970.Informative.InfCommon.impl;

import CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import CIM.IEC61970.Informative.InfCommon.Ratio;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ratio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.RatioImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.RatioImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatioImpl extends ElementImpl implements Ratio {
	/**
	 * The default value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected static final float NUMERATOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected float numerator = NUMERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final float DENOMINATOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected float denominator = DENOMINATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.RATIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNumerator() {
		return numerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumerator(float newNumerator) {
		float oldNumerator = numerator;
		numerator = newNumerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.RATIO__NUMERATOR, oldNumerator, numerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominator(float newDenominator) {
		float oldDenominator = denominator;
		denominator = newDenominator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.RATIO__DENOMINATOR, oldDenominator, denominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfCommonPackage.RATIO__NUMERATOR:
				return getNumerator();
			case InfCommonPackage.RATIO__DENOMINATOR:
				return getDenominator();
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
			case InfCommonPackage.RATIO__NUMERATOR:
				setNumerator((Float)newValue);
				return;
			case InfCommonPackage.RATIO__DENOMINATOR:
				setDenominator((Float)newValue);
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
			case InfCommonPackage.RATIO__NUMERATOR:
				setNumerator(NUMERATOR_EDEFAULT);
				return;
			case InfCommonPackage.RATIO__DENOMINATOR:
				setDenominator(DENOMINATOR_EDEFAULT);
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
			case InfCommonPackage.RATIO__NUMERATOR:
				return numerator != NUMERATOR_EDEFAULT;
			case InfCommonPackage.RATIO__DENOMINATOR:
				return denominator != DENOMINATOR_EDEFAULT;
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
		result.append(" (numerator: ");
		result.append(numerator);
		result.append(", denominator: ");
		result.append(denominator);
		result.append(')');
		return result.toString();
	}

} //RatioImpl
