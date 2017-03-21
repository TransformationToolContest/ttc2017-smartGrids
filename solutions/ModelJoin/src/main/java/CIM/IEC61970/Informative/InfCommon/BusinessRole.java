/**
 */
package CIM.IEC61970.Informative.InfCommon;

import CIM.IEC61968.Common.Organisation;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.BusinessRole#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.BusinessRole#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.BusinessRole#getOrganisations <em>Organisations</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getBusinessRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A business role that this organisation plays. A single organisation typically performs many functions, each one described as a role.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A business role that this organisation plays. A single organisation typically performs many functions, each one described as a role.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A business role that this organisation plays. A single organisation typically performs many functions, each one described as a role.' Profile\040documentation='A business role that this organisation plays. A single organisation typically performs many functions, each one described as a role.'"
 * @generated
 */
public interface BusinessRole extends IdentifiedObject {
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
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getBusinessRole_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCommon.BusinessRole#getStatus <em>Status</em>}' reference.
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
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getBusinessRole_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category by utility\'s corporate standards and practices.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category by utility\'s corporate standards and practices.'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCommon.BusinessRole#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Organisations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.Organisation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Organisation#getBusinessRoles <em>Business Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisations</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getBusinessRole_Organisations()
	 * @see CIM.IEC61968.Common.Organisation#getBusinessRoles
	 * @model opposite="BusinessRoles"
	 * @generated
	 */
	EList<Organisation> getOrganisations();

} // BusinessRole
