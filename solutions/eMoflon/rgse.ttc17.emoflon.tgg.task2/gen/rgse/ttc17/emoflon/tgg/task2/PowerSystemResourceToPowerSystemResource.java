/**
 */
package rgse.ttc17.emoflon.tgg.task2;

import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power System Resource To Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource#getSource <em>Source</em>}</li>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#getPowerSystemResourceToPowerSystemResource()
 * @model
 * @generated
 */
public interface PowerSystemResourceToPowerSystemResource extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PowerSystemResource)
	 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#getPowerSystemResourceToPowerSystemResource_Source()
	 * @model required="true"
	 * @generated
	 */
	PowerSystemResource getSource();

	/**
	 * Sets the value of the '{@link rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PowerSystemResource value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.PowerSystemResource)
	 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#getPowerSystemResourceToPowerSystemResource_Target()
	 * @model required="true"
	 * @generated
	 */
	outagePreventionJointarget.PowerSystemResource getTarget();

	/**
	 * Sets the value of the '{@link rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.PowerSystemResource value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // PowerSystemResourceToPowerSystemResource
