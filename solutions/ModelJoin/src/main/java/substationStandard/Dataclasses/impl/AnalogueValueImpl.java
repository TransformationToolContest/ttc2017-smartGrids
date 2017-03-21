/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.AnalogueValue;
import substationStandard.Dataclasses.DataclassesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analogue Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.AnalogueValueImpl#getI <em>I</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.AnalogueValueImpl#getF <em>F</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogueValueImpl extends MinimalEObjectImpl.Container implements AnalogueValue {
	/**
	 * The default value of the '{@link #getI() <em>I</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI()
	 * @generated
	 * @ordered
	 */
	protected static final int I_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getI() <em>I</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI()
	 * @generated
	 * @ordered
	 */
	protected int i = I_EDEFAULT;

	/**
	 * The default value of the '{@link #getF() <em>F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF()
	 * @generated
	 * @ordered
	 */
	protected static final float F_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getF() <em>F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF()
	 * @generated
	 * @ordered
	 */
	protected float f = F_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogueValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.ANALOGUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getI() {
		return i;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI(int newI) {
		int oldI = i;
		i = newI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ANALOGUE_VALUE__I, oldI, i));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getF() {
		return f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF(float newF) {
		float oldF = f;
		f = newF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ANALOGUE_VALUE__F, oldF, f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.ANALOGUE_VALUE__I:
				return getI();
			case DataclassesPackage.ANALOGUE_VALUE__F:
				return getF();
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
			case DataclassesPackage.ANALOGUE_VALUE__I:
				setI((Integer)newValue);
				return;
			case DataclassesPackage.ANALOGUE_VALUE__F:
				setF((Float)newValue);
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
			case DataclassesPackage.ANALOGUE_VALUE__I:
				setI(I_EDEFAULT);
				return;
			case DataclassesPackage.ANALOGUE_VALUE__F:
				setF(F_EDEFAULT);
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
			case DataclassesPackage.ANALOGUE_VALUE__I:
				return i != I_EDEFAULT;
			case DataclassesPackage.ANALOGUE_VALUE__F:
				return f != F_EDEFAULT;
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
		result.append(" (i: ");
		result.append(i);
		result.append(", f: ");
		result.append(f);
		result.append(')');
		return result.toString();
	}

} //AnalogueValueImpl
