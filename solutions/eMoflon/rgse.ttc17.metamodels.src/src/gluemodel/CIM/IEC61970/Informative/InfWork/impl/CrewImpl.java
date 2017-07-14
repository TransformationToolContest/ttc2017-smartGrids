/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfLocations.Route;

import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep;
import gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule;

import gluemodel.CIM.IEC61970.Informative.InfWork.Assignment;
import gluemodel.CIM.IEC61970.Informative.InfWork.Capability;
import gluemodel.CIM.IEC61970.Informative.InfWork.Crew;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.ShiftPattern;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask;

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
 * An implementation of the model object '<em><b>Crew</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getShiftPatterns <em>Shift Patterns</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getCrewMembers <em>Crew Members</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getWorkEquipmentAssets <em>Work Equipment Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getSwitchingSchedules <em>Switching Schedules</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CrewImpl#getOutageSteps <em>Outage Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrewImpl extends IdentifiedObjectImpl implements Crew {
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
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> assignments;

	/**
	 * The cached value of the '{@link #getShiftPatterns() <em>Shift Patterns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<ShiftPattern> shiftPatterns;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route;

	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EList<ToolInfo> tools;

	/**
	 * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleInfo> vehicles;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCrewMembers() <em>Crew Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrewMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPerson> crewMembers;

	/**
	 * The cached value of the '{@link #getWorkEquipmentAssets() <em>Work Equipment Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEquipmentAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkEquipmentInfo> workEquipmentAssets;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getOrganisations() <em>Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpOrganisation> organisations;

	/**
	 * The cached value of the '{@link #getSwitchingSchedules() <em>Switching Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingSchedule> switchingSchedules;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capabilities;

	/**
	 * The cached value of the '{@link #getOutageSteps() <em>Outage Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageStep> outageSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CREW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new EObjectWithInverseResolvingEList.ManyInverse<WorkTask>(WorkTask.class, this, InfWorkPackage.CREW__WORK_TASKS, InfWorkPackage.WORK_TASK__CREWS);
		}
		return workTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assignment> getAssignments() {
		if (assignments == null) {
			assignments = new EObjectWithInverseResolvingEList.ManyInverse<Assignment>(Assignment.class, this, InfWorkPackage.CREW__ASSIGNMENTS, InfWorkPackage.ASSIGNMENT__CREWS);
		}
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShiftPattern> getShiftPatterns() {
		if (shiftPatterns == null) {
			shiftPatterns = new EObjectWithInverseResolvingEList.ManyInverse<ShiftPattern>(ShiftPattern.class, this, InfWorkPackage.CREW__SHIFT_PATTERNS, InfWorkPackage.SHIFT_PATTERN__CREWS);
		}
		return shiftPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject)route;
			route = (Route)eResolveProxy(oldRoute);
			if (route != oldRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CREW__ROUTE, oldRoute, route));
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(Route newRoute, NotificationChain msgs) {
		Route oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.CREW__ROUTE, oldRoute, newRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(Route newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, InfLocationsPackage.ROUTE__CREWS, Route.class, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, InfLocationsPackage.ROUTE__CREWS, Route.class, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CREW__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToolInfo> getTools() {
		if (tools == null) {
			tools = new EObjectWithInverseResolvingEList<ToolInfo>(ToolInfo.class, this, InfWorkPackage.CREW__TOOLS, InfAssetsPackage.TOOL_INFO__CREW);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VehicleInfo> getVehicles() {
		if (vehicles == null) {
			vehicles = new EObjectWithInverseResolvingEList<VehicleInfo>(VehicleInfo.class, this, InfWorkPackage.CREW__VEHICLES, InfAssetsPackage.VEHICLE_INFO__CREW);
		}
		return vehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CREW__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPerson> getCrewMembers() {
		if (crewMembers == null) {
			crewMembers = new EObjectWithInverseResolvingEList.ManyInverse<ErpPerson>(ErpPerson.class, this, InfWorkPackage.CREW__CREW_MEMBERS, InfERPSupportPackage.ERP_PERSON__CREWS);
		}
		return crewMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkEquipmentInfo> getWorkEquipmentAssets() {
		if (workEquipmentAssets == null) {
			workEquipmentAssets = new EObjectWithInverseResolvingEList<WorkEquipmentInfo>(WorkEquipmentInfo.class, this, InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS, InfAssetsPackage.WORK_EQUIPMENT_INFO__CREW);
		}
		return workEquipmentAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectWithInverseResolvingEList.ManyInverse<Location>(Location.class, this, InfWorkPackage.CREW__LOCATIONS, CommonPackage.LOCATION__CREWS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpOrganisation> getOrganisations() {
		if (organisations == null) {
			organisations = new EObjectWithInverseResolvingEList.ManyInverse<ErpOrganisation>(ErpOrganisation.class, this, InfWorkPackage.CREW__ORGANISATIONS, InfERPSupportPackage.ERP_ORGANISATION__CREWS);
		}
		return organisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchingSchedule> getSwitchingSchedules() {
		if (switchingSchedules == null) {
			switchingSchedules = new EObjectWithInverseResolvingEList.ManyInverse<SwitchingSchedule>(SwitchingSchedule.class, this, InfWorkPackage.CREW__SWITCHING_SCHEDULES, InfOperationsPackage.SWITCHING_SCHEDULE__CREWS);
		}
		return switchingSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectWithInverseResolvingEList<Capability>(Capability.class, this, InfWorkPackage.CREW__CAPABILITIES, InfWorkPackage.CAPABILITY__CREW);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutageStep> getOutageSteps() {
		if (outageSteps == null) {
			outageSteps = new EObjectWithInverseResolvingEList.ManyInverse<OutageStep>(OutageStep.class, this, InfWorkPackage.CREW__OUTAGE_STEPS, InfOperationsPackage.OUTAGE_STEP__CREWS);
		}
		return outageSteps;
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
			case InfWorkPackage.CREW__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__ASSIGNMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignments()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__SHIFT_PATTERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getShiftPatterns()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__ROUTE:
				if (route != null)
					msgs = ((InternalEObject)route).eInverseRemove(this, InfLocationsPackage.ROUTE__CREWS, Route.class, msgs);
				return basicSetRoute((Route)otherEnd, msgs);
			case InfWorkPackage.CREW__TOOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTools()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__VEHICLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVehicles()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__CREW_MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrewMembers()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkEquipmentAssets()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocations()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__ORGANISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganisations()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__SWITCHING_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchingSchedules()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapabilities()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__OUTAGE_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageSteps()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CREW__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__ASSIGNMENTS:
				return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__SHIFT_PATTERNS:
				return ((InternalEList<?>)getShiftPatterns()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__ROUTE:
				return basicSetRoute(null, msgs);
			case InfWorkPackage.CREW__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__VEHICLES:
				return ((InternalEList<?>)getVehicles()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__CREW_MEMBERS:
				return ((InternalEList<?>)getCrewMembers()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS:
				return ((InternalEList<?>)getWorkEquipmentAssets()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__ORGANISATIONS:
				return ((InternalEList<?>)getOrganisations()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__SWITCHING_SCHEDULES:
				return ((InternalEList<?>)getSwitchingSchedules()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__OUTAGE_STEPS:
				return ((InternalEList<?>)getOutageSteps()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.CREW__WORK_TASKS:
				return getWorkTasks();
			case InfWorkPackage.CREW__ASSIGNMENTS:
				return getAssignments();
			case InfWorkPackage.CREW__SHIFT_PATTERNS:
				return getShiftPatterns();
			case InfWorkPackage.CREW__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
			case InfWorkPackage.CREW__TOOLS:
				return getTools();
			case InfWorkPackage.CREW__VEHICLES:
				return getVehicles();
			case InfWorkPackage.CREW__CATEGORY:
				return getCategory();
			case InfWorkPackage.CREW__CREW_MEMBERS:
				return getCrewMembers();
			case InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS:
				return getWorkEquipmentAssets();
			case InfWorkPackage.CREW__LOCATIONS:
				return getLocations();
			case InfWorkPackage.CREW__ORGANISATIONS:
				return getOrganisations();
			case InfWorkPackage.CREW__SWITCHING_SCHEDULES:
				return getSwitchingSchedules();
			case InfWorkPackage.CREW__CAPABILITIES:
				return getCapabilities();
			case InfWorkPackage.CREW__OUTAGE_STEPS:
				return getOutageSteps();
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
			case InfWorkPackage.CREW__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case InfWorkPackage.CREW__ASSIGNMENTS:
				getAssignments().clear();
				getAssignments().addAll((Collection<? extends Assignment>)newValue);
				return;
			case InfWorkPackage.CREW__SHIFT_PATTERNS:
				getShiftPatterns().clear();
				getShiftPatterns().addAll((Collection<? extends ShiftPattern>)newValue);
				return;
			case InfWorkPackage.CREW__ROUTE:
				setRoute((Route)newValue);
				return;
			case InfWorkPackage.CREW__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends ToolInfo>)newValue);
				return;
			case InfWorkPackage.CREW__VEHICLES:
				getVehicles().clear();
				getVehicles().addAll((Collection<? extends VehicleInfo>)newValue);
				return;
			case InfWorkPackage.CREW__CATEGORY:
				setCategory((String)newValue);
				return;
			case InfWorkPackage.CREW__CREW_MEMBERS:
				getCrewMembers().clear();
				getCrewMembers().addAll((Collection<? extends ErpPerson>)newValue);
				return;
			case InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS:
				getWorkEquipmentAssets().clear();
				getWorkEquipmentAssets().addAll((Collection<? extends WorkEquipmentInfo>)newValue);
				return;
			case InfWorkPackage.CREW__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case InfWorkPackage.CREW__ORGANISATIONS:
				getOrganisations().clear();
				getOrganisations().addAll((Collection<? extends ErpOrganisation>)newValue);
				return;
			case InfWorkPackage.CREW__SWITCHING_SCHEDULES:
				getSwitchingSchedules().clear();
				getSwitchingSchedules().addAll((Collection<? extends SwitchingSchedule>)newValue);
				return;
			case InfWorkPackage.CREW__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case InfWorkPackage.CREW__OUTAGE_STEPS:
				getOutageSteps().clear();
				getOutageSteps().addAll((Collection<? extends OutageStep>)newValue);
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
			case InfWorkPackage.CREW__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case InfWorkPackage.CREW__ASSIGNMENTS:
				getAssignments().clear();
				return;
			case InfWorkPackage.CREW__SHIFT_PATTERNS:
				getShiftPatterns().clear();
				return;
			case InfWorkPackage.CREW__ROUTE:
				setRoute((Route)null);
				return;
			case InfWorkPackage.CREW__TOOLS:
				getTools().clear();
				return;
			case InfWorkPackage.CREW__VEHICLES:
				getVehicles().clear();
				return;
			case InfWorkPackage.CREW__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case InfWorkPackage.CREW__CREW_MEMBERS:
				getCrewMembers().clear();
				return;
			case InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS:
				getWorkEquipmentAssets().clear();
				return;
			case InfWorkPackage.CREW__LOCATIONS:
				getLocations().clear();
				return;
			case InfWorkPackage.CREW__ORGANISATIONS:
				getOrganisations().clear();
				return;
			case InfWorkPackage.CREW__SWITCHING_SCHEDULES:
				getSwitchingSchedules().clear();
				return;
			case InfWorkPackage.CREW__CAPABILITIES:
				getCapabilities().clear();
				return;
			case InfWorkPackage.CREW__OUTAGE_STEPS:
				getOutageSteps().clear();
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
			case InfWorkPackage.CREW__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case InfWorkPackage.CREW__ASSIGNMENTS:
				return assignments != null && !assignments.isEmpty();
			case InfWorkPackage.CREW__SHIFT_PATTERNS:
				return shiftPatterns != null && !shiftPatterns.isEmpty();
			case InfWorkPackage.CREW__ROUTE:
				return route != null;
			case InfWorkPackage.CREW__TOOLS:
				return tools != null && !tools.isEmpty();
			case InfWorkPackage.CREW__VEHICLES:
				return vehicles != null && !vehicles.isEmpty();
			case InfWorkPackage.CREW__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case InfWorkPackage.CREW__CREW_MEMBERS:
				return crewMembers != null && !crewMembers.isEmpty();
			case InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS:
				return workEquipmentAssets != null && !workEquipmentAssets.isEmpty();
			case InfWorkPackage.CREW__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case InfWorkPackage.CREW__ORGANISATIONS:
				return organisations != null && !organisations.isEmpty();
			case InfWorkPackage.CREW__SWITCHING_SCHEDULES:
				return switchingSchedules != null && !switchingSchedules.isEmpty();
			case InfWorkPackage.CREW__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case InfWorkPackage.CREW__OUTAGE_STEPS:
				return outageSteps != null && !outageSteps.isEmpty();
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
		result.append(" (category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //CrewImpl
