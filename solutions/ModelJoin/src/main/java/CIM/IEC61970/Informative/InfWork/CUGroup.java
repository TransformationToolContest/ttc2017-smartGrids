/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CU Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUGroup#getChildCUGroups <em>Child CU Groups</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUGroup#getParentCUGroups <em>Parent CU Groups</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUGroup#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUGroup#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUGroup#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUGroup()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Compatible Unit Group identifies a set of compatible units which may be jointly utilized for estimating and designating jobs.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A Compatible Unit Group identifies a set of compatible units which may be jointly utilized for estimating and designating jobs.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Compatible Unit Group identifies a set of compatible units which may be jointly utilized for estimating and designating jobs.' Profile\040documentation='A Compatible Unit Group identifies a set of compatible units which may be jointly utilized for estimating and designating jobs.'"
 * @generated
 */
public interface CUGroup extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Child CU Groups</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CUGroup}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CUGroup#getParentCUGroups <em>Parent CU Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child CU Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child CU Groups</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUGroup_ChildCUGroups()
	 * @see CIM.IEC61970.Informative.InfWork.CUGroup#getParentCUGroups
	 * @model opposite="ParentCUGroups"
	 * @generated
	 */
	EList<CUGroup> getChildCUGroups();

	/**
	 * Returns the value of the '<em><b>Parent CU Groups</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CUGroup}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CUGroup#getChildCUGroups <em>Child CU Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent CU Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent CU Groups</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUGroup_ParentCUGroups()
	 * @see CIM.IEC61970.Informative.InfWork.CUGroup#getChildCUGroups
	 * @model opposite="ChildCUGroups"
	 * @generated
	 */
	EList<CUGroup> getParentCUGroups();

	/**
	 * Returns the value of the '<em><b>Design Location CUs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.DesignLocationCU}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCUGroups <em>CU Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location CUs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location CUs</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUGroup_DesignLocationCUs()
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCUGroups
	 * @model opposite="CUGroups"
	 * @generated
	 */
	EList<DesignLocationCU> getDesignLocationCUs();

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUGroup <em>CU Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUGroup_CompatibleUnits()
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUGroup
	 * @model opposite="CUGroup"
	 * @generated
	 */
	EList<CompatibleUnit> getCompatibleUnits();

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUGroup_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUGroup#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // CUGroup
