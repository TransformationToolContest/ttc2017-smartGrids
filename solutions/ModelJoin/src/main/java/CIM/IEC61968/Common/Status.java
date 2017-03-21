/**
 */
package CIM.IEC61968.Common;

import CIM.Element;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.Status#getReason <em>Reason</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Status#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Status#getRemark <em>Remark</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.Status#getDateTime <em>Date Time</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Common.CommonPackage#getStatus()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current status information relevant to an entity.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Current status information relevant to an entity.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current status information relevant to an entity.' Profile\040documentation='Current status information relevant to an entity.'"
 * @generated
 */
public interface Status extends Element {
	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getStatus_Reason()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reason code or explanation for why an object went to the current status \'value\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reason code or explanation for why an object went to the current status \'value\'.'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Status#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getStatus_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Status value at \'dateTime\'; prior status changes may have been kept in instances of ActivityRecords associated with the object to which this Status applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Status value at \'dateTime\'; prior status changes may have been kept in instances of ActivityRecords associated with the object to which this Status applies.'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Status#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' attribute.
	 * @see #setRemark(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getStatus_Remark()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pertinent information regarding the current \'value\', as free form text.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pertinent information regarding the current \'value\', as free form text.'"
	 * @generated
	 */
	String getRemark();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Status#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' attribute.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(String value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see CIM.IEC61968.Common.CommonPackage#getStatus_DateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time for which status \'value\' applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time for which status \'value\' applies.'"
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.Status#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

} // Status
