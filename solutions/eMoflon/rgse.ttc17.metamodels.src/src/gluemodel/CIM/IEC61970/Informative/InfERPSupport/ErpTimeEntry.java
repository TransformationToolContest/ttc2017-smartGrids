/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Time Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpProjectAccounting <em>Erp Project Accounting</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpTimeSheet <em>Erp Time Sheet</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpTimeEntry()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An individual entry on an ErpTimeSheet.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An individual entry on an ErpTimeSheet.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An individual entry on an ErpTimeSheet.' Profile\040documentation='An individual entry on an ErpTimeSheet.'"
 * @generated
 */
public interface ErpTimeEntry extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Erp Project Accounting</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getErpTimeEntries <em>Erp Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Project Accounting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #setErpProjectAccounting(ErpProjectAccounting)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpTimeEntry_ErpProjectAccounting()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getErpTimeEntries
	 * @model opposite="ErpTimeEntries"
	 * @generated
	 */
	ErpProjectAccounting getErpProjectAccounting();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpProjectAccounting <em>Erp Project Accounting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	void setErpProjectAccounting(ErpProjectAccounting value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpTimeEntry_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Erp Time Sheet</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeSheet#getErpTimeEntries <em>Erp Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Time Sheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Time Sheet</em>' reference.
	 * @see #setErpTimeSheet(ErpTimeSheet)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpTimeEntry_ErpTimeSheet()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeSheet#getErpTimeEntries
	 * @model opposite="ErpTimeEntries"
	 * @generated
	 */
	ErpTimeSheet getErpTimeSheet();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpTimeSheet <em>Erp Time Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Time Sheet</em>' reference.
	 * @see #getErpTimeSheet()
	 * @generated
	 */
	void setErpTimeSheet(ErpTimeSheet value);

} // ErpTimeEntry
