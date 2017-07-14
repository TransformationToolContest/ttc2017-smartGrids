/**
 */
package gluemodel.CIM.IEC61968.AssetModels;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Winding Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getOpenCircuitTests <em>Open Circuit Tests</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getToWinding <em>To Winding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getToTapStep <em>To Tap Step</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getPhaseShift <em>Phase Shift</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getShortCircuitTests <em>Short Circuit Tests</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getToWindingSpec()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For short-circuit tests, specifies the winding and tap for all short-circuited windings. \nFor open-circuit tests, specifies the winding, tap, induced voltage, and induced angle for any non-excited windings that were measured during the test. This won\'t apply if only the exciting current and no-load losses were measured.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='For short-circuit tests, specifies the winding and tap for all short-circuited windings. \nFor open-circuit tests, specifies the winding, tap, induced voltage, and induced angle for any non-excited windings that were measured during the test. This won\'t apply if only the exciting current and no-load losses were measured.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For short-circuit tests, specifies the winding and tap for all short-circuited windings. \nFor open-circuit tests, specifies the winding, tap, induced voltage, and induced angle for any non-excited windings that were measured during the test. This won\'t apply if only the exciting current and no-load losses were measured.' Profile\040documentation='For short-circuit tests, specifies the winding and tap for all short-circuited windings. \nFor open-circuit tests, specifies the winding, tap, induced voltage, and induced angle for any non-excited windings that were measured during the test. This won\'t apply if only the exciting current and no-load losses were measured.'"
 * @generated
 */
public interface ToWindingSpec extends IdentifiedObject {
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
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getToWindingSpec_Voltage()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if open-circuit test) Voltage measured at the open-circuited \"to\" winding, with the \"from\" winding set to the \"from\" winding\'s rated voltage and all other windings open-circuited.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if open-circuit test) Voltage measured at the open-circuited \"to\" winding, with the \"from\" winding set to the \"from\" winding\'s rated voltage and all other windings open-circuited.'"
	 * @generated
	 */
	float getVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Open Circuit Tests</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getMeasuredWindingSpecs <em>Measured Winding Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Circuit Tests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Circuit Tests</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getToWindingSpec_OpenCircuitTests()
	 * @see gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest#getMeasuredWindingSpecs
	 * @model opposite="MeasuredWindingSpecs"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All open-circuit tests in which this winding was measured.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All open-circuit tests in which this winding was measured.'"
	 * @generated
	 */
	EList<OpenCircuitTest> getOpenCircuitTests();

	/**
	 * Returns the value of the '<em><b>To Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getToWindingSpecs <em>To Winding Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Winding</em>' reference.
	 * @see #setToWinding(WindingInfo)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getToWindingSpec_ToWinding()
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getToWindingSpecs
	 * @model opposite="ToWindingSpecs"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Winding short-circuited in a short-circuit test, or measured for induced voltage and angle in an open-circuit test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Winding short-circuited in a short-circuit test, or measured for induced voltage and angle in an open-circuit test.'"
	 * @generated
	 */
	WindingInfo getToWinding();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getToWinding <em>To Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Winding</em>' reference.
	 * @see #getToWinding()
	 * @generated
	 */
	void setToWinding(WindingInfo value);

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
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getToWindingSpec_ToTapStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Tap step number for the \"to\" winding of the test pair.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tap step number for the \"to\" winding of the test pair.'"
	 * @generated
	 */
	int getToTapStep();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getToTapStep <em>To Tap Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Tap Step</em>' attribute.
	 * @see #getToTapStep()
	 * @generated
	 */
	void setToTapStep(int value);

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
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getToWindingSpec_PhaseShift()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AngleDegrees" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if open-circuit test) Phase shift measured at the open-circuited \"to\" winding, with the \"from\" winding set to the \"from\" winding\'s rated voltage and all other windings open-circuited.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if open-circuit test) Phase shift measured at the open-circuited \"to\" winding, with the \"from\" winding set to the \"from\" winding\'s rated voltage and all other windings open-circuited.'"
	 * @generated
	 */
	float getPhaseShift();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getPhaseShift <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Shift</em>' attribute.
	 * @see #getPhaseShift()
	 * @generated
	 */
	void setPhaseShift(float value);

	/**
	 * Returns the value of the '<em><b>Short Circuit Tests</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest#getShortedWindingSpecs <em>Shorted Winding Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Circuit Tests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Circuit Tests</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getToWindingSpec_ShortCircuitTests()
	 * @see gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest#getShortedWindingSpecs
	 * @model opposite="ShortedWindingSpecs"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All short-circuit tests in which this winding was short-circuited.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All short-circuit tests in which this winding was short-circuited.'"
	 * @generated
	 */
	EList<ShortCircuitTest> getShortCircuitTests();

} // ToWindingSpec
