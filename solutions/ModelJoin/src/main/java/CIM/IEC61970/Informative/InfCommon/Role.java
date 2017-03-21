/**
 */
package CIM.IEC61970.Informative.InfCommon;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.Role#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.Role#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Enumeration of potential roles that might be played by one object relative to another.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Enumeration of potential roles that might be played by one object relative to another.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Enumeration of potential roles that might be played by one object relative to another.' Profile\040documentation='Enumeration of potential roles that might be played by one object relative to another.'"
 * @generated
 */
public interface Role extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getRole_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCommon.Role#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getRole_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category of role.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category of role.'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCommon.Role#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

} // Role
