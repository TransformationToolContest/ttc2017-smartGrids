/**
 */
package CIM.IEC61970.Core;

import CIM.IEC61970.Topology.TopologicalNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.BaseVoltage#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.BaseVoltage#isIsDC <em>Is DC</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Core.CorePackage#getBaseVoltage()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Defines a nominal base voltage which is referenced in the system.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Defines a nominal base voltage which is referenced in the system.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Defines a nominal base voltage which is referenced in the system.' Profile\040documentation='Defines a nominal base voltage which is referenced in the system.'"
 * @generated
 */
public interface BaseVoltage extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Voltage</em>' attribute.
	 * @see #setNominalVoltage(float)
	 * @see CIM.IEC61970.Core.CorePackage#getBaseVoltage_NominalVoltage()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The PowerSystemResource\'s base voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The PowerSystemResource\'s base voltage.'"
	 * @generated
	 */
	float getNominalVoltage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Voltage</em>' attribute.
	 * @see #getNominalVoltage()
	 * @generated
	 */
	void setNominalVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Topology.TopologicalNode}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Topology.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getBaseVoltage_TopologicalNode()
	 * @see CIM.IEC61970.Topology.TopologicalNode#getBaseVoltage
	 * @model opposite="BaseVoltage"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The topological nodes at the base voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The topological nodes at the base voltage.'"
	 * @generated
	 */
	EList<TopologicalNode> getTopologicalNode();

	/**
	 * Returns the value of the '<em><b>Voltage Level</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.VoltageLevel}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Level</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Level</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getBaseVoltage_VoltageLevel()
	 * @see CIM.IEC61970.Core.VoltageLevel#getBaseVoltage
	 * @model opposite="BaseVoltage"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The VoltageLevels having this BaseVoltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The VoltageLevels having this BaseVoltage.'"
	 * @generated
	 */
	EList<VoltageLevel> getVoltageLevel();

	/**
	 * Returns the value of the '<em><b>Is DC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is DC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is DC</em>' attribute.
	 * @see #setIsDC(boolean)
	 * @see CIM.IEC61970.Core.CorePackage#getBaseVoltage_IsDC()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='If true, this is a direct current base voltage and items assigned to this base voltage are also associated with a direct current capabilities.   False indicates alternating current.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If true, this is a direct current base voltage and items assigned to this base voltage are also associated with a direct current capabilities.   False indicates alternating current.'"
	 * @generated
	 */
	boolean isIsDC();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.BaseVoltage#isIsDC <em>Is DC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is DC</em>' attribute.
	 * @see #isIsDC()
	 * @generated
	 */
	void setIsDC(boolean value);

	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.ConductingEquipment}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' reference list.
	 * @see CIM.IEC61970.Core.CorePackage#getBaseVoltage_ConductingEquipment()
	 * @see CIM.IEC61970.Core.ConductingEquipment#getBaseVoltage
	 * @model opposite="BaseVoltage"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Use association to ConductingEquipment only when there is no VoltageLevel container used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Use association to ConductingEquipment only when there is no VoltageLevel container used.'"
	 * @generated
	 */
	EList<ConductingEquipment> getConductingEquipment();

} // BaseVoltage
