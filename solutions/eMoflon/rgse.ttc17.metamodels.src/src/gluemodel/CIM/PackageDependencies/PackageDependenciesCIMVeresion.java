/**
 */
package gluemodel.CIM.PackageDependencies;

import gluemodel.CIM.Element;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Veresion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.PackageDependencies.PackageDependenciesCIMVeresion#getDate <em>Date</em>}</li>
 *   <li>{@link gluemodel.CIM.PackageDependencies.PackageDependenciesCIMVeresion#getVesion <em>Vesion</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.PackageDependencies.PackageDependenciesPackage#getPackageDependenciesCIMVeresion()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The version of dependencies description among top level subpackages of the combined CIM model.  This is not the same as the combined packages version.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The version of dependencies description among top level subpackages of the combined CIM model.  This is not the same as the combined packages version.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The version of dependencies description among top level subpackages of the combined CIM model.  This is not the same as the combined packages version.' Profile\040documentation='The version of dependencies description among top level subpackages of the combined CIM model.  This is not the same as the combined packages version.'"
 * @generated
 */
public interface PackageDependenciesCIMVeresion extends Element {
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
	 * @see gluemodel.CIM.PackageDependencies.PackageDependenciesPackage#getPackageDependenciesCIMVeresion_Date()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date of last change to the main package dependencies in format YYYY-MM-DD.   This is updated when the version attribute is updated.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date of last change to the main package dependencies in format YYYY-MM-DD.   This is updated when the version attribute is updated.'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.PackageDependencies.PackageDependenciesCIMVeresion#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Vesion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vesion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vesion</em>' attribute.
	 * @see #setVesion(String)
	 * @see gluemodel.CIM.PackageDependencies.PackageDependenciesPackage#getPackageDependenciesCIMVeresion_Vesion()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The version of the main subpackages of the combined CIM model.  The format is simply an integer.  The version (and date) initial values should be updated any time the dependencies in the model change and require an actual change to the diagrams within this package.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The version of the main subpackages of the combined CIM model.  The format is simply an integer.  The version (and date) initial values should be updated any time the dependencies in the model change and require an actual change to the diagrams within this package.'"
	 * @generated
	 */
	String getVesion();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.PackageDependencies.PackageDependenciesCIMVeresion#getVesion <em>Vesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vesion</em>' attribute.
	 * @see #getVesion()
	 * @generated
	 */
	void setVesion(String value);

} // PackageDependenciesCIMVeresion
