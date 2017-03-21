/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ACT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.ACT#isGeneral <em>General</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACT#isPhsA <em>Phs A</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACT#isPhsB <em>Phs B</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACT#isPhsC <em>Phs C</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACT#isNeut <em>Neut</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACT#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACT#getOperTm <em>Oper Tm</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getACT()
 * @model
 * @generated
 */
public interface ACT extends EObject {
	/**
	 * Returns the value of the '<em><b>General</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' attribute.
	 * @see #setGeneral(boolean)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACT_General()
	 * @model
	 * @generated
	 */
	boolean isGeneral();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACT#isGeneral <em>General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' attribute.
	 * @see #isGeneral()
	 * @generated
	 */
	void setGeneral(boolean value);

	/**
	 * Returns the value of the '<em><b>Phs A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs A</em>' attribute.
	 * @see #setPhsA(boolean)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACT_PhsA()
	 * @model
	 * @generated
	 */
	boolean isPhsA();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACT#isPhsA <em>Phs A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs A</em>' attribute.
	 * @see #isPhsA()
	 * @generated
	 */
	void setPhsA(boolean value);

	/**
	 * Returns the value of the '<em><b>Phs B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs B</em>' attribute.
	 * @see #setPhsB(boolean)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACT_PhsB()
	 * @model
	 * @generated
	 */
	boolean isPhsB();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACT#isPhsB <em>Phs B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs B</em>' attribute.
	 * @see #isPhsB()
	 * @generated
	 */
	void setPhsB(boolean value);

	/**
	 * Returns the value of the '<em><b>Phs C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs C</em>' attribute.
	 * @see #setPhsC(boolean)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACT_PhsC()
	 * @model
	 * @generated
	 */
	boolean isPhsC();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACT#isPhsC <em>Phs C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs C</em>' attribute.
	 * @see #isPhsC()
	 * @generated
	 */
	void setPhsC(boolean value);

	/**
	 * Returns the value of the '<em><b>Neut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neut</em>' attribute.
	 * @see #setNeut(boolean)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACT_Neut()
	 * @model
	 * @generated
	 */
	boolean isNeut();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACT#isNeut <em>Neut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neut</em>' attribute.
	 * @see #isNeut()
	 * @generated
	 */
	void setNeut(boolean value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACT_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACT#getQ <em>Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Quality value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACT_OperTm()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getOperTm();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACT#getOperTm <em>Oper Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oper Tm</em>' reference.
	 * @see #getOperTm()
	 * @generated
	 */
	void setOperTm(TimeStamp value);

} // ACT
