/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.StatusInfo#getT <em>T</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.StatusInfo#getD <em>D</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.StatusInfo#getDU <em>DU</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getStatusInfo()
 * @model
 * @generated
 */
public interface StatusInfo extends EObject {
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getStatusInfo_T()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getT();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.StatusInfo#getT <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(TimeStamp value);

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getStatusInfo_D()
	 * @model
	 * @generated
	 */
	String getD();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.StatusInfo#getD <em>D</em>}' attribute.
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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getStatusInfo_DU()
	 * @model
	 * @generated
	 */
	String getDU();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.StatusInfo#getDU <em>DU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DU</em>' attribute.
	 * @see #getDU()
	 * @generated
	 */
	void setDU(String value);

} // StatusInfo
