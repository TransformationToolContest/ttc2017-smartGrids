/**
 */
package CIM.IEC61968.Common;

import CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electronic Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.ElectronicAddress#getLan <em>Lan</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.ElectronicAddress#getEmail <em>Email</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.ElectronicAddress#getUserID <em>User ID</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.ElectronicAddress#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.ElectronicAddress#getWeb <em>Web</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.ElectronicAddress#getPassword <em>Password</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.ElectronicAddress#getRadio <em>Radio</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Common.CommonPackage#getElectronicAddress()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Electronic address information.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Electronic address information.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Electronic address information.' Profile\040documentation='Electronic address information.'"
 * @generated
 */
public interface ElectronicAddress extends Element {
	/**
	 * Returns the value of the '<em><b>Lan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lan</em>' attribute.
	 * @see #setLan(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getElectronicAddress_Lan()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Address on local area network.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Address on local area network.'"
	 * @generated
	 */
	String getLan();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.ElectronicAddress#getLan <em>Lan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lan</em>' attribute.
	 * @see #getLan()
	 * @generated
	 */
	void setLan(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getElectronicAddress_Email()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Email address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Email address.'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.ElectronicAddress#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getElectronicAddress_UserID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='User ID needed to log in, which can be for an individual person, an organisation, a location, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='User ID needed to log in, which can be for an individual person, an organisation, a location, etc.'"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.ElectronicAddress#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

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
	 * @see CIM.IEC61968.Common.CommonPackage#getElectronicAddress_Status()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Status of this electronic address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Status of this electronic address.'"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.ElectronicAddress#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web</em>' attribute.
	 * @see #setWeb(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getElectronicAddress_Web()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='World Wide Web address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='World Wide Web address.'"
	 * @generated
	 */
	String getWeb();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.ElectronicAddress#getWeb <em>Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web</em>' attribute.
	 * @see #getWeb()
	 * @generated
	 */
	void setWeb(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getElectronicAddress_Password()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Password needed to log in.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Password needed to log in.'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.ElectronicAddress#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio</em>' attribute.
	 * @see #setRadio(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getElectronicAddress_Radio()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Radio address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Radio address.'"
	 * @generated
	 */
	String getRadio();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.ElectronicAddress#getRadio <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radio</em>' attribute.
	 * @see #getRadio()
	 * @generated
	 */
	void setRadio(String value);

} // ElectronicAddress
