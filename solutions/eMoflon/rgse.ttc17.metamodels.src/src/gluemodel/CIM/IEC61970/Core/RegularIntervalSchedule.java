/**
 */
package gluemodel.CIM.IEC61970.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getEndTime <em>End Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getRegularIntervalSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The schedule has TimePoints where the time between them is constant.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The schedule has TimePoints where the time between them is constant.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The schedule has TimePoints where the time between them is constant.' Profile\040documentation='The schedule has TimePoints where the time between them is constant.'"
 * @generated
 */
public interface RegularIntervalSchedule extends BasicIntervalSchedule {
	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(String)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getRegularIntervalSchedule_EndTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The time for the last time point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time for the last time point.'"
	 * @generated
	 */
	String getEndTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(String value);

	/**
	 * Returns the value of the '<em><b>Time Points</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.RegularTimePoint}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Points</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getRegularIntervalSchedule_TimePoints()
	 * @see gluemodel.CIM.IEC61970.Core.RegularTimePoint#getIntervalSchedule
	 * @model opposite="IntervalSchedule"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The point data values that define a curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The point data values that define a curve'"
	 * @generated
	 */
	EList<RegularTimePoint> getTimePoints();

	/**
	 * Returns the value of the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Step</em>' attribute.
	 * @see #setTimeStep(float)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getRegularIntervalSchedule_TimeStep()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The time between each pair of subsequent RegularTimePoints.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time between each pair of subsequent RegularTimePoints.'"
	 * @generated
	 */
	float getTimeStep();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Step</em>' attribute.
	 * @see #getTimeStep()
	 * @generated
	 */
	void setTimeStep(float value);

} // RegularIntervalSchedule
