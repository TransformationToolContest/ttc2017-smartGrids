/**
 */
package gluemodel.CIM.IEC61970.LoadModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getConformLoadSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A curve of load  versus time (X-axis) showing the active power values (Y1-axis) and reactive power (Y2-axis) for each unit of the period covered. This curve represents a typical pattern of load over the time period for a given day type and season.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A curve of load  versus time (X-axis) showing the active power values (Y1-axis) and reactive power (Y2-axis) for each unit of the period covered. This curve represents a typical pattern of load over the time period for a given day type and season.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A curve of load  versus time (X-axis) showing the active power values (Y1-axis) and reactive power (Y2-axis) for each unit of the period covered. This curve represents a typical pattern of load over the time period for a given day type and season.' Profile\040documentation='A curve of load  versus time (X-axis) showing the active power values (Y1-axis) and reactive power (Y2-axis) for each unit of the period covered. This curve represents a typical pattern of load over the time period for a given day type and season.'"
 * @generated
 */
public interface ConformLoadSchedule extends SeasonDayTypeSchedule {
	/**
	 * Returns the value of the '<em><b>Conform Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conform Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conform Load Group</em>' reference.
	 * @see #setConformLoadGroup(ConformLoadGroup)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getConformLoadSchedule_ConformLoadGroup()
	 * @see gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup#getConformLoadSchedules
	 * @model opposite="ConformLoadSchedules"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The ConformLoadGroup where the ConformLoadSchedule belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ConformLoadGroup where the ConformLoadSchedule belongs.'"
	 * @generated
	 */
	ConformLoadGroup getConformLoadGroup();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conform Load Group</em>' reference.
	 * @see #getConformLoadGroup()
	 * @generated
	 */
	void setConformLoadGroup(ConformLoadGroup value);

} // ConformLoadSchedule
