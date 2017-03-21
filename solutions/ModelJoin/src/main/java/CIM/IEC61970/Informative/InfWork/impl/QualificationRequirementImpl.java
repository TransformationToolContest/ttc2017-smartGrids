/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.Specification;

import CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import CIM.IEC61970.Informative.InfCommon.Skill;

import CIM.IEC61970.Informative.InfWork.CULaborItem;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.QualificationRequirement;
import CIM.IEC61970.Informative.InfWork.WorkTask;

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
 * An implementation of the model object '<em><b>Qualification Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.QualificationRequirementImpl#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.QualificationRequirementImpl#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.QualificationRequirementImpl#getCULaborItems <em>CU Labor Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.QualificationRequirementImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.QualificationRequirementImpl#getQualificationID <em>Qualification ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualificationRequirementImpl extends IdentifiedObjectImpl implements QualificationRequirement {
	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Specification> specifications;

	/**
	 * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkTask> workTasks;

	/**
	 * The cached value of the '{@link #getCULaborItems() <em>CU Labor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCULaborItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CULaborItem> cuLaborItems;

	/**
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<Skill> skills;

	/**
	 * The default value of the '{@link #getQualificationID() <em>Qualification ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationID()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFICATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualificationID() <em>Qualification ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationID()
	 * @generated
	 * @ordered
	 */
	protected String qualificationID = QUALIFICATION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualificationRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.QUALIFICATION_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specification> getSpecifications() {
		if (specifications == null) {
			specifications = new EObjectWithInverseResolvingEList.ManyInverse<Specification>(Specification.class, this, InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS, InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS);
		}
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new EObjectWithInverseResolvingEList.ManyInverse<WorkTask>(WorkTask.class, this, InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS, InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS);
		}
		return workTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CULaborItem> getCULaborItems() {
		if (cuLaborItems == null) {
			cuLaborItems = new EObjectWithInverseResolvingEList.ManyInverse<CULaborItem>(CULaborItem.class, this, InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS, InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS);
		}
		return cuLaborItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Skill> getSkills() {
		if (skills == null) {
			skills = new EObjectWithInverseResolvingEList.ManyInverse<Skill>(Skill.class, this, InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS, InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS);
		}
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualificationID() {
		return qualificationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificationID(String newQualificationID) {
		String oldQualificationID = qualificationID;
		qualificationID = newQualificationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.QUALIFICATION_REQUIREMENT__QUALIFICATION_ID, oldQualificationID, qualificationID));
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
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecifications()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCULaborItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSkills()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS:
				return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS:
				return ((InternalEList<?>)getCULaborItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS:
				return getSpecifications();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS:
				return getWorkTasks();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS:
				return getCULaborItems();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS:
				return getSkills();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__QUALIFICATION_ID:
				return getQualificationID();
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
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS:
				getSpecifications().clear();
				getSpecifications().addAll((Collection<? extends Specification>)newValue);
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS:
				getCULaborItems().clear();
				getCULaborItems().addAll((Collection<? extends CULaborItem>)newValue);
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__QUALIFICATION_ID:
				setQualificationID((String)newValue);
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
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS:
				getSpecifications().clear();
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS:
				getCULaborItems().clear();
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS:
				getSkills().clear();
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__QUALIFICATION_ID:
				setQualificationID(QUALIFICATION_ID_EDEFAULT);
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
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS:
				return specifications != null && !specifications.isEmpty();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS:
				return cuLaborItems != null && !cuLaborItems.isEmpty();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS:
				return skills != null && !skills.isEmpty();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__QUALIFICATION_ID:
				return QUALIFICATION_ID_EDEFAULT == null ? qualificationID != null : !QUALIFICATION_ID_EDEFAULT.equals(qualificationID);
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
		result.append(" (qualificationID: ");
		result.append(qualificationID);
		result.append(')');
		return result.toString();
	}

} //QualificationRequirementImpl
