/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controllable Analogue Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.ControllableAnalogueInfo#getAPC <em>APC</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.ControllableAnalogueInfo#getC_PrimitiveCDC <em>CPrimitive CDC</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableAnalogueInfo()
 * @model
 * @generated
 */
public interface ControllableAnalogueInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>APC</b></em>' reference list.
	 * The list contents are of type {@link substationStandard.Dataclasses.APC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APC</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APC</em>' reference list.
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableAnalogueInfo_APC()
	 * @model required="true"
	 * @generated
	 */
	EList<APC> getAPC();

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#getControllableAnalogueInfo_C_PrimitiveCDC()
	 * @model required="true"
	 * @generated
	 */
	EList<C_PrimitiveCDC> getC_PrimitiveCDC();

} // ControllableAnalogueInfo
