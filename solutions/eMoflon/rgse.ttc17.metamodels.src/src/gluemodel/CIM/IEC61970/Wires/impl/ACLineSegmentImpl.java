/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61970.Wires.ACLineSegment;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AC Line Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.ACLineSegmentImpl#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.ACLineSegmentImpl#getX <em>X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.ACLineSegmentImpl#getGch <em>Gch</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.ACLineSegmentImpl#getR <em>R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.ACLineSegmentImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.ACLineSegmentImpl#getBch <em>Bch</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.ACLineSegmentImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.ACLineSegmentImpl#getB0ch <em>B0ch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ACLineSegmentImpl extends ConductorImpl implements ACLineSegment {
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
	 * The default value of the '{@link #getGch() <em>Gch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGch()
	 * @generated
	 * @ordered
	 */
	protected static final float GCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGch() <em>Gch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGch()
	 * @generated
	 * @ordered
	 */
	protected float gch = GCH_EDEFAULT;

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
	 * The default value of the '{@link #getBch() <em>Bch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBch()
	 * @generated
	 * @ordered
	 */
	protected static final float BCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBch() <em>Bch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBch()
	 * @generated
	 * @ordered
	 */
	protected float bch = BCH_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ACLineSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.AC_LINE_SEGMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.AC_LINE_SEGMENT__G0CH, oldG0ch, g0ch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.AC_LINE_SEGMENT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGch() {
		return gch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGch(float newGch) {
		float oldGch = gch;
		gch = newGch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.AC_LINE_SEGMENT__GCH, oldGch, gch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.AC_LINE_SEGMENT__R, oldR, r));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.AC_LINE_SEGMENT__X0, oldX0, x0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBch() {
		return bch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBch(float newBch) {
		float oldBch = bch;
		bch = newBch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.AC_LINE_SEGMENT__BCH, oldBch, bch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.AC_LINE_SEGMENT__R0, oldR0, r0));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.AC_LINE_SEGMENT__B0CH, oldB0ch, b0ch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.AC_LINE_SEGMENT__G0CH:
				return getG0ch();
			case WiresPackage.AC_LINE_SEGMENT__X:
				return getX();
			case WiresPackage.AC_LINE_SEGMENT__GCH:
				return getGch();
			case WiresPackage.AC_LINE_SEGMENT__R:
				return getR();
			case WiresPackage.AC_LINE_SEGMENT__X0:
				return getX0();
			case WiresPackage.AC_LINE_SEGMENT__BCH:
				return getBch();
			case WiresPackage.AC_LINE_SEGMENT__R0:
				return getR0();
			case WiresPackage.AC_LINE_SEGMENT__B0CH:
				return getB0ch();
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
			case WiresPackage.AC_LINE_SEGMENT__G0CH:
				setG0ch((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__X:
				setX((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__GCH:
				setGch((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__R:
				setR((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__X0:
				setX0((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__BCH:
				setBch((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__R0:
				setR0((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__B0CH:
				setB0ch((Float)newValue);
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
			case WiresPackage.AC_LINE_SEGMENT__G0CH:
				setG0ch(G0CH_EDEFAULT);
				return;
			case WiresPackage.AC_LINE_SEGMENT__X:
				setX(X_EDEFAULT);
				return;
			case WiresPackage.AC_LINE_SEGMENT__GCH:
				setGch(GCH_EDEFAULT);
				return;
			case WiresPackage.AC_LINE_SEGMENT__R:
				setR(R_EDEFAULT);
				return;
			case WiresPackage.AC_LINE_SEGMENT__X0:
				setX0(X0_EDEFAULT);
				return;
			case WiresPackage.AC_LINE_SEGMENT__BCH:
				setBch(BCH_EDEFAULT);
				return;
			case WiresPackage.AC_LINE_SEGMENT__R0:
				setR0(R0_EDEFAULT);
				return;
			case WiresPackage.AC_LINE_SEGMENT__B0CH:
				setB0ch(B0CH_EDEFAULT);
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
			case WiresPackage.AC_LINE_SEGMENT__G0CH:
				return g0ch != G0CH_EDEFAULT;
			case WiresPackage.AC_LINE_SEGMENT__X:
				return x != X_EDEFAULT;
			case WiresPackage.AC_LINE_SEGMENT__GCH:
				return gch != GCH_EDEFAULT;
			case WiresPackage.AC_LINE_SEGMENT__R:
				return r != R_EDEFAULT;
			case WiresPackage.AC_LINE_SEGMENT__X0:
				return x0 != X0_EDEFAULT;
			case WiresPackage.AC_LINE_SEGMENT__BCH:
				return bch != BCH_EDEFAULT;
			case WiresPackage.AC_LINE_SEGMENT__R0:
				return r0 != R0_EDEFAULT;
			case WiresPackage.AC_LINE_SEGMENT__B0CH:
				return b0ch != B0CH_EDEFAULT;
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
		result.append(" (g0ch: ");
		result.append(g0ch);
		result.append(", x: ");
		result.append(x);
		result.append(", gch: ");
		result.append(gch);
		result.append(", r: ");
		result.append(r);
		result.append(", x0: ");
		result.append(x0);
		result.append(", bch: ");
		result.append(bch);
		result.append(", r0: ");
		result.append(r0);
		result.append(", b0ch: ");
		result.append(b0ch);
		result.append(')');
		return result.toString();
	}

} //ACLineSegmentImpl
