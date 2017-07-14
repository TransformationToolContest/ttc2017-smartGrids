/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.ScaledValueConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scaled Value Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ScaledValueConfigImpl#getScaleFactor <em>Scale Factor</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ScaledValueConfigImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScaledValueConfigImpl extends MinimalEObjectImpl.Container implements ScaledValueConfig {
	/**
	 * The default value of the '{@link #getScaleFactor() <em>Scale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float SCALE_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getScaleFactor() <em>Scale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleFactor()
	 * @generated
	 * @ordered
	 */
	protected float scaleFactor = SCALE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected float offset = OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScaledValueConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.SCALED_VALUE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getScaleFactor() {
		return scaleFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleFactor(float newScaleFactor) {
		float oldScaleFactor = scaleFactor;
		scaleFactor = newScaleFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SCALED_VALUE_CONFIG__SCALE_FACTOR, oldScaleFactor, scaleFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(float newOffset) {
		float oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SCALED_VALUE_CONFIG__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.SCALED_VALUE_CONFIG__SCALE_FACTOR:
				return getScaleFactor();
			case DataclassesPackage.SCALED_VALUE_CONFIG__OFFSET:
				return getOffset();
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
			case DataclassesPackage.SCALED_VALUE_CONFIG__SCALE_FACTOR:
				setScaleFactor((Float)newValue);
				return;
			case DataclassesPackage.SCALED_VALUE_CONFIG__OFFSET:
				setOffset((Float)newValue);
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
			case DataclassesPackage.SCALED_VALUE_CONFIG__SCALE_FACTOR:
				setScaleFactor(SCALE_FACTOR_EDEFAULT);
				return;
			case DataclassesPackage.SCALED_VALUE_CONFIG__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case DataclassesPackage.SCALED_VALUE_CONFIG__SCALE_FACTOR:
				return scaleFactor != SCALE_FACTOR_EDEFAULT;
			case DataclassesPackage.SCALED_VALUE_CONFIG__OFFSET:
				return offset != OFFSET_EDEFAULT;
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
		result.append(" (scaleFactor: ");
		result.append(scaleFactor);
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //ScaledValueConfigImpl
