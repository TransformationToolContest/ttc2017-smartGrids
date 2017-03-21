/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61968.Common.Document;

import CIM.IEC61968.Customers.Customer;

import CIM.IEC61970.Outage.OutageSchedule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planned Outage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.PlannedOutage#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.PlannedOutage#getCustomerDatas <em>Customer Datas</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.PlannedOutage#getOutageSchedules <em>Outage Schedules</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getPlannedOutage()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Planned outage involves network operations which will affect the supply of power to customers. Note that the list of Power System Resources for the PlannedOutage may be the same or a superset of the ones per OutageStep.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Planned outage involves network operations which will affect the supply of power to customers. Note that the list of Power System Resources for the PlannedOutage may be the same or a superset of the ones per OutageStep.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Planned outage involves network operations which will affect the supply of power to customers. Note that the list of Power System Resources for the PlannedOutage may be the same or a superset of the ones per OutageStep.' Profile\040documentation='Planned outage involves network operations which will affect the supply of power to customers. Note that the list of Power System Resources for the PlannedOutage may be the same or a superset of the ones per OutageStep.'"
 * @generated
 */
public interface PlannedOutage extends Document {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfOperations.OutageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfOperations.OutageKind
	 * @see #setKind(OutageKind)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getPlannedOutage_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of outage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of outage.'"
	 * @generated
	 */
	OutageKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.PlannedOutage#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfOperations.OutageKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(OutageKind value);

	/**
	 * Returns the value of the '<em><b>Customer Datas</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Customers.Customer}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.Customer#getPlannedOutage <em>Planned Outage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Datas</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getPlannedOutage_CustomerDatas()
	 * @see CIM.IEC61968.Customers.Customer#getPlannedOutage
	 * @model opposite="PlannedOutage"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All customers affected by this work. Derived from WorkOrder.connectedCustomers'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All customers affected by this work. Derived from WorkOrder.connectedCustomers'"
	 * @generated
	 */
	EList<Customer> getCustomerDatas();

	/**
	 * Returns the value of the '<em><b>Outage Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Outage.OutageSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Outage.OutageSchedule#getPlannedOutage <em>Planned Outage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Schedules</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getPlannedOutage_OutageSchedules()
	 * @see CIM.IEC61970.Outage.OutageSchedule#getPlannedOutage
	 * @model opposite="PlannedOutage"
	 * @generated
	 */
	EList<OutageSchedule> getOutageSchedules();

} // PlannedOutage
