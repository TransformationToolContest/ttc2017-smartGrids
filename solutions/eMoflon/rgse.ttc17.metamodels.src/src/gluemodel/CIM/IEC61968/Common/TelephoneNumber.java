/**
 */
package gluemodel.CIM.IEC61968.Common;

import gluemodel.CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telephone Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.TelephoneNumber#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.TelephoneNumber#getCityCode <em>City Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.TelephoneNumber#getLocalNumber <em>Local Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.TelephoneNumber#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.TelephoneNumber#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getTelephoneNumber()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Telephone number.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Telephone number.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Telephone number.' Profile\040documentation='Telephone number.'"
 * @generated
 */
public interface TelephoneNumber extends Element {
	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #setCountryCode(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getTelephoneNumber_CountryCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Country code.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Country code.'"
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.TelephoneNumber#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

	/**
	 * Returns the value of the '<em><b>City Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Code</em>' attribute.
	 * @see #setCityCode(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getTelephoneNumber_CityCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) City code.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) City code.'"
	 * @generated
	 */
	String getCityCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.TelephoneNumber#getCityCode <em>City Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Code</em>' attribute.
	 * @see #getCityCode()
	 * @generated
	 */
	void setCityCode(String value);

	/**
	 * Returns the value of the '<em><b>Local Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Number</em>' attribute.
	 * @see #setLocalNumber(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getTelephoneNumber_LocalNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Main (local) part of this telephone number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Main (local) part of this telephone number.'"
	 * @generated
	 */
	String getLocalNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.TelephoneNumber#getLocalNumber <em>Local Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Number</em>' attribute.
	 * @see #getLocalNumber()
	 * @generated
	 */
	void setLocalNumber(String value);

	/**
	 * Returns the value of the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Code</em>' attribute.
	 * @see #setAreaCode(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getTelephoneNumber_AreaCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Area or region code.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Area or region code.'"
	 * @generated
	 */
	String getAreaCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.TelephoneNumber#getAreaCode <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Code</em>' attribute.
	 * @see #getAreaCode()
	 * @generated
	 */
	void setAreaCode(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getTelephoneNumber_Extension()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) Extension for this telephone number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) Extension for this telephone number.'"
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.TelephoneNumber#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

} // TelephoneNumber
