/**
 */
package CIM.IEC61970.Informative.InfLocations;

import CIM.IEC61968.Common.Agreement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Grant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.LocationGrant#getLandProperty <em>Land Property</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.LocationGrant#getPropertyData <em>Property Data</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLocationGrant()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A grant provides a right, as defined by type, for a parcel of land. Note that the association to Location, Asset, Organisation, etc. for the Grant is inherited from Agreement, a type of Document.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A grant provides a right, as defined by type, for a parcel of land. Note that the association to Location, Asset, Organisation, etc. for the Grant is inherited from Agreement, a type of Document.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A grant provides a right, as defined by type, for a parcel of land. Note that the association to Location, Asset, Organisation, etc. for the Grant is inherited from Agreement, a type of Document.' Profile\040documentation='A grant provides a right, as defined by type, for a parcel of land. Note that the association to Location, Asset, Organisation, etc. for the Grant is inherited from Agreement, a type of Document.'"
 * @generated
 */
public interface LocationGrant extends Agreement {
	/**
	 * Returns the value of the '<em><b>Land Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfLocations.LandProperty#getLocationGrants <em>Location Grants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Property</em>' reference.
	 * @see #setLandProperty(LandProperty)
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLocationGrant_LandProperty()
	 * @see CIM.IEC61970.Informative.InfLocations.LandProperty#getLocationGrants
	 * @model opposite="LocationGrants"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Land property this location grant applies to.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Land property this location grant applies to.'"
	 * @generated
	 */
	LandProperty getLandProperty();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfLocations.LocationGrant#getLandProperty <em>Land Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Land Property</em>' reference.
	 * @see #getLandProperty()
	 * @generated
	 */
	void setLandProperty(LandProperty value);

	/**
	 * Returns the value of the '<em><b>Property Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Data</em>' attribute.
	 * @see #setPropertyData(String)
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getLocationGrant_PropertyData()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Property related information that describes the Grant\'s land parcel. For example, it may be a deed book number, deed book page number, and parcel number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Property related information that describes the Grant\'s land parcel. For example, it may be a deed book number, deed book page number, and parcel number.'"
	 * @generated
	 */
	String getPropertyData();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfLocations.LocationGrant#getPropertyData <em>Property Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Data</em>' attribute.
	 * @see #getPropertyData()
	 * @generated
	 */
	void setPropertyData(String value);

} // LocationGrant
