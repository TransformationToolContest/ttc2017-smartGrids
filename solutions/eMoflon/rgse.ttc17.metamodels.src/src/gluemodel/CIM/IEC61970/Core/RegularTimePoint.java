/**
 */
package gluemodel.CIM.IEC61970.Core;

import gluemodel.CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Time Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getValue1 <em>Value1</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getValue2 <em>Value2</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getRegularTimePoint()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='TimePoints for a schedule where the time between the points is constant.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='TimePoints for a schedule where the time between the points is constant.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='TimePoints for a schedule where the time between the points is constant.' Profile\040documentation='TimePoints for a schedule where the time between the points is constant.'"
 * @generated
 */
public interface RegularTimePoint extends Element {
	/**
	 * Returns the value of the '<em><b>Interval Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Schedule</em>' reference.
	 * @see #setIntervalSchedule(RegularIntervalSchedule)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getRegularTimePoint_IntervalSchedule()
	 * @see gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule#getTimePoints
	 * @model opposite="TimePoints"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A RegularTimePoint belongs to a RegularIntervalSchedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A RegularTimePoint belongs to a RegularIntervalSchedule.'"
	 * @generated
	 */
	RegularIntervalSchedule getIntervalSchedule();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Schedule</em>' reference.
	 * @see #getIntervalSchedule()
	 * @generated
	 */
	void setIntervalSchedule(RegularIntervalSchedule value);

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
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getRegularTimePoint_Value1()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The first value at the time. The meaning of the value is defined by the class inhering the RegularIntervalSchedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The first value at the time. The meaning of the value is defined by the class inhering the RegularIntervalSchedule.'"
	 * @generated
	 */
	float getValue1();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getValue1 <em>Value1</em>}' attribute.
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
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getRegularTimePoint_Value2()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The second value at the time. The meaning of the value is defined by the class inhering the RegularIntervalSchedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The second value at the time. The meaning of the value is defined by the class inhering the RegularIntervalSchedule.'"
	 * @generated
	 */
	float getValue2();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getValue2 <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2</em>' attribute.
	 * @see #getValue2()
	 * @generated
	 */
	void setValue2(float value);

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(int)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getRegularTimePoint_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The position of the RegularTimePoint in the sequence. Note that time points don\'t have to be sequential, i.e. time points may be omitted. The actual time for a RegularTimePoint is computed by multiplying the RegularIntervalSchedule.timeStep with the RegularTimePoint.sequenceNumber and add the BasicIntervalSchedule.startTime.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The position of the RegularTimePoint in the sequence. Note that time points don\'t have to be sequential, i.e. time points may be omitted. The actual time for a RegularTimePoint is computed by multiplying the RegularIntervalSchedule.timeStep with the RegularTimePoint.sequenceNumber and add the BasicIntervalSchedule.startTime.'"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.RegularTimePoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

} // RegularTimePoint
