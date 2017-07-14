/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.PointArray#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getPointArray()
 * @model
 * @generated
 */
public interface PointArray extends EObject {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.substationStandard.Dataclasses.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' reference list.
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getPointArray_Point()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	EList<Point> getPoint();

} // PointArray
