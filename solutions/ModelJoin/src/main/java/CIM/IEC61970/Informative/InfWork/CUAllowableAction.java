/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CU Allowable Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUAllowableAction#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CUAllowableAction#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUAllowableAction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Allowed actions: Install, Remove, Transfer, Abandon, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Allowed actions: Install, Remove, Transfer, Abandon, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Allowed actions: Install, Remove, Transfer, Abandon, etc.' Profile\040documentation='Allowed actions: Install, Remove, Transfer, Abandon, etc.'"
 * @generated
 */
public interface CUAllowableAction extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUAllowableAction <em>CU Allowable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUAllowableAction_CompatibleUnits()
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCUAllowableAction
	 * @model opposite="CUAllowableAction"
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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCUAllowableAction_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CUAllowableAction#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // CUAllowableAction
