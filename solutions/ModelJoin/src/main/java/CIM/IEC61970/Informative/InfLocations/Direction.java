/**
 */
package CIM.IEC61970.Informative.InfLocations;

import CIM.Element;

import CIM.IEC61968.Common.Location;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.Direction#getLocation <em>Location</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.Direction#getDirectionInfo <em>Direction Info</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getDirection()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used for navigating from one location to another location.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Used for navigating from one location to another location.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used for navigating from one location to another location.' Profile\040documentation='Used for navigating from one location to another location.'"
 * @generated
 */
public interface Direction extends Element {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Location#getDirections <em>Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getDirection_Location()
	 * @see CIM.IEC61968.Common.Location#getDirections
	 * @model opposite="Directions"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfLocations.Direction#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Direction Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Info</em>' attribute.
	 * @see #setDirectionInfo(String)
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getDirection_DirectionInfo()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Detailed directional information.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Detailed directional information.'"
	 * @generated
	 */
	String getDirectionInfo();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfLocations.Direction#getDirectionInfo <em>Direction Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Info</em>' attribute.
	 * @see #getDirectionInfo()
	 * @generated
	 */
	void setDirectionInfo(String value);

} // Direction
