/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.INC#getCtlVal <em>Ctl Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.INC#getStVal <em>St Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.INC#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.INC#getT <em>T</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.INC#getSubVal <em>Sub Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.INC#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.INC#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.INC#getStepSize <em>Step Size</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getINC()
 * @model
 * @generated
 */
public interface INC extends EObject {
	/**
	 * Returns the value of the '<em><b>Ctl Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctl Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctl Val</em>' attribute.
	 * @see #setCtlVal(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getINC_CtlVal()
	 * @model
	 * @generated
	 */
	int getCtlVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.INC#getCtlVal <em>Ctl Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctl Val</em>' attribute.
	 * @see #getCtlVal()
	 * @generated
	 */
	void setCtlVal(int value);

	/**
	 * Returns the value of the '<em><b>St Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>St Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>St Val</em>' attribute.
	 * @see #setStVal(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getINC_StVal()
	 * @model
	 * @generated
	 */
	int getStVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.INC#getStVal <em>St Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>St Val</em>' attribute.
	 * @see #getStVal()
	 * @generated
	 */
	void setStVal(int value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getINC_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.INC#getQ <em>Q</em>}' reference.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getINC_T()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getT();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.INC#getT <em>T</em>}' reference.
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
	 * @see #setSubVal(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getINC_SubVal()
	 * @model
	 * @generated
	 */
	int getSubVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.INC#getSubVal <em>Sub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Val</em>' attribute.
	 * @see #getSubVal()
	 * @generated
	 */
	void setSubVal(int value);

	/**
	 * Returns the value of the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Val</em>' attribute.
	 * @see #setMinVal(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getINC_MinVal()
	 * @model
	 * @generated
	 */
	int getMinVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.INC#getMinVal <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Val</em>' attribute.
	 * @see #getMinVal()
	 * @generated
	 */
	void setMinVal(int value);

	/**
	 * Returns the value of the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Val</em>' attribute.
	 * @see #setMaxVal(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getINC_MaxVal()
	 * @model
	 * @generated
	 */
	int getMaxVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.INC#getMaxVal <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Val</em>' attribute.
	 * @see #getMaxVal()
	 * @generated
	 */
	void setMaxVal(int value);

	/**
	 * Returns the value of the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Size</em>' attribute.
	 * @see #setStepSize(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getINC_StepSize()
	 * @model
	 * @generated
	 */
	int getStepSize();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.INC#getStepSize <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Size</em>' attribute.
	 * @see #getStepSize()
	 * @generated
	 */
	void setStepSize(int value);

} // INC
