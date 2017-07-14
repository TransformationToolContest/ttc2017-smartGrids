/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLocations;

import gluemodel.CIM.IEC61968.Common.Location;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Zone#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getZone()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Area divided off from other areas. It may be part of the electrical network, a land area where special restrictions apply, weather areas, etc. For weather, it is an area where a set of relatively homogenous weather measurements apply.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Area divided off from other areas. It may be part of the electrical network, a land area where special restrictions apply, weather areas, etc. For weather, it is an area where a set of relatively homogenous weather measurements apply.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Area divided off from other areas. It may be part of the electrical network, a land area where special restrictions apply, weather areas, etc. For weather, it is an area where a set of relatively homogenous weather measurements apply.' Profile\040documentation='Area divided off from other areas. It may be part of the electrical network, a land area where special restrictions apply, weather areas, etc. For weather, it is an area where a set of relatively homogenous weather measurements apply.'"
 * @generated
 */
public interface Zone extends Location {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfLocations.ZoneKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.ZoneKind
	 * @see #setKind(ZoneKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getZone_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of this zone.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of this zone.'"
	 * @generated
	 */
	ZoneKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Zone#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.ZoneKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ZoneKind value);

} // Zone
