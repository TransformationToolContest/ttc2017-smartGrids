/**
 */
package CIM.IEC61970.Contingency;

import CIM.IEC61970.Core.Equipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Contingency.ContingencyEquipment#getEquipment <em>Equipment</em>}</li>
 *   <li>{@link CIM.IEC61970.Contingency.ContingencyEquipment#getContingentStatus <em>Contingent Status</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Contingency.ContingencyPackage#getContingencyEquipment()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A equipment to which the in service status is to change such as a power transformer or AC line segment.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A equipment to which the in service status is to change such as a power transformer or AC line segment.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A equipment to which the in service status is to change such as a power transformer or AC line segment.' Profile\040documentation='A equipment to which the in service status is to change such as a power transformer or AC line segment.'"
 * @generated
 */
public interface ContingencyEquipment extends ContingencyElement {
	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.Equipment#getContingencyEquipment <em>Contingency Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' reference.
	 * @see #setEquipment(Equipment)
	 * @see CIM.IEC61970.Contingency.ContingencyPackage#getContingencyEquipment_Equipment()
	 * @see CIM.IEC61970.Core.Equipment#getContingencyEquipment
	 * @model opposite="ContingencyEquipment"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The single piece of equipment to which to apply the contingency.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The single piece of equipment to which to apply the contingency.'"
	 * @generated
	 */
	Equipment getEquipment();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Contingency.ContingencyEquipment#getEquipment <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment</em>' reference.
	 * @see #getEquipment()
	 * @generated
	 */
	void setEquipment(Equipment value);

	/**
	 * Returns the value of the '<em><b>Contingent Status</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Contingency.ContingencyEquipmentStatusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contingent Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingent Status</em>' attribute.
	 * @see CIM.IEC61970.Contingency.ContingencyEquipmentStatusKind
	 * @see #setContingentStatus(ContingencyEquipmentStatusKind)
	 * @see CIM.IEC61970.Contingency.ContingencyPackage#getContingencyEquipment_ContingentStatus()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The status for the associated equipment when in the contingency state.   This status is independent of the case to which the contingency is originally applied, but defines the equipment status when the contingency is applied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The status for the associated equipment when in the contingency state.   This status is independent of the case to which the contingency is originally applied, but defines the equipment status when the contingency is applied.'"
	 * @generated
	 */
	ContingencyEquipmentStatusKind getContingentStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Contingency.ContingencyEquipment#getContingentStatus <em>Contingent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contingent Status</em>' attribute.
	 * @see CIM.IEC61970.Contingency.ContingencyEquipmentStatusKind
	 * @see #getContingentStatus()
	 * @generated
	 */
	void setContingentStatus(ContingencyEquipmentStatusKind value);

} // ContingencyEquipment
