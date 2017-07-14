/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.OperatingTime#getTimeofoperation <em>Timeofoperation</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getOperatingTime()
 * @model
 * @generated
 */
public interface OperatingTime extends Data {
	/**
	 * Returns the value of the '<em><b>Timeofoperation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeofoperation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeofoperation</em>' attribute.
	 * @see #setTimeofoperation(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getOperatingTime_Timeofoperation()
	 * @model
	 * @generated
	 */
	String getTimeofoperation();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.OperatingTime#getTimeofoperation <em>Timeofoperation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeofoperation</em>' attribute.
	 * @see #getTimeofoperation()
	 * @generated
	 */
	void setTimeofoperation(String value);

} // OperatingTime
