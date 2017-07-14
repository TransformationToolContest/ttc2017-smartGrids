/**
 */
package gluemodel.CIM.IEC61970.Core;

import gluemodel.CIM.IEC61970.Meas.Control;
import gluemodel.CIM.IEC61970.Meas.Measurement;

import gluemodel.CIM.IEC61970.Protection.ProtectionEquipment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Unit#getControls <em>Controls</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Unit#getProtectionEquipments <em>Protection Equipments</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Unit#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getUnit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quantity being measured. The Unit.name shall be unique among all specified quantities and describe the quantity. The Unit.aliasName is meant to be used for localization.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Quantity being measured. The Unit.name shall be unique among all specified quantities and describe the quantity. The Unit.aliasName is meant to be used for localization.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quantity being measured. The Unit.name shall be unique among all specified quantities and describe the quantity. The Unit.aliasName is meant to be used for localization.' Profile\040documentation='Quantity being measured. The Unit.name shall be unique among all specified quantities and describe the quantity. The Unit.aliasName is meant to be used for localization.'"
 * @generated
 */
public interface Unit extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.Control}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Control#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getUnit_Controls()
	 * @see gluemodel.CIM.IEC61970.Meas.Control#getUnit
	 * @model opposite="Unit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Controls having the Unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Controls having the Unit.'"
	 * @generated
	 */
	EList<Control> getControls();

	/**
	 * Returns the value of the '<em><b>Protection Equipments</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Protection.ProtectionEquipment}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Protection.ProtectionEquipment#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Equipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Equipments</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getUnit_ProtectionEquipments()
	 * @see gluemodel.CIM.IEC61970.Protection.ProtectionEquipment#getUnit
	 * @model opposite="Unit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Protection Equipments having the Unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Protection Equipments having the Unit.'"
	 * @generated
	 */
	EList<ProtectionEquipment> getProtectionEquipments();

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getUnit_Measurements()
	 * @see gluemodel.CIM.IEC61970.Meas.Measurement#getUnit
	 * @model opposite="Unit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Measurements having the Unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Measurements having the Unit'"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

} // Unit
