/**
 */
package gluemodel.CIM.IEC61970.LoadModel;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.DayType#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getDayType()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Group of similar days, e.g., Mon/Tue/Wed, Thu/Fri, Sat/Sun, Holiday1, Holiday2'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Group of similar days, e.g., Mon/Tue/Wed, Thu/Fri, Sat/Sun, Holiday1, Holiday2'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Group of similar days, e.g., Mon/Tue/Wed, Thu/Fri, Sat/Sun, Holiday1, Holiday2' Profile\040documentation='Group of similar days, e.g., Mon/Tue/Wed, Thu/Fri, Sat/Sun, Holiday1, Holiday2'"
 * @generated
 */
public interface DayType extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.LoadModel.SeasonDayTypeSchedule}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.LoadModel.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Season Day Type Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season Day Type Schedules</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getDayType_SeasonDayTypeSchedules()
	 * @see gluemodel.CIM.IEC61970.LoadModel.SeasonDayTypeSchedule#getDayType
	 * @model opposite="DayType"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Schedules that use this DayType.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Schedules that use this DayType.'"
	 * @generated
	 */
	EList<SeasonDayTypeSchedule> getSeasonDayTypeSchedules();

} // DayType
