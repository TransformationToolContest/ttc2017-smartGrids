/**
 */
package CIM.IEC61970.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.Substation#getBays <em>Bays</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.Substation#getRegion <em>Region</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.Substation#getVoltageLevels <em>Voltage Levels</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Core.CorePackage#getSubstation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A collection of equipment for purposes other than generation or utilization, through which electric energy in bulk is passed for the purposes of switching or modifying its characteristics.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A collection of equipment for purposes other than generation or utilization, through which electric energy in bulk is passed for the purposes of switching or modifying its characteristics.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A collection of equipment for purposes other than generation or utilization, through which electric energy in bulk is passed for the purposes of switching or modifying its characteristics.' Profile\040documentation='A collection of equipment for purposes other than generation or utilization, through which electric energy in bulk is passed for the purposes of switching or modifying its characteristics.'"
 * @generated
 */
public interface Substation extends EquipmentContainer {
	/**
	 * Returns the value of the '<em><b>Bays</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.Bay}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.Bay#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bays</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bays</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getSubstation_Bays()
	 * @see CIM.IEC61970.Core.Bay#getSubstation
	 * @model opposite="Substation"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	EList<Bay> getBays();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.SubGeographicalRegion#getSubstations <em>Substations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(SubGeographicalRegion)
	 * @see CIM.IEC61970.Core.CorePackage#getSubstation_Region()
	 * @see CIM.IEC61970.Core.SubGeographicalRegion#getSubstations
	 * @model opposite="Substations"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	SubGeographicalRegion getRegion();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.Substation#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(SubGeographicalRegion value);

	/**
	 * Returns the value of the '<em><b>Voltage Levels</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.VoltageLevel}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.VoltageLevel#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Levels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Levels</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getSubstation_VoltageLevels()
	 * @see CIM.IEC61970.Core.VoltageLevel#getSubstation
	 * @model opposite="Substation"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	EList<VoltageLevel> getVoltageLevels();

} // Substation
