/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLocations;

import gluemodel.CIM.IEC61968.Common.Location;
import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard#getLocations <em>Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getHazard()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A hazard is any object or condition that is a danger for causing loss or perils to an asset and/or people. Examples of hazards are trees growing under overhead power lines, a park being located by a substation (i.e., children climb fence to recover a ball), a lake near an overhead distribution line (fishing pole/line contacting power lines), etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A hazard is any object or condition that is a danger for causing loss or perils to an asset and/or people. Examples of hazards are trees growing under overhead power lines, a park being located by a substation (i.e., children climb fence to recover a ball), a lake near an overhead distribution line (fishing pole/line contacting power lines), etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A hazard is any object or condition that is a danger for causing loss or perils to an asset and/or people. Examples of hazards are trees growing under overhead power lines, a park being located by a substation (i.e., children climb fence to recover a ball), a lake near an overhead distribution line (fishing pole/line contacting power lines), etc.' Profile\040documentation='A hazard is any object or condition that is a danger for causing loss or perils to an asset and/or people. Examples of hazards are trees growing under overhead power lines, a park being located by a substation (i.e., children climb fence to recover a ball), a lake near an overhead distribution line (fishing pole/line contacting power lines), etc.'"
 * @generated
 */
public interface Hazard extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Location#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getHazard_Locations()
	 * @see gluemodel.CIM.IEC61968.Common.Location#getHazards
	 * @model opposite="Hazards"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The point or polygon location of a given hazard.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The point or polygon location of a given hazard.'"
	 * @generated
	 */
	EList<Location> getLocations();

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getHazard_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard#getStatus <em>Status</em>}' reference.
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
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getHazard_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category by utility\'s corporate standards and practices.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category by utility\'s corporate standards and practices.'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.Hazard#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

} // Hazard
