/**
 */
package gluemodel.CIM.IEC61968.Work.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61968.Customers.Customer;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;

import gluemodel.CIM.IEC61968.Work.Work;
import gluemodel.CIM.IEC61968.Work.WorkKind;
import gluemodel.CIM.IEC61968.Work.WorkPackage;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.BusinessCase;
import gluemodel.CIM.IEC61970.Informative.InfWork.Design;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.Project;
import gluemodel.CIM.IEC61970.Informative.InfWork.Request;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkFlowStep;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getDesigns <em>Designs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getBusinessCase <em>Business Case</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getWorkFlowSteps <em>Work Flow Steps</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getErpProjectAccounting <em>Erp Project Accounting</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getProject <em>Project</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getWorkBillingInfo <em>Work Billing Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getRequestDateTime <em>Request Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Work.impl.WorkImpl#getCustomers <em>Customers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkImpl extends DocumentImpl implements Work {
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
	 * The cached value of the '{@link #getDesigns() <em>Designs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesigns()
	 * @generated
	 * @ordered
	 */
	protected EList<Design> designs;

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
	 * The cached value of the '{@link #getWorkFlowSteps() <em>Work Flow Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkFlowSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkFlowStep> workFlowSteps;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

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
	 * The cached value of the '{@link #getErpProjectAccounting() <em>Erp Project Accounting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpProjectAccounting()
	 * @generated
	 * @ordered
	 */
	protected ErpProjectAccounting erpProjectAccounting;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Request request;

	/**
	 * The cached value of the '{@link #getWorkBillingInfo() <em>Work Billing Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkBillingInfo()
	 * @generated
	 * @ordered
	 */
	protected WorkBillingInfo workBillingInfo;

	/**
	 * The default value of the '{@link #getRequestDateTime() <em>Request Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date REQUEST_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestDateTime() <em>Request Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date requestDateTime = REQUEST_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final WorkKind KIND_EDEFAULT = WorkKind.MAINTENANCE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected WorkKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkPackage.Literals.WORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new EObjectWithInverseResolvingEList<WorkTask>(WorkTask.class, this, WorkPackage.WORK__WORK_TASKS, InfWorkPackage.WORK_TASK__WORK);
		}
		return workTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Design> getDesigns() {
		if (designs == null) {
			designs = new EObjectWithInverseResolvingEList<Design>(Design.class, this, WorkPackage.WORK__DESIGNS, InfWorkPackage.DESIGN__WORK);
		}
		return designs;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.WORK__BUSINESS_CASE, oldBusinessCase, businessCase));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__BUSINESS_CASE, oldBusinessCase, newBusinessCase);
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
				msgs = ((InternalEObject)businessCase).eInverseRemove(this, InfWorkPackage.BUSINESS_CASE__WORKS, BusinessCase.class, msgs);
			if (newBusinessCase != null)
				msgs = ((InternalEObject)newBusinessCase).eInverseAdd(this, InfWorkPackage.BUSINESS_CASE__WORKS, BusinessCase.class, msgs);
			msgs = basicSetBusinessCase(newBusinessCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__BUSINESS_CASE, newBusinessCase, newBusinessCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkFlowStep> getWorkFlowSteps() {
		if (workFlowSteps == null) {
			workFlowSteps = new EObjectWithInverseResolvingEList<WorkFlowStep>(WorkFlowStep.class, this, WorkPackage.WORK__WORK_FLOW_STEPS, InfWorkPackage.WORK_FLOW_STEP__WORK);
		}
		return workFlowSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new EObjectWithInverseResolvingEList.ManyInverse<WorkCostDetail>(WorkCostDetail.class, this, WorkPackage.WORK__WORK_COST_DETAILS, InfWorkPackage.WORK_COST_DETAIL__WORKS);
		}
		return workCostDetails;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.WORK__ERP_PROJECT_ACCOUNTING, oldErpProjectAccounting, erpProjectAccounting));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__ERP_PROJECT_ACCOUNTING, oldErpProjectAccounting, newErpProjectAccounting);
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
				msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS, ErpProjectAccounting.class, msgs);
			if (newErpProjectAccounting != null)
				msgs = ((InternalEObject)newErpProjectAccounting).eInverseAdd(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS, ErpProjectAccounting.class, msgs);
			msgs = basicSetErpProjectAccounting(newErpProjectAccounting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__ERP_PROJECT_ACCOUNTING, newErpProjectAccounting, newErpProjectAccounting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.WORK__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__PROJECT, oldProject, newProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != project) {
			NotificationChain msgs = null;
			if (project != null)
				msgs = ((InternalEObject)project).eInverseRemove(this, InfWorkPackage.PROJECT__WORKS, Project.class, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, InfWorkPackage.PROJECT__WORKS, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Request)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.WORK__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Request newRequest, NotificationChain msgs) {
		Request oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Request newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, InfWorkPackage.REQUEST__WORKS, Request.class, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, InfWorkPackage.REQUEST__WORKS, Request.class, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkBillingInfo getWorkBillingInfo() {
		if (workBillingInfo != null && workBillingInfo.eIsProxy()) {
			InternalEObject oldWorkBillingInfo = (InternalEObject)workBillingInfo;
			workBillingInfo = (WorkBillingInfo)eResolveProxy(oldWorkBillingInfo);
			if (workBillingInfo != oldWorkBillingInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.WORK__WORK_BILLING_INFO, oldWorkBillingInfo, workBillingInfo));
			}
		}
		return workBillingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkBillingInfo basicGetWorkBillingInfo() {
		return workBillingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkBillingInfo(WorkBillingInfo newWorkBillingInfo, NotificationChain msgs) {
		WorkBillingInfo oldWorkBillingInfo = workBillingInfo;
		workBillingInfo = newWorkBillingInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__WORK_BILLING_INFO, oldWorkBillingInfo, newWorkBillingInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkBillingInfo(WorkBillingInfo newWorkBillingInfo) {
		if (newWorkBillingInfo != workBillingInfo) {
			NotificationChain msgs = null;
			if (workBillingInfo != null)
				msgs = ((InternalEObject)workBillingInfo).eInverseRemove(this, InfCustomersPackage.WORK_BILLING_INFO__WORKS, WorkBillingInfo.class, msgs);
			if (newWorkBillingInfo != null)
				msgs = ((InternalEObject)newWorkBillingInfo).eInverseAdd(this, InfCustomersPackage.WORK_BILLING_INFO__WORKS, WorkBillingInfo.class, msgs);
			msgs = basicSetWorkBillingInfo(newWorkBillingInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__WORK_BILLING_INFO, newWorkBillingInfo, newWorkBillingInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRequestDateTime() {
		return requestDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestDateTime(Date newRequestDateTime) {
		Date oldRequestDateTime = requestDateTime;
		requestDateTime = newRequestDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__REQUEST_DATE_TIME, oldRequestDateTime, requestDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(WorkKind newKind) {
		WorkKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.WORK__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectWithInverseResolvingEList.ManyInverse<Customer>(Customer.class, this, WorkPackage.WORK__CUSTOMERS, CustomersPackage.CUSTOMER__WORKS);
		}
		return customers;
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
			case WorkPackage.WORK__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case WorkPackage.WORK__DESIGNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesigns()).basicAdd(otherEnd, msgs);
			case WorkPackage.WORK__BUSINESS_CASE:
				if (businessCase != null)
					msgs = ((InternalEObject)businessCase).eInverseRemove(this, InfWorkPackage.BUSINESS_CASE__WORKS, BusinessCase.class, msgs);
				return basicSetBusinessCase((BusinessCase)otherEnd, msgs);
			case WorkPackage.WORK__WORK_FLOW_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkFlowSteps()).basicAdd(otherEnd, msgs);
			case WorkPackage.WORK__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
			case WorkPackage.WORK__ERP_PROJECT_ACCOUNTING:
				if (erpProjectAccounting != null)
					msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS, ErpProjectAccounting.class, msgs);
				return basicSetErpProjectAccounting((ErpProjectAccounting)otherEnd, msgs);
			case WorkPackage.WORK__PROJECT:
				if (project != null)
					msgs = ((InternalEObject)project).eInverseRemove(this, InfWorkPackage.PROJECT__WORKS, Project.class, msgs);
				return basicSetProject((Project)otherEnd, msgs);
			case WorkPackage.WORK__REQUEST:
				if (request != null)
					msgs = ((InternalEObject)request).eInverseRemove(this, InfWorkPackage.REQUEST__WORKS, Request.class, msgs);
				return basicSetRequest((Request)otherEnd, msgs);
			case WorkPackage.WORK__WORK_BILLING_INFO:
				if (workBillingInfo != null)
					msgs = ((InternalEObject)workBillingInfo).eInverseRemove(this, InfCustomersPackage.WORK_BILLING_INFO__WORKS, WorkBillingInfo.class, msgs);
				return basicSetWorkBillingInfo((WorkBillingInfo)otherEnd, msgs);
			case WorkPackage.WORK__CUSTOMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomers()).basicAdd(otherEnd, msgs);
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
			case WorkPackage.WORK__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__DESIGNS:
				return ((InternalEList<?>)getDesigns()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__BUSINESS_CASE:
				return basicSetBusinessCase(null, msgs);
			case WorkPackage.WORK__WORK_FLOW_STEPS:
				return ((InternalEList<?>)getWorkFlowSteps()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__ERP_PROJECT_ACCOUNTING:
				return basicSetErpProjectAccounting(null, msgs);
			case WorkPackage.WORK__PROJECT:
				return basicSetProject(null, msgs);
			case WorkPackage.WORK__REQUEST:
				return basicSetRequest(null, msgs);
			case WorkPackage.WORK__WORK_BILLING_INFO:
				return basicSetWorkBillingInfo(null, msgs);
			case WorkPackage.WORK__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
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
			case WorkPackage.WORK__WORK_TASKS:
				return getWorkTasks();
			case WorkPackage.WORK__DESIGNS:
				return getDesigns();
			case WorkPackage.WORK__BUSINESS_CASE:
				if (resolve) return getBusinessCase();
				return basicGetBusinessCase();
			case WorkPackage.WORK__WORK_FLOW_STEPS:
				return getWorkFlowSteps();
			case WorkPackage.WORK__PRIORITY:
				return getPriority();
			case WorkPackage.WORK__WORK_COST_DETAILS:
				return getWorkCostDetails();
			case WorkPackage.WORK__ERP_PROJECT_ACCOUNTING:
				if (resolve) return getErpProjectAccounting();
				return basicGetErpProjectAccounting();
			case WorkPackage.WORK__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case WorkPackage.WORK__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case WorkPackage.WORK__WORK_BILLING_INFO:
				if (resolve) return getWorkBillingInfo();
				return basicGetWorkBillingInfo();
			case WorkPackage.WORK__REQUEST_DATE_TIME:
				return getRequestDateTime();
			case WorkPackage.WORK__KIND:
				return getKind();
			case WorkPackage.WORK__CUSTOMERS:
				return getCustomers();
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
			case WorkPackage.WORK__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case WorkPackage.WORK__DESIGNS:
				getDesigns().clear();
				getDesigns().addAll((Collection<? extends Design>)newValue);
				return;
			case WorkPackage.WORK__BUSINESS_CASE:
				setBusinessCase((BusinessCase)newValue);
				return;
			case WorkPackage.WORK__WORK_FLOW_STEPS:
				getWorkFlowSteps().clear();
				getWorkFlowSteps().addAll((Collection<? extends WorkFlowStep>)newValue);
				return;
			case WorkPackage.WORK__PRIORITY:
				setPriority((String)newValue);
				return;
			case WorkPackage.WORK__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
				return;
			case WorkPackage.WORK__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)newValue);
				return;
			case WorkPackage.WORK__PROJECT:
				setProject((Project)newValue);
				return;
			case WorkPackage.WORK__REQUEST:
				setRequest((Request)newValue);
				return;
			case WorkPackage.WORK__WORK_BILLING_INFO:
				setWorkBillingInfo((WorkBillingInfo)newValue);
				return;
			case WorkPackage.WORK__REQUEST_DATE_TIME:
				setRequestDateTime((Date)newValue);
				return;
			case WorkPackage.WORK__KIND:
				setKind((WorkKind)newValue);
				return;
			case WorkPackage.WORK__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
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
			case WorkPackage.WORK__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case WorkPackage.WORK__DESIGNS:
				getDesigns().clear();
				return;
			case WorkPackage.WORK__BUSINESS_CASE:
				setBusinessCase((BusinessCase)null);
				return;
			case WorkPackage.WORK__WORK_FLOW_STEPS:
				getWorkFlowSteps().clear();
				return;
			case WorkPackage.WORK__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case WorkPackage.WORK__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				return;
			case WorkPackage.WORK__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)null);
				return;
			case WorkPackage.WORK__PROJECT:
				setProject((Project)null);
				return;
			case WorkPackage.WORK__REQUEST:
				setRequest((Request)null);
				return;
			case WorkPackage.WORK__WORK_BILLING_INFO:
				setWorkBillingInfo((WorkBillingInfo)null);
				return;
			case WorkPackage.WORK__REQUEST_DATE_TIME:
				setRequestDateTime(REQUEST_DATE_TIME_EDEFAULT);
				return;
			case WorkPackage.WORK__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case WorkPackage.WORK__CUSTOMERS:
				getCustomers().clear();
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
			case WorkPackage.WORK__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case WorkPackage.WORK__DESIGNS:
				return designs != null && !designs.isEmpty();
			case WorkPackage.WORK__BUSINESS_CASE:
				return businessCase != null;
			case WorkPackage.WORK__WORK_FLOW_STEPS:
				return workFlowSteps != null && !workFlowSteps.isEmpty();
			case WorkPackage.WORK__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case WorkPackage.WORK__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
			case WorkPackage.WORK__ERP_PROJECT_ACCOUNTING:
				return erpProjectAccounting != null;
			case WorkPackage.WORK__PROJECT:
				return project != null;
			case WorkPackage.WORK__REQUEST:
				return request != null;
			case WorkPackage.WORK__WORK_BILLING_INFO:
				return workBillingInfo != null;
			case WorkPackage.WORK__REQUEST_DATE_TIME:
				return REQUEST_DATE_TIME_EDEFAULT == null ? requestDateTime != null : !REQUEST_DATE_TIME_EDEFAULT.equals(requestDateTime);
			case WorkPackage.WORK__KIND:
				return kind != KIND_EDEFAULT;
			case WorkPackage.WORK__CUSTOMERS:
				return customers != null && !customers.isEmpty();
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(", requestDateTime: ");
		result.append(requestDateTime);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //WorkImpl
