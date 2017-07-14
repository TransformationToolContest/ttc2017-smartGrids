/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61968.Work.Work;

import gluemodel.CIM.IEC61970.Informative.InfWork.Project;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Project Accounting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getProjects <em>Projects</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getErpTimeEntries <em>Erp Time Entries</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorks <em>Works</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpProjectAccounting()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Utility Project Accounting information, used by ERP applications to enable all relevant sub-systems that submit single sided transactions to transfer information with a Project Accounting Application. This would include, but not necessarily be limited to: Accounts Payable, Accounts Receivable, Budget, Order Management, Purchasing, Time and Labor, Travel and Expense.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Utility Project Accounting information, used by ERP applications to enable all relevant sub-systems that submit single sided transactions to transfer information with a Project Accounting Application. This would include, but not necessarily be limited to: Accounts Payable, Accounts Receivable, Budget, Order Management, Purchasing, Time and Labor, Travel and Expense.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Utility Project Accounting information, used by ERP applications to enable all relevant sub-systems that submit single sided transactions to transfer information with a Project Accounting Application. This would include, but not necessarily be limited to: Accounts Payable, Accounts Receivable, Budget, Order Management, Purchasing, Time and Labor, Travel and Expense.' Profile\040documentation='Utility Project Accounting information, used by ERP applications to enable all relevant sub-systems that submit single sided transactions to transfer information with a Project Accounting Application. This would include, but not necessarily be limited to: Accounts Payable, Accounts Receivable, Budget, Order Management, Purchasing, Time and Labor, Travel and Expense.'"
 * @generated
 */
public interface ErpProjectAccounting extends Document {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.Project}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpProjectAccounting_Projects()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Project#getErpProjectAccounting
	 * @model opposite="ErpProjectAccounting"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpProjectAccounting_WorkCostDetails()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getErpProjectAccounting
	 * @model opposite="ErpProjectAccounting"
	 * @generated
	 */
	EList<WorkCostDetail> getWorkCostDetails();

	/**
	 * Returns the value of the '<em><b>Erp Time Entries</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Time Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Time Entries</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpProjectAccounting_ErpTimeEntries()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpProjectAccounting
	 * @model opposite="ErpProjectAccounting"
	 * @generated
	 */
	EList<ErpTimeEntry> getErpTimeEntries();

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Work.Work#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpProjectAccounting_Works()
	 * @see gluemodel.CIM.IEC61968.Work.Work#getErpProjectAccounting
	 * @model opposite="ErpProjectAccounting"
	 * @generated
	 */
	EList<Work> getWorks();

} // ErpProjectAccounting
