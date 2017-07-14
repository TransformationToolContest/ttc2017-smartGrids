/**
 */
package gluemodel.substationStandard.Dataclasses;

import gluemodel.substationStandard.Enumerations.TimeAccuracyKind;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.TimeQuality#isLeapSecondsKnown <em>Leap Seconds Known</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.TimeQuality#isClockFailure <em>Clock Failure</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.TimeQuality#isClockNotSynchronized <em>Clock Not Synchronized</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.TimeQuality#getTimeAccuracy <em>Time Accuracy</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getTimeQuality()
 * @model
 * @generated
 */
public interface TimeQuality extends EObject {
	/**
	 * Returns the value of the '<em><b>Leap Seconds Known</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leap Seconds Known</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leap Seconds Known</em>' attribute.
	 * @see #setLeapSecondsKnown(boolean)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getTimeQuality_LeapSecondsKnown()
	 * @model
	 * @generated
	 */
	boolean isLeapSecondsKnown();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.TimeQuality#isLeapSecondsKnown <em>Leap Seconds Known</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leap Seconds Known</em>' attribute.
	 * @see #isLeapSecondsKnown()
	 * @generated
	 */
	void setLeapSecondsKnown(boolean value);

	/**
	 * Returns the value of the '<em><b>Clock Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Failure</em>' attribute.
	 * @see #setClockFailure(boolean)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getTimeQuality_ClockFailure()
	 * @model
	 * @generated
	 */
	boolean isClockFailure();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.TimeQuality#isClockFailure <em>Clock Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Failure</em>' attribute.
	 * @see #isClockFailure()
	 * @generated
	 */
	void setClockFailure(boolean value);

	/**
	 * Returns the value of the '<em><b>Clock Not Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Not Synchronized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Not Synchronized</em>' attribute.
	 * @see #setClockNotSynchronized(boolean)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getTimeQuality_ClockNotSynchronized()
	 * @model
	 * @generated
	 */
	boolean isClockNotSynchronized();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.TimeQuality#isClockNotSynchronized <em>Clock Not Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Not Synchronized</em>' attribute.
	 * @see #isClockNotSynchronized()
	 * @generated
	 */
	void setClockNotSynchronized(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Accuracy</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.substationStandard.Enumerations.TimeAccuracyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Accuracy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Accuracy</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.TimeAccuracyKind
	 * @see #setTimeAccuracy(TimeAccuracyKind)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getTimeQuality_TimeAccuracy()
	 * @model
	 * @generated
	 */
	TimeAccuracyKind getTimeAccuracy();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.TimeQuality#getTimeAccuracy <em>Time Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Accuracy</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.TimeAccuracyKind
	 * @see #getTimeAccuracy()
	 * @generated
	 */
	void setTimeAccuracy(TimeAccuracyKind value);

} // TimeQuality
