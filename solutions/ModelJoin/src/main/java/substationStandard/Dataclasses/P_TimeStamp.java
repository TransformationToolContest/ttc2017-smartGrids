/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTime Stamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.P_TimeStamp#getSecondSinceEpoch <em>Second Since Epoch</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.P_TimeStamp#getFractionOfSecond <em>Fraction Of Second</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.P_TimeStamp#getTimeQuality <em>Time Quality</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getP_TimeStamp()
 * @model
 * @generated
 */
public interface P_TimeStamp extends EObject {
	/**
	 * Returns the value of the '<em><b>Second Since Epoch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Since Epoch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Since Epoch</em>' attribute.
	 * @see #setSecondSinceEpoch(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getP_TimeStamp_SecondSinceEpoch()
	 * @model
	 * @generated
	 */
	int getSecondSinceEpoch();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.P_TimeStamp#getSecondSinceEpoch <em>Second Since Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Since Epoch</em>' attribute.
	 * @see #getSecondSinceEpoch()
	 * @generated
	 */
	void setSecondSinceEpoch(int value);

	/**
	 * Returns the value of the '<em><b>Fraction Of Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fraction Of Second</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraction Of Second</em>' attribute.
	 * @see #setFractionOfSecond(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getP_TimeStamp_FractionOfSecond()
	 * @model
	 * @generated
	 */
	int getFractionOfSecond();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.P_TimeStamp#getFractionOfSecond <em>Fraction Of Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction Of Second</em>' attribute.
	 * @see #getFractionOfSecond()
	 * @generated
	 */
	void setFractionOfSecond(int value);

	/**
	 * Returns the value of the '<em><b>Time Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Quality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Quality</em>' reference.
	 * @see #setTimeQuality(TimeQuality)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getP_TimeStamp_TimeQuality()
	 * @model required="true"
	 * @generated
	 */
	TimeQuality getTimeQuality();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.P_TimeStamp#getTimeQuality <em>Time Quality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Quality</em>' reference.
	 * @see #getTimeQuality()
	 * @generated
	 */
	void setTimeQuality(TimeQuality value);

} // P_TimeStamp
