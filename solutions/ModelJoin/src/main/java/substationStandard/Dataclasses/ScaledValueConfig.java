/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaled Value Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.ScaledValueConfig#getScaleFactor <em>Scale Factor</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ScaledValueConfig#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getScaledValueConfig()
 * @model
 * @generated
 */
public interface ScaledValueConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Scale Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Factor</em>' attribute.
	 * @see #setScaleFactor(float)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getScaledValueConfig_ScaleFactor()
	 * @model
	 * @generated
	 */
	float getScaleFactor();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ScaledValueConfig#getScaleFactor <em>Scale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Factor</em>' attribute.
	 * @see #getScaleFactor()
	 * @generated
	 */
	void setScaleFactor(float value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(float)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getScaledValueConfig_Offset()
	 * @model
	 * @generated
	 */
	float getOffset();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ScaledValueConfig#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(float value);

} // ScaledValueConfig
