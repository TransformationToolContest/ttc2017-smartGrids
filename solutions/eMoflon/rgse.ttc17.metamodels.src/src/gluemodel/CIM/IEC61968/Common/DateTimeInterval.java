/**
 */
package gluemodel.CIM.IEC61968.Common;

import gluemodel.CIM.Element;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.DateTimeInterval#getStart <em>Start</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.DateTimeInterval#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getDateTimeInterval()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Interval of date and time.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Interval of date and time.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Interval of date and time.' Profile\040documentation='Interval of date and time.'"
 * @generated
 */
public interface DateTimeInterval extends Element {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getDateTimeInterval_Start()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time that this interval started.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time that this interval started.'"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.DateTimeInterval#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getDateTimeInterval_End()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time that this interval ended.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time that this interval ended.'"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.DateTimeInterval#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

} // DateTimeInterval
