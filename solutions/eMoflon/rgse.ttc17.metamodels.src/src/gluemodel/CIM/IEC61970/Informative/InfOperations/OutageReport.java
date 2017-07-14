/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.OutageHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageRecord <em>Outage Record</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getCustomerCount <em>Customer Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageHistory <em>Outage History</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageDuration <em>Outage Duration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getAverageCml <em>Average Cml</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getTotalCml <em>Total Cml</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageReport()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Document with statistics of an outage.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Document with statistics of an outage.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Document with statistics of an outage.' Profile\040documentation='Document with statistics of an outage.'"
 * @generated
 */
public interface OutageReport extends Document {
	/**
	 * Returns the value of the '<em><b>Outage Record</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageReport <em>Outage Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Record</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Record</em>' reference.
	 * @see #setOutageRecord(OutageRecord)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageReport_OutageRecord()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageReport
	 * @model opposite="OutageReport"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='reference to related document'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='reference to related document'"
	 * @generated
	 */
	OutageRecord getOutageRecord();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageRecord <em>Outage Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Record</em>' reference.
	 * @see #getOutageRecord()
	 * @generated
	 */
	void setOutageRecord(OutageRecord value);

	/**
	 * Returns the value of the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Count</em>' attribute.
	 * @see #setCustomerCount(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageReport_CustomerCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total number of outaged customers.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total number of outaged customers.'"
	 * @generated
	 */
	int getCustomerCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getCustomerCount <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Count</em>' attribute.
	 * @see #getCustomerCount()
	 * @generated
	 */
	void setCustomerCount(int value);

	/**
	 * Returns the value of the '<em><b>Outage History</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.OutageHistory#getOutageReports <em>Outage Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage History</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage History</em>' reference.
	 * @see #setOutageHistory(OutageHistory)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageReport_OutageHistory()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.OutageHistory#getOutageReports
	 * @model opposite="OutageReports"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='OutageHistory of a customer, which may include this OutageReport.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='OutageHistory of a customer, which may include this OutageReport.'"
	 * @generated
	 */
	OutageHistory getOutageHistory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageHistory <em>Outage History</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage History</em>' reference.
	 * @see #getOutageHistory()
	 * @generated
	 */
	void setOutageHistory(OutageHistory value);

	/**
	 * Returns the value of the '<em><b>Outage Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Duration</em>' attribute.
	 * @see #setOutageDuration(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageReport_OutageDuration()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total outage duration.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total outage duration.'"
	 * @generated
	 */
	float getOutageDuration();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageDuration <em>Outage Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Duration</em>' attribute.
	 * @see #getOutageDuration()
	 * @generated
	 */
	void setOutageDuration(float value);

	/**
	 * Returns the value of the '<em><b>Average Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Cml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Cml</em>' attribute.
	 * @see #setAverageCml(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageReport_AverageCml()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Average Customer Minutes Lost (CML) for this outage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Average Customer Minutes Lost (CML) for this outage.'"
	 * @generated
	 */
	float getAverageCml();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getAverageCml <em>Average Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Cml</em>' attribute.
	 * @see #getAverageCml()
	 * @generated
	 */
	void setAverageCml(float value);

	/**
	 * Returns the value of the '<em><b>Total Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cml</em>' attribute.
	 * @see #setTotalCml(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageReport_TotalCml()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total Customer Minutes Lost (CML).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total Customer Minutes Lost (CML).'"
	 * @generated
	 */
	float getTotalCml();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageReport#getTotalCml <em>Total Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cml</em>' attribute.
	 * @see #getTotalCml()
	 * @generated
	 */
	void setTotalCml(float value);

} // OutageReport
