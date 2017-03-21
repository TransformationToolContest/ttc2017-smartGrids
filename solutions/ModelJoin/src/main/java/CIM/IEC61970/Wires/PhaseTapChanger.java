/**
 */
package CIM.IEC61970.Wires;

import CIM.IEC61968.WiresExt.DistributionTransformerWinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.PhaseTapChanger#getTransformerWinding <em>Transformer Winding</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.PhaseTapChanger#getWindingConnectionAngle <em>Winding Connection Angle</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.PhaseTapChanger#getWinding <em>Winding</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.PhaseTapChanger#getPhaseTapChangerType <em>Phase Tap Changer Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.PhaseTapChanger#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.PhaseTapChanger#getPhaseVariationCurve <em>Phase Variation Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.PhaseTapChanger#getVoltageStepIncrementOutOfPhase <em>Voltage Step Increment Out Of Phase</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.PhaseTapChanger#getNominalVoltageOutOfPhase <em>Nominal Voltage Out Of Phase</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.PhaseTapChanger#getXStepMax <em>XStep Max</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.PhaseTapChanger#getXStepMin <em>XStep Min</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getPhaseTapChanger()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A specialization of a voltage tap changer that has detailed modeling for phase shifting capabilities.   A phase shifting tap changer is also in general a voltage magnitude transformer.    The symmetrical and asymmetrical transformer tap changer models are defined here.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A specialization of a voltage tap changer that has detailed modeling for phase shifting capabilities.   A phase shifting tap changer is also in general a voltage magnitude transformer.    The symmetrical and asymmetrical transformer tap changer models are defined here.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A specialization of a voltage tap changer that has detailed modeling for phase shifting capabilities.   A phase shifting tap changer is also in general a voltage magnitude transformer.    The symmetrical and asymmetrical transformer tap changer models are defined here.' Profile\040documentation='A specialization of a voltage tap changer that has detailed modeling for phase shifting capabilities.   A phase shifting tap changer is also in general a voltage magnitude transformer.    The symmetrical and asymmetrical transformer tap changer models are defined here.'"
 * @generated
 */
public interface PhaseTapChanger extends TapChanger {
	/**
	 * Returns the value of the '<em><b>Transformer Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.TransformerWinding#getPhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Winding</em>' reference.
	 * @see #setTransformerWinding(TransformerWinding)
	 * @see CIM.IEC61970.Wires.WiresPackage#getPhaseTapChanger_TransformerWinding()
	 * @see CIM.IEC61970.Wires.TransformerWinding#getPhaseTapChanger
	 * @model opposite="PhaseTapChanger"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The transformer winding to which the phase tap changer belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The transformer winding to which the phase tap changer belongs.'"
	 * @generated
	 */
	TransformerWinding getTransformerWinding();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.PhaseTapChanger#getTransformerWinding <em>Transformer Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Winding</em>' reference.
	 * @see #getTransformerWinding()
	 * @generated
	 */
	void setTransformerWinding(TransformerWinding value);

	/**
	 * Returns the value of the '<em><b>Winding Connection Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Connection Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Connection Angle</em>' attribute.
	 * @see #setWindingConnectionAngle(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getPhaseTapChanger_WindingConnectionAngle()
	 * @model dataType="CIM.IEC61970.Domain.AngleDegrees" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The phase angle between the in-phase winding and the out-of -phase winding used for creating phase shift.   It is only possible to have a symmemtrical transformer if this angle is 90 degrees.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The phase angle between the in-phase winding and the out-of -phase winding used for creating phase shift.   It is only possible to have a symmemtrical transformer if this angle is 90 degrees.'"
	 * @generated
	 */
	float getWindingConnectionAngle();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.PhaseTapChanger#getWindingConnectionAngle <em>Winding Connection Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winding Connection Angle</em>' attribute.
	 * @see #getWindingConnectionAngle()
	 * @generated
	 */
	void setWindingConnectionAngle(float value);

	/**
	 * Returns the value of the '<em><b>Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getPhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding</em>' reference.
	 * @see #setWinding(DistributionTransformerWinding)
	 * @see CIM.IEC61970.Wires.WiresPackage#getPhaseTapChanger_Winding()
	 * @see CIM.IEC61968.WiresExt.DistributionTransformerWinding#getPhaseTapChanger
	 * @model opposite="PhaseTapChanger"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transformer winding to which this phase tap changer belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transformer winding to which this phase tap changer belongs.'"
	 * @generated
	 */
	DistributionTransformerWinding getWinding();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.PhaseTapChanger#getWinding <em>Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winding</em>' reference.
	 * @see #getWinding()
	 * @generated
	 */
	void setWinding(DistributionTransformerWinding value);

	/**
	 * Returns the value of the '<em><b>Phase Tap Changer Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Wires.PhaseTapChangerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Tap Changer Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Tap Changer Type</em>' attribute.
	 * @see CIM.IEC61970.Wires.PhaseTapChangerKind
	 * @see #setPhaseTapChangerType(PhaseTapChangerKind)
	 * @see CIM.IEC61970.Wires.WiresPackage#getPhaseTapChanger_PhaseTapChangerType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of phase shifter construction.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of phase shifter construction.'"
	 * @generated
	 */
	PhaseTapChangerKind getPhaseTapChangerType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.PhaseTapChanger#getPhaseTapChangerType <em>Phase Tap Changer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Tap Changer Type</em>' attribute.
	 * @see CIM.IEC61970.Wires.PhaseTapChangerKind
	 * @see #getPhaseTapChangerType()
	 * @generated
	 */
	void setPhaseTapChangerType(PhaseTapChangerKind value);

