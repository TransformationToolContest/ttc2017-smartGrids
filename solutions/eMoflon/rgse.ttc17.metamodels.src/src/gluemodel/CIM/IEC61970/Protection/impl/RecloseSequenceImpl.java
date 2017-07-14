/**
 */
package gluemodel.CIM.IEC61970.Protection.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Protection.ProtectionPackage;
import gluemodel.CIM.IEC61970.Protection.RecloseSequence;

import gluemodel.CIM.IEC61970.Wires.ProtectedSwitch;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reclose Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Protection.impl.RecloseSequenceImpl#getProtectedSwitch <em>Protected Switch</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Protection.impl.RecloseSequenceImpl#getRecloseDelay <em>Reclose Delay</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Protection.impl.RecloseSequenceImpl#getRecloseStep <em>Reclose Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecloseSequenceImpl extends IdentifiedObjectImpl implements RecloseSequence {
	/**
	 * The cached value of the '{@link #getProtectedSwitch() <em>Protected Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectedSwitch()
	 * @generated
	 * @ordered
	 */
	protected ProtectedSwitch protectedSwitch;

	/**
	 * The default value of the '{@link #getRecloseDelay() <em>Reclose Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float RECLOSE_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRecloseDelay() <em>Reclose Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseDelay()
	 * @generated
	 * @ordered
	 */
	protected float recloseDelay = RECLOSE_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecloseStep() <em>Reclose Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseStep()
	 * @generated
	 * @ordered
	 */
	protected static final int RECLOSE_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRecloseStep() <em>Reclose Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseStep()
	 * @generated
	 * @ordered
	 */
	protected int recloseStep = RECLOSE_STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecloseSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtectionPackage.Literals.RECLOSE_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectedSwitch getProtectedSwitch() {
		if (protectedSwitch != null && protectedSwitch.eIsProxy()) {
			InternalEObject oldProtectedSwitch = (InternalEObject)protectedSwitch;
			protectedSwitch = (ProtectedSwitch)eResolveProxy(oldProtectedSwitch);
			if (protectedSwitch != oldProtectedSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH, oldProtectedSwitch, protectedSwitch));
			}
		}
		return protectedSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectedSwitch basicGetProtectedSwitch() {
		return protectedSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtectedSwitch(ProtectedSwitch newProtectedSwitch, NotificationChain msgs) {
		ProtectedSwitch oldProtectedSwitch = protectedSwitch;
		protectedSwitch = newProtectedSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH, oldProtectedSwitch, newProtectedSwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectedSwitch(ProtectedSwitch newProtectedSwitch) {
		if (newProtectedSwitch != protectedSwitch) {
			NotificationChain msgs = null;
			if (protectedSwitch != null)
				msgs = ((InternalEObject)protectedSwitch).eInverseRemove(this, WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES, ProtectedSwitch.class, msgs);
			if (newProtectedSwitch != null)
				msgs = ((InternalEObject)newProtectedSwitch).eInverseAdd(this, WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES, ProtectedSwitch.class, msgs);
			msgs = basicSetProtectedSwitch(newProtectedSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH, newProtectedSwitch, newProtectedSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRecloseDelay() {
		return recloseDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecloseDelay(float newRecloseDelay) {
		float oldRecloseDelay = recloseDelay;
		recloseDelay = newRecloseDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY, oldRecloseDelay, recloseDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRecloseStep() {
		return recloseStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecloseStep(int newRecloseStep) {
		int oldRecloseStep = recloseStep;
		recloseStep = newRecloseStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_STEP, oldRecloseStep, recloseStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
				if (protectedSwitch != null)
					msgs = ((InternalEObject)protectedSwitch).eInverseRemove(this, WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES, ProtectedSwitch.class, msgs);
				return basicSetProtectedSwitch((ProtectedSwitch)otherEnd, msgs);
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
			case ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
				return basicSetProtectedSwitch(null, msgs);
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
			case ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
				if (resolve) return getProtectedSwitch();
				return basicGetProtectedSwitch();
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY:
				return getRecloseDelay();
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_STEP:
				return getRecloseStep();
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
			case ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
				setProtectedSwitch((ProtectedSwitch)newValue);
				return;
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY:
				setRecloseDelay((Float)newValue);
				return;
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_STEP:
				setRecloseStep((Integer)newValue);
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
			case ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
				setProtectedSwitch((ProtectedSwitch)null);
				return;
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY:
				setRecloseDelay(RECLOSE_DELAY_EDEFAULT);
				return;
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_STEP:
				setRecloseStep(RECLOSE_STEP_EDEFAULT);
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
			case ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
				return protectedSwitch != null;
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY:
				return recloseDelay != RECLOSE_DELAY_EDEFAULT;
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_STEP:
				return recloseStep != RECLOSE_STEP_EDEFAULT;
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
		result.append(" (recloseDelay: ");
		result.append(recloseDelay);
		result.append(", recloseStep: ");
		result.append(recloseStep);
		result.append(')');
		return result.toString();
	}

} //RecloseSequenceImpl
