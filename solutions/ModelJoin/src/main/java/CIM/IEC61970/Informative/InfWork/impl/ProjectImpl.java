/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61968.Work.Work;
import CIM.IEC61968.Work.WorkPackage;

import CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfWork.BusinessCase;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.Project;
import CIM.IEC61970.Informative.InfWork.Request;

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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ProjectImpl#getBudget <em>Budget</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ProjectImpl#getErpProjectAccounting <em>Erp Project Accounting</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ProjectImpl#getWorks <em>Works</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ProjectImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ProjectImpl#getBusinessCase <em>Business Case</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ProjectImpl#getSubProjects <em>Sub Projects</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ProjectImpl#getParentProject <em>Parent Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends DocumentImpl implements Project {
	/**
	 * The default value of the '{@link #getBudget() <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudget()
	 * @generated
	 * @ordered
	 */
	protected static final float BUDGET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBudget() <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudget()
	 * @generated
	 * @ordered
	 */
	protected float budget = BUDGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpProjectAccounting() <em>Erp Project Accounting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpProjectAccounting()
	 * @generated
	 * @ordered
	 */
	protected ErpProjectAccounting erpProjectAccounting;

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
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> requests;

	/**
	 * The cached value of the '{@link #getBusinessCase() <em>Business Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCase()
	 * @generated
	 * @ordered
	 */
	protected BusinessCase businessCase;

	/**
	 * The cached value of the '{@link #getSubProjects() <em>Sub Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> subProjects;

	/**
	 * The cached value of the '{@link #getParentProject() <em>Parent Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentProject()
	 * @generated
	 * @ordered
	 */
	protected Project parentProject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBudget() {
		return budget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBudget(float newBudget) {
		float oldBudget = budget;
		budget = newBudget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.PROJECT__BUDGET, oldBudget, budget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpProjectAccounting getErpProjectAccounting() {
		if (erpProjectAccounting != null && erpProjectAccounting.eIsProxy()) {
			InternalEObject oldErpProjectAccounting = (InternalEObject)erpProjectAccounting;
			erpProjectAccounting = (ErpProjectAccounting)eResolveProxy(oldErpProjectAccounting);
			if (erpProjectAccounting != oldErpProjectAccounting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING, oldErpProjectAccounting, erpProjectAccounting));
			}
		}
		return erpProjectAccounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpProjectAccounting basicGetErpProjectAccounting() {
		return erpProjectAccounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpProjectAccounting(ErpProjectAccounting newErpProjectAccounting, NotificationChain msgs) {
		ErpProjectAccounting oldErpProjectAccounting = erpProjectAccounting;
		erpProjectAccounting = newErpProjectAccounting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING, oldErpProjectAccounting, newErpProjectAccounting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpProjectAccounting(ErpProjectAccounting newErpProjectAccounting) {
		if (newErpProjectAccounting != erpProjectAccounting) {
			NotificationChain msgs = null;
			if (erpProjectAccounting != null)
				msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS, ErpProjectAccounting.class, msgs);
			if (newErpProjectAccounting != null)
				msgs = ((InternalEObject)newErpProjectAccounting).eInverseAdd(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS, ErpProjectAccounting.class, msgs);
			msgs = basicSetErpProjectAccounting(newErpProjectAccounting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING, newErpProjectAccounting, newErpProjectAccounting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new EObjectWithInverseResolvingEList<Work>(Work.class, this, InfWorkPackage.PROJECT__WORKS, WorkPackage.WORK__PROJECT);
		}
		return works;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Request> getRequests() {
		if (requests == null) {
			requests = new EObjectWithInverseResolvingEList.ManyInverse<Request>(Request.class, this, InfWorkPackage.PROJECT__REQUESTS, InfWorkPackage.REQUEST__PROJECTS);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCase getBusinessCase() {
		if (businessCase != null && businessCase.eIsProxy()) {
			InternalEObject oldBusinessCase = (InternalEObject)businessCase;
			businessCase = (BusinessCase)eResolveProxy(oldBusinessCase);
			if (businessCase != oldBusinessCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.PROJECT__BUSINESS_CASE, oldBusinessCase, businessCase));
			}
		}
		return businessCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCase basicGetBusinessCase() {
		return businessCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessCase(BusinessCase newBusinessCase, NotificationChain msgs) {
		BusinessCase oldBusinessCase = businessCase;
		businessCase = newBusinessCase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.PROJECT__BUSINESS_CASE, oldBusinessCase, newBusinessCase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessCase(BusinessCase newBusinessCase) {
		if (newBusinessCase != businessCase) {
			NotificationChain msgs = null;
			if (businessCase != null)
				msgs = ((InternalEObject)businessCase).eInverseRemove(this, InfWorkPackage.BUSINESS_CASE__PROJECTS, BusinessCase.class, msgs);
			if (newBusinessCase != null)
				msgs = ((InternalEObject)newBusinessCase).eInverseAdd(this, InfWorkPackage.BUSINESS_CASE__PROJECTS, BusinessCase.class, msgs);
			msgs = basicSetBusinessCase(newBusinessCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.PROJECT__BUSINESS_CASE, newBusinessCase, newBusinessCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getSubProjects() {
		if (subProjects == null) {
			subProjects = new EObjectWithInverseResolvingEList<Project>(Project.class, this, InfWorkPackage.PROJECT__SUB_PROJECTS, InfWorkPackage.PROJECT__PARENT_PROJECT);
		}
		return subProjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getParentProject() {
		if (parentProject != null && parentProject.eIsProxy()) {
			InternalEObject oldParentProject = (InternalEObject)parentProject;
			parentProject = (Project)eResolveProxy(oldParentProject);
			if (parentProject != oldParentProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.PROJECT__PARENT_PROJECT, oldParentProject, parentProject));
			}
		}
		return parentProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetParentProject() {
		return parentProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentProject(Project newParentProject, NotificationChain msgs) {
		Project oldParentProject = parentProject;
		parentProject = newParentProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.PROJECT__PARENT_PROJECT, oldParentProject, newParentProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentProject(Project newParentProject) {
		if (newParentProject != parentProject) {
			NotificationChain msgs = null;
			if (parentProject != null)
				msgs = ((InternalEObject)parentProject).eInverseRemove(this, InfWorkPackage.PROJECT__SUB_PROJECTS, Project.class, msgs);
			if (newParentProject != null)
				msgs = ((InternalEObject)newParentProject).eInverseAdd(this, InfWorkPackage.PROJECT__SUB_PROJECTS, Project.class, msgs);
			msgs = basicSetParentProject(newParentProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.PROJECT__PARENT_PROJECT, newParentProject, newParentProject));
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
			case InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING:
				if (erpProjectAccounting != null)
					msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS, ErpProjectAccounting.class, msgs);
				return basicSetErpProjectAccounting((ErpProjectAccounting)otherEnd, msgs);
			case InfWorkPackage.PROJECT__WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.PROJECT__REQUESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequests()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.PROJECT__BUSINESS_CASE:
				if (businessCase != null)
					msgs = ((InternalEObject)businessCase).eInverseRemove(this, InfWorkPackage.BUSINESS_CASE__PROJECTS, BusinessCase.class, msgs);
				return basicSetBusinessCase((BusinessCase)otherEnd, msgs);
			case InfWorkPackage.PROJECT__SUB_PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubProjects()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.PROJECT__PARENT_PROJECT:
				if (parentProject != null)
					msgs = ((InternalEObject)parentProject).eInverseRemove(this, InfWorkPackage.PROJECT__SUB_PROJECTS, Project.class, msgs);
				return basicSetParentProject((Project)otherEnd, msgs);
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
			case InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING:
				return basicSetErpProjectAccounting(null, msgs);
			case InfWorkPackage.PROJECT__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.PROJECT__REQUESTS:
				return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.PROJECT__BUSINESS_CASE:
				return basicSetBusinessCase(null, msgs);
			case InfWorkPackage.PROJECT__SUB_PROJECTS:
				return ((InternalEList<?>)getSubProjects()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.PROJECT__PARENT_PROJECT:
				return basicSetParentProject(null, msgs);
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
			case InfWorkPackage.PROJECT__BUDGET:
				return getBudget();
			case InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING:
				if (resolve) return getErpProjectAccounting();
				return basicGetErpProjectAccounting();
			case InfWorkPackage.PROJECT__WORKS:
				return getWorks();
			case InfWorkPackage.PROJECT__REQUESTS:
				return getRequests();
			case InfWorkPackage.PROJECT__BUSINESS_CASE:
				if (resolve) return getBusinessCase();
				return basicGetBusinessCase();
			case InfWorkPackage.PROJECT__SUB_PROJECTS:
				return getSubProjects();
			case InfWorkPackage.PROJECT__PARENT_PROJECT:
				if (resolve) return getParentProject();
				return basicGetParentProject();
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
			case InfWorkPackage.PROJECT__BUDGET:
				setBudget((Float)newValue);
				return;
			case InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)newValue);
				return;
			case InfWorkPackage.PROJECT__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
				return;
			case InfWorkPackage.PROJECT__REQUESTS:
				getRequests().clear();
				getRequests().addAll((Collection<? extends Request>)newValue);
				return;
			case InfWorkPackage.PROJECT__BUSINESS_CASE:
				setBusinessCase((BusinessCase)newValue);
				return;
			case InfWorkPackage.PROJECT__SUB_PROJECTS:
				getSubProjects().clear();
				getSubProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case InfWorkPackage.PROJECT__PARENT_PROJECT:
				setParentProject((Project)newValue);
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
			case InfWorkPackage.PROJECT__BUDGET:
				setBudget(BUDGET_EDEFAULT);
				return;
			case InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)null);
				return;
			case InfWorkPackage.PROJECT__WORKS:
				getWorks().clear();
				return;
			case InfWorkPackage.PROJECT__REQUESTS:
				getRequests().clear();
				return;
			case InfWorkPackage.PROJECT__BUSINESS_CASE:
				setBusinessCase((BusinessCase)null);
				return;
			case InfWorkPackage.PROJECT__SUB_PROJECTS:
				getSubProjects().clear();
				return;
			case InfWorkPackage.PROJECT__PARENT_PROJECT:
				setParentProject((Project)null);
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
			case InfWorkPackage.PROJECT__BUDGET:
				return budget != BUDGET_EDEFAULT;
			case InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING:
				return erpProjectAccounting != null;
			case InfWorkPackage.PROJECT__WORKS:
				return works != null && !works.isEmpty();
			case InfWorkPackage.PROJECT__REQUESTS:
				return requests != null && !requests.isEmpty();
			case InfWorkPackage.PROJECT__BUSINESS_CASE:
				return businessCase != null;
			case InfWorkPackage.PROJECT__SUB_PROJECTS:
				return subProjects != null && !subProjects.isEmpty();
			case InfWorkPackage.PROJECT__PARENT_PROJECT:
				return parentProject != null;
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
		result.append(" (budget: ");
		result.append(budget);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
