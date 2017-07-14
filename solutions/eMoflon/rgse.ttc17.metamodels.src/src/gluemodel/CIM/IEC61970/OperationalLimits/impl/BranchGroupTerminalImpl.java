/**
 */
package gluemodel.CIM.IEC61970.OperationalLimits.impl;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.Terminal;

import gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup;
import gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal;
import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Group Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.BranchGroupTerminalImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.BranchGroupTerminalImpl#getBranchGroup <em>Branch Group</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.BranchGroupTerminalImpl#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchGroupTerminalImpl extends ElementImpl implements BranchGroupTerminal {
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
	 * The cached value of the '{@link #getBranchGroup() <em>Branch Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchGroup()
	 * @generated
	 * @ordered
	 */
	protected BranchGroup branchGroup;

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
	protected BranchGroupTerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.BRANCH_GROUP_TERMINAL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL, oldTerminal, terminal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL, oldTerminal, newTerminal);
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
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL, newTerminal, newTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchGroup getBranchGroup() {
		if (branchGroup != null && branchGroup.eIsProxy()) {
			InternalEObject oldBranchGroup = (InternalEObject)branchGroup;
			branchGroup = (BranchGroup)eResolveProxy(oldBranchGroup);
			if (branchGroup != oldBranchGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP, oldBranchGroup, branchGroup));
			}
		}
		return branchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchGroup basicGetBranchGroup() {
		return branchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranchGroup(BranchGroup newBranchGroup, NotificationChain msgs) {
		BranchGroup oldBranchGroup = branchGroup;
		branchGroup = newBranchGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP, oldBranchGroup, newBranchGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchGroup(BranchGroup newBranchGroup) {
		if (newBranchGroup != branchGroup) {
			NotificationChain msgs = null;
			if (branchGroup != null)
				msgs = ((InternalEObject)branchGroup).eInverseRemove(this, OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL, BranchGroup.class, msgs);
			if (newBranchGroup != null)
				msgs = ((InternalEObject)newBranchGroup).eInverseAdd(this, OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL, BranchGroup.class, msgs);
			msgs = basicSetBranchGroup(newBranchGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP, newBranchGroup, newBranchGroup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN, oldPositiveFlowIn, positiveFlowIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
				if (branchGroup != null)
					msgs = ((InternalEObject)branchGroup).eInverseRemove(this, OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL, BranchGroup.class, msgs);
				return basicSetBranchGroup((BranchGroup)otherEnd, msgs);
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
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
				return basicSetTerminal(null, msgs);
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
				return basicSetBranchGroup(null, msgs);
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
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
				if (resolve) return getBranchGroup();
				return basicGetBranchGroup();
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN:
				return isPositiveFlowIn();
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
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
				setBranchGroup((BranchGroup)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN:
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
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
				setBranchGroup((BranchGroup)null);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN:
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
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
				return terminal != null;
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
				return branchGroup != null;
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN:
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

} //BranchGroupTerminalImpl
