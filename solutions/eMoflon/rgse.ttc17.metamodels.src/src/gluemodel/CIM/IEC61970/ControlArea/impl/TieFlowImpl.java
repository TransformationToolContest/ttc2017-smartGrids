/**
 */
package gluemodel.CIM.IEC61970.ControlArea.impl;

import gluemodel.CIM.IEC61970.ControlArea.AltTieMeas;
import gluemodel.CIM.IEC61970.ControlArea.ControlArea;
import gluemodel.CIM.IEC61970.ControlArea.ControlAreaPackage;
import gluemodel.CIM.IEC61970.ControlArea.TieFlow;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.Terminal;

import gluemodel.CIM.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Tie Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.ControlArea.impl.TieFlowImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.ControlArea.impl.TieFlowImpl#getAltTieMeas <em>Alt Tie Meas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.ControlArea.impl.TieFlowImpl#getControlArea <em>Control Area</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.ControlArea.impl.TieFlowImpl#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TieFlowImpl extends ElementImpl implements TieFlow {
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
	 * The cached value of the '{@link #getAltTieMeas() <em>Alt Tie Meas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltTieMeas()
	 * @generated
	 * @ordered
	 */
	protected EList<AltTieMeas> altTieMeas;

	/**
	 * The cached value of the '{@link #getControlArea() <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlArea()
	 * @generated
	 * @ordered
	 */
	protected ControlArea controlArea;

	/**
	 * The default value of the '{@link #isPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositiveFlowIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSITIVE_FLOW_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositiveFlowIn()
	 * @generated
	 * @ordered
	 */
	protected boolean positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TieFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlAreaPackage.Literals.TIE_FLOW;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlAreaPackage.TIE_FLOW__TERMINAL, oldTerminal, terminal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlAreaPackage.TIE_FLOW__TERMINAL, oldTerminal, newTerminal);
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
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__TIE_FLOW, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__TIE_FLOW, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.TIE_FLOW__TERMINAL, newTerminal, newTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AltTieMeas> getAltTieMeas() {
		if (altTieMeas == null) {
			altTieMeas = new EObjectWithInverseResolvingEList<AltTieMeas>(AltTieMeas.class, this, ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS, ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW);
		}
		return altTieMeas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea getControlArea() {
		if (controlArea != null && controlArea.eIsProxy()) {
			InternalEObject oldControlArea = (InternalEObject)controlArea;
			controlArea = (ControlArea)eResolveProxy(oldControlArea);
			if (controlArea != oldControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlAreaPackage.TIE_FLOW__CONTROL_AREA, oldControlArea, controlArea));
			}
		}
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea basicGetControlArea() {
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlArea(ControlArea newControlArea, NotificationChain msgs) {
		ControlArea oldControlArea = controlArea;
		controlArea = newControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlAreaPackage.TIE_FLOW__CONTROL_AREA, oldControlArea, newControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlArea(ControlArea newControlArea) {
		if (newControlArea != controlArea) {
			NotificationChain msgs = null;
			if (controlArea != null)
				msgs = ((InternalEObject)controlArea).eInverseRemove(this, ControlAreaPackage.CONTROL_AREA__TIE_FLOW, ControlArea.class, msgs);
			if (newControlArea != null)
				msgs = ((InternalEObject)newControlArea).eInverseAdd(this, ControlAreaPackage.CONTROL_AREA__TIE_FLOW, ControlArea.class, msgs);
			msgs = basicSetControlArea(newControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.TIE_FLOW__CONTROL_AREA, newControlArea, newControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPositiveFlowIn() {
		return positiveFlowIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveFlowIn(boolean newPositiveFlowIn) {
		boolean oldPositiveFlowIn = positiveFlowIn;
		positiveFlowIn = newPositiveFlowIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.TIE_FLOW__POSITIVE_FLOW_IN, oldPositiveFlowIn, positiveFlowIn));
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
			case ControlAreaPackage.TIE_FLOW__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__TIE_FLOW, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
			case ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAltTieMeas()).basicAdd(otherEnd, msgs);
			case ControlAreaPackage.TIE_FLOW__CONTROL_AREA:
				if (controlArea != null)
					msgs = ((InternalEObject)controlArea).eInverseRemove(this, ControlAreaPackage.CONTROL_AREA__TIE_FLOW, ControlArea.class, msgs);
				return basicSetControlArea((ControlArea)otherEnd, msgs);
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
			case ControlAreaPackage.TIE_FLOW__TERMINAL:
				return basicSetTerminal(null, msgs);
			case ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS:
				return ((InternalEList<?>)getAltTieMeas()).basicRemove(otherEnd, msgs);
			case ControlAreaPackage.TIE_FLOW__CONTROL_AREA:
				return basicSetControlArea(null, msgs);
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
			case ControlAreaPackage.TIE_FLOW__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS:
				return getAltTieMeas();
			case ControlAreaPackage.TIE_FLOW__CONTROL_AREA:
				if (resolve) return getControlArea();
				return basicGetControlArea();
			case ControlAreaPackage.TIE_FLOW__POSITIVE_FLOW_IN:
				return isPositiveFlowIn();
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
			case ControlAreaPackage.TIE_FLOW__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS:
				getAltTieMeas().clear();
				getAltTieMeas().addAll((Collection<? extends AltTieMeas>)newValue);
				return;
			case ControlAreaPackage.TIE_FLOW__CONTROL_AREA:
				setControlArea((ControlArea)newValue);
				return;
			case ControlAreaPackage.TIE_FLOW__POSITIVE_FLOW_IN:
				setPositiveFlowIn((Boolean)newValue);
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
			case ControlAreaPackage.TIE_FLOW__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS:
				getAltTieMeas().clear();
				return;
			case ControlAreaPackage.TIE_FLOW__CONTROL_AREA:
				setControlArea((ControlArea)null);
				return;
			case ControlAreaPackage.TIE_FLOW__POSITIVE_FLOW_IN:
				setPositiveFlowIn(POSITIVE_FLOW_IN_EDEFAULT);
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
			case ControlAreaPackage.TIE_FLOW__TERMINAL:
				return terminal != null;
			case ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS:
				return altTieMeas != null && !altTieMeas.isEmpty();
			case ControlAreaPackage.TIE_FLOW__CONTROL_AREA:
				return controlArea != null;
			case ControlAreaPackage.TIE_FLOW__POSITIVE_FLOW_IN:
				return positiveFlowIn != POSITIVE_FLOW_IN_EDEFAULT;
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
		result.append(" (positiveFlowIn: ");
		result.append(positiveFlowIn);
		result.append(')');
		return result.toString();
	}

} //TieFlowImpl
