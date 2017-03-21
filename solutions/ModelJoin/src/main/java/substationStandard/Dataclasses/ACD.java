/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ACD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.ACD#isGeneral <em>General</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACD#getDirGeneral <em>Dir General</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACD#isPhsA <em>Phs A</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACD#getDirPhsA <em>Dir Phs A</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACD#isPhsB <em>Phs B</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACD#getDirPhsB <em>Dir Phs B</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACD#isPhsC <em>Phs C</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACD#getDirPhsC <em>Dir Phs C</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACD#isNeut <em>Neut</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACD#getDirNeut <em>Dir Neut</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ACD#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getACD()
 * @model
 * @generated
 */
public interface ACD extends EObject {
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACD_General()
	 * @model
	 * @generated
	 */
	boolean isGeneral();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACD#isGeneral <em>General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' attribute.
	 * @see #isGeneral()
	 * @generated
	 */
	void setGeneral(boolean value);

	/**
	 * Returns the value of the '<em><b>Dir General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir General</em>' reference.
	 * @see #setDirGeneral(FaultDirection)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACD_DirGeneral()
	 * @model required="true"
	 * @generated
	 */
	FaultDirection getDirGeneral();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACD#getDirGeneral <em>Dir General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir General</em>' reference.
	 * @see #getDirGeneral()
	 * @generated
	 */
	void setDirGeneral(FaultDirection value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACD_PhsA()
	 * @model
	 * @generated
	 */
	boolean isPhsA();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACD#isPhsA <em>Phs A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs A</em>' attribute.
	 * @see #isPhsA()
	 * @generated
	 */
	void setPhsA(boolean value);

	/**
	 * Returns the value of the '<em><b>Dir Phs A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir Phs A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir Phs A</em>' reference.
	 * @see #setDirPhsA(DirectionPhase)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACD_DirPhsA()
	 * @model required="true"
	 * @generated
	 */
	DirectionPhase getDirPhsA();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACD#getDirPhsA <em>Dir Phs A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Phs A</em>' reference.
	 * @see #getDirPhsA()
	 * @generated
	 */
	void setDirPhsA(DirectionPhase value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACD_PhsB()
	 * @model
	 * @generated
	 */
	boolean isPhsB();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACD#isPhsB <em>Phs B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs B</em>' attribute.
	 * @see #isPhsB()
	 * @generated
	 */
	void setPhsB(boolean value);

	/**
	 * Returns the value of the '<em><b>Dir Phs B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir Phs B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir Phs B</em>' reference.
	 * @see #setDirPhsB(DirectionPhase)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACD_DirPhsB()
	 * @model required="true"
	 * @generated
	 */
	DirectionPhase getDirPhsB();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACD#getDirPhsB <em>Dir Phs B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Phs B</em>' reference.
	 * @see #getDirPhsB()
	 * @generated
	 */
	void setDirPhsB(DirectionPhase value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACD_PhsC()
	 * @model
	 * @generated
	 */
	boolean isPhsC();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACD#isPhsC <em>Phs C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs C</em>' attribute.
	 * @see #isPhsC()
	 * @generated
	 */
	void setPhsC(boolean value);

	/**
	 * Returns the value of the '<em><b>Dir Phs C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir Phs C</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir Phs C</em>' reference.
	 * @see #setDirPhsC(DirectionPhase)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACD_DirPhsC()
	 * @model required="true"
	 * @generated
	 */
	DirectionPhase getDirPhsC();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACD#getDirPhsC <em>Dir Phs C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Phs C</em>' reference.
	 * @see #getDirPhsC()
	 * @generated
	 */
	void setDirPhsC(DirectionPhase value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACD_Neut()
	 * @model
	 * @generated
	 */
	boolean isNeut();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACD#isNeut <em>Neut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neut</em>' attribute.
	 * @see #isNeut()
	 * @generated
	 */
	void setNeut(boolean value);

	/**
	 * Returns the value of the '<em><b>Dir Neut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir Neut</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir Neut</em>' reference.
	 * @see #setDirNeut(DirectionPhase)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACD_DirNeut()
	 * @model required="true"
	 * @generated
	 */
	DirectionPhase getDirNeut();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACD#getDirNeut <em>Dir Neut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Neut</em>' reference.
	 * @see #getDirNeut()
	 * @generated
	 */
	void setDirNeut(DirectionPhase value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getACD_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.ACD#getQ <em>Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Quality value);

} // ACD
