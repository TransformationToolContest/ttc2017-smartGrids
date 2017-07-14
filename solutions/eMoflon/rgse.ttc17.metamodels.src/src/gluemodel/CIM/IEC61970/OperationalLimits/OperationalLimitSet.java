/**
 */
package gluemodel.CIM.IEC61970.OperationalLimits;

import gluemodel.CIM.IEC61970.Core.Equipment;
import gluemodel.CIM.IEC61970.Core.IdentifiedObject;
import gluemodel.CIM.IEC61970.Core.Terminal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitSet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A set of limits associated with equipmnet.  Sets of limits might apply to a specific temperature, or season for example. A set of limits may contain may different severities of limit levels that would apply to the same equipment.   The set may contain limits of different types such as apparent power and current limits or high and low voltage limits  that are logically applied together as a set.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A set of limits associated with equipmnet.  Sets of limits might apply to a specific temperature, or season for example. A set of limits may contain may different severities of limit levels that would apply to the same equipment.   The set may contain limits of different types such as apparent power and current limits or high and low voltage limits  that are logically applied together as a set.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A set of limits associated with equipmnet.  Sets of limits might apply to a specific temperature, or season for example. A set of limits may contain may different severities of limit levels that would apply to the same equipment.   The set may contain limits of different types such as apparent power and current limits or high and low voltage limits  that are logically applied together as a set.' Profile\040documentation='A set of limits associated with equipmnet.  Sets of limits might apply to a specific temperature, or season for example. A set of limits may contain may different severities of limit levels that would apply to the same equipment.   The set may contain limits of different types such as apparent power and current limits or high and low voltage limits  that are logically applied together as a set.'"
 * @generated
 */
public interface OperationalLimitSet extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Operational Limit Value</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit Value</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitSet_OperationalLimitValue()
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitSet
	 * @model opposite="OperationalLimitSet"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Values of equipment limits.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Values of equipment limits.'"
	 * @generated
	 */
	EList<OperationalLimit> getOperationalLimitValue();

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Terminal#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitSet_Terminal()
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getOperationalLimitSet
	 * @model opposite="OperationalLimitSet"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The terminal specifically associated to this operational limit set.  If no terminal is associated, all terminals of the equipment are implied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The terminal specifically associated to this operational limit set.  If no terminal is associated, all terminals of the equipment are implied.'"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' reference.
	 * @see #setEquipment(Equipment)
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitSet_Equipment()
	 * @see gluemodel.CIM.IEC61970.Core.Equipment#getOperationalLimitSet
	 * @model opposite="OperationalLimitSet"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The equpment to which the limit set applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equpment to which the limit set applies.'"
	 * @generated
	 */
	Equipment getEquipment();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getEquipment <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment</em>' reference.
	 * @see #getEquipment()
	 * @generated
	 */
	void setEquipment(Equipment value);

} // OperationalLimitSet
