/**
 */
package CIM.IEC61970.Core;

import CIM.IEC61970.Wires.Line;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Geographical Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.SubGeographicalRegion#getLines <em>Lines</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.SubGeographicalRegion#getRegion <em>Region</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.SubGeographicalRegion#getSubstations <em>Substations</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Core.CorePackage#getSubGeographicalRegion()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A subset of a geographical region of a power system network model.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A subset of a geographical region of a power system network model.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A subset of a geographical region of a power system network model.' Profile\040documentation='A subset of a geographical region of a power system network model.'"
 * @generated
 */
public interface SubGeographicalRegion extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.Line}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.Line#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getSubGeographicalRegion_Lines()
	 * @see CIM.IEC61970.Wires.Line#getRegion
	 * @model opposite="Region"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Line can be contained by a SubGeographical Region.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Line can be contained by a SubGeographical Region.'"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.GeographicalRegion#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(GeographicalRegion)
	 * @see CIM.IEC61970.Core.CorePackage#getSubGeographicalRegion_Region()
	 * @see CIM.IEC61970.Core.GeographicalRegion#getRegions
	 * @model opposite="Regions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	GeographicalRegion getRegion();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.SubGeographicalRegion#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(GeographicalRegion value);

	/**
	 * Returns the value of the '<em><b>Substations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.Substation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.Substation#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substations</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getSubGeographicalRegion_Substations()
	 * @see CIM.IEC61970.Core.Substation#getRegion
	 * @model opposite="Region"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	EList<Substation> getSubstations();

} // SubGeographicalRegion
