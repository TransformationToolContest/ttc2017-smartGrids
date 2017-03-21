/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.DPC#isCtlVal <em>Ctl Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.DPC#getStVal <em>St Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.DPC#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.DPC#getT <em>T</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.DPC#getSubVal <em>Sub Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.DPC#getPulseConfig <em>Pulse Config</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getDPC()
 * @model
 * @generated
 */
public interface DPC extends EObject {
	/**
	 * Returns the value of the '<em><b>Ctl Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctl Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctl Val</em>' attribute.
	 * @see #setCtlVal(boolean)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getDPC_CtlVal()
	 * @model
	 * @generated
	 */
	boolean isCtlVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.DPC#isCtlVal <em>Ctl Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctl Val</em>' attribute.
	 * @see #isCtlVal()
	 * @generated
	 */
	void setCtlVal(boolean value);

	/**
	 * Returns the value of the '<em><b>St Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>St Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>St Val</em>' reference.
	 * @see #setStVal(DPStatus)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getDPC_StVal()
	 * @model required="true"
	 * @generated
	 */
	DPStatus getStVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.DPC#getStVal <em>St Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>St Val</em>' reference.
	 * @see #getStVal()
	 * @generated
	 */
	void setStVal(DPStatus value);

	/**
	 * Returns the value of the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' reference.
	 * @see #setQ(Quality)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getDPC_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.DPC#getQ <em>Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Quality value);

	/**
	 * Returns the value of the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' reference.
	 * @see #setT(TimeStamp)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getDPC_T()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getT();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.DPC#getT <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Sub Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Val</em>' reference.
	 * @see #setSubVal(DPStatus)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getDPC_SubVal()
	 * @model required="true"
	 * @generated
	 */
	DPStatus getSubVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.DPC#getSubVal <em>Sub Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Val</em>' reference.
	 * @see #getSubVal()
	 * @generated
	 */
	void setSubVal(DPStatus value);

	/**
	 * Returns the value of the '<em><b>Pulse Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pulse Config</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pulse Config</em>' reference.
	 * @see #setPulseConfig(PulseConfig)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getDPC_PulseConfig()
	 * @model required="true"
	 * @generated
	 */
	PulseConfig getPulseConfig();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.DPC#getPulseConfig <em>Pulse Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pulse Config</em>' reference.
	 * @see #getPulseConfig()
	 * @generated
	 */
	void setPulseConfig(PulseConfig value);

} // DPC
