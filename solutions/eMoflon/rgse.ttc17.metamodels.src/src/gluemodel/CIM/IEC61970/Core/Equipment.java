/**
 */
package gluemodel.CIM.IEC61970.Core;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;

import gluemodel.CIM.IEC61970.Contingency.ContingencyEquipment;

import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet;

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
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Equipment#getContingencyEquipment <em>Contingency Equipment</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Equipment#isNormaIlyInService <em>Norma Ily In Service</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Equipment#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Equipment#isAggregate <em>Aggregate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Equipment#getEquipmentContainer <em>Equipment Container</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getEquipment()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The parts of a power system that are physical devices, electronic or mechanical'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The parts of a power system that are physical devices, electronic or mechanical'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The parts of a power system that are physical devices, electronic or mechanical' Profile\040documentation='The parts of a power system that are physical devices, electronic or mechanical'"
 * @generated
 */
public interface Equipment extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Operational Limit Set</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit Set</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getEquipment_OperationalLimitSet()
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getEquipment
	 * @model opposite="Equipment"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The equipment limit sets associated with the equipment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equipment limit sets associated with the equipment.'"
	 * @generated
	 */
	EList<OperationalLimitSet> getOperationalLimitSet();

	/**
	 * Returns the value of the '<em><b>Contingency Equipment</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Contingency.ContingencyEquipment}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Contingency.ContingencyEquipment#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contingency Equipment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingency Equipment</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getEquipment_ContingencyEquipment()
	 * @see gluemodel.CIM.IEC61970.Contingency.ContingencyEquipment#getEquipment
	 * @model opposite="Equipment"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The contingency element associated with the equipment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The contingency element associated with the equipment.'"
	 * @generated
	 */
	EList<ContingencyEquipment> getContingencyEquipment();

	/**
	 * Returns the value of the '<em><b>Norma Ily In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Norma Ily In Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Norma Ily In Service</em>' attribute.
	 * @see #setNormaIlyInService(boolean)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getEquipment_NormaIlyInService()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The equipment is normally in service.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equipment is normally in service.'"
	 * @generated
	 */
	boolean isNormaIlyInService();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Equipment#isNormaIlyInService <em>Norma Ily In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Norma Ily In Service</em>' attribute.
	 * @see #isNormaIlyInService()
	 * @generated
	 */
	void setNormaIlyInService(boolean value);

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getEquipments <em>Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getEquipment_CustomerAgreements()
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getEquipments
	 * @model opposite="Equipments"
	 * @generated
	 */
	EList<CustomerAgreement> getCustomerAgreements();

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' attribute.
	 * @see #setAggregate(boolean)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getEquipment_Aggregate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The single instance of equipment represents multiple pieces of equipment that have been modeled together as an aggregate.  Examples would be PowerTransformers or SychronousMachines operating in parallel modeled as a single aggregate PowerTransformer or aggregate SynchronousMachine.  This is not to be used to indicate equipment that is part of a group of interdependent equipment produced by a network production program.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The single instance of equipment represents multiple pieces of equipment that have been modeled together as an aggregate.  Examples would be PowerTransformers or SychronousMachines operating in parallel modeled as a single aggregate PowerTransformer or aggregate SynchronousMachine.  This is not to be used to indicate equipment that is part of a group of interdependent equipment produced by a network production program.'"
	 * @generated
	 */
	boolean isAggregate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Equipment#isAggregate <em>Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' attribute.
	 * @see #isAggregate()
	 * @generated
	 */
	void setAggregate(boolean value);

	/**
	 * Returns the value of the '<em><b>Equipment Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.EquipmentContainer#getEquipments <em>Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment Container</em>' reference.
	 * @see #setEquipmentContainer(EquipmentContainer)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getEquipment_EquipmentContainer()
	 * @see gluemodel.CIM.IEC61970.Core.EquipmentContainer#getEquipments
	 * @model opposite="Equipments"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	EquipmentContainer getEquipmentContainer();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Equipment#getEquipmentContainer <em>Equipment Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment Container</em>' reference.
	 * @see #getEquipmentContainer()
	 * @generated
	 */
	void setEquipmentContainer(EquipmentContainer value);

} // Equipment
