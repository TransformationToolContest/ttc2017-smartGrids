/**
 */
package CIM.IEC61968.WiresExt;

import CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Impedance Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.WiresExt.PhaseImpedanceData#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.PhaseImpedanceData#getB <em>B</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.PhaseImpedanceData#getX <em>X</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.PhaseImpedanceData#getR <em>R</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.PhaseImpedanceData#getPhaseImpedance <em>Phase Impedance</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getPhaseImpedanceData()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Triplet of resistance, reactance, and susceptance matrix element values.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Triplet of resistance, reactance, and susceptance matrix element values.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Triplet of resistance, reactance, and susceptance matrix element values.' Profile\040documentation='Triplet of resistance, reactance, and susceptance matrix element values.'"
 * @generated
 */
public interface PhaseImpedanceData extends Element {
	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(int)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getPhaseImpedanceData_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Column-wise element index, assuming a symmetrical matrix. Ranges from 1 to N + N*(N-1)/2.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Column-wise element index, assuming a symmetrical matrix. Ranges from 1 to N + N*(N-1)/2.'"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.PhaseImpedanceData#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(float)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getPhaseImpedanceData_B()
	 * @model dataType="CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Susceptance matrix element value, per length of unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Susceptance matrix element value, per length of unit.'"
	 * @generated
	 */
	float getB();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.PhaseImpedanceData#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(float value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getPhaseImpedanceData_X()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reactance matrix element value, per length of unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reactance matrix element value, per length of unit.'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.PhaseImpedanceData#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(float)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getPhaseImpedanceData_R()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Resistance matrix element value, per length of unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Resistance matrix element value, per length of unit.'"
	 * @generated
	 */
	float getR();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.PhaseImpedanceData#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(float value);

	/**
	 * Returns the value of the '<em><b>Phase Impedance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getPhaseImpedanceData <em>Phase Impedance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Impedance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Impedance</em>' reference.
	 * @see #setPhaseImpedance(PerLengthPhaseImpedance)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getPhaseImpedanceData_PhaseImpedance()
	 * @see CIM.IEC61968.WiresExt.PerLengthPhaseImpedance#getPhaseImpedanceData
	 * @model opposite="PhaseImpedanceData"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Conductor phase impedance to which this data belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Conductor phase impedance to which this data belongs.'"
	 * @generated
	 */
	PerLengthPhaseImpedance getPhaseImpedance();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.PhaseImpedanceData#getPhaseImpedance <em>Phase Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Impedance</em>' reference.
	 * @see #getPhaseImpedance()
	 * @generated
	 */
	void setPhaseImpedance(PerLengthPhaseImpedance value);

} // PhaseImpedanceData
