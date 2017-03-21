/**
 */
package CIM.IEC61970.Core;

import CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Irregular Time Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.IrregularTimePoint#getValue1 <em>Value1</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.IrregularTimePoint#getValue2 <em>Value2</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.IrregularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.IrregularTimePoint#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Core.CorePackage#getIrregularTimePoint()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='TimePoints for a schedule where the time between the points varies.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='TimePoints for a schedule where the time between the points varies.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='TimePoints for a schedule where the time between the points varies.' Profile\040documentation='TimePoints for a schedule where the time between the points varies.'"
 * @generated
 */
public interface IrregularTimePoint extends Element {
	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #setValue1(float)
	 * @see CIM.IEC61970.Core.CorePackage#getIrregularTimePoint_Value1()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The first value at the time. The meaning of the value is defined by the class inhering the IrregularIntervalSchedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The first value at the time. The meaning of the value is defined by the class inhering the IrregularIntervalSchedule.'"
	 * @generated
	 */
	float getValue1();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.IrregularTimePoint#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(float value);

	/**
	 * Returns the value of the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2</em>' attribute.
	 * @see #setValue2(float)
	 * @see CIM.IEC61970.Core.CorePackage#getIrregularTimePoint_Value2()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The second value at the time. The meaning of the value is defined by the class inhering the IrregularIntervalSchedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The second value at the time. The meaning of the value is defined by the class inhering the IrregularIntervalSchedule.'"
	 * @generated
	 */
	float getValue2();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.IrregularTimePoint#getValue2 <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2</em>' attribute.
	 * @see #getValue2()
	 * @generated
	 */
	void setValue2(float value);

	/**
	 * Returns the value of the '<em><b>Interval Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.IrregularIntervalSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Schedule</em>' reference.
	 * @see #setIntervalSchedule(IrregularIntervalSchedule)
	 * @see CIM.IEC61970.Core.CorePackage#getIrregularTimePoint_IntervalSchedule()
	 * @see CIM.IEC61970.Core.IrregularIntervalSchedule#getTimePoints
	 * @model opposite="TimePoints"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An IrregularTimePoint belongs to an IrregularIntervalSchedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An IrregularTimePoint belongs to an IrregularIntervalSchedule.'"
	 * @generated
	 */
	IrregularIntervalSchedule getIntervalSchedule();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.IrregularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Schedule</em>' reference.
	 * @see #getIntervalSchedule()
	 * @generated
	 */
	void setIntervalSchedule(IrregularIntervalSchedule value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(float)
	 * @see CIM.IEC61970.Core.CorePackage#getIrregularTimePoint_Time()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The time is relative the BasicTimeSchedule.startTime.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time is relative the BasicTimeSchedule.startTime.'"
	 * @generated
	 */
	float getTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.IrregularTimePoint#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(float value);

} // IrregularTimePoint
