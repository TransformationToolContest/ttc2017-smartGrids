/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.DateTimeInterval;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfWork.Crew;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.ShiftPattern;

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
 * An implementation of the model object '<em><b>Shift Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ShiftPatternImpl#getAssignmentType <em>Assignment Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ShiftPatternImpl#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ShiftPatternImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ShiftPatternImpl#getCycleCount <em>Cycle Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ShiftPatternImpl#getValidityInterval <em>Validity Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShiftPatternImpl extends IdentifiedObjectImpl implements ShiftPattern {
	/**
	 * The default value of the '{@link #getAssignmentType() <em>Assignment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentType()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignmentType() <em>Assignment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentType()
	 * @generated
	 * @ordered
	 */
	protected String assignmentType = ASSIGNMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The default value of the '{@link #getCycleCount() <em>Cycle Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CYCLE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCycleCount() <em>Cycle Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleCount()
	 * @generated
	 * @ordered
	 */
	protected int cycleCount = CYCLE_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidityInterval() <em>Validity Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval validityInterval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShiftPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.SHIFT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssignmentType() {
		return assignmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignmentType(String newAssignmentType) {
		String oldAssignmentType = assignmentType;
		assignmentType = newAssignmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.SHIFT_PATTERN__ASSIGNMENT_TYPE, oldAssignmentType, assignmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new EObjectWithInverseResolvingEList.ManyInverse<Crew>(Crew.class, this, InfWorkPackage.SHIFT_PATTERN__CREWS, InfWorkPackage.CREW__SHIFT_PATTERNS);
		}
		return crews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.SHIFT_PATTERN__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.SHIFT_PATTERN__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCycleCount() {
		return cycleCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycleCount(int newCycleCount) {
		int oldCycleCount = cycleCount;
		cycleCount = newCycleCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.SHIFT_PATTERN__CYCLE_COUNT, oldCycleCount, cycleCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getValidityInterval() {
		if (validityInterval != null && validityInterval.eIsProxy()) {
			InternalEObject oldValidityInterval = (InternalEObject)validityInterval;
			validityInterval = (DateTimeInterval)eResolveProxy(oldValidityInterval);
			if (validityInterval != oldValidityInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL, oldValidityInterval, validityInterval));
			}
		}
		return validityInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetValidityInterval() {
		return validityInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityInterval(DateTimeInterval newValidityInterval) {
		DateTimeInterval oldValidityInterval = validityInterval;
		validityInterval = newValidityInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL, oldValidityInterval, validityInterval));
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
			case InfWorkPackage.SHIFT_PATTERN__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.SHIFT_PATTERN__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.SHIFT_PATTERN__ASSIGNMENT_TYPE:
				return getAssignmentType();
			case InfWorkPackage.SHIFT_PATTERN__CREWS:
				return getCrews();
			case InfWorkPackage.SHIFT_PATTERN__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.SHIFT_PATTERN__CYCLE_COUNT:
				return getCycleCount();
			case InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL:
				if (resolve) return getValidityInterval();
				return basicGetValidityInterval();
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
			case InfWorkPackage.SHIFT_PATTERN__ASSIGNMENT_TYPE:
				setAssignmentType((String)newValue);
				return;
			case InfWorkPackage.SHIFT_PATTERN__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case InfWorkPackage.SHIFT_PATTERN__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.SHIFT_PATTERN__CYCLE_COUNT:
				setCycleCount((Integer)newValue);
				return;
			case InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)newValue);
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
			case InfWorkPackage.SHIFT_PATTERN__ASSIGNMENT_TYPE:
				setAssignmentType(ASSIGNMENT_TYPE_EDEFAULT);
				return;
			case InfWorkPackage.SHIFT_PATTERN__CREWS:
				getCrews().clear();
				return;
			case InfWorkPackage.SHIFT_PATTERN__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.SHIFT_PATTERN__CYCLE_COUNT:
				setCycleCount(CYCLE_COUNT_EDEFAULT);
				return;
			case InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)null);
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
			case InfWorkPackage.SHIFT_PATTERN__ASSIGNMENT_TYPE:
				return ASSIGNMENT_TYPE_EDEFAULT == null ? assignmentType != null : !ASSIGNMENT_TYPE_EDEFAULT.equals(assignmentType);
			case InfWorkPackage.SHIFT_PATTERN__CREWS:
				return crews != null && !crews.isEmpty();
			case InfWorkPackage.SHIFT_PATTERN__STATUS:
				return status != null;
			case InfWorkPackage.SHIFT_PATTERN__CYCLE_COUNT:
				return cycleCount != CYCLE_COUNT_EDEFAULT;
			case InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL:
				return validityInterval != null;
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
		result.append(" (assignmentType: ");
		result.append(assignmentType);
		result.append(", cycleCount: ");
		result.append(cycleCount);
		result.append(')');
		return result.toString();
	}

} //ShiftPatternImpl
