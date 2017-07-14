/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Personnel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPersonnel#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPersonnel#getErpPersons <em>Erp Persons</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPersonnel()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information that applies to the basic data about a utility person, used by ERP applications to transfer Personnel data for a worker.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Information that applies to the basic data about a utility person, used by ERP applications to transfer Personnel data for a worker.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information that applies to the basic data about a utility person, used by ERP applications to transfer Personnel data for a worker.' Profile\040documentation='Information that applies to the basic data about a utility person, used by ERP applications to transfer Personnel data for a worker.'"
 * @generated
 */
public interface ErpPersonnel extends IdentifiedObject {
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
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPersonnel_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPersonnel#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Erp Persons</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpPersonnel <em>Erp Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPersonnel_ErpPersons()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getErpPersonnel
	 * @model opposite="ErpPersonnel"
	 * @generated
	 */
	EList<ErpPerson> getErpPersons();

} // ErpPersonnel
