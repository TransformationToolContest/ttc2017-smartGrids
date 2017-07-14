/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Measure And Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.PrimitiveMeasureAndInfo#getD <em>D</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.PrimitiveMeasureAndInfo#getDU <em>DU</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getPrimitiveMeasureAndInfo()
 * @model
 * @generated
 */
public interface PrimitiveMeasureAndInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' attribute.
	 * @see #setD(String)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getPrimitiveMeasureAndInfo_D()
	 * @model
	 * @generated
	 */
	String getD();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.PrimitiveMeasureAndInfo#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' attribute.
	 * @see #getD()
	 * @generated
	 */
	void setD(String value);

	/**
	 * Returns the value of the '<em><b>DU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DU</em>' attribute.
	 * @see #setDU(String)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getPrimitiveMeasureAndInfo_DU()
	 * @model
	 * @generated
	 */
	String getDU();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.PrimitiveMeasureAndInfo#getDU <em>DU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DU</em>' attribute.
	 * @see #getDU()
	 * @generated
	 */
	void setDU(String value);

} // PrimitiveMeasureAndInfo
