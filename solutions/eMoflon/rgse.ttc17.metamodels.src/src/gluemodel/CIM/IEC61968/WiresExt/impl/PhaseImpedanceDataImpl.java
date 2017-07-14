/**
 */
package gluemodel.CIM.IEC61968.WiresExt.impl;

import gluemodel.CIM.IEC61968.WiresExt.PerLengthPhaseImpedance;
import gluemodel.CIM.IEC61968.WiresExt.PhaseImpedanceData;
import gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase Impedance Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.PhaseImpedanceDataImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.PhaseImpedanceDataImpl#getB <em>B</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.PhaseImpedanceDataImpl#getX <em>X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.PhaseImpedanceDataImpl#getR <em>R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.PhaseImpedanceDataImpl#getPhaseImpedance <em>Phase Impedance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseImpedanceDataImpl extends ElementImpl implements PhaseImpedanceData {
	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getPhaseImpedance() <em>Phase Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseImpedance()
	 * @generated
	 * @ordered
	 */
	protected PerLengthPhaseImpedance phaseImpedance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseImpedanceDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresExtPackage.Literals.PHASE_IMPEDANCE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		int oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.PHASE_IMPEDANCE_DATA__B, oldB, b));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.PHASE_IMPEDANCE_DATA__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.PHASE_IMPEDANCE_DATA__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthPhaseImpedance getPhaseImpedance() {
		if (phaseImpedance != null && phaseImpedance.eIsProxy()) {
			InternalEObject oldPhaseImpedance = (InternalEObject)phaseImpedance;
			phaseImpedance = (PerLengthPhaseImpedance)eResolveProxy(oldPhaseImpedance);
			if (phaseImpedance != oldPhaseImpedance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresExtPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE, oldPhaseImpedance, phaseImpedance));
			}
		}
		return phaseImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthPhaseImpedance basicGetPhaseImpedance() {
		return phaseImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseImpedance(PerLengthPhaseImpedance newPhaseImpedance, NotificationChain msgs) {
		PerLengthPhaseImpedance oldPhaseImpedance = phaseImpedance;
		phaseImpedance = newPhaseImpedance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresExtPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE, oldPhaseImpedance, newPhaseImpedance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseImpedance(PerLengthPhaseImpedance newPhaseImpedance) {
		if (newPhaseImpedance != phaseImpedance) {
			NotificationChain msgs = null;
			if (phaseImpedance != null)
				msgs = ((InternalEObject)phaseImpedance).eInverseRemove(this, WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA, PerLengthPhaseImpedance.class, msgs);
			if (newPhaseImpedance != null)
				msgs = ((InternalEObject)newPhaseImpedance).eInverseAdd(this, WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA, PerLengthPhaseImpedance.class, msgs);
			msgs = basicSetPhaseImpedance(newPhaseImpedance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE, newPhaseImpedance, newPhaseImpedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
				if (phaseImpedance != null)
					msgs = ((InternalEObject)phaseImpedance).eInverseRemove(this, WiresExtPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA, PerLengthPhaseImpedance.class, msgs);
				return basicSetPhaseImpedance((PerLengthPhaseImpedance)otherEnd, msgs);
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
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
				return basicSetPhaseImpedance(null, msgs);
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
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__B:
				return getB();
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__X:
				return getX();
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__R:
				return getR();
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
				if (resolve) return getPhaseImpedance();
				return basicGetPhaseImpedance();
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
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__B:
				setB((Float)newValue);
				return;
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__X:
				setX((Float)newValue);
				return;
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__R:
				setR((Float)newValue);
				return;
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
				setPhaseImpedance((PerLengthPhaseImpedance)newValue);
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
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__B:
				setB(B_EDEFAULT);
				return;
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__X:
				setX(X_EDEFAULT);
				return;
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__R:
				setR(R_EDEFAULT);
				return;
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
				setPhaseImpedance((PerLengthPhaseImpedance)null);
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
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__B:
				return b != B_EDEFAULT;
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__X:
				return x != X_EDEFAULT;
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__R:
				return r != R_EDEFAULT;
			case WiresExtPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
				return phaseImpedance != null;
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
		result.append(" (sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", b: ");
		result.append(b);
		result.append(", x: ");
		result.append(x);
		result.append(", r: ");
		result.append(r);
		result.append(')');
		return result.toString();
	}

} //PhaseImpedanceDataImpl
