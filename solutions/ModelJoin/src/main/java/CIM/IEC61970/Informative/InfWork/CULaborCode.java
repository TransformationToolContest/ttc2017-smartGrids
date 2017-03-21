/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CU Labor Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CULaborCode#getCode <em>Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CULaborCode#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CULaborCode#getCULaborItems <em>CU Labor Items</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborCode()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Labor code associated with various compatible unit labor items.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Labor code associated with various compatible unit labor items.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Labor code associated with various compatible unit labor items.' Profile\040documentation='Labor code associated with various compatible unit labor items.'"
 * @generated
 */
public interface CULaborCode extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborCode_Code()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Labor code.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Labor code.'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CULaborCode#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborCode_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CULaborCode#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>CU Labor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CULaborItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CULaborItem#getCULaborCode <em>CU Labor Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Labor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Labor Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborCode_CULaborItems()
	 * @see CIM.IEC61970.Informative.InfWork.CULaborItem#getCULaborCode
	 * @model opposite="CULaborCode"
	 * @generated
	 */
	EList<CULaborItem> getCULaborItems();

} // CULaborCode
