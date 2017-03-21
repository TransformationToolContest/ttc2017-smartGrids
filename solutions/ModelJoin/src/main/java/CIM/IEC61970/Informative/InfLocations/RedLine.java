/**
 */
package CIM.IEC61970.Informative.InfLocations;

import CIM.IEC61968.Common.Location;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Red Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.RedLine#getLocations <em>Locations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLocations.RedLine#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getRedLine()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This class is used for handling the accompanying annotations, time stamp, author, etc. of designs, drawings and maps. A red line can be associated with any Location object.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='This class is used for handling the accompanying annotations, time stamp, author, etc. of designs, drawings and maps. A red line can be associated with any Location object.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This class is used for handling the accompanying annotations, time stamp, author, etc. of designs, drawings and maps. A red line can be associated with any Location object.' Profile\040documentation='This class is used for handling the accompanying annotations, time stamp, author, etc. of designs, drawings and maps. A red line can be associated with any Location object.'"
 * @generated
 */
public interface RedLine extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Location#getRedLines <em>Red Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getRedLine_Locations()
	 * @see CIM.IEC61968.Common.Location#getRedLines
	 * @model opposite="RedLines"
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
	 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage#getRedLine_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfLocations.RedLine#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // RedLine
