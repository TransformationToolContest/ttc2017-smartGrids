/**
 */
package gluemodel.CIM;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.CombinedVersion#getVersion <em>Version</em>}</li>
 *   <li>{@link gluemodel.CIM.CombinedVersion#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.CIMPackage#getCombinedVersion()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The combined version denotes the versions of the subpackages that have been combined into the total CIIMmodel. This is a convenience instead of having to look at each subpackage.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The combined version denotes the versions of the subpackages that have been combined into the total CIIMmodel. This is a convenience instead of having to look at each subpackage.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The combined version denotes the versions of the subpackages that have been combined into the total CIIMmodel. This is a convenience instead of having to look at each subpackage.' Profile\040documentation='The combined version denotes the versions of the subpackages that have been combined into the total CIIMmodel. This is a convenience instead of having to look at each subpackage.'"
 * @generated
 */
public interface CombinedVersion extends Element {
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
	 * @see gluemodel.CIM.CIMPackage#getCombinedVersion_Version()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Form is IEC61970CIMXXvYY_IEC61968CIMXXvYY_combined where XX is the major CIM package version and the YY is the minor version, and different packages could have different major and minor versions.   For example IEC61970CIM13v18_IEC61968CIM10v16_combined.  Additional packages might be added in the future.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Form is IEC61970CIMXXvYY_IEC61968CIMXXvYY_combined where XX is the major CIM package version and the YY is the minor version, and different packages could have different major and minor versions.   For example IEC61970CIM13v18_IEC61968CIM10v16_combined.  Additional packages might be added in the future.'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.CombinedVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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
	 * @see gluemodel.CIM.CIMPackage#getCombinedVersion_Date()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Form is YYYY-MM-DD for example for January 5, 2009 it is 2009-01-05.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Form is YYYY-MM-DD for example for January 5, 2009 it is 2009-01-05.'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.CombinedVersion#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // CombinedVersion
