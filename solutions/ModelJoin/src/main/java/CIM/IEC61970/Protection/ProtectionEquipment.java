/**
 */
package CIM.IEC61970.Protection;

import CIM.IEC61970.Core.ConductingEquipment;
import CIM.IEC61970.Core.Equipment;
import CIM.IEC61970.Core.Unit;

import CIM.IEC61970.Wires.ProtectedSwitch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Protection.ProtectionEquipment#getConductingEquipments <em>Conducting Equipments</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.ProtectionEquipment#getHighLimit <em>High Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.ProtectionEquipment#getUnit <em>Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.ProtectionEquipment#getRelayDelayTime <em>Relay Delay Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.ProtectionEquipment#getProtectedSwitches <em>Protected Switches</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.ProtectionEquipment#isPowerDirectionFlag <em>Power Direction Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.ProtectionEquipment#getLowLimit <em>Low Limit</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Protection.ProtectionPackage#getProtectionEquipment()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An electrical device designed to respond to input conditions in a prescribed manner and after specified conditions are met to cause contact operation or similar abrupt change in associated electric control circuits, or simply to display the detected condition. Protection equipment are associated with conducting equipment and usually operate circuit breakers.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An electrical device designed to respond to input conditions in a prescribed manner and after specified conditions are met to cause contact operation or similar abrupt change in associated electric control circuits, or simply to display the detected condition. Protection equipment are associated with conducting equipment and usually operate circuit breakers.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An electrical device designed to respond to input conditions in a prescribed manner and after specified conditions are met to cause contact operation or similar abrupt change in associated electric control circuits, or simply to display the detected condition. Protection equipment are associated with conducting equipment and usually operate circuit breakers.' Profile\040documentation='An electrical device designed to respond to input conditions in a prescribed manner and after specified conditions are met to cause contact operation or similar abrupt change in associated electric control circuits, or simply to display the detected condition. Protection equipment are associated with conducting equipment and usually operate circuit breakers.'"
 * @generated
 */
public interface ProtectionEquipment extends Equipment {
	/**
	 * Returns the value of the '<em><b>Conducting Equipments</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.ConductingEquipment}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.ConductingEquipment#getProtectionEquipments <em>Protection Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipments</em>' reference list.
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getProtectionEquipment_ConductingEquipments()
	 * @see CIM.IEC61970.Core.ConductingEquipment#getProtectionEquipments
	 * @model opposite="ProtectionEquipments"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Protection equipment may be used to protect specific Conducting Equipment. Multiple equipment may be protected or monitored by multiple protection equipment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Protection equipment may be used to protect specific Conducting Equipment. Multiple equipment may be protected or monitored by multiple protection equipment.'"
	 * @generated
	 */
	EList<ConductingEquipment> getConductingEquipments();

	/**
	 * Returns the value of the '<em><b>High Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Limit</em>' attribute.
	 * @see #setHighLimit(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getProtectionEquipment_HighLimit()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum allowable value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum allowable value.'"
	 * @generated
	 */
	float getHighLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.ProtectionEquipment#getHighLimit <em>High Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Limit</em>' attribute.
	 * @see #getHighLimit()
	 * @generated
	 */
	void setHighLimit(float value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.Unit#getProtectionEquipments <em>Protection Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getProtectionEquipment_Unit()
	 * @see CIM.IEC61970.Core.Unit#getProtectionEquipments
	 * @model opposite="ProtectionEquipments"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Unit for the Protection Equipment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Unit for the Protection Equipment.'"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.ProtectionEquipment#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Relay Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relay Delay Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relay Delay Time</em>' attribute.
	 * @see #setRelayDelayTime(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getProtectionEquipment_RelayDelayTime()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The time delay from detection of abnormal conditions to relay operation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time delay from detection of abnormal conditions to relay operation.'"
	 * @generated
	 */
	float getRelayDelayTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.ProtectionEquipment#getRelayDelayTime <em>Relay Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relay Delay Time</em>' attribute.
	 * @see #getRelayDelayTime()
	 * @generated
	 */
	void setRelayDelayTime(float value);

	/**
	 * Returns the value of the '<em><b>Protected Switches</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.ProtectedSwitch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected Switches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected Switches</em>' reference list.
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getProtectionEquipment_ProtectedSwitches()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Protected switches operated by this ProtectionEquipment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Protected switches operated by this ProtectionEquipment.'"
	 * @generated
	 */
	EList<ProtectedSwitch> getProtectedSwitches();

	/**
	 * Returns the value of the '<em><b>Power Direction Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Direction Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Direction Flag</em>' attribute.
	 * @see #setPowerDirectionFlag(boolean)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getProtectionEquipment_PowerDirectionFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Direction same as positive active power flow value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Direction same as positive active power flow value.'"
	 * @generated
	 */
	boolean isPowerDirectionFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.ProtectionEquipment#isPowerDirectionFlag <em>Power Direction Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Direction Flag</em>' attribute.
	 * @see #isPowerDirectionFlag()
	 * @generated
	 */
	void setPowerDirectionFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Low Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Limit</em>' attribute.
	 * @see #setLowLimit(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getProtectionEquipment_LowLimit()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum allowable value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum allowable value.'"
	 * @generated
	 */
	float getLowLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.ProtectionEquipment#getLowLimit <em>Low Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Limit</em>' attribute.
	 * @see #getLowLimit()
	 * @generated
	 */
	void setLowLimit(float value);

} // ProtectionEquipment
