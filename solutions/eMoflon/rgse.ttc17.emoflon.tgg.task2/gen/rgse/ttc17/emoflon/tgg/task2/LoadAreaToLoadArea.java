/**
 */
package rgse.ttc17.emoflon.tgg.task2;

import gluemodel.CIM.IEC61970.LoadModel.LoadArea;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Area To Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea#getSource <em>Source</em>}</li>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#getLoadAreaToLoadArea()
 * @model
 * @generated
 */
public interface LoadAreaToLoadArea extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(LoadArea)
	 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#getLoadAreaToLoadArea_Source()
	 * @model required="true"
	 * @generated
	 */
	LoadArea getSource();

	/**
	 * Sets the value of the '{@link rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LoadArea value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.LoadArea)
	 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#getLoadAreaToLoadArea_Target()
	 * @model required="true"
	 * @generated
	 */
	outagePreventionJointarget.LoadArea getTarget();

	/**
	 * Sets the value of the '{@link rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.LoadArea value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // LoadAreaToLoadArea
