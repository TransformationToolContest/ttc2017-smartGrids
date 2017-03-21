/**
 */
package CIM.IEC61970.StateVariables.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.Terminal;

import CIM.IEC61970.StateVariables.StateVariablesPackage;
import CIM.IEC61970.StateVariables.SvPowerFlow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sv Power Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvPowerFlowImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvPowerFlowImpl#getP <em>P</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvPowerFlowImpl#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvPowerFlowImpl extends StateVariableImpl implements SvPowerFlow {
	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminal;

	/**
	 * The default value of the '{@link #getP() <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected static final float P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected float p = P_EDEFAULT;

	/**
	 * The default value of the '{@link #getQ() <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected static final float Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected float q = Q_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvPowerFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.SV_POWER_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getTerminal() {
		if (terminal != null && terminal.eIsProxy()) {
			InternalEObject oldTerminal = (InternalEObject)terminal;
			terminal = (Terminal)eResolveProxy(oldTerminal);
			if (terminal != oldTerminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateVariablesPackage.SV_POWER_FLOW__TERMINAL, oldTerminal, terminal));
			}
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminal(Terminal newTerminal, NotificationChain msgs) {
		Terminal oldTerminal = terminal;
		terminal = newTerminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_POWER_FLOW__TERMINAL, oldTerminal, newTerminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal(Terminal newTerminal) {
		if (newTerminal != terminal) {
			NotificationChain msgs = null;
			if (terminal != null)
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__SV_POWER_FLOW, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__SV_POWER_FLOW, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_POWER_FLOW__TERMINAL, newTerminal, newTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getP() {
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP(float newP) {
		float oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_POWER_FLOW__P, oldP, p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQ() {
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQ(float newQ) {
		float oldQ = q;
		q = newQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_POWER_FLOW__Q, oldQ, q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateVariablesPackage.SV_POWER_FLOW__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__SV_POWER_FLOW, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
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
			case StateVariablesPackage.SV_POWER_FLOW__TERMINAL:
				return basicSetTerminal(null, msgs);
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
			case StateVariablesPackage.SV_POWER_FLOW__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case StateVariablesPackage.SV_POWER_FLOW__P:
				return getP();
			case StateVariablesPackage.SV_POWER_FLOW__Q:
				return getQ();
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
			case StateVariablesPackage.SV_POWER_FLOW__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case StateVariablesPackage.SV_POWER_FLOW__P:
				setP((Float)newValue);
				return;
			case StateVariablesPackage.SV_POWER_FLOW__Q:
				setQ((Float)newValue);
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
			case StateVariablesPackage.SV_POWER_FLOW__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case StateVariablesPackage.SV_POWER_FLOW__P:
				setP(P_EDEFAULT);
				return;
			case StateVariablesPackage.SV_POWER_FLOW__Q:
				setQ(Q_EDEFAULT);
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
			case StateVariablesPackage.SV_POWER_FLOW__TERMINAL:
				return terminal != null;
			case StateVariablesPackage.SV_POWER_FLOW__P:
				return p != P_EDEFAULT;
			case StateVariablesPackage.SV_POWER_FLOW__Q:
				return q != Q_EDEFAULT;
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
		result.append(" (p: ");
		result.append(p);
		result.append(", q: ");
		result.append(q);
		result.append(')');
		return result.toString();
	}

} //SvPowerFlowImpl
