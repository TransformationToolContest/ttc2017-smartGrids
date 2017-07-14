/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DEL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.DEL#getPhsAB <em>Phs AB</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.DEL#getPhsBC <em>Phs BC</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.DEL#getPhsCA <em>Phs CA</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.DEL#getAngRef <em>Ang Ref</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getDEL()
 * @model
 * @generated
 */
public interface DEL extends EObject {
	/**
	 * Returns the value of the '<em><b>Phs AB</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs AB</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs AB</em>' reference.
	 * @see #setPhsAB(CMV)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getDEL_PhsAB()
	 * @model required="true"
	 * @generated
	 */
	CMV getPhsAB();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.DEL#getPhsAB <em>Phs AB</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs AB</em>' reference.
	 * @see #getPhsAB()
	 * @generated
	 */
	void setPhsAB(CMV value);

	/**
	 * Returns the value of the '<em><b>Phs BC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs BC</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs BC</em>' reference.
	 * @see #setPhsBC(CMV)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getDEL_PhsBC()
	 * @model required="true"
	 * @generated
	 */
	CMV getPhsBC();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.DEL#getPhsBC <em>Phs BC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs BC</em>' reference.
	 * @see #getPhsBC()
	 * @generated
	 */
	void setPhsBC(CMV value);

	/**
	 * Returns the value of the '<em><b>Phs CA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phs CA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phs CA</em>' reference.
	 * @see #setPhsCA(CMV)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getDEL_PhsCA()
	 * @model required="true"
	 * @generated
	 */
	CMV getPhsCA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.DEL#getPhsCA <em>Phs CA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phs CA</em>' reference.
	 * @see #getPhsCA()
	 * @generated
	 */
	void setPhsCA(CMV value);

	/**
	 * Returns the value of the '<em><b>Ang Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ang Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ang Ref</em>' reference.
	 * @see #setAngRef(AngleReference)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getDEL_AngRef()
	 * @model required="true"
	 * @generated
	 */
	AngleReference getAngRef();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.DEL#getAngRef <em>Ang Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ang Ref</em>' reference.
	 * @see #getAngRef()
	 * @generated
	 */
	void setAngRef(AngleReference value);

} // DEL
