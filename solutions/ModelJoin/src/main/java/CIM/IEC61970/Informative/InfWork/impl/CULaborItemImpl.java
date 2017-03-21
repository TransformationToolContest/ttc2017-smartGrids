/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfWork.CULaborCode;
import CIM.IEC61970.Informative.InfWork.CULaborItem;
import CIM.IEC61970.Informative.InfWork.CompatibleUnit;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.QualificationRequirement;

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
 * An implementation of the model object '<em><b>CU Labor Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CULaborItemImpl#getQualificationRequirements <em>Qualification Requirements</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CULaborItemImpl#getCULaborCode <em>CU Labor Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CULaborItemImpl#getActivityCode <em>Activity Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CULaborItemImpl#getLaborDuration <em>Labor Duration</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CULaborItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CULaborItemImpl#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CULaborItemImpl#getLaborRate <em>Labor Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CULaborItemImpl extends IdentifiedObjectImpl implements CULaborItem {
	/**
	 * The cached value of the '{@link #getQualificationRequirements() <em>Qualification Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<QualificationRequirement> qualificationRequirements;

	/**
	 * The cached value of the '{@link #getCULaborCode() <em>CU Labor Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCULaborCode()
	 * @generated
	 * @ordered
	 */
	protected CULaborCode cuLaborCode;

	/**
	 * The default value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected String activityCode = ACTIVITY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLaborDuration() <em>Labor Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float LABOR_DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLaborDuration() <em>Labor Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborDuration()
	 * @generated
	 * @ordered
	 */
	protected float laborDuration = LABOR_DURATION_EDEFAULT;

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
	 * The cached value of the '{@link #getCompatibleUnits() <em>Compatible Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibleUnit> compatibleUnits;

	/**
	 * The default value of the '{@link #getLaborRate() <em>Labor Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborRate()
	 * @generated
	 * @ordered
	 */
	protected static final float LABOR_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLaborRate() <em>Labor Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborRate()
	 * @generated
	 * @ordered
	 */
	protected float laborRate = LABOR_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CULaborItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CU_LABOR_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualificationRequirement> getQualificationRequirements() {
		if (qualificationRequirements == null) {
			qualificationRequirements = new EObjectWithInverseResolvingEList.ManyInverse<QualificationRequirement>(QualificationRequirement.class, this, InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS, InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS);
		}
		return qualificationRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CULaborCode getCULaborCode() {
		if (cuLaborCode != null && cuLaborCode.eIsProxy()) {
			InternalEObject oldCULaborCode = (InternalEObject)cuLaborCode;
			cuLaborCode = (CULaborCode)eResolveProxy(oldCULaborCode);
			if (cuLaborCode != oldCULaborCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE, oldCULaborCode, cuLaborCode));
			}
		}
		return cuLaborCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CULaborCode basicGetCULaborCode() {
		return cuLaborCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCULaborCode(CULaborCode newCULaborCode, NotificationChain msgs) {
		CULaborCode oldCULaborCode = cuLaborCode;
		cuLaborCode = newCULaborCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE, oldCULaborCode, newCULaborCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCULaborCode(CULaborCode newCULaborCode) {
		if (newCULaborCode != cuLaborCode) {
			NotificationChain msgs = null;
			if (cuLaborCode != null)
				msgs = ((InternalEObject)cuLaborCode).eInverseRemove(this, InfWorkPackage.CU_LABOR_CODE__CU_LABOR_ITEMS, CULaborCode.class, msgs);
			if (newCULaborCode != null)
				msgs = ((InternalEObject)newCULaborCode).eInverseAdd(this, InfWorkPackage.CU_LABOR_CODE__CU_LABOR_ITEMS, CULaborCode.class, msgs);
			msgs = basicSetCULaborCode(newCULaborCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE, newCULaborCode, newCULaborCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityCode() {
		return activityCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityCode(String newActivityCode) {
		String oldActivityCode = activityCode;
		activityCode = newActivityCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_LABOR_ITEM__ACTIVITY_CODE, oldActivityCode, activityCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLaborDuration() {
		return laborDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaborDuration(float newLaborDuration) {
		float oldLaborDuration = laborDuration;
		laborDuration = newLaborDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_LABOR_ITEM__LABOR_DURATION, oldLaborDuration, laborDuration));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CU_LABOR_ITEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_LABOR_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new EObjectWithInverseResolvingEList.ManyInverse<CompatibleUnit>(CompatibleUnit.class, this, InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS, InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS);
		}
		return compatibleUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLaborRate() {
		return laborRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaborRate(float newLaborRate) {
		float oldLaborRate = laborRate;
		laborRate = newLaborRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_LABOR_ITEM__LABOR_RATE, oldLaborRate, laborRate));
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
			case InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualificationRequirements()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE:
				if (cuLaborCode != null)
					msgs = ((InternalEObject)cuLaborCode).eInverseRemove(this, InfWorkPackage.CU_LABOR_CODE__CU_LABOR_ITEMS, CULaborCode.class, msgs);
				return basicSetCULaborCode((CULaborCode)otherEnd, msgs);
			case InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<?>)getQualificationRequirements()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE:
				return basicSetCULaborCode(null, msgs);
			case InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS:
				return getQualificationRequirements();
			case InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE:
				if (resolve) return getCULaborCode();
				return basicGetCULaborCode();
			case InfWorkPackage.CU_LABOR_ITEM__ACTIVITY_CODE:
				return getActivityCode();
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_DURATION:
				return getLaborDuration();
			case InfWorkPackage.CU_LABOR_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_RATE:
				return getLaborRate();
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
			case InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				getQualificationRequirements().addAll((Collection<? extends QualificationRequirement>)newValue);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE:
				setCULaborCode((CULaborCode)newValue);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__ACTIVITY_CODE:
				setActivityCode((String)newValue);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_DURATION:
				setLaborDuration((Float)newValue);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_RATE:
				setLaborRate((Float)newValue);
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
			case InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				return;
			case InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE:
				setCULaborCode((CULaborCode)null);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__ACTIVITY_CODE:
				setActivityCode(ACTIVITY_CODE_EDEFAULT);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_DURATION:
				setLaborDuration(LABOR_DURATION_EDEFAULT);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_RATE:
				setLaborRate(LABOR_RATE_EDEFAULT);
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
			case InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS:
				return qualificationRequirements != null && !qualificationRequirements.isEmpty();
			case InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE:
				return cuLaborCode != null;
			case InfWorkPackage.CU_LABOR_ITEM__ACTIVITY_CODE:
				return ACTIVITY_CODE_EDEFAULT == null ? activityCode != null : !ACTIVITY_CODE_EDEFAULT.equals(activityCode);
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_DURATION:
				return laborDuration != LABOR_DURATION_EDEFAULT;
			case InfWorkPackage.CU_LABOR_ITEM__STATUS:
				return status != null;
			case InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_RATE:
				return laborRate != LABOR_RATE_EDEFAULT;
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
		result.append(" (activityCode: ");
		result.append(activityCode);
		result.append(", laborDuration: ");
		result.append(laborDuration);
		result.append(", laborRate: ");
		result.append(laborRate);
		result.append(')');
		return result.toString();
	}

} //CULaborItemImpl
