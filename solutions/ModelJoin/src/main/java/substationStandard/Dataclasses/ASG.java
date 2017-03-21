/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ASG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.ASG#getSetMag <em>Set Mag</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ASG#getUnits <em>Units</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ASG#getSVC <em>SVC</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ASG#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ASG#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ASG#getStepSize <em>Step Size</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getASG()
 * @model
 * @generated
 */
public interface ASG extends EObject {
	/**
	 * Returns the value of the '<em><b>Set Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Mag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Mag</em>' reference.
	 * @see #setSetMag(AnalogueValue)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getASG_SetMag()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getSetMag();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ASG#getSetMag <em>Set Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Mag</em>' reference.
	 * @see #getSetMag()
	 * @generated
	 */
	void setSetMag(AnalogueValue value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' reference.
	 * @see #setUnits(Units)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getASG_Units()
	 * @model required="true"
	 * @generated
	 */
	Units getUnits();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ASG#getUnits <em>Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(Units value);

	/**
	 * Returns the value of the '<em><b>SVC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SVC</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SVC</em>' reference.
	 * @see #setSVC(ScaledValueConfig)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getASG_SVC()
	 * @model required="true"
	 * @generated
	 */
	ScaledValueConfig getSVC();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ASG#getSVC <em>SVC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SVC</em>' reference.
	 * @see #getSVC()
	 * @generated
	 */
	void setSVC(ScaledValueConfig value);

	/**
	 * Returns the value of the '<em><b>Min Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Val</em>' reference.
	 * @see #setMinVal(AnalogueValue)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getASG_MinVal()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getMinVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ASG#getMinVal <em>Min Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Val</em>' reference.
	 * @see #getMinVal()
	 * @generated
	 */
	void setMinVal(AnalogueValue value);

	/**
	 * Returns the value of the '<em><b>Max Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Val</em>' reference.
	 * @see #setMaxVal(AnalogueValue)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getASG_MaxVal()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getMaxVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ASG#getMaxVal <em>Max Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Val</em>' reference.
	 * @see #getMaxVal()
	 * @generated
	 */
	void setMaxVal(AnalogueValue value);

	/**
	 * Returns the value of the '<em><b>Step Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Size</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Size</em>' reference.
	 * @see #setStepSize(AnalogueValue)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getASG_StepSize()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getStepSize();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ASG#getStepSize <em>Step Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Size</em>' reference.
	 * @see #getStepSize()
	 * @generated
	 */
	void setStepSize(AnalogueValue value);

} // ASG
