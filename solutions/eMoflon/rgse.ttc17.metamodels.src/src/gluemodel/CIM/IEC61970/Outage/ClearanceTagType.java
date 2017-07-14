/**
 */
package gluemodel.CIM.IEC61970.Outage;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clearance Tag Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Outage.ClearanceTagType#getClearanceTags <em>Clearance Tags</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Outage.OutagePackage#getClearanceTagType()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of ClearanceTag. Could indicate the type of work to be performed and/or the type of supervisory control.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Type of ClearanceTag. Could indicate the type of work to be performed and/or the type of supervisory control.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of ClearanceTag. Could indicate the type of work to be performed and/or the type of supervisory control.' Profile\040documentation='Type of ClearanceTag. Could indicate the type of work to be performed and/or the type of supervisory control.'"
 * @generated
 */
public interface ClearanceTagType extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Clearance Tags</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Outage.ClearanceTag}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Outage.ClearanceTag#getClearanceTagType <em>Clearance Tag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearance Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearance Tags</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Outage.OutagePackage#getClearanceTagType_ClearanceTags()
	 * @see gluemodel.CIM.IEC61970.Outage.ClearanceTag#getClearanceTagType
	 * @model opposite="ClearanceTagType"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The ClearanceTags currently being defined for this type.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ClearanceTags currently being defined for this type.'"
	 * @generated
	 */
	EList<ClearanceTag> getClearanceTags();

} // ClearanceTagType
