/**
 */
package COSEM.COSEMObjects;

import COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.InvocationCounter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getInvocationCounter()
 * @model
 * @generated
 */
public interface InvocationCounter extends Data {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getInvocationCounter_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.InvocationCounter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // InvocationCounter
