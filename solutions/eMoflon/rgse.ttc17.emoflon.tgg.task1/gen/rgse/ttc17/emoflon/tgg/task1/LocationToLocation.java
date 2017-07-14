/**
 */
package rgse.ttc17.emoflon.tgg.task1;

import gluemodel.CIM.IEC61968.Common.Location;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location To Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task1.LocationToLocation#getSource <em>Source</em>}</li>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task1.LocationToLocation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see rgse.ttc17.emoflon.tgg.task1.Task1Package#getLocationToLocation()
 * @model
 * @generated
 */
public interface LocationToLocation extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Location)
	 * @see rgse.ttc17.emoflon.tgg.task1.Task1Package#getLocationToLocation_Source()
	 * @model required="true"
	 * @generated
	 */
	Location getSource();

	/**
	 * Sets the value of the '{@link rgse.ttc17.emoflon.tgg.task1.LocationToLocation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Location value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outageDetectionJointarget.Location)
	 * @see rgse.ttc17.emoflon.tgg.task1.Task1Package#getLocationToLocation_Target()
	 * @model required="true"
	 * @generated
	 */
	outageDetectionJointarget.Location getTarget();

	/**
	 * Sets the value of the '{@link rgse.ttc17.emoflon.tgg.task1.LocationToLocation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outageDetectionJointarget.Location value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // LocationToLocation
