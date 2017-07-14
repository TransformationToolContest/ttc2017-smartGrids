/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.Terminal;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Wires.MutualCoupling;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mutual Coupling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.MutualCouplingImpl#getDistance11 <em>Distance11</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.MutualCouplingImpl#getDistance12 <em>Distance12</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.MutualCouplingImpl#getB0ch <em>B0ch</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.MutualCouplingImpl#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.MutualCouplingImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.MutualCouplingImpl#getSecond_Terminal <em>Second Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.MutualCouplingImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.MutualCouplingImpl#getFirst_Terminal <em>First Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.MutualCouplingImpl#getDistance22 <em>Distance22</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.MutualCouplingImpl#getDistance21 <em>Distance21</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MutualCouplingImpl extends IdentifiedObjectImpl implements MutualCoupling {
	/**
	 * The default value of the '{@link #getDistance11() <em>Distance11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance11()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE11_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance11() <em>Distance11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance11()
	 * @generated
	 * @ordered
	 */
	protected float distance11 = DISTANCE11_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance12() <em>Distance12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance12()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE12_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance12() <em>Distance12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance12()
	 * @generated
	 * @ordered
	 */
	protected float distance12 = DISTANCE12_EDEFAULT;

	/**
	 * The default value of the '{@link #getB0ch() <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0ch()
	 * @generated
	 * @ordered
	 */
	protected static final float B0CH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB0ch() <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0ch()
	 * @generated
	 * @ordered
	 */
	protected float b0ch = B0CH_EDEFAULT;

	/**
	 * The default value of the '{@link #getG0ch() <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0ch()
	 * @generated
	 * @ordered
	 */
	protected static final float G0CH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG0ch() <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0ch()
	 * @generated
	 * @ordered
	 */
	protected float g0ch = G0CH_EDEFAULT;

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
	 * The cached value of the '{@link #getSecond_Terminal() <em>Second Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond_Terminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal second_Terminal;

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
	 * The cached value of the '{@link #getFirst_Terminal() <em>First Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_Terminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal first_Terminal;

	/**
	 * The default value of the '{@link #getDistance22() <em>Distance22</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance22()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE22_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance22() <em>Distance22</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance22()
	 * @generated
	 * @ordered
	 */
	protected float distance22 = DISTANCE22_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance21() <em>Distance21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance21()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE21_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance21() <em>Distance21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance21()
	 * @generated
	 * @ordered
	 */
	protected float distance21 = DISTANCE21_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutualCouplingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.MUTUAL_COUPLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDistance11() {
		return distance11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance11(float newDistance11) {
		float oldDistance11 = distance11;
		distance11 = newDistance11;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.MUTUAL_COUPLING__DISTANCE11, oldDistance11, distance11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDistance12() {
		return distance12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance12(float newDistance12) {
		float oldDistance12 = distance12;
		distance12 = newDistance12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.MUTUAL_COUPLING__DISTANCE12, oldDistance12, distance12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getB0ch() {
		return b0ch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB0ch(float newB0ch) {
		float oldB0ch = b0ch;
		b0ch = newB0ch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.MUTUAL_COUPLING__B0CH, oldB0ch, b0ch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getG0ch() {
		return g0ch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG0ch(float newG0ch) {
		float oldG0ch = g0ch;
		g0ch = newG0ch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.MUTUAL_COUPLING__G0CH, oldG0ch, g0ch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.MUTUAL_COUPLING__X0, oldX0, x0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getSecond_Terminal() {
		if (second_Terminal != null && second_Terminal.eIsProxy()) {
			InternalEObject oldSecond_Terminal = (InternalEObject)second_Terminal;
			second_Terminal = (Terminal)eResolveProxy(oldSecond_Terminal);
			if (second_Terminal != oldSecond_Terminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL, oldSecond_Terminal, second_Terminal));
			}
		}
		return second_Terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetSecond_Terminal() {
		return second_Terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecond_Terminal(Terminal newSecond_Terminal, NotificationChain msgs) {
		Terminal oldSecond_Terminal = second_Terminal;
		second_Terminal = newSecond_Terminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL, oldSecond_Terminal, newSecond_Terminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond_Terminal(Terminal newSecond_Terminal) {
		if (newSecond_Terminal != second_Terminal) {
			NotificationChain msgs = null;
			if (second_Terminal != null)
				msgs = ((InternalEObject)second_Terminal).eInverseRemove(this, CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING, Terminal.class, msgs);
			if (newSecond_Terminal != null)
				msgs = ((InternalEObject)newSecond_Terminal).eInverseAdd(this, CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING, Terminal.class, msgs);
			msgs = basicSetSecond_Terminal(newSecond_Terminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL, newSecond_Terminal, newSecond_Terminal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.MUTUAL_COUPLING__R0, oldR0, r0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getFirst_Terminal() {
		if (first_Terminal != null && first_Terminal.eIsProxy()) {
			InternalEObject oldFirst_Terminal = (InternalEObject)first_Terminal;
			first_Terminal = (Terminal)eResolveProxy(oldFirst_Terminal);
			if (first_Terminal != oldFirst_Terminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL, oldFirst_Terminal, first_Terminal));
			}
		}
		return first_Terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetFirst_Terminal() {
		return first_Terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst_Terminal(Terminal newFirst_Terminal, NotificationChain msgs) {
		Terminal oldFirst_Terminal = first_Terminal;
		first_Terminal = newFirst_Terminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL, oldFirst_Terminal, newFirst_Terminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst_Terminal(Terminal newFirst_Terminal) {
		if (newFirst_Terminal != first_Terminal) {
			NotificationChain msgs = null;
			if (first_Terminal != null)
				msgs = ((InternalEObject)first_Terminal).eInverseRemove(this, CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING, Terminal.class, msgs);
			if (newFirst_Terminal != null)
				msgs = ((InternalEObject)newFirst_Terminal).eInverseAdd(this, CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING, Terminal.class, msgs);
			msgs = basicSetFirst_Terminal(newFirst_Terminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL, newFirst_Terminal, newFirst_Terminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDistance22() {
		return distance22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance22(float newDistance22) {
		float oldDistance22 = distance22;
		distance22 = newDistance22;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.MUTUAL_COUPLING__DISTANCE22, oldDistance22, distance22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDistance21() {
		return distance21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance21(float newDistance21) {
		float oldDistance21 = distance21;
		distance21 = newDistance21;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.MUTUAL_COUPLING__DISTANCE21, oldDistance21, distance21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
				if (second_Terminal != null)
					msgs = ((InternalEObject)second_Terminal).eInverseRemove(this, CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING, Terminal.class, msgs);
				return basicSetSecond_Terminal((Terminal)otherEnd, msgs);
			case WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
				if (first_Terminal != null)
					msgs = ((InternalEObject)first_Terminal).eInverseRemove(this, CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING, Terminal.class, msgs);
				return basicSetFirst_Terminal((Terminal)otherEnd, msgs);
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
			case WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
				return basicSetSecond_Terminal(null, msgs);
			case WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
				return basicSetFirst_Terminal(null, msgs);
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
			case WiresPackage.MUTUAL_COUPLING__DISTANCE11:
				return getDistance11();
			case WiresPackage.MUTUAL_COUPLING__DISTANCE12:
				return getDistance12();
			case WiresPackage.MUTUAL_COUPLING__B0CH:
				return getB0ch();
			case WiresPackage.MUTUAL_COUPLING__G0CH:
				return getG0ch();
			case WiresPackage.MUTUAL_COUPLING__X0:
				return getX0();
			case WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
				if (resolve) return getSecond_Terminal();
				return basicGetSecond_Terminal();
			case WiresPackage.MUTUAL_COUPLING__R0:
				return getR0();
			case WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
				if (resolve) return getFirst_Terminal();
				return basicGetFirst_Terminal();
			case WiresPackage.MUTUAL_COUPLING__DISTANCE22:
				return getDistance22();
			case WiresPackage.MUTUAL_COUPLING__DISTANCE21:
				return getDistance21();
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
			case WiresPackage.MUTUAL_COUPLING__DISTANCE11:
				setDistance11((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE12:
				setDistance12((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__B0CH:
				setB0ch((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__G0CH:
				setG0ch((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__X0:
				setX0((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
				setSecond_Terminal((Terminal)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__R0:
				setR0((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
				setFirst_Terminal((Terminal)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE22:
				setDistance22((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE21:
				setDistance21((Float)newValue);
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
			case WiresPackage.MUTUAL_COUPLING__DISTANCE11:
				setDistance11(DISTANCE11_EDEFAULT);
				return;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE12:
				setDistance12(DISTANCE12_EDEFAULT);
				return;
			case WiresPackage.MUTUAL_COUPLING__B0CH:
				setB0ch(B0CH_EDEFAULT);
				return;
			case WiresPackage.MUTUAL_COUPLING__G0CH:
				setG0ch(G0CH_EDEFAULT);
				return;
			case WiresPackage.MUTUAL_COUPLING__X0:
				setX0(X0_EDEFAULT);
				return;
			case WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
				setSecond_Terminal((Terminal)null);
				return;
			case WiresPackage.MUTUAL_COUPLING__R0:
				setR0(R0_EDEFAULT);
				return;
			case WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
				setFirst_Terminal((Terminal)null);
				return;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE22:
				setDistance22(DISTANCE22_EDEFAULT);
				return;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE21:
				setDistance21(DISTANCE21_EDEFAULT);
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
			case WiresPackage.MUTUAL_COUPLING__DISTANCE11:
				return distance11 != DISTANCE11_EDEFAULT;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE12:
				return distance12 != DISTANCE12_EDEFAULT;
			case WiresPackage.MUTUAL_COUPLING__B0CH:
				return b0ch != B0CH_EDEFAULT;
			case WiresPackage.MUTUAL_COUPLING__G0CH:
				return g0ch != G0CH_EDEFAULT;
			case WiresPackage.MUTUAL_COUPLING__X0:
				return x0 != X0_EDEFAULT;
			case WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
				return second_Terminal != null;
			case WiresPackage.MUTUAL_COUPLING__R0:
				return r0 != R0_EDEFAULT;
			case WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
				return first_Terminal != null;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE22:
				return distance22 != DISTANCE22_EDEFAULT;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE21:
				return distance21 != DISTANCE21_EDEFAULT;
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
		result.append(" (distance11: ");
		result.append(distance11);
		result.append(", distance12: ");
		result.append(distance12);
		result.append(", b0ch: ");
		result.append(b0ch);
		result.append(", g0ch: ");
		result.append(g0ch);
		result.append(", x0: ");
		result.append(x0);
		result.append(", r0: ");
		result.append(r0);
		result.append(", distance22: ");
		result.append(distance22);
		result.append(", distance21: ");
		result.append(distance21);
		result.append(')');
		return result.toString();
	}

} //MutualCouplingImpl
