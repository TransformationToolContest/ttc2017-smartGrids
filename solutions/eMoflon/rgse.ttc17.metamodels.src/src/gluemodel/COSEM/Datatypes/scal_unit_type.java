/**
 */
package gluemodel.COSEM.Datatypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>scal unit type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.Datatypes.scal_unit_type#getScaler <em>Scaler</em>}</li>
 *   <li>{@link gluemodel.COSEM.Datatypes.scal_unit_type#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.Datatypes.DatatypesPackage#getscal_unit_type()
 * @model
 * @generated
 */
public interface scal_unit_type extends EObject {
	/**
	 * Returns the value of the '<em><b>Scaler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaler</em>' attribute.
	 * @see #setScaler(int)
	 * @see gluemodel.COSEM.Datatypes.DatatypesPackage#getscal_unit_type_Scaler()
	 * @model
	 * @generated
	 */
	int getScaler();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.Datatypes.scal_unit_type#getScaler <em>Scaler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaler</em>' attribute.
	 * @see #getScaler()
	 * @generated
	 */
	void setScaler(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.COSEM.Datatypes.Units}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see gluemodel.COSEM.Datatypes.Units
	 * @see #setUnit(Units)
	 * @see gluemodel.COSEM.Datatypes.DatatypesPackage#getscal_unit_type_Unit()
	 * @model
	 * @generated
	 */
	Units getUnit();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.Datatypes.scal_unit_type#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see gluemodel.COSEM.Datatypes.Units
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Units value);

} // scal_unit_type
