/**
 */
package gluemodel.CIM.IEC61970.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geographical Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.GeographicalRegion#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getGeographicalRegion()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A geographical region of a power system network model.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A geographical region of a power system network model.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A geographical region of a power system network model.' Profile\040documentation='A geographical region of a power system network model.'"
 * @generated
 */
public interface GeographicalRegion extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.SubGeographicalRegion}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.SubGeographicalRegion#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getGeographicalRegion_Regions()
	 * @see gluemodel.CIM.IEC61970.Core.SubGeographicalRegion#getRegion
	 * @model opposite="Region"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	EList<SubGeographicalRegion> getRegions();

} // GeographicalRegion
