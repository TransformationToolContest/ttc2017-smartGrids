/**
 */
package CIM.IEC61968.Common;

import CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Town Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.TownDetail#getCountry <em>Country</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TownDetail#getCode <em>Code</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TownDetail#getName <em>Name</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TownDetail#getSection <em>Section</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TownDetail#getStateOrProvince <em>State Or Province</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Common.CommonPackage#getTownDetail()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Town details, in the context of address.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Town details, in the context of address.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Town details, in the context of address.' Profile\040documentation='Town details, in the context of address.'"
 * @generated
 */
public interface TownDetail extends Element {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getTownDetail_Country()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name of the country.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name of the country.'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TownDetail#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getTownDetail_Code()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Town code.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Town code.'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TownDetail#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getTownDetail_Name()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Town name.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Town name.'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TownDetail#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' attribute.
	 * @see #setSection(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getTownDetail_Section()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Town section. For example, it is common for there to be 36 sections per township.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Town section. For example, it is common for there to be 36 sections per township.'"
	 * @generated
	 */
	String getSection();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TownDetail#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' attribute.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(String value);

	/**
	 * Returns the value of the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Or Province</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Or Province</em>' attribute.
	 * @see #setStateOrProvince(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getTownDetail_StateOrProvince()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name of the state or province.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name of the state or province.'"
	 * @generated
	 */
	String getStateOrProvince();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TownDetail#getStateOrProvince <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Or Province</em>' attribute.
	 * @see #getStateOrProvince()
	 * @generated
	 */
	void setStateOrProvince(String value);

} // TownDetail
