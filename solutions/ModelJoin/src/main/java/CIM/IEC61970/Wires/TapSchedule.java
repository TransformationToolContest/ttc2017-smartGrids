/**
 */
package CIM.IEC61970.Wires;

import CIM.IEC61970.LoadModel.SeasonDayTypeSchedule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tap Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.TapSchedule#isLineDropCompensation <em>Line Drop Compensation</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapSchedule#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapSchedule#getLineDropX <em>Line Drop X</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapSchedule#getLineDropR <em>Line Drop R</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getTapSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A pre-established pattern over time for a tap step.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A pre-established pattern over time for a tap step.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A pre-established pattern over time for a tap step.' Profile\040documentation='A pre-established pattern over time for a tap step.'"
 * @generated
 */
public interface TapSchedule extends SeasonDayTypeSchedule {
	/**
	 * Returns the value of the '<em><b>Line Drop Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Drop Compensation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Drop Compensation</em>' attribute.
	 * @see #setLineDropCompensation(boolean)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapSchedule_LineDropCompensation()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Flag to indicate that line drop compensation is to be applied'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Flag to indicate that line drop compensation is to be applied'"
	 * @generated
	 */
	boolean isLineDropCompensation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapSchedule#isLineDropCompensation <em>Line Drop Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Drop Compensation</em>' attribute.
	 * @see #isLineDropCompensation()
	 * @generated
	 */
	void setLineDropCompensation(boolean value);

	/**
	 * Returns the value of the '<em><b>Tap Changer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.TapChanger#getTapSchedules <em>Tap Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changer</em>' reference.
	 * @see #setTapChanger(TapChanger)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapSchedule_TapChanger()
	 * @see CIM.IEC61970.Wires.TapChanger#getTapSchedules
	 * @model opposite="TapSchedules"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TapSchedule is associated with a TapChanger.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TapSchedule is associated with a TapChanger.'"
	 * @generated
	 */
	TapChanger getTapChanger();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapSchedule#getTapChanger <em>Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Changer</em>' reference.
	 * @see #getTapChanger()
	 * @generated
	 */
	void setTapChanger(TapChanger value);

	/**
	 * Returns the value of the '<em><b>Line Drop X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Drop X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Drop X</em>' attribute.
	 * @see #setLineDropX(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapSchedule_LineDropX()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Line drop reactance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Line drop reactance.'"
	 * @generated
	 */
	float getLineDropX();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapSchedule#getLineDropX <em>Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Drop X</em>' attribute.
	 * @see #getLineDropX()
	 * @generated
	 */
	void setLineDropX(float value);

	/**
	 * Returns the value of the '<em><b>Line Drop R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Drop R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Drop R</em>' attribute.
	 * @see #setLineDropR(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapSchedule_LineDropR()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Line drop resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Line drop resistance.'"
	 * @generated
	 */
	float getLineDropR();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapSchedule#getLineDropR <em>Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Drop R</em>' attribute.
	 * @see #getLineDropR()
	 * @generated
	 */
	void setLineDropR(float value);

} // TapSchedule
