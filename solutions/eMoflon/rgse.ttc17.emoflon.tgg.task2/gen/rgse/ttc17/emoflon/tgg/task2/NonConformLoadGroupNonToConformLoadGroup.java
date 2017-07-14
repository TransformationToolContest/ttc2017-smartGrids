/**
 */
package rgse.ttc17.emoflon.tgg.task2;

import gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Conform Load Group Non To Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup#getSource <em>Source</em>}</li>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#getNonConformLoadGroupNonToConformLoadGroup()
 * @model
 * @generated
 */
public interface NonConformLoadGroupNonToConformLoadGroup extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NonConformLoadGroup)
	 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#getNonConformLoadGroupNonToConformLoadGroup_Source()
	 * @model required="true"
	 * @generated
	 */
	NonConformLoadGroup getSource();

	/**
	 * Sets the value of the '{@link rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NonConformLoadGroup value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.NonConformLoadGroup)
	 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#getNonConformLoadGroupNonToConformLoadGroup_Target()
	 * @model required="true"
	 * @generated
	 */
	outagePreventionJointarget.NonConformLoadGroup getTarget();

	/**
	 * Sets the value of the '{@link rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.NonConformLoadGroup value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // NonConformLoadGroupNonToConformLoadGroup
