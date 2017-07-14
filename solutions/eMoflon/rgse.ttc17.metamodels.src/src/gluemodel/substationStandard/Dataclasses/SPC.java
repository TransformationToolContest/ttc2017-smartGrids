/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.SPC#isCtlVal <em>Ctl Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.SPC#isStVal <em>St Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.SPC#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.SPC#getT <em>T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.SPC#isSubVal <em>Sub Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.SPC#getPulseConfig <em>Pulse Config</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getSPC()
 * @model
 * @generated
 */
public interface SPC extends EObject {
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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getSPC_CtlVal()
	 * @model
	 * @generated
	 */
	boolean isCtlVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.SPC#isCtlVal <em>Ctl Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctl Val</em>' attribute.
	 * @see #isCtlVal()
	 * @generated
	 */
	void setCtlVal(boolean value);

	/**
	 * Returns the value of the '<em><b>St Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>St Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>St Val</em>' attribute.
	 * @see #setStVal(boolean)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getSPC_StVal()
	 * @model
	 * @generated
	 */
	boolean isStVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.SPC#isStVal <em>St Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>St Val</em>' attribute.
	 * @see #isStVal()
	 * @generated
	 */
	void setStVal(boolean value);

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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getSPC_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.SPC#getQ <em>Q</em>}' reference.
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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getSPC_T()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getT();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.SPC#getT <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Sub Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Val</em>' attribute.
	 * @see #setSubVal(boolean)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getSPC_SubVal()
	 * @model
	 * @generated
	 */
	boolean isSubVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.SPC#isSubVal <em>Sub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Val</em>' attribute.
	 * @see #isSubVal()
	 * @generated
	 */
	void setSubVal(boolean value);

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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getSPC_PulseConfig()
	 * @model required="true"
	 * @generated
	 */
	PulseConfig getPulseConfig();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.SPC#getPulseConfig <em>Pulse Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pulse Config</em>' reference.
	 * @see #getPulseConfig()
	 * @generated
	 */
	void setPulseConfig(PulseConfig value);

} // SPC
