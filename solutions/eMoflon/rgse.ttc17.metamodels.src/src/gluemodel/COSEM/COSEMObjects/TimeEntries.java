/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Entries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TimeEntries#getLocalTime <em>Local Time</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.TimeEntries#getLocalDate <em>Local Date</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTimeEntries()
 * @model
 * @generated
 */
public interface TimeEntries extends Data {
	/**
	 * Returns the value of the '<em><b>Local Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Time</em>' attribute.
	 * @see #setLocalTime(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTimeEntries_LocalTime()
	 * @model
	 * @generated
	 */
	String getLocalTime();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TimeEntries#getLocalTime <em>Local Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Time</em>' attribute.
	 * @see #getLocalTime()
	 * @generated
	 */
	void setLocalTime(String value);

	/**
	 * Returns the value of the '<em><b>Local Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Date</em>' attribute.
	 * @see #setLocalDate(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getTimeEntries_LocalDate()
	 * @model
	 * @generated
	 */
	String getLocalDate();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.TimeEntries#getLocalDate <em>Local Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Date</em>' attribute.
	 * @see #getLocalDate()
	 * @generated
	 */
	void setLocalDate(String value);

} // TimeEntries
