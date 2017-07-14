/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61968.Work.Work;
import gluemodel.CIM.IEC61968.Work.WorkPackage;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.Project;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Project Accounting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpProjectAccountingImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpProjectAccountingImpl#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpProjectAccountingImpl#getErpTimeEntries <em>Erp Time Entries</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpProjectAccountingImpl#getWorks <em>Works</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpProjectAccountingImpl extends DocumentImpl implements ErpProjectAccounting {
	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> projects;

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
	 * The cached value of the '{@link #getErpTimeEntries() <em>Erp Time Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpTimeEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpTimeEntry> erpTimeEntries;

	/**
	 * The cached value of the '{@link #getWorks() <em>Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<Work> works;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpProjectAccountingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_PROJECT_ACCOUNTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectWithInverseResolvingEList<Project>(Project.class, this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS, InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new EObjectWithInverseResolvingEList<WorkCostDetail>(WorkCostDetail.class, this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS, InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING);
		}
		return workCostDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpTimeEntry> getErpTimeEntries() {
		if (erpTimeEntries == null) {
			erpTimeEntries = new EObjectWithInverseResolvingEList<ErpTimeEntry>(ErpTimeEntry.class, this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES, InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING);
		}
		return erpTimeEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new EObjectWithInverseResolvingEList<Work>(Work.class, this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS, WorkPackage.WORK__ERP_PROJECT_ACCOUNTING);
		}
		return works;
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
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjects()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpTimeEntries()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorks()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES:
				return ((InternalEList<?>)getErpTimeEntries()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS:
				return getProjects();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS:
				return getWorkCostDetails();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES:
				return getErpTimeEntries();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS:
				return getWorks();
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
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
				return;
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES:
				getErpTimeEntries().clear();
				getErpTimeEntries().addAll((Collection<? extends ErpTimeEntry>)newValue);
				return;
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
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
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS:
				getProjects().clear();
				return;
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				return;
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES:
				getErpTimeEntries().clear();
				return;
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS:
				getWorks().clear();
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
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS:
				return projects != null && !projects.isEmpty();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES:
				return erpTimeEntries != null && !erpTimeEntries.isEmpty();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS:
				return works != null && !works.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErpProjectAccountingImpl
