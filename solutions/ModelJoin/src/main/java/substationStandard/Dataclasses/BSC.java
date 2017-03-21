/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BSC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.BSC#getCtlVal <em>Ctl Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.BSC#getValWTr <em>Val WTr</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.BSC#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.BSC#getT <em>T</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.BSC#getSubVal <em>Sub Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.BSC#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.BSC#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.BSC#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.BSC#getStepSize <em>Step Size</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getBSC()
 * @model
 * @generated
 */
public interface BSC extends EObject {
	/**
	 * Returns the value of the '<em><b>Ctl Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctl Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctl Val</em>' reference.
	 * @see #setCtlVal(BSControl)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getBSC_CtlVal()
	 * @model required="true"
	 * @generated
	 */
	BSControl getCtlVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.BSC#getCtlVal <em>Ctl Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctl Val</em>' reference.
	 * @see #getCtlVal()
	 * @generated
	 */
	void setCtlVal(BSControl value);

	/**
	 * Returns the value of the '<em><b>Val WTr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val WTr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val WTr</em>' reference.
	 * @see #setValWTr(ValWithTrans)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getBSC_ValWTr()
	 * @model required="true"
	 * @generated
	 */
	ValWithTrans getValWTr();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.BSC#getValWTr <em>Val WTr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val WTr</em>' reference.
	 * @see #getValWTr()
	 * @generated
	 */
	void setValWTr(ValWithTrans value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getBSC_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.BSC#getQ <em>Q</em>}' reference.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getBSC_T()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getT();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.BSC#getT <em>T</em>}' reference.
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
	 * @see #setSubVal(ValWithTrans)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getBSC_SubVal()
	 * @model required="true"
	 * @generated
	 */
	ValWithTrans getSubVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.BSC#getSubVal <em>Sub Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Val</em>' reference.
	 * @see #getSubVal()
	 * @generated
	 */
	void setSubVal(ValWithTrans value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getBSC_Persistent()
	 * @model
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.BSC#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getBSC_MinVal()
	 * @model
	 * @generated
	 */
	int getMinVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.BSC#getMinVal <em>Min Val</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getBSC_MaxVal()
	 * @model
	 * @generated
	 */
	int getMaxVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.BSC#getMaxVal <em>Max Val</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getBSC_StepSize()
	 * @model
	 * @generated
	 */
	int getStepSize();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.BSC#getStepSize <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Size</em>' attribute.
	 * @see #getStepSize()
	 * @generated
	 */
	void setStepSize(int value);

} // BSC
