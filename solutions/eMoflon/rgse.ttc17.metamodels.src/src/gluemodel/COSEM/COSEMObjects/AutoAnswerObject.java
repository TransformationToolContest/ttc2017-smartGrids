/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Auto_answer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Answer Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.AutoAnswerObject#isAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getAutoAnswerObject()
 * @model
 * @generated
 */
public interface AutoAnswerObject extends Auto_answer {
	/**
	 * Returns the value of the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' attribute.
	 * @see #setAnswer(boolean)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getAutoAnswerObject_Answer()
	 * @model
	 * @generated
	 */
	boolean isAnswer();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.AutoAnswerObject#isAnswer <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer</em>' attribute.
	 * @see #isAnswer()
	 * @generated
	 */
	void setAnswer(boolean value);

} // AutoAnswerObject
