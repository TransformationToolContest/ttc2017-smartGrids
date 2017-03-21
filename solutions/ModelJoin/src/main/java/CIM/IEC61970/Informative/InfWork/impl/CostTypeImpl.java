/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfWork.CompatibleUnit;
import CIM.IEC61970.Informative.InfWork.CostType;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.WorkCostDetail;

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
 * An implementation of the model object '<em><b>Cost Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl#getErpJournalEntries <em>Erp Journal Entries</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl#getParentCostType <em>Parent Cost Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl#getChildCostTypes <em>Child Cost Types</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl#isAmountAssignmentFlag <em>Amount Assignment Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.CostTypeImpl#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostTypeImpl extends IdentifiedObjectImpl implements CostType {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpJournalEntries() <em>Erp Journal Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpJournalEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpJournalEntry> erpJournalEntries;

	/**
	 * The cached value of the '{@link #getWorkCostDetails() <em>Work Cost Details</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkCostDetail> workCostDetails;

	/**
	 * The cached value of the '{@link #getParentCostType() <em>Parent Cost Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCostType()
	 * @generated
	 * @ordered
	 */
	protected CostType parentCostType;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getChildCostTypes() <em>Child Cost Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildCostTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CostType> childCostTypes;

	/**
	 * The default value of the '{@link #isAmountAssignmentFlag() <em>Amount Assignment Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAmountAssignmentFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AMOUNT_ASSIGNMENT_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAmountAssignmentFlag() <em>Amount Assignment Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAmountAssignmentFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean amountAssignmentFlag = AMOUNT_ASSIGNMENT_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected static final String STAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected String stage = STAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.COST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.COST_TYPE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpJournalEntry> getErpJournalEntries() {
		if (erpJournalEntries == null) {
			erpJournalEntries = new EObjectWithInverseResolvingEList.ManyInverse<ErpJournalEntry>(ErpJournalEntry.class, this, InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES, InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES);
		}
		return erpJournalEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new EObjectWithInverseResolvingEList<WorkCostDetail>(WorkCostDetail.class, this, InfWorkPackage.COST_TYPE__WORK_COST_DETAILS, InfWorkPackage.WORK_COST_DETAIL__COST_TYPE);
		}
		return workCostDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType getParentCostType() {
		if (parentCostType != null && parentCostType.eIsProxy()) {
			InternalEObject oldParentCostType = (InternalEObject)parentCostType;
			parentCostType = (CostType)eResolveProxy(oldParentCostType);
			if (parentCostType != oldParentCostType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.COST_TYPE__PARENT_COST_TYPE, oldParentCostType, parentCostType));
			}
		}
		return parentCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType basicGetParentCostType() {
		return parentCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCostType(CostType newParentCostType, NotificationChain msgs) {
		CostType oldParentCostType = parentCostType;
		parentCostType = newParentCostType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.COST_TYPE__PARENT_COST_TYPE, oldParentCostType, newParentCostType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCostType(CostType newParentCostType) {
		if (newParentCostType != parentCostType) {
			NotificationChain msgs = null;
			if (parentCostType != null)
				msgs = ((InternalEObject)parentCostType).eInverseRemove(this, InfWorkPackage.COST_TYPE__CHILD_COST_TYPES, CostType.class, msgs);
			if (newParentCostType != null)
				msgs = ((InternalEObject)newParentCostType).eInverseAdd(this, InfWorkPackage.COST_TYPE__CHILD_COST_TYPES, CostType.class, msgs);
			msgs = basicSetParentCostType(newParentCostType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.COST_TYPE__PARENT_COST_TYPE, newParentCostType, newParentCostType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new EObjectWithInverseResolvingEList<CompatibleUnit>(CompatibleUnit.class, this, InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS, InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE);
		}
		return compatibleUnits;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.COST_TYPE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.COST_TYPE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CostType> getChildCostTypes() {
		if (childCostTypes == null) {
			childCostTypes = new EObjectWithInverseResolvingEList<CostType>(CostType.class, this, InfWorkPackage.COST_TYPE__CHILD_COST_TYPES, InfWorkPackage.COST_TYPE__PARENT_COST_TYPE);
		}
		return childCostTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAmountAssignmentFlag() {
		return amountAssignmentFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountAssignmentFlag(boolean newAmountAssignmentFlag) {
		boolean oldAmountAssignmentFlag = amountAssignmentFlag;
		amountAssignmentFlag = newAmountAssignmentFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.COST_TYPE__AMOUNT_ASSIGNMENT_FLAG, oldAmountAssignmentFlag, amountAssignmentFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.COST_TYPE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(String newStage) {
		String oldStage = stage;
		stage = newStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.COST_TYPE__STAGE, oldStage, stage));
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
			case InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpJournalEntries()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__PARENT_COST_TYPE:
				if (parentCostType != null)
					msgs = ((InternalEObject)parentCostType).eInverseRemove(this, InfWorkPackage.COST_TYPE__CHILD_COST_TYPES, CostType.class, msgs);
				return basicSetParentCostType((CostType)otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__CHILD_COST_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildCostTypes()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES:
				return ((InternalEList<?>)getErpJournalEntries()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__PARENT_COST_TYPE:
				return basicSetParentCostType(null, msgs);
			case InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__CHILD_COST_TYPES:
				return ((InternalEList<?>)getChildCostTypes()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.COST_TYPE__LEVEL:
				return getLevel();
			case InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES:
				return getErpJournalEntries();
			case InfWorkPackage.COST_TYPE__WORK_COST_DETAILS:
				return getWorkCostDetails();
			case InfWorkPackage.COST_TYPE__PARENT_COST_TYPE:
				if (resolve) return getParentCostType();
				return basicGetParentCostType();
			case InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.COST_TYPE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.COST_TYPE__CHILD_COST_TYPES:
				return getChildCostTypes();
			case InfWorkPackage.COST_TYPE__AMOUNT_ASSIGNMENT_FLAG:
				return isAmountAssignmentFlag();
			case InfWorkPackage.COST_TYPE__CODE:
				return getCode();
			case InfWorkPackage.COST_TYPE__STAGE:
				return getStage();
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
			case InfWorkPackage.COST_TYPE__LEVEL:
				setLevel((String)newValue);
				return;
			case InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES:
				getErpJournalEntries().clear();
				getErpJournalEntries().addAll((Collection<? extends ErpJournalEntry>)newValue);
				return;
			case InfWorkPackage.COST_TYPE__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
				return;
			case InfWorkPackage.COST_TYPE__PARENT_COST_TYPE:
				setParentCostType((CostType)newValue);
				return;
			case InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.COST_TYPE__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.COST_TYPE__CHILD_COST_TYPES:
				getChildCostTypes().clear();
				getChildCostTypes().addAll((Collection<? extends CostType>)newValue);
				return;
			case InfWorkPackage.COST_TYPE__AMOUNT_ASSIGNMENT_FLAG:
				setAmountAssignmentFlag((Boolean)newValue);
				return;
			case InfWorkPackage.COST_TYPE__CODE:
				setCode((String)newValue);
				return;
			case InfWorkPackage.COST_TYPE__STAGE:
				setStage((String)newValue);
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
			case InfWorkPackage.COST_TYPE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES:
				getErpJournalEntries().clear();
				return;
			case InfWorkPackage.COST_TYPE__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				return;
			case InfWorkPackage.COST_TYPE__PARENT_COST_TYPE:
				setParentCostType((CostType)null);
				return;
			case InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.COST_TYPE__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.COST_TYPE__CHILD_COST_TYPES:
				getChildCostTypes().clear();
				return;
			case InfWorkPackage.COST_TYPE__AMOUNT_ASSIGNMENT_FLAG:
				setAmountAssignmentFlag(AMOUNT_ASSIGNMENT_FLAG_EDEFAULT);
				return;
			case InfWorkPackage.COST_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case InfWorkPackage.COST_TYPE__STAGE:
				setStage(STAGE_EDEFAULT);
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
			case InfWorkPackage.COST_TYPE__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES:
				return erpJournalEntries != null && !erpJournalEntries.isEmpty();
			case InfWorkPackage.COST_TYPE__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
			case InfWorkPackage.COST_TYPE__PARENT_COST_TYPE:
				return parentCostType != null;
			case InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.COST_TYPE__STATUS:
				return status != null;
			case InfWorkPackage.COST_TYPE__CHILD_COST_TYPES:
				return childCostTypes != null && !childCostTypes.isEmpty();
			case InfWorkPackage.COST_TYPE__AMOUNT_ASSIGNMENT_FLAG:
				return amountAssignmentFlag != AMOUNT_ASSIGNMENT_FLAG_EDEFAULT;
			case InfWorkPackage.COST_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case InfWorkPackage.COST_TYPE__STAGE:
				return STAGE_EDEFAULT == null ? stage != null : !STAGE_EDEFAULT.equals(stage);
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
		result.append(" (level: ");
		result.append(level);
		result.append(", amountAssignmentFlag: ");
		result.append(amountAssignmentFlag);
		result.append(", code: ");
		result.append(code);
		result.append(", stage: ");
		result.append(stage);
		result.append(')');
		return result.toString();
	}

} //CostTypeImpl
