/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCommon;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

import gluemodel.CIM.IEC61970.Informative.InfWork.Capability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Craft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Craft#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Craft#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Craft#getSkills <em>Skills</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Craft#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Craft#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getCraft()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Craft of a person or a crew. Examples include overhead electric, underground electric, high pressure gas, etc. This ensures necessary knowledge and skills before being allowed to perform certain types of work.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Craft of a person or a crew. Examples include overhead electric, underground electric, high pressure gas, etc. This ensures necessary knowledge and skills before being allowed to perform certain types of work.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Craft of a person or a crew. Examples include overhead electric, underground electric, high pressure gas, etc. This ensures necessary knowledge and skills before being allowed to perform certain types of work.' Profile\040documentation='Craft of a person or a crew. Examples include overhead electric, underground electric, high pressure gas, etc. This ensures necessary knowledge and skills before being allowed to perform certain types of work.'"
 * @generated
 */
public interface Craft extends IdentifiedObject {
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
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getCraft_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Craft#getStatus <em>Status</em>}' reference.
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
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCrafts <em>Crafts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getCraft_ErpPersons()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCrafts
	 * @model opposite="Crafts"
	 * @generated
	 */
	EList<ErpPerson> getErpPersons();

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getCrafts <em>Crafts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getCraft_Skills()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.Skill#getCrafts
	 * @model opposite="Crafts"
	 * @generated
	 */
	EList<Skill> getSkills();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getCrafts <em>Crafts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getCraft_Capabilities()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getCrafts
	 * @model opposite="Crafts"
	 * @generated
	 */
	EList<Capability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getCraft_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category by utility\'s work mangement standards and practices.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category by utility\'s work mangement standards and practices.'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Craft#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

} // Craft
