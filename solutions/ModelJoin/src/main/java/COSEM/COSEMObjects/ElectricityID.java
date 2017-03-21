/**
 */
package COSEM.COSEMObjects;

import COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electricity ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.ElectricityID#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityID()
 * @model
 * @generated
 */
public interface ElectricityID extends Data {
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
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityID_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ElectricityID#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ElectricityID
