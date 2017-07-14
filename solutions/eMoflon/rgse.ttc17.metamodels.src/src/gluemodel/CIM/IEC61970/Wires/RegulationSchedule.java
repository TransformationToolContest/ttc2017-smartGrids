/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.LoadModel.SeasonDayTypeSchedule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulation Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.RegulationSchedule#getLineDropR <em>Line Drop R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.RegulationSchedule#getLineDropX <em>Line Drop X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.RegulationSchedule#isLineDropCompensation <em>Line Drop Compensation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.RegulationSchedule#getVoltageControlZones <em>Voltage Control Zones</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRegulationSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A pre-established pattern over time for a controlled variable, e.g., busbar voltage.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A pre-established pattern over time for a controlled variable, e.g., busbar voltage.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A pre-established pattern over time for a controlled variable, e.g., busbar voltage.' Profile\040documentation='A pre-established pattern over time for a controlled variable, e.g., busbar voltage.'"
 * @generated
 */
public interface RegulationSchedule extends SeasonDayTypeSchedule {
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
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRegulationSchedule_LineDropR()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Line drop resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Line drop resistance.'"
	 * @generated
	 */
	float getLineDropR();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.RegulationSchedule#getLineDropR <em>Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Drop R</em>' attribute.
	 * @see #getLineDropR()
	 * @generated
	 */
	void setLineDropR(float value);

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
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRegulationSchedule_LineDropX()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Line drop reactance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Line drop reactance.'"
	 * @generated
	 */
	float getLineDropX();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.RegulationSchedule#getLineDropX <em>Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Drop X</em>' attribute.
	 * @see #getLineDropX()
	 * @generated
	 */
	void setLineDropX(float value);

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
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRegulationSchedule_LineDropCompensation()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Flag to indicate that line drop compensation is to be applied'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Flag to indicate that line drop compensation is to be applied'"
	 * @generated
	 */
	boolean isLineDropCompensation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.RegulationSchedule#isLineDropCompensation <em>Line Drop Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Drop Compensation</em>' attribute.
	 * @see #isLineDropCompensation()
	 * @generated
	 */
	void setLineDropCompensation(boolean value);

	/**
	 * Returns the value of the '<em><b>Regulating Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Control</em>' reference.
	 * @see #setRegulatingControl(RegulatingControl)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRegulationSchedule_RegulatingControl()
	 * @see gluemodel.CIM.IEC61970.Wires.RegulatingControl#getRegulationSchedule
	 * @model opposite="RegulationSchedule"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Regulating controls that have this Schedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Regulating controls that have this Schedule.'"
	 * @generated
	 */
	RegulatingControl getRegulatingControl();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulating Control</em>' reference.
	 * @see #getRegulatingControl()
	 * @generated
	 */
	void setRegulatingControl(RegulatingControl value);

	/**
	 * Returns the value of the '<em><b>Voltage Control Zones</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.VoltageControlZone}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Control Zones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Control Zones</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRegulationSchedule_VoltageControlZones()
	 * @see gluemodel.CIM.IEC61970.Wires.VoltageControlZone#getRegulationSchedule
	 * @model opposite="RegulationSchedule"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A VoltageControlZone may have a  voltage regulation schedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A VoltageControlZone may have a  voltage regulation schedule.'"
	 * @generated
	 */
	EList<VoltageControlZone> getVoltageControlZones();

} // RegulationSchedule
