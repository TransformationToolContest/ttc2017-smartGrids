/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Stamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.TimeStamp#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getTimeStamp()
 * @model
 * @generated
 */
public interface TimeStamp extends EObject {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' reference.
	 * @see #setVal(P_TimeStamp)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getTimeStamp_Val()
	 * @model required="true"
	 * @generated
	 */
	P_TimeStamp getVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.TimeStamp#getVal <em>Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' reference.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(P_TimeStamp value);

} // TimeStamp
