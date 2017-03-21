/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.SAV#getInstMag <em>Inst Mag</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SAV#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SAV#getT <em>T</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SAV#getUnits <em>Units</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SAV#getSVC <em>SVC</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SAV#getMin <em>Min</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.SAV#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getSAV()
 * @model
 * @generated
 */
public interface SAV extends EObject {
	/**
	 * Returns the value of the '<em><b>Inst Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst Mag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst Mag</em>' reference.
	 * @see #setInstMag(AnalogueValue)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSAV_InstMag()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getInstMag();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SAV#getInstMag <em>Inst Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst Mag</em>' reference.
	 * @see #getInstMag()
	 * @generated
	 */
	void setInstMag(AnalogueValue value);

	/**
	 * Returns the value of the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' reference.
	 * @see #setQ(Quality)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSAV_Q()
	 * @model required="true"
	 * @generated
	 */
	Quality getQ();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SAV#getQ <em>Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Quality value);

	/**
	 * Returns the value of the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' reference.
	 * @see #setT(TimeStamp)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSAV_T()
	 * @model required="true"
	 * @generated
	 */
	TimeStamp getT();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SAV#getT <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(TimeStamp value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' reference.
	 * @see #setUnits(Units)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSAV_Units()
	 * @model required="true"
	 * @generated
	 */
	Units getUnits();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SAV#getUnits <em>Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(Units value);

	/**
	 * Returns the value of the '<em><b>SVC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SVC</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SVC</em>' reference.
	 * @see #setSVC(ScaledValueConfig)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSAV_SVC()
	 * @model required="true"
	 * @generated
	 */
	ScaledValueConfig getSVC();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SAV#getSVC <em>SVC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SVC</em>' reference.
	 * @see #getSVC()
	 * @generated
	 */
	void setSVC(ScaledValueConfig value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' reference.
	 * @see #setMin(AnalogueValue)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSAV_Min()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getMin();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SAV#getMin <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(AnalogueValue value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' reference.
	 * @see #setMax(AnalogueValue)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSAV_Max()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getMax();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SAV#getMax <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(AnalogueValue value);

} // SAV
