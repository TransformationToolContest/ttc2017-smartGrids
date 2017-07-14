/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getSetMag <em>Set Mag</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getOrigin <em>Origin</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getOperTm <em>Oper Tm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getT <em>T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getCtlModel <em>Ctl Model</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getUnits <em>Units</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getSVC <em>SVC</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getStepSize <em>Step Size</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getD <em>D</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.APC#getDU <em>DU</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC()
 * @model
 * @generated
 */
public interface APC extends EObject {
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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_SetMag()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getSetMag();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getSetMag <em>Set Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Mag</em>' reference.
	 * @see #getSetMag()
	 * @generated
	 */
	void setSetMag(AnalogueValue value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Originator)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_Origin()
	 * @model required="true"
	 * @generated
	 */
	Originator getOrigin();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Originator value);

	/**
	 * Returns the value of the '<em><b>Oper Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oper Tm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oper Tm</em>' reference.
	 * @see #setOperTm(TimeStamp)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_OperTm()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getOperTm();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getOperTm <em>Oper Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oper Tm</em>' reference.
	 * @see #getOperTm()
	 * @generated
	 */
	void setOperTm(TimeStamp value);

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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getQ <em>Q</em>}' reference.
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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_T()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getT();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getT <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Ctl Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctl Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctl Model</em>' reference.
	 * @see #setCtlModel(CtlModels)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_CtlModel()
	 * @model required="true"
	 * @generated
	 */
	CtlModels getCtlModel();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getCtlModel <em>Ctl Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctl Model</em>' reference.
	 * @see #getCtlModel()
	 * @generated
	 */
	void setCtlModel(CtlModels value);

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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_Units()
	 * @model required="true"
	 * @generated
	 */
	Units getUnits();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getUnits <em>Units</em>}' reference.
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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_SVC()
	 * @model required="true"
	 * @generated
	 */
	ScaledValueConfig getSVC();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getSVC <em>SVC</em>}' reference.
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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_MinVal()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getMinVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getMinVal <em>Min Val</em>}' reference.
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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_MaxVal()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getMaxVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getMaxVal <em>Max Val</em>}' reference.
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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_StepSize()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getStepSize();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getStepSize <em>Step Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Size</em>' reference.
	 * @see #getStepSize()
	 * @generated
	 */
	void setStepSize(AnalogueValue value);

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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_D()
	 * @model
	 * @generated
	 */
	String getD();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getD <em>D</em>}' attribute.
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
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAPC_DU()
	 * @model
	 * @generated
	 */
	String getDU();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.APC#getDU <em>DU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DU</em>' attribute.
	 * @see #getDU()
	 * @generated
	 */
	void setDU(String value);

} // APC
