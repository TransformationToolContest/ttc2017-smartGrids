/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

import gluemodel.CIM.IEC61970.Informative.InfLocations.Route;

import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep;
import gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crew</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getShiftPatterns <em>Shift Patterns</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getRoute <em>Route</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getTools <em>Tools</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getCategory <em>Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getCrewMembers <em>Crew Members</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getWorkEquipmentAssets <em>Work Equipment Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getLocations <em>Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getSwitchingSchedules <em>Switching Schedules</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getOutageSteps <em>Outage Steps</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A crew is a group of people (ErpPersons) with specific skills, tools, and vehicles.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A crew is a group of people (ErpPersons) with specific skills, tools, and vehicles.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A crew is a group of people (ErpPersons) with specific skills, tools, and vehicles.' Profile\040documentation='A crew is a group of people (ErpPersons) with specific skills, tools, and vehicles.'"
 * @generated
 */
public interface Crew extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_WorkTasks()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getCrews
	 * @model opposite="Crews"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All WorkTasks this Crew participates in.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All WorkTasks this Crew participates in.'"
	 * @generated
	 */
	EList<WorkTask> getWorkTasks();

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.Assignment}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Assignment#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_Assignments()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Assignment#getCrews
	 * @model opposite="Crews"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All Assignments for this Crew.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All Assignments for this Crew.'"
	 * @generated
	 */
	EList<Assignment> getAssignments();

	/**
	 * Returns the value of the '<em><b>Shift Patterns</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.ShiftPattern}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.ShiftPattern#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift Patterns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift Patterns</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_ShiftPatterns()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.ShiftPattern#getCrews
	 * @model opposite="Crews"
	 * @generated
	 */
	EList<ShiftPattern> getShiftPatterns();

	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Route#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(Route)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_Route()
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.Route#getCrews
	 * @model opposite="Crews"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tools</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_Tools()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ToolInfo#getCrew
	 * @model opposite="Crew"
	 * @generated
	 */
	EList<ToolInfo> getTools();

	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_Vehicles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getCrew
	 * @model opposite="Crew"
	 * @generated
	 */
	EList<VehicleInfo> getVehicles();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category by utility\'s work management standards and practices.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category by utility\'s work management standards and practices.'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Crew Members</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crew Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew Members</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_CrewMembers()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCrews
	 * @model opposite="Crews"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All ErpPersons that are members of this Crew.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All ErpPersons that are members of this Crew.'"
	 * @generated
	 */
	EList<ErpPerson> getCrewMembers();

	/**
	 * Returns the value of the '<em><b>Work Equipment Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Equipment Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Equipment Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_WorkEquipmentAssets()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo#getCrew
	 * @model opposite="Crew"
	 * @generated
	 */
	EList<WorkEquipmentInfo> getWorkEquipmentAssets();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Location#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_Locations()
	 * @see gluemodel.CIM.IEC61968.Common.Location#getCrews
	 * @model opposite="Crews"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Organisations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_Organisations()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCrews
	 * @model opposite="Crews"
	 * @generated
	 */
	EList<ErpOrganisation> getOrganisations();

	/**
	 * Returns the value of the '<em><b>Switching Schedules</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Schedules</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_SwitchingSchedules()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getCrews
	 * @model opposite="Crews"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All SwitchingSchedules executed by this Crew.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All SwitchingSchedules executed by this Crew.'"
	 * @generated
	 */
	EList<SwitchingSchedule> getSwitchingSchedules();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_Capabilities()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getCrew
	 * @model opposite="Crew"
	 * @generated
	 */
	EList<Capability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Outage Steps</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Steps</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCrew_OutageSteps()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getCrews
	 * @model opposite="Crews"
	 * @generated
	 */
	EList<OutageStep> getOutageSteps();

} // Crew
