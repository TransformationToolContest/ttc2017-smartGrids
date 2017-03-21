/**
 */
package CIM.IEC61970.OperationalLimits.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.OperationalLimits.BranchGroup;
import CIM.IEC61970.OperationalLimits.BranchGroupTerminal;
import CIM.IEC61970.OperationalLimits.OperationalLimitsPackage;

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
 * An implementation of the model object '<em><b>Branch Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.OperationalLimits.impl.BranchGroupImpl#isMonitorReactivePower <em>Monitor Reactive Power</em>}</li>
 *   <li>{@link CIM.IEC61970.OperationalLimits.impl.BranchGroupImpl#getMinimumReactivePower <em>Minimum Reactive Power</em>}</li>
 *   <li>{@link CIM.IEC61970.OperationalLimits.impl.BranchGroupImpl#getBranchGroupTerminal <em>Branch Group Terminal</em>}</li>
 *   <li>{@link CIM.IEC61970.OperationalLimits.impl.BranchGroupImpl#isMonitorActivePower <em>Monitor Active Power</em>}</li>
 *   <li>{@link CIM.IEC61970.OperationalLimits.impl.BranchGroupImpl#getMaximumReactivePower <em>Maximum Reactive Power</em>}</li>
 *   <li>{@link CIM.IEC61970.OperationalLimits.impl.BranchGroupImpl#getMaximumActivePower <em>Maximum Active Power</em>}</li>
 *   <li>{@link CIM.IEC61970.OperationalLimits.impl.BranchGroupImpl#getMinimumActivePower <em>Minimum Active Power</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchGroupImpl extends IdentifiedObjectImpl implements BranchGroup {
	/**
	 * The default value of the '{@link #isMonitorReactivePower() <em>Monitor Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorReactivePower()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITOR_REACTIVE_POWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitorReactivePower() <em>Monitor Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorReactivePower()
	 * @generated
	 * @ordered
	 */
	protected boolean monitorReactivePower = MONITOR_REACTIVE_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumReactivePower() <em>Minimum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumReactivePower()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_REACTIVE_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumReactivePower() <em>Minimum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumReactivePower()
	 * @generated
	 * @ordered
	 */
	protected float minimumReactivePower = MINIMUM_REACTIVE_POWER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBranchGroupTerminal() <em>Branch Group Terminal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchGroupTerminal()
	 * @generated
	 * @ordered
	 */
	protected EList<BranchGroupTerminal> branchGroupTerminal;

	/**
	 * The default value of the '{@link #isMonitorActivePower() <em>Monitor Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorActivePower()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITOR_ACTIVE_POWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitorActivePower() <em>Monitor Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorActivePower()
	 * @generated
	 * @ordered
	 */
	protected boolean monitorActivePower = MONITOR_ACTIVE_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumReactivePower() <em>Maximum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumReactivePower()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXIMUM_REACTIVE_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaximumReactivePower() <em>Maximum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumReactivePower()
	 * @generated
	 * @ordered
	 */
	protected float maximumReactivePower = MAXIMUM_REACTIVE_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumActivePower() <em>Maximum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumActivePower()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXIMUM_ACTIVE_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaximumActivePower() <em>Maximum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumActivePower()
	 * @generated
	 * @ordered
	 */
	protected float maximumActivePower = MAXIMUM_ACTIVE_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumActivePower() <em>Minimum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumActivePower()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_ACTIVE_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumActivePower() <em>Minimum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumActivePower()
	 * @generated
	 * @ordered
	 */
	protected float minimumActivePower = MINIMUM_ACTIVE_POWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.BRANCH_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitorReactivePower() {
		return monitorReactivePower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorReactivePower(boolean newMonitorReactivePower) {
		boolean oldMonitorReactivePower = monitorReactivePower;
		monitorReactivePower = newMonitorReactivePower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER, oldMonitorReactivePower, monitorReactivePower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinimumReactivePower() {
		return minimumReactivePower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumReactivePower(float newMinimumReactivePower) {
		float oldMinimumReactivePower = minimumReactivePower;
		minimumReactivePower = newMinimumReactivePower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER, oldMinimumReactivePower, minimumReactivePower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BranchGroupTerminal> getBranchGroupTerminal() {
		if (branchGroupTerminal == null) {
			branchGroupTerminal = new EObjectWithInverseResolvingEList<BranchGroupTerminal>(BranchGroupTerminal.class, this, OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL, OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP);
		}
		return branchGroupTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitorActivePower() {
		return monitorActivePower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorActivePower(boolean newMonitorActivePower) {
		boolean oldMonitorActivePower = monitorActivePower;
		monitorActivePower = newMonitorActivePower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER, oldMonitorActivePower, monitorActivePower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaximumReactivePower() {
		return maximumReactivePower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumReactivePower(float newMaximumReactivePower) {
		float oldMaximumReactivePower = maximumReactivePower;
		maximumReactivePower = newMaximumReactivePower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER, oldMaximumReactivePower, maximumReactivePower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaximumActivePower() {
		return maximumActivePower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumActivePower(float newMaximumActivePower) {
		float oldMaximumActivePower = maximumActivePower;
		maximumActivePower = newMaximumActivePower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER, oldMaximumActivePower, maximumActivePower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinimumActivePower() {
		return minimumActivePower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumActivePower(float newMinimumActivePower) {
		float oldMinimumActivePower = minimumActivePower;
		minimumActivePower = newMinimumActivePower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER, oldMinimumActivePower, minimumActivePower));
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
			case OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBranchGroupTerminal()).basicAdd(otherEnd, msgs);
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
			case OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
				return ((InternalEList<?>)getBranchGroupTerminal()).basicRemove(otherEnd, msgs);
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
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
				return isMonitorReactivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
				return getMinimumReactivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
				return getBranchGroupTerminal();
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
				return isMonitorActivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
				return getMaximumReactivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
				return getMaximumActivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
				return getMinimumActivePower();
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
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
				setMonitorReactivePower((Boolean)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
				setMinimumReactivePower((Float)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
				getBranchGroupTerminal().clear();
				getBranchGroupTerminal().addAll((Collection<? extends BranchGroupTerminal>)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
				setMonitorActivePower((Boolean)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
				setMaximumReactivePower((Float)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
				setMaximumActivePower((Float)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
				setMinimumActivePower((Float)newValue);
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
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
				setMonitorReactivePower(MONITOR_REACTIVE_POWER_EDEFAULT);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
				setMinimumReactivePower(MINIMUM_REACTIVE_POWER_EDEFAULT);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
				getBranchGroupTerminal().clear();
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
				setMonitorActivePower(MONITOR_ACTIVE_POWER_EDEFAULT);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
				setMaximumReactivePower(MAXIMUM_REACTIVE_POWER_EDEFAULT);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
				setMaximumActivePower(MAXIMUM_ACTIVE_POWER_EDEFAULT);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
				setMinimumActivePower(MINIMUM_ACTIVE_POWER_EDEFAULT);
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
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
				return monitorReactivePower != MONITOR_REACTIVE_POWER_EDEFAULT;
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
				return minimumReactivePower != MINIMUM_REACTIVE_POWER_EDEFAULT;
			case OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
				return branchGroupTerminal != null && !branchGroupTerminal.isEmpty();
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
				return monitorActivePower != MONITOR_ACTIVE_POWER_EDEFAULT;
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
				return maximumReactivePower != MAXIMUM_REACTIVE_POWER_EDEFAULT;
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
				return maximumActivePower != MAXIMUM_ACTIVE_POWER_EDEFAULT;
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
				return minimumActivePower != MINIMUM_ACTIVE_POWER_EDEFAULT;
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
		result.append(" (monitorReactivePower: ");
		result.append(monitorReactivePower);
		result.append(", minimumReactivePower: ");
		result.append(minimumReactivePower);
		result.append(", monitorActivePower: ");
		result.append(monitorActivePower);
		result.append(", maximumReactivePower: ");
		result.append(maximumReactivePower);
		result.append(", maximumActivePower: ");
		result.append(maximumActivePower);
		result.append(", minimumActivePower: ");
		result.append(minimumActivePower);
		result.append(')');
		return result.toString();
	}

} //BranchGroupImpl
