/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.SEC#getCnt <em>Cnt</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.SEC#getSev <em>Sev</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.SEC#getAddr <em>Addr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.SEC#getAddInfo <em>Add Info</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getSEC()
 * @model
 * @generated
 */
public interface SEC extends EObject {
	/**
	 * Returns the value of the '<em><b>Cnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cnt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cnt</em>' attribute.
	 * @see #setCnt(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getSEC_Cnt()
	 * @model
	 * @generated
	 */
	int getCnt();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.SEC#getCnt <em>Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cnt</em>' attribute.
	 * @see #getCnt()
	 * @generated
	 */
	void setCnt(int value);

	/**
	 * Returns the value of the '<em><b>Sev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sev</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sev</em>' reference.
	 * @see #setSev(Severity)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getSEC_Sev()
	 * @model required="true"
	 * @generated
	 */
	Severity getSev();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.SEC#getSev <em>Sev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sev</em>' reference.
	 * @see #getSev()
	 * @generated
	 */
	void setSev(Severity value);

	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #setAddr(String)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getSEC_Addr()
	 * @model
	 * @generated
	 */
	String getAddr();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.SEC#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(String value);

	/**
	 * Returns the value of the '<em><b>Add Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Info</em>' attribute.
	 * @see #setAddInfo(String)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getSEC_AddInfo()
	 * @model
	 * @generated
	 */
	String getAddInfo();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.SEC#getAddInfo <em>Add Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Info</em>' attribute.
	 * @see #getAddInfo()
	 * @generated
	 */
	void setAddInfo(String value);

} // SEC
