/**
 */
package CIM.IEC61970.Equivalents.impl;

import CIM.IEC61970.Equivalents.EquivalentShunt;
import CIM.IEC61970.Equivalents.EquivalentsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Shunt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Equivalents.impl.EquivalentShuntImpl#getB <em>B</em>}</li>
 *   <li>{@link CIM.IEC61970.Equivalents.impl.EquivalentShuntImpl#getG <em>G</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquivalentShuntImpl extends EquivalentEquipmentImpl implements EquivalentShunt {
	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final float B_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected float b = B_EDEFAULT;

	/**
	 * The default value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected static final float G_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected float g = G_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentShuntImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EquivalentsPackage.Literals.EQUIVALENT_SHUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(float newB) {
		float oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EquivalentsPackage.EQUIVALENT_SHUNT__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getG() {
		return g;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(float newG) {
		float oldG = g;
		g = newG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EquivalentsPackage.EQUIVALENT_SHUNT__G, oldG, g));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EquivalentsPackage.EQUIVALENT_SHUNT__B:
				return getB();
			case EquivalentsPackage.EQUIVALENT_SHUNT__G:
				return getG();
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
			case EquivalentsPackage.EQUIVALENT_SHUNT__B:
				setB((Float)newValue);
				return;
			case EquivalentsPackage.EQUIVALENT_SHUNT__G:
				setG((Float)newValue);
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
			case EquivalentsPackage.EQUIVALENT_SHUNT__B:
				setB(B_EDEFAULT);
				return;
			case EquivalentsPackage.EQUIVALENT_SHUNT__G:
				setG(G_EDEFAULT);
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
			case EquivalentsPackage.EQUIVALENT_SHUNT__B:
				return b != B_EDEFAULT;
			case EquivalentsPackage.EQUIVALENT_SHUNT__G:
				return g != G_EDEFAULT;
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
		result.append(" (b: ");
		result.append(b);
		result.append(", g: ");
		result.append(g);
		result.append(')');
		return result.toString();
	}

} //EquivalentShuntImpl
