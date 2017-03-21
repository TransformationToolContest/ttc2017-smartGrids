/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.OneCallRequest;
import CIM.IEC61970.Informative.InfWork.WorkLocation;

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
 * An implementation of the model object '<em><b>One Call Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.OneCallRequestImpl#getMarkingInstruction <em>Marking Instruction</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.OneCallRequestImpl#isExplosivesUsed <em>Explosives Used</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.OneCallRequestImpl#getWorkLocations <em>Work Locations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.OneCallRequestImpl#isMarkedIndicator <em>Marked Indicator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneCallRequestImpl extends DocumentImpl implements OneCallRequest {
	/**
	 * The default value of the '{@link #getMarkingInstruction() <em>Marking Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkingInstruction()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKING_INSTRUCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkingInstruction() <em>Marking Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkingInstruction()
	 * @generated
	 * @ordered
	 */
	protected String markingInstruction = MARKING_INSTRUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isExplosivesUsed() <em>Explosives Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplosivesUsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLOSIVES_USED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplosivesUsed() <em>Explosives Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplosivesUsed()
	 * @generated
	 * @ordered
	 */
	protected boolean explosivesUsed = EXPLOSIVES_USED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkLocations() <em>Work Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkLocation> workLocations;

	/**
	 * The default value of the '{@link #isMarkedIndicator() <em>Marked Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkedIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARKED_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMarkedIndicator() <em>Marked Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkedIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean markedIndicator = MARKED_INDICATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneCallRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.ONE_CALL_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkingInstruction() {
		return markingInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkingInstruction(String newMarkingInstruction) {
		String oldMarkingInstruction = markingInstruction;
		markingInstruction = newMarkingInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.ONE_CALL_REQUEST__MARKING_INSTRUCTION, oldMarkingInstruction, markingInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplosivesUsed() {
		return explosivesUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplosivesUsed(boolean newExplosivesUsed) {
		boolean oldExplosivesUsed = explosivesUsed;
		explosivesUsed = newExplosivesUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.ONE_CALL_REQUEST__EXPLOSIVES_USED, oldExplosivesUsed, explosivesUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkLocation> getWorkLocations() {
		if (workLocations == null) {
			workLocations = new EObjectWithInverseResolvingEList<WorkLocation>(WorkLocation.class, this, InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS, InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST);
		}
		return workLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMarkedIndicator() {
		return markedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkedIndicator(boolean newMarkedIndicator) {
		boolean oldMarkedIndicator = markedIndicator;
		markedIndicator = newMarkedIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.ONE_CALL_REQUEST__MARKED_INDICATOR, oldMarkedIndicator, markedIndicator));
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
			case InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkLocations()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS:
				return ((InternalEList<?>)getWorkLocations()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.ONE_CALL_REQUEST__MARKING_INSTRUCTION:
				return getMarkingInstruction();
			case InfWorkPackage.ONE_CALL_REQUEST__EXPLOSIVES_USED:
				return isExplosivesUsed();
			case InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS:
				return getWorkLocations();
			case InfWorkPackage.ONE_CALL_REQUEST__MARKED_INDICATOR:
				return isMarkedIndicator();
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
			case InfWorkPackage.ONE_CALL_REQUEST__MARKING_INSTRUCTION:
				setMarkingInstruction((String)newValue);
				return;
			case InfWorkPackage.ONE_CALL_REQUEST__EXPLOSIVES_USED:
				setExplosivesUsed((Boolean)newValue);
				return;
			case InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS:
				getWorkLocations().clear();
				getWorkLocations().addAll((Collection<? extends WorkLocation>)newValue);
				return;
			case InfWorkPackage.ONE_CALL_REQUEST__MARKED_INDICATOR:
				setMarkedIndicator((Boolean)newValue);
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
			case InfWorkPackage.ONE_CALL_REQUEST__MARKING_INSTRUCTION:
				setMarkingInstruction(MARKING_INSTRUCTION_EDEFAULT);
				return;
			case InfWorkPackage.ONE_CALL_REQUEST__EXPLOSIVES_USED:
				setExplosivesUsed(EXPLOSIVES_USED_EDEFAULT);
				return;
			case InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS:
				getWorkLocations().clear();
				return;
			case InfWorkPackage.ONE_CALL_REQUEST__MARKED_INDICATOR:
				setMarkedIndicator(MARKED_INDICATOR_EDEFAULT);
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
			case InfWorkPackage.ONE_CALL_REQUEST__MARKING_INSTRUCTION:
				return MARKING_INSTRUCTION_EDEFAULT == null ? markingInstruction != null : !MARKING_INSTRUCTION_EDEFAULT.equals(markingInstruction);
			case InfWorkPackage.ONE_CALL_REQUEST__EXPLOSIVES_USED:
				return explosivesUsed != EXPLOSIVES_USED_EDEFAULT;
			case InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS:
				return workLocations != null && !workLocations.isEmpty();
			case InfWorkPackage.ONE_CALL_REQUEST__MARKED_INDICATOR:
				return markedIndicator != MARKED_INDICATOR_EDEFAULT;
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
		result.append(" (markingInstruction: ");
		result.append(markingInstruction);
		result.append(", explosivesUsed: ");
		result.append(explosivesUsed);
		result.append(", markedIndicator: ");
		result.append(markedIndicator);
		result.append(')');
		return result.toString();
	}

} //OneCallRequestImpl
