/**
 */
package CIM.IEC61970.Core;

import CIM.IEC61970.Informative.InfAssets.ElectricalAsset;

import CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole;

import CIM.IEC61970.Outage.ClearanceTag;

import CIM.IEC61970.Protection.ProtectionEquipment;

import CIM.IEC61970.StateVariables.SvStatus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.ConductingEquipment#getProtectionEquipments <em>Protection Equipments</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.ConductingEquipment#getOutageStepRoles <em>Outage Step Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.ConductingEquipment#getClearanceTags <em>Clearance Tags</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.ConductingEquipment#getSvStatus <em>Sv Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.ConductingEquipment#getPhases <em>Phases</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.ConductingEquipment#getElectricalAssets <em>Electrical Assets</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.ConductingEquipment#getTerminals <em>Terminals</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Core.CorePackage#getConductingEquipment()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The parts of the power system that are designed to carry current or that are conductively connected therewith. ConductingEquipment is contained within an EquipmentContainer that may be a Substation, or a VoltageLevel or a Bay within a Substation.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The parts of the power system that are designed to carry current or that are conductively connected therewith. ConductingEquipment is contained within an EquipmentContainer that may be a Substation, or a VoltageLevel or a Bay within a Substation.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The parts of the power system that are designed to carry current or that are conductively connected therewith. ConductingEquipment is contained within an EquipmentContainer that may be a Substation, or a VoltageLevel or a Bay within a Substation.' Profile\040documentation='The parts of the power system that are designed to carry current or that are conductively connected therewith. ConductingEquipment is contained within an EquipmentContainer that may be a Substation, or a VoltageLevel or a Bay within a Substation.'"
 * @generated
 */
public interface ConductingEquipment extends Equipment {
	/**
	 * Returns the value of the '<em><b>Protection Equipments</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Protection.ProtectionEquipment}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Protection.ProtectionEquipment#getConductingEquipments <em>Conducting Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Equipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Equipments</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getConductingEquipment_ProtectionEquipments()
	 * @see CIM.IEC61970.Protection.ProtectionEquipment#getConductingEquipments
	 * @model opposite="ConductingEquipments"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Protection equipment may be used to protect specific Conducting Equipment. Multiple equipment may be protected or monitored by multiple protection equipment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Protection equipment may be used to protect specific Conducting Equipment. Multiple equipment may be protected or monitored by multiple protection equipment.'"
	 * @generated
	 */
	EList<ProtectionEquipment> getProtectionEquipments();

	/**
	 * Returns the value of the '<em><b>Outage Step Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Step Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Step Roles</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getConductingEquipment_OutageStepRoles()
	 * @see CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole#getConductingEquipment
	 * @model opposite="ConductingEquipment"
	 * @generated
	 */
	EList<OutageStepPsrRole> getOutageStepRoles();

	/**
	 * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Voltage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Voltage</em>' reference.
	 * @see #setBaseVoltage(BaseVoltage)
	 * @see CIM.IEC61970.Core.CorePackage#getConductingEquipment_BaseVoltage()
	 * @see CIM.IEC61970.Core.BaseVoltage#getConductingEquipment
	 * @model opposite="ConductingEquipment"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Use association to ConductingEquipment only when there is no VoltageLevel container used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Use association to ConductingEquipment only when there is no VoltageLevel container used.'"
	 * @generated
	 */
	BaseVoltage getBaseVoltage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Voltage</em>' reference.
	 * @see #getBaseVoltage()
	 * @generated
	 */
	void setBaseVoltage(BaseVoltage value);

	/**
	 * Returns the value of the '<em><b>Clearance Tags</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Outage.ClearanceTag}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Outage.ClearanceTag#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearance Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearance Tags</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getConductingEquipment_ClearanceTags()
	 * @see CIM.IEC61970.Outage.ClearanceTag#getConductingEquipment
	 * @model opposite="ConductingEquipment"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Conducting equipment may have multiple clearance tags for authorized field work'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Conducting equipment may have multiple clearance tags for authorized field work'"
	 * @generated
	 */
	EList<ClearanceTag> getClearanceTags();

	/**
	 * Returns the value of the '<em><b>Sv Status</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.StateVariables.SvStatus#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv Status</em>' reference.
	 * @see #setSvStatus(SvStatus)
	 * @see CIM.IEC61970.Core.CorePackage#getConductingEquipment_SvStatus()
	 * @see CIM.IEC61970.StateVariables.SvStatus#getConductingEquipment
	 * @model opposite="ConductingEquipment"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The status state associated with the conducting equipment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The status state associated with the conducting equipment.'"
	 * @generated
	 */
	SvStatus getSvStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.ConductingEquipment#getSvStatus <em>Sv Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv Status</em>' reference.
	 * @see #getSvStatus()
	 * @generated
	 */
	void setSvStatus(SvStatus value);

	/**
	 * Returns the value of the '<em><b>Phases</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' attribute.
	 * @see CIM.IEC61970.Core.PhaseCode
	 * @see #setPhases(PhaseCode)
	 * @see CIM.IEC61970.Core.CorePackage#getConductingEquipment_Phases()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Describes the phases carried by a conducting equipment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Describes the phases carried by a conducting equipment.'"
	 * @generated
	 */
	PhaseCode getPhases();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.ConductingEquipment#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see CIM.IEC61970.Core.PhaseCode
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(PhaseCode value);

	/**
	 * Returns the value of the '<em><b>Electrical Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.ElectricalAsset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electrical Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Assets</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getConductingEquipment_ElectricalAssets()
	 * @see CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getConductingEquipment
	 * @model opposite="ConductingEquipment"
	 * @generated
	 */
	EList<ElectricalAsset> getElectricalAssets();

	/**
	 * Returns the value of the '<em><b>Terminals</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.Terminal}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.Terminal#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminals</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getConductingEquipment_Terminals()
	 * @see CIM.IEC61970.Core.Terminal#getConductingEquipment
	 * @model opposite="ConductingEquipment"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes'"
	 * @generated
	 */
	EList<Terminal> getTerminals();

} // ConductingEquipment
