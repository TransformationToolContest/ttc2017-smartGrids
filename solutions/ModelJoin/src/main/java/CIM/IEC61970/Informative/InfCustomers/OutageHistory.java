/**
 */
package CIM.IEC61970.Informative.InfCustomers;

import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Informative.InfOperations.OutageReport;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.OutageHistory#getOutageReports <em>Outage Reports</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getOutageHistory()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A document collecting OutageReports, that allows utilities to examine the number of outages suffered by a customer. Also provides data to calculate the total supply interruption to any customer over a given period.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A document collecting OutageReports, that allows utilities to examine the number of outages suffered by a customer. Also provides data to calculate the total supply interruption to any customer over a given period.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A document collecting OutageReports, that allows utilities to examine the number of outages suffered by a customer. Also provides data to calculate the total supply interruption to any customer over a given period.' Profile\040documentation='A document collecting OutageReports, that allows utilities to examine the number of outages suffered by a customer. Also provides data to calculate the total supply interruption to any customer over a given period.'"
 * @generated
 */
public interface OutageHistory extends Document {
	/**
	 * Returns the value of the '<em><b>Outage Reports</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.OutageReport}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageHistory <em>Outage History</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Reports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Reports</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getOutageHistory_OutageReports()
	 * @see CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageHistory
	 * @model opposite="OutageHistory"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='OutageReports per customer for which this OutageHistory is created.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='OutageReports per customer for which this OutageHistory is created.'"
	 * @generated
	 */
	EList<OutageReport> getOutageReports();

} // OutageHistory
