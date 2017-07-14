/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.VectorArray#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getVectorArray()
 * @model
 * @generated
 */
public interface VectorArray extends EObject {
	/**
	 * Returns the value of the '<em><b>Vector</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.substationStandard.Dataclasses.Vector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector</em>' reference list.
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getVectorArray_Vector()
	 * @model required="true"
	 * @generated
	 */
	EList<Vector> getVector();

} // VectorArray
