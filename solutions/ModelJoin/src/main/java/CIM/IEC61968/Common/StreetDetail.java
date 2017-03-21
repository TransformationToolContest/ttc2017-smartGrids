/**
 */
package CIM.IEC61968.Common;

import CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Street Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.StreetDetail#getName <em>Name</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.StreetDetail#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.StreetDetail#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.StreetDetail#getSuiteNumber <em>Suite Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.StreetDetail#isWithinTownLimits <em>Within Town Limits</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.StreetDetail#getAddressGeneral <em>Address General</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.StreetDetail#getNumber <em>Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.StreetDetail#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.StreetDetail#getType <em>Type</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.StreetDetail#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Common.CommonPackage#getStreetDetail()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Street details, in the context of address.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Street details, in the context of address.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Street details, in the context of address.' Profile\040documentation='Street details, in the context of address.'"
 * @generated
 */
public interface StreetDetail extends Element {
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
	 * @see CIM.IEC61968.Common.CommonPackage#getStreetDetail_Name()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name of the street.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name of the street.'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.StreetDetail#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getStreetDetail_Prefix()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Prefix to the street name. For example: North, South, East, West.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Prefix to the street name. For example: North, South, East, West.'"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.StreetDetail#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Building Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Name</em>' attribute.
	 * @see #setBuildingName(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getStreetDetail_BuildingName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) In certain cases the physical location of the place of interest does not have a direct point of entry from the street, but may be located inside a larger structure such as a building, complex, office block, apartment, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) In certain cases the physical location of the place of interest does not have a direct point of entry from the street, but may be located inside a larger structure such as a building, complex, office block, apartment, etc.'"
	 * @generated
	 */
	String getBuildingName();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.StreetDetail#getBuildingName <em>Building Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Name</em>' attribute.
	 * @see #getBuildingName()
	 * @generated
	 */
	void setBuildingName(String value);

	/**
	 * Returns the value of the '<em><b>Suite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suite Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suite Number</em>' attribute.
	 * @see #setSuiteNumber(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getStreetDetail_SuiteNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of the apartment or suite.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of the apartment or suite.'"
	 * @generated
	 */
	String getSuiteNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.StreetDetail#getSuiteNumber <em>Suite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suite Number</em>' attribute.
	 * @see #getSuiteNumber()
	 * @generated
	 */
	void setSuiteNumber(String value);

	/**
	 * Returns the value of the '<em><b>Within Town Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Within Town Limits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Within Town Limits</em>' attribute.
	 * @see #setWithinTownLimits(boolean)
	 * @see CIM.IEC61968.Common.CommonPackage#getStreetDetail_WithinTownLimits()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this street is within the legal geographical boundaries of the specified town (default).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this street is within the legal geographical boundaries of the specified town (default).'"
	 * @generated
	 */
	boolean isWithinTownLimits();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.StreetDetail#isWithinTownLimits <em>Within Town Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Within Town Limits</em>' attribute.
	 * @see #isWithinTownLimits()
	 * @generated
	 */
	void setWithinTownLimits(boolean value);

	/**
	 * Returns the value of the '<em><b>Address General</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address General</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address General</em>' attribute.
	 * @see #setAddressGeneral(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getStreetDetail_AddressGeneral()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Additional address information, for example a mailstop.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Additional address information, for example a mailstop.'"
	 * @generated
	 */
	String getAddressGeneral();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.StreetDetail#getAddressGeneral <em>Address General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address General</em>' attribute.
	 * @see #getAddressGeneral()
	 * @generated
	 */
	void setAddressGeneral(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getStreetDetail_Number()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Designator of the specific location on the street.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Designator of the specific location on the street.'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.StreetDetail#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see #setSuffix(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getStreetDetail_Suffix()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Suffix to the street name. For example: North, South, East, West.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Suffix to the street name. For example: North, South, East, West.'"
	 * @generated
	 */
	String getSuffix();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.StreetDetail#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' attribute.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getStreetDetail_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of street. Examples include: street, circle, boulevard, avenue, road, drive, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of street. Examples include: street, circle, boulevard, avenue, road, drive, etc.'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.StreetDetail#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see CIM.IEC61968.Common.CommonPackage#getStreetDetail_Code()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) Utilities often make use of external reference systems, such as those of the town-planner\'s department or surveyor general\'s mapping system, that allocate global reference codes to streets.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) Utilities often make use of external reference systems, such as those of the town-planner\'s department or surveyor general\'s mapping system, that allocate global reference codes to streets.'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.StreetDetail#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // StreetDetail
