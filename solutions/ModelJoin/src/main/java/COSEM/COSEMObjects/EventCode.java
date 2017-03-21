/**
 */
package COSEM.COSEMObjects;

import COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.EventCode#getEvent_code_object <em>Event code object</em>}</li>
 * </ul>
 *
 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getEventCode()
 * @model
 * @generated
 */
public interface EventCode extends Data {
	/**
	 * Returns the value of the '<em><b>Event code object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event code object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event code object</em>' attribute.
	 * @see #setEvent_code_object(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getEventCode_Event_code_object()
	 * @model
	 * @generated
	 */
	String getEvent_code_object();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.EventCode#getEvent_code_object <em>Event code object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event code object</em>' attribute.
	 * @see #getEvent_code_object()
	 * @generated
	 */
	void setEvent_code_object(String value);

} // EventCode
