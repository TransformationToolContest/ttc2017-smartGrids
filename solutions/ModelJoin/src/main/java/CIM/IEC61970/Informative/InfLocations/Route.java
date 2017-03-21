/**
 */
package CIM.IEC61970.Informative.InfLocations;

import CIM.IEC61968.Common.Location;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfWork.Crew;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.Route#getLocations <em>Locations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.Route#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.Route#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.Route#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getRoute()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Route that is followed, for example by service crews.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Route that is followed, for example by service crews.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Route that is followed, for example by service crews.' Profile\040documentation='Route that is followed, for example by service crews.'"
 * @generated
 */
public interface Route extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Location#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getRoute_Locations()
	 * @see CIM.IEC61968.Common.Location#getRoutes
	 * @model opposite="Routes"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Crew#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getRoute_Crews()
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getRoute
	 * @model opposite="Route"
	 * @generated
	 */
	EList<Crew> getCrews();

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
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getRoute_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfLocations.Route#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getRoute_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category by utility\'s work management standards and practices.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category by utility\'s work management standards and practices.'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfLocations.Route#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

} // Route
