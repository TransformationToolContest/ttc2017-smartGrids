/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SEQ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.SEQ#getC1 <em>C1</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SEQ#getC2 <em>C2</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SEQ#getC3 <em>C3</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SEQ#getSeqT <em>Seq T</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SEQ#getPhsRef <em>Phs Ref</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getSEQ()
 * @model
 * @generated
 */
public interface SEQ extends EObject {
	/**
	 * Returns the value of the '<em><b>C1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C1</em>' reference.
	 * @see #setC1(CMV)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSEQ_C1()
	 * @model required="true"
	 * @generated
	 */
	CMV getC1();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SEQ#getC1 <em>C1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C1</em>' reference.
	 * @see #getC1()
	 * @generated
	 */
	void setC1(CMV value);

	/**
	 * Returns the value of the '<em><b>C2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C2</em>' reference.
	 * @see #setC2(CMV)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSEQ_C2()
	 * @model required="true"
	 * @generated
	 */
	CMV getC2();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SEQ#getC2 <em>C2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C2</em>' reference.
	 * @see #getC2()
	 * @generated
	 */
	void setC2(CMV value);

	/**
	 * Returns the value of the '<em><b>C3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C3</em>' reference.
	 * @see #setC3(CMV)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSEQ_C3()
	 * @model required="true"
	 * @generated
	 */
	CMV getC3();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SEQ#getC3 <em>C3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C3</em>' reference.
	 * @see #getC3()
	 * @generated
	 */
	void setC3(CMV value);

	/**
	 * Returns the value of the '<em><b>Seq T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq T</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq T</em>' reference.
	 * @see #setSeqT(Sequence)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSEQ_SeqT()
	 * @model required="true"
	 * @generated
	 */
	Sequence getSeqT();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SEQ#getSeqT <em>Seq T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq T</em>' reference.
	 * @see #getSeqT()
	 * @generated
	 */
	void setSeqT(Sequence value);

	/**
	 * Returns the value of the '<em><b>Phs Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs Ref</em>' reference.
	 * @see #setPhsRef(PhaseReference)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSEQ_PhsRef()
	 * @model required="true"
	 * @generated
	 */
	PhaseReference getPhsRef();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SEQ#getPhsRef <em>Phs Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs Ref</em>' reference.
	 * @see #getPhsRef()
	 * @generated
	 */
	void setPhsRef(PhaseReference value);

} // SEQ
