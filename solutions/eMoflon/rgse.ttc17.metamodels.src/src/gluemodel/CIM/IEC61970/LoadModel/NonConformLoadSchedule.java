/**
 */
package gluemodel.CIM.IEC61970.LoadModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getNonConformLoadSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An active power (Y1-axis) and reactive power (Y2-axis) schedule (curves) versus time (X-axis) for non-conforming loads, e.g., large industrial load or power station service (where modeled)'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An active power (Y1-axis) and reactive power (Y2-axis) schedule (curves) versus time (X-axis) for non-conforming loads, e.g., large industrial load or power station service (where modeled)'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An active power (Y1-axis) and reactive power (Y2-axis) schedule (curves) versus time (X-axis) for non-conforming loads, e.g., large industrial load or power station service (where modeled)' Profile\040documentation='An active power (Y1-axis) and reactive power (Y2-axis) schedule (curves) versus time (X-axis) for non-conforming loads, e.g., large industrial load or power station service (where modeled)'"
 * @generated
 */
public interface NonConformLoadSchedule extends SeasonDayTypeSchedule {
	/**
	 * Returns the value of the '<em><b>Non Conform Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Conform Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Conform Load Group</em>' reference.
	 * @see #setNonConformLoadGroup(NonConformLoadGroup)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getNonConformLoadSchedule_NonConformLoadGroup()
	 * @see gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup#getNonConformLoadSchedules
	 * @model opposite="NonConformLoadSchedules"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The NonConformLoadGroup where the NonConformLoadSchedule belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The NonConformLoadGroup where the NonConformLoadSchedule belongs.'"
	 * @generated
	 */
	NonConformLoadGroup getNonConformLoadGroup();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Conform Load Group</em>' reference.
	 * @see #getNonConformLoadGroup()
	 * @generated
	 */
	void setNonConformLoadGroup(NonConformLoadGroup value);

} // NonConformLoadSchedule
