/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pulse Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.PulseConfig#getOnDur <em>On Dur</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.PulseConfig#getOffDur <em>Off Dur</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.PulseConfig#getNumPls <em>Num Pls</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.PulseConfig#getCmdQual <em>Cmd Qual</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getPulseConfig()
 * @model
 * @generated
 */
public interface PulseConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>On Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Dur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Dur</em>' attribute.
	 * @see #setOnDur(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getPulseConfig_OnDur()
	 * @model
	 * @generated
	 */
	int getOnDur();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.PulseConfig#getOnDur <em>On Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Dur</em>' attribute.
	 * @see #getOnDur()
	 * @generated
	 */
	void setOnDur(int value);

	/**
	 * Returns the value of the '<em><b>Off Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Off Dur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Off Dur</em>' attribute.
	 * @see #setOffDur(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getPulseConfig_OffDur()
	 * @model
	 * @generated
	 */
	int getOffDur();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.PulseConfig#getOffDur <em>Off Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Off Dur</em>' attribute.
	 * @see #getOffDur()
	 * @generated
	 */
	void setOffDur(int value);

	/**
	 * Returns the value of the '<em><b>Num Pls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Pls</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Pls</em>' attribute.
	 * @see #setNumPls(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getPulseConfig_NumPls()
	 * @model
	 * @generated
	 */
	int getNumPls();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.PulseConfig#getNumPls <em>Num Pls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Pls</em>' attribute.
	 * @see #getNumPls()
	 * @generated
	 */
	void setNumPls(int value);

	/**
	 * Returns the value of the '<em><b>Cmd Qual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd Qual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd Qual</em>' reference.
	 * @see #setCmdQual(ControlOutput)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getPulseConfig_CmdQual()
	 * @model required="true"
	 * @generated
	 */
	ControlOutput getCmdQual();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.PulseConfig#getCmdQual <em>Cmd Qual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd Qual</em>' reference.
	 * @see #getCmdQual()
	 * @generated
	 */
	void setCmdQual(ControlOutput value);

} // PulseConfig
