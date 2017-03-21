/**
 */
package CIM.IEC61970.Informative.InfCommon;

import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Core.PowerSystemResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Psr Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.DocPsrRole#getDocument <em>Document</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.DocPsrRole#getPowerSystemResource <em>Power System Resource</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getDocPsrRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Potential roles that might played by a document relative to a type of PowerSystemResource.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Potential roles that might played by a document relative to a type of PowerSystemResource.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Potential roles that might played by a document relative to a type of PowerSystemResource.' Profile\040documentation='Potential roles that might played by a document relative to a type of PowerSystemResource.'"
 * @generated
 */
public interface DocPsrRole extends Role {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Document#getPowerSystemResourceRoles <em>Power System Resource Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(Document)
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getDocPsrRole_Document()
	 * @see CIM.IEC61968.Common.Document#getPowerSystemResourceRoles
	 * @model opposite="PowerSystemResourceRoles"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCommon.DocPsrRole#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.PowerSystemResource#getDocumentRoles <em>Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference.
	 * @see #setPowerSystemResource(PowerSystemResource)
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getDocPsrRole_PowerSystemResource()
	 * @see CIM.IEC61970.Core.PowerSystemResource#getDocumentRoles
	 * @model opposite="DocumentRoles"
	 * @generated
	 */
	PowerSystemResource getPowerSystemResource();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCommon.DocPsrRole#getPowerSystemResource <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power System Resource</em>' reference.
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	void setPowerSystemResource(PowerSystemResource value);

} // DocPsrRole
