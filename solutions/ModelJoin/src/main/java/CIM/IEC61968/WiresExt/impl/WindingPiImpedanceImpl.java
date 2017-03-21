/**
 */
package CIM.IEC61968.WiresExt.impl;

import CIM.IEC61968.WiresExt.DistributionTransformerWinding;
import CIM.IEC61968.WiresExt.WindingPiImpedance;
import CIM.IEC61968.WiresExt.WiresExtPackage;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Winding Pi Impedance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl#getX <em>X</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl#getR <em>R</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl#getG <em>G</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl#getB <em>B</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl#getWindings <em>Windings</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl#getG0 <em>G0</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.WindingPiImpedanceImpl#getB0 <em>B0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindingPiImpedanceImpl extends IdentifiedObjectImpl implements WindingPiImpedance {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final float R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected float r = R_EDEFAULT;

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
	 * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected static final float R0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected float r0 = R0_EDEFAULT;

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
	 * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected static final float X0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected float x0 = X0_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWindings() <em>Windings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindings()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionTransformerWinding> windings;

	/**
	 * The default value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected static final float G0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected float g0 = G0_EDEFAULT;

	/**
	 * The default value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected static final float B0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected float b0 = B0_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindingPiImpedanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresExtPackage.Literals.WINDING_PI_IMPEDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		float oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.WINDING_PI_IMPEDANCE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(float newR) {
		float oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.WINDING_PI_IMPEDANCE__R, oldR, r));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.WINDING_PI_IMPEDANCE__G, oldG, g));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR0() {
		return r0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR0(float newR0) {
		float oldR0 = r0;
		r0 = newR0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.WINDING_PI_IMPEDANCE__R0, oldR0, r0));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.WINDING_PI_IMPEDANCE__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX0() {
		return x0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX0(float newX0) {
		float oldX0 = x0;
		x0 = newX0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.WINDING_PI_IMPEDANCE__X0, oldX0, x0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistributionTransformerWinding> getWindings() {
		if (windings == null) {
			windings = new EObjectWithInverseResolvingEList<DistributionTransformerWinding>(DistributionTransformerWinding.class, this, WiresExtPackage.WINDING_PI_IMPEDANCE__WINDINGS, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PI_IMPEDANCE);
		}
		return windings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getG0() {
		return g0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG0(float newG0) {
		float oldG0 = g0;
		g0 = newG0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.WINDING_PI_IMPEDANCE__G0, oldG0, g0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getB0() {
		return b0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB0(float newB0) {
		float oldB0 = b0;
		b0 = newB0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.WINDING_PI_IMPEDANCE__B0, oldB0, b0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresExtPackage.WINDING_PI_IMPEDANCE__WINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWindings()).basicAdd(otherEnd, msgs);
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
			case WiresExtPackage.WINDING_PI_IMPEDANCE__WINDINGS:
				return ((InternalEList<?>)getWindings()).basicRemove(otherEnd, msgs);
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
			case WiresExtPackage.WINDING_PI_IMPEDANCE__X:
				return getX();
			case WiresExtPackage.WINDING_PI_IMPEDANCE__R:
				return getR();
			case WiresExtPackage.WINDING_PI_IMPEDANCE__G:
				return getG();
			case WiresExtPackage.WINDING_PI_IMPEDANCE__R0:
				return getR0();
			case WiresExtPackage.WINDING_PI_IMPEDANCE__B:
				return getB();
			case WiresExtPackage.WINDING_PI_IMPEDANCE__X0:
				return getX0();
			case WiresExtPackage.WINDING_PI_IMPEDANCE__WINDINGS:
				return getWindings();
			case WiresExtPackage.WINDING_PI_IMPEDANCE__G0:
				return getG0();
			case WiresExtPackage.WINDING_PI_IMPEDANCE__B0:
				return getB0();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WiresExtPackage.WINDING_PI_IMPEDANCE__X:
				setX((Float)newValue);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__R:
				setR((Float)newValue);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__G:
				setG((Float)newValue);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__R0:
				setR0((Float)newValue);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__B:
				setB((Float)newValue);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__X0:
				setX0((Float)newValue);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__WINDINGS:
				getWindings().clear();
				getWindings().addAll((Collection<? extends DistributionTransformerWinding>)newValue);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__G0:
				setG0((Float)newValue);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__B0:
				setB0((Float)newValue);
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
			case WiresExtPackage.WINDING_PI_IMPEDANCE__X:
				setX(X_EDEFAULT);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__R:
				setR(R_EDEFAULT);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__G:
				setG(G_EDEFAULT);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__R0:
				setR0(R0_EDEFAULT);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__B:
				setB(B_EDEFAULT);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__X0:
				setX0(X0_EDEFAULT);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__WINDINGS:
				getWindings().clear();
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__G0:
				setG0(G0_EDEFAULT);
				return;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__B0:
				setB0(B0_EDEFAULT);
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
			case WiresExtPackage.WINDING_PI_IMPEDANCE__X:
				return x != X_EDEFAULT;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__R:
				return r != R_EDEFAULT;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__G:
				return g != G_EDEFAULT;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__R0:
				return r0 != R0_EDEFAULT;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__B:
				return b != B_EDEFAULT;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__X0:
				return x0 != X0_EDEFAULT;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__WINDINGS:
				return windings != null && !windings.isEmpty();
			case WiresExtPackage.WINDING_PI_IMPEDANCE__G0:
				return g0 != G0_EDEFAULT;
			case WiresExtPackage.WINDING_PI_IMPEDANCE__B0:
				return b0 != B0_EDEFAULT;
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
		result.append(" (x: ");
		result.append(x);
		result.append(", r: ");
		result.append(r);
		result.append(", g: ");
		result.append(g);
		result.append(", r0: ");
		result.append(r0);
		result.append(", b: ");
		result.append(b);
		result.append(", x0: ");
		result.append(x0);
		result.append(", g0: ");
		result.append(g0);
		result.append(", b0: ");
		result.append(b0);
		result.append(')');
		return result.toString();
	}

} //WindingPiImpedanceImpl
