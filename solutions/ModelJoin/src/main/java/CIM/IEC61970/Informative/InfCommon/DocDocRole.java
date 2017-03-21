/**
 */
package CIM.IEC61970.Informative.InfCommon;

import CIM.IEC61968.Common.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Doc Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.DocDocRole#getFromDocument <em>From Document</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.DocDocRole#getToDocument <em>To Document</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getDocDocRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Roles played between Documents and other Documents.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Roles played between Documents and other Documents.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Roles played between Documents and other Documents.' Profile\040documentation='Roles played between Documents and other Documents.'"
 * @generated
 */
public interface DocDocRole extends Role {
	/**
	 * Returns the value of the '<em><b>From Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Document#getToDocumentRoles <em>To Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Document</em>' reference.
	 * @see #setFromDocument(Document)
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getDocDocRole_FromDocument()
	 * @see CIM.IEC61968.Common.Document#getToDocumentRoles
	 * @model opposite="ToDocumentRoles"
	 * @generated
	 */
	Document getFromDocument();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCommon.DocDocRole#getFromDocument <em>From Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Document</em>' reference.
	 * @see #getFromDocument()
	 * @generated
	 */
	void setFromDocument(Document value);

	/**
	 * Returns the value of the '<em><b>To Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Document#getFromDocumentRoles <em>From Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Document</em>' reference.
	 * @see #setToDocument(Document)
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getDocDocRole_ToDocument()
	 * @see CIM.IEC61968.Common.Document#getFromDocumentRoles
	 * @model opposite="FromDocumentRoles"
	 * @generated
	 */
	Document getToDocument();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCommon.DocDocRole#getToDocument <em>To Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Document</em>' reference.
	 * @see #getToDocument()
	 * @generated
	 */
	void setToDocument(Document value);

} // DocDocRole
