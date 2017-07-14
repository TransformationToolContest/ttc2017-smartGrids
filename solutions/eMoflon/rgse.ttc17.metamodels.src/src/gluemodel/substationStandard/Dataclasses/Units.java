/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Units</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.Units#getSlUnits <em>Sl Units</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.Units#getMultiplier <em>Multiplier</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getUnits()
 * @model
 * @generated
 */
public interface Units extends EObject {
	/**
	 * Returns the value of the '<em><b>Sl Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sl Units</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sl Units</em>' reference.
	 * @see #setSlUnits(SlUnits)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getUnits_SlUnits()
	 * @model required="true"
	 * @generated
	 */
	SlUnits getSlUnits();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.Units#getSlUnits <em>Sl Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sl Units</em>' reference.
	 * @see #getSlUnits()
	 * @generated
	 */
	void setSlUnits(SlUnits value);

	/**
	 * Returns the value of the '<em><b>Multiplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplier</em>' reference.
	 * @see #setMultiplier(Multiplier)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getUnits_Multiplier()
	 * @model required="true"
	 * @generated
	 */
	Multiplier getMultiplier();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.Units#getMultiplier <em>Multiplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' reference.
	 * @see #getMultiplier()
	 * @generated
	 */
	void setMultiplier(Multiplier value);

} // Units
