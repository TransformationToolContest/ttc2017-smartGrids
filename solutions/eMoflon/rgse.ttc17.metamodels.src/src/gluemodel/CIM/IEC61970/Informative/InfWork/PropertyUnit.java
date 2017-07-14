/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getPropertyAccount <em>Property Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getCUMaterialItems <em>CU Material Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getAccountingUsage <em>Accounting Usage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getActivityCode <em>Activity Code</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getPropertyUnit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unit of property for reporting purposes.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Unit of property for reporting purposes.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unit of property for reporting purposes.' Profile\040documentation='Unit of property for reporting purposes.'"
 * @generated
 */
public interface PropertyUnit extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getPropertyUnits <em>Property Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getPropertyUnit_WorkCostDetails()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getPropertyUnits
	 * @model opposite="PropertyUnits"
	 * @generated
	 */
	EList<WorkCostDetail> getWorkCostDetails();

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getPropertyUnit_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getPropertyUnit <em>Property Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getPropertyUnit_CompatibleUnits()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit#getPropertyUnit
	 * @model opposite="PropertyUnit"
	 * @generated
	 */
	EList<CompatibleUnit> getCompatibleUnits();

	/**
	 * Returns the value of the '<em><b>Property Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Account</em>' attribute.
	 * @see #setPropertyAccount(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getPropertyUnit_PropertyAccount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used for property record accounting. For example, in the USA, this would be a FERC account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used for property record accounting. For example, in the USA, this would be a FERC account.'"
	 * @generated
	 */
	String getPropertyAccount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getPropertyAccount <em>Property Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Account</em>' attribute.
	 * @see #getPropertyAccount()
	 * @generated
	 */
	void setPropertyAccount(String value);

	/**
	 * Returns the value of the '<em><b>CU Material Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.CUMaterialItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CUMaterialItem#getPropertyUnits <em>Property Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Material Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getPropertyUnit_CUMaterialItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CUMaterialItem#getPropertyUnits
	 * @model opposite="PropertyUnits"
	 * @generated
	 */
	EList<CUMaterialItem> getCUMaterialItems();

	/**
	 * Returns the value of the '<em><b>Accounting Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounting Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounting Usage</em>' attribute.
	 * @see #setAccountingUsage(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getPropertyUnit_AccountingUsage()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A code that identifies appropriate type of property accounts such as distribution, streetlgihts, communications.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A code that identifies appropriate type of property accounts such as distribution, streetlgihts, communications.'"
	 * @generated
	 */
	String getAccountingUsage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getAccountingUsage <em>Accounting Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Usage</em>' attribute.
	 * @see #getAccountingUsage()
	 * @generated
	 */
	void setAccountingUsage(String value);

	/**
	 * Returns the value of the '<em><b>Activity Code</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkActionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Code</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkActionKind
	 * @see #setActivityCode(WorkActionKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getPropertyUnit_ActivityCode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Activity code identifies a specific and distinguishable work action.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Activity code identifies a specific and distinguishable work action.'"
	 * @generated
	 */
	WorkActionKind getActivityCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getActivityCode <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Code</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkActionKind
	 * @see #getActivityCode()
	 * @generated
	 */
	void setActivityCode(WorkActionKind value);

} // PropertyUnit
