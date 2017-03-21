/**
 */
package CIM.IEC61970;

import CIM.Element;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.IEC61970CIMVersion#getDate <em>Date</em>}</li>
 *   <li>{@link CIM.IEC61970.IEC61970CIMVersion#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.IEC61970Package#getIEC61970CIMVersion()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This is the IEC 61970 CIM version number assigned to this UML model file.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='This is the IEC 61970 CIM version number assigned to this UML model file.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is the IEC 61970 CIM version number assigned to this UML model file.' Profile\040documentation='This is the IEC 61970 CIM version number assigned to this UML model file.'"
 * @generated
 */
public interface IEC61970CIMVersion extends Element {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see CIM.IEC61970.IEC61970Package#getIEC61970CIMVersion_Date()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Form is YYYY-MM-DD for example for January 5, 2009 it is 2009-01-05.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Form is YYYY-MM-DD for example for January 5, 2009 it is 2009-01-05.'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.IEC61970CIMVersion#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see CIM.IEC61970.IEC61970Package#getIEC61970CIMVersion_Version()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Form is IEC61970CIMXXvYY where XX is the major CIM package version and the YY is the minor version. For ecample IEC61970CIM13v18.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Form is IEC61970CIMXXvYY where XX is the major CIM package version and the YY is the minor version. For ecample IEC61970CIM13v18.'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.IEC61970CIMVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // IEC61970CIMVersion