	/**
	 * Returns the value of the '<em><b>Step Phase Shift Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Phase Shift Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Phase Shift Increment</em>' attribute.
	 * @see #setStepPhaseShiftIncrement(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getPhaseTapChanger_StepPhaseShiftIncrement()
	 * @model dataType="CIM.IEC61970.Domain.AngleDegrees" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase shift per step position. A positive value indicates a positive phase shift from the winding where the tap is located to the other winding (for a two-winding transformer).\nThe actual phase shift increment might be more accurately computed from the symmetrical or asymmetrical models or a tap step table lookup if those are available.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase shift per step position. A positive value indicates a positive phase shift from the winding where the tap is located to the other winding (for a two-winding transformer).\nThe actual phase shift increment might be more accurately computed from the symmetrical or asymmetrical models or a tap step table lookup if those are available.'"
	 * @generated
	 */
	float getStepPhaseShiftIncrement();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.PhaseTapChanger#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Phase Shift Increment</em>' attribute.
	 * @see #getStepPhaseShiftIncrement()
	 * @generated
	 */
	void setStepPhaseShiftIncrement(float value);

	/**
	 * Returns the value of the '<em><b>Phase Variation Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.PhaseVariationCurve#getPhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Variation Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Variation Curve</em>' reference.
	 * @see #setPhaseVariationCurve(PhaseVariationCurve)
	 * @see CIM.IEC61970.Wires.WiresPackage#getPhaseTapChanger_PhaseVariationCurve()
	 * @see CIM.IEC61970.Wires.PhaseVariationCurve#getPhaseTapChanger
	 * @model opposite="PhaseTapChanger"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A PhaseTapChanger can have an associated PhaseVariationCurve to define phase shift variations with tap step changes.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A PhaseTapChanger can have an associated PhaseVariationCurve to define phase shift variations with tap step changes.'"
	 * @generated
	 */
	PhaseVariationCurve getPhaseVariationCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.PhaseTapChanger#getPhaseVariationCurve <em>Phase Variation Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Variation Curve</em>' reference.
	 * @see #getPhaseVariationCurve()
	 * @generated
	 */
	void setPhaseVariationCurve(PhaseVariationCurve value);

	/**
	 * Returns the value of the '<em><b>Voltage Step Increment Out Of Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Step Increment Out Of Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Step Increment Out Of Phase</em>' attribute.
	 * @see #setVoltageStepIncrementOutOfPhase(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getPhaseTapChanger_VoltageStepIncrementOutOfPhase()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The voltage step increment on the out of phase winding.    This voltage step on the out of phase winding of the phase shifter.  Similar to TapChanger.voltageStepIncrement, but it is applied only to the out of phase winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The voltage step increment on the out of phase winding.    This voltage step on the out of phase winding of the phase shifter.  Similar to TapChanger.voltageStepIncrement, but it is applied only to the out of phase winding.'"
	 * @generated
	 */
	float getVoltageStepIncrementOutOfPhase();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.PhaseTapChanger#getVoltageStepIncrementOutOfPhase <em>Voltage Step Increment Out Of Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Step Increment Out Of Phase</em>' attribute.
	 * @see #getVoltageStepIncrementOutOfPhase()
	 * @generated
	 */
	void setVoltageStepIncrementOutOfPhase(float value);

	/**
	 * Returns the value of the '<em><b>Nominal Voltage Out Of Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Voltage Out Of Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Voltage Out Of Phase</em>' attribute.
	 * @see #setNominalVoltageOutOfPhase(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getPhaseTapChanger_NominalVoltageOutOfPhase()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Similar to TapChanger.nominalVoltage, but this is the nominal voltage in the out of phase winding at the nominal tap step. A typical case may have zero voltage at the nominal step, indicating no phase shift at the nominal voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Similar to TapChanger.nominalVoltage, but this is the nominal voltage in the out of phase winding at the nominal tap step. A typical case may have zero voltage at the nominal step, indicating no phase shift at the nominal voltage.'"
	 * @generated
	 */
	float getNominalVoltageOutOfPhase();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.PhaseTapChanger#getNominalVoltageOutOfPhase <em>Nominal Voltage Out Of Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Voltage Out Of Phase</em>' attribute.
	 * @see #getNominalVoltageOutOfPhase()
	 * @generated
	 */
	void setNominalVoltageOutOfPhase(float value);

	/**
	 * Returns the value of the '<em><b>XStep Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XStep Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XStep Max</em>' attribute.
	 * @see #setXStepMax(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getPhaseTapChanger_XStepMax()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The reactance at the maximum tap step.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The reactance at the maximum tap step.'"
	 * @generated
	 */
	float getXStepMax();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.PhaseTapChanger#getXStepMax <em>XStep Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XStep Max</em>' attribute.
	 * @see #getXStepMax()
	 * @generated
	 */
	void setXStepMax(float value);

	/**
	 * Returns the value of the '<em><b>XStep Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XStep Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XStep Min</em>' attribute.
	 * @see #setXStepMin(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getPhaseTapChanger_XStepMin()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The reactance at the minimum tap step.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The reactance at the minimum tap step.'"
	 * @generated
	 */
	float getXStepMin();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.PhaseTapChanger#getXStepMin <em>XStep Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XStep Min</em>' attribute.
	 * @see #getXStepMin()
	 * @generated
	 */
	void setXStepMin(float value);

} // PhaseTapChanger
