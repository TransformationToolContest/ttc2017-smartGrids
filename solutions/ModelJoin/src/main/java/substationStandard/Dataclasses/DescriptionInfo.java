/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.DescriptionInfo#getDPL <em>DPL</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.DescriptionInfo#getLPL <em>LPL</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.DescriptionInfo#getCSD <em>CSD</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.DescriptionInfo#getC_PrimitiveCDC <em>CPrimitive CDC</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getDescriptionInfo()
 * @model
 * @generated
 */
public interface DescriptionInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>DPL</b></em>' reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.DPL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DPL</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DPL</em>' reference list.
	 * @see substationStandard.Dataclasses.DataclassesPackage#getDescriptionInfo_DPL()
	 * @model required="true"
	 * @generated
	 */
	EList<DPL> getDPL();

	/**
	 * Returns the value of the '<em><b>LPL</b></em>' reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.LPL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LPL</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LPL</em>' reference list.
	 * @see substationStandard.Dataclasses.DataclassesPackage#getDescriptionInfo_LPL()
	 * @model required="true"
	 * @generated
	 */
	EList<LPL> getLPL();

	/**
	 * Returns the value of the '<em><b>CSD</b></em>' reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.CSD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSD</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSD</em>' reference list.
	 * @see substationStandard.Dataclasses.DataclassesPackage#getDescriptionInfo_CSD()
	 * @model required="true"
	 * @generated
	 */
	EList<CSD> getCSD();

	/**
	 * Returns the value of the '<em><b>CPrimitive CDC</b></em>' reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.C_PrimitiveCDC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPrimitive CDC</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPrimitive CDC</em>' reference list.
	 * @see substationStandard.Dataclasses.DataclassesPackage#getDescriptionInfo_C_PrimitiveCDC()
	 * @model required="true"
	 * @generated
	 */
	EList<C_PrimitiveCDC> getC_PrimitiveCDC();

} // DescriptionInfo
