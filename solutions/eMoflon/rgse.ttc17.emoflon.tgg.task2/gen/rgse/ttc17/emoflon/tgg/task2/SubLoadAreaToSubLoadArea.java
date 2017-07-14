/**
 */
package rgse.ttc17.emoflon.tgg.task2;

import gluemodel.CIM.IEC61970.LoadModel.SubLoadArea;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Load Area To Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea#getSource <em>Source</em>}</li>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#getSubLoadAreaToSubLoadArea()
 * @model
 * @generated
 */
public interface SubLoadAreaToSubLoadArea extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SubLoadArea)
	 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#getSubLoadAreaToSubLoadArea_Source()
	 * @model required="true"
	 * @generated
	 */
	SubLoadArea getSource();

	/**
	 * Sets the value of the '{@link rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SubLoadArea value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.SubLoadArea)
	 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#getSubLoadAreaToSubLoadArea_Target()
	 * @model required="true"
	 * @generated
	 */
	outagePreventionJointarget.SubLoadArea getTarget();

	/**
	 * Sets the value of the '{@link rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.SubLoadArea value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SubLoadAreaToSubLoadArea
