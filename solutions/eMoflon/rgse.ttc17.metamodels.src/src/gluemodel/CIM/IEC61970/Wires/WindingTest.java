/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Winding Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getFromTapStep <em>From Tap Step</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getFrom_TransformerWinding <em>From Transformer Winding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getLeakageImpedance <em>Leakage Impedance</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getNoLoadLoss <em>No Load Loss</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getPhaseShift <em>Phase Shift</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getTo_TransformerWinding <em>To Transformer Winding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getLoadLoss <em>Load Loss</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getToTapStep <em>To Tap Step</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getExcitingCurrent <em>Exciting Current</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getWindingTest()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Physical winding test data for the winding/tap pairs of a transformer (or phase shifter). This test data can be used to derive other attributes of specific transformer or phase shifter models.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Physical winding test data for the winding/tap pairs of a transformer (or phase shifter). This test data can be used to derive other attributes of specific transformer or phase shifter models.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Physical winding test data for the winding/tap pairs of a transformer (or phase shifter). This test data can be used to derive other attributes of specific transformer or phase shifter models.' Profile\040documentation='Physical winding test data for the winding/tap pairs of a transformer (or phase shifter). This test data can be used to derive other attributes of specific transformer or phase shifter models.'"
 * @generated
 */
public interface WindingTest extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>From Tap Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Tap Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Tap Step</em>' attribute.
	 * @see #setFromTapStep(int)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getWindingTest_FromTapStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The tap step number for the \"from\" winding of the test pair.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The tap step number for the \"from\" winding of the test pair.'"
	 * @generated
	 */
	int getFromTapStep();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getFromTapStep <em>From Tap Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Tap Step</em>' attribute.
	 * @see #getFromTapStep()
	 * @generated
	 */
	void setFromTapStep(int value);

	/**
	 * Returns the value of the '<em><b>From Transformer Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.TransformerWinding#getFrom_WindingTest <em>From Winding Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Transformer Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Transformer Winding</em>' reference.
	 * @see #setFrom_TransformerWinding(TransformerWinding)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getWindingTest_From_TransformerWinding()
	 * @see gluemodel.CIM.IEC61970.Wires.TransformerWinding#getFrom_WindingTest
	 * @model opposite="From_WindingTest"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The winding from which the test was conducted'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The winding from which the test was conducted'"
	 * @generated
	 */
	TransformerWinding getFrom_TransformerWinding();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getFrom_TransformerWinding <em>From Transformer Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Transformer Winding</em>' reference.
	 * @see #getFrom_TransformerWinding()
	 * @generated
	 */
	void setFrom_TransformerWinding(TransformerWinding value);

	/**
	 * Returns the value of the '<em><b>Leakage Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leakage Impedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leakage Impedance</em>' attribute.
	 * @see #setLeakageImpedance(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getWindingTest_LeakageImpedance()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Impedance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The leakage impedance measured at the \"from\" winding  with the \"to\" winding short-circuited and all other windings open-circuited.  Leakage impedance is expressed in units based on the apparent power and voltage ratings of the \"from\" winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The leakage impedance measured at the \"from\" winding  with the \"to\" winding short-circuited and all other windings open-circuited.  Leakage impedance is expressed in units based on the apparent power and voltage ratings of the \"from\" winding.'"
	 * @generated
	 */
	float getLeakageImpedance();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getLeakageImpedance <em>Leakage Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leakage Impedance</em>' attribute.
	 * @see #getLeakageImpedance()
	 * @generated
	 */
	void setLeakageImpedance(float value);

	/**
	 * Returns the value of the '<em><b>No Load Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Load Loss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Load Loss</em>' attribute.
	 * @see #setNoLoadLoss(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getWindingTest_NoLoadLoss()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.KWActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The no load loss kW \"to\" winding open-circuited) from the test report.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The no load loss kW \"to\" winding open-circuited) from the test report.'"
	 * @generated
	 */
	float getNoLoadLoss();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getNoLoadLoss <em>No Load Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Load Loss</em>' attribute.
	 * @see #getNoLoadLoss()
	 * @generated
	 */
	void setNoLoadLoss(float value);

	/**
	 * Returns the value of the '<em><b>Phase Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Shift</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Shift</em>' attribute.
	 * @see #setPhaseShift(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getWindingTest_PhaseShift()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AngleDegrees" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The phase shift measured at the open-circuited \"to\" winding, with the \"from\" winding set to the \"from\" winding\'s rated voltage and all other windings open-circuited.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The phase shift measured at the open-circuited \"to\" winding, with the \"from\" winding set to the \"from\" winding\'s rated voltage and all other windings open-circuited.'"
	 * @generated
	 */
	float getPhaseShift();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getPhaseShift <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Shift</em>' attribute.
	 * @see #getPhaseShift()
	 * @generated
	 */
	void setPhaseShift(float value);

	/**
	 * Returns the value of the '<em><b>To Transformer Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.TransformerWinding#getTo_WindingTest <em>To Winding Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Transformer Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Transformer Winding</em>' reference.
	 * @see #setTo_TransformerWinding(TransformerWinding)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getWindingTest_To_TransformerWinding()
	 * @see gluemodel.CIM.IEC61970.Wires.TransformerWinding#getTo_WindingTest
	 * @model opposite="To_WindingTest"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The winding to which the test was conducted.  Note that although the \"from\" side of the test is required, the \"to\" side of a test is not always required.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The winding to which the test was conducted.  Note that although the \"from\" side of the test is required, the \"to\" side of a test is not always required.'"
	 * @generated
	 */
	TransformerWinding getTo_TransformerWinding();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getTo_TransformerWinding <em>To Transformer Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Transformer Winding</em>' reference.
	 * @see #getTo_TransformerWinding()
	 * @generated
	 */
	void setTo_TransformerWinding(TransformerWinding value);

	/**
	 * Returns the value of the '<em><b>Load Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Loss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Loss</em>' attribute.
	 * @see #setLoadLoss(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getWindingTest_LoadLoss()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.KWActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The load loss kW (\"to\" winding short-circuited) from the test report.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The load loss kW (\"to\" winding short-circuited) from the test report.'"
	 * @generated
	 */
	float getLoadLoss();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getLoadLoss <em>Load Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Loss</em>' attribute.
	 * @see #getLoadLoss()
	 * @generated
	 */
	void setLoadLoss(float value);

	/**
	 * Returns the value of the '<em><b>To Tap Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Tap Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Tap Step</em>' attribute.
	 * @see #setToTapStep(int)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getWindingTest_ToTapStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The tap step number for the \"to\" winding of the test pair.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The tap step number for the \"to\" winding of the test pair.'"
	 * @generated
	 */
	int getToTapStep();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getToTapStep <em>To Tap Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Tap Step</em>' attribute.
	 * @see #getToTapStep()
	 * @generated
	 */
	void setToTapStep(int value);

	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage</em>' attribute.
	 * @see #setVoltage(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getWindingTest_Voltage()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The voltage measured at the open-circuited \"to\" winding, with the \"from\" winding set to the \"from\" winding\'s rated voltage and all other windings open-circuited.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The voltage measured at the open-circuited \"to\" winding, with the \"from\" winding set to the \"from\" winding\'s rated voltage and all other windings open-circuited.'"
	 * @generated
	 */
	float getVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Exciting Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exciting Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exciting Current</em>' attribute.
	 * @see #setExcitingCurrent(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getWindingTest_ExcitingCurrent()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The exciting current on open-circuit test, expressed as a percentage of rated current, at nominal voltage'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The exciting current on open-circuit test, expressed as a percentage of rated current, at nominal voltage'"
	 * @generated
	 */
	float getExcitingCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.WindingTest#getExcitingCurrent <em>Exciting Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exciting Current</em>' attribute.
	 * @see #getExcitingCurrent()
	 * @generated
	 */
	void setExcitingCurrent(float value);

} // WindingTest
