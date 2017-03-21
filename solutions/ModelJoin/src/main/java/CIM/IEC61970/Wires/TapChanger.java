/**
 */
package CIM.IEC61970.Wires;

import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.StateVariables.SvTapStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#getSubsequentDelay <em>Subsequent Delay</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#getTapSchedules <em>Tap Schedules</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#isLtcFlag <em>Ltc Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#isRegulationStatus <em>Regulation Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#getNeutralU <em>Neutral U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#getHighStep <em>High Step</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#getImpedanceVariationCurve <em>Impedance Variation Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#getSvTapStep <em>Sv Tap Step</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.TapChanger#getNormalStep <em>Normal Step</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Mechanism for changing transformer winding tap positions.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Mechanism for changing transformer winding tap positions.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Mechanism for changing transformer winding tap positions.' Profile\040documentation='Mechanism for changing transformer winding tap positions.'"
 * @generated
 */
public interface TapChanger extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Delay</em>' attribute.
	 * @see #setInitialDelay(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_InitialDelay()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For an LTC, the delay for initial tap changer operation (first step change)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For an LTC, the delay for initial tap changer operation (first step change)'"
	 * @generated
	 */
	float getInitialDelay();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#getInitialDelay <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Delay</em>' attribute.
	 * @see #getInitialDelay()
	 * @generated
	 */
	void setInitialDelay(float value);

	/**
	 * Returns the value of the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsequent Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsequent Delay</em>' attribute.
	 * @see #setSubsequentDelay(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_SubsequentDelay()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For an LTC, the delay for subsequent tap changer operation (second and later step changes)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For an LTC, the delay for subsequent tap changer operation (second and later step changes)'"
	 * @generated
	 */
	float getSubsequentDelay();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#getSubsequentDelay <em>Subsequent Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsequent Delay</em>' attribute.
	 * @see #getSubsequentDelay()
	 * @generated
	 */
	void setSubsequentDelay(float value);

	/**
	 * Returns the value of the '<em><b>Tap Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.TapSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.TapSchedule#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Schedules</em>' reference list.
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_TapSchedules()
	 * @see CIM.IEC61970.Wires.TapSchedule#getTapChanger
	 * @model opposite="TapChanger"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TapChanger can have TapSchedules.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TapChanger can have TapSchedules.'"
	 * @generated
	 */
	EList<TapSchedule> getTapSchedules();

	/**
	 * Returns the value of the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ltc Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ltc Flag</em>' attribute.
	 * @see #setLtcFlag(boolean)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_LtcFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies whether or not a TapChanger has load tap changing capabilities.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies whether or not a TapChanger has load tap changing capabilities.'"
	 * @generated
	 */
	boolean isLtcFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#isLtcFlag <em>Ltc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ltc Flag</em>' attribute.
	 * @see #isLtcFlag()
	 * @generated
	 */
	void setLtcFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Status</em>' attribute.
	 * @see #setRegulationStatus(boolean)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_RegulationStatus()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies the default regulation status of the TapChanger.  True is regulating.  False is not regulating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the default regulation status of the TapChanger.  True is regulating.  False is not regulating.'"
	 * @generated
	 */
	boolean isRegulationStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#isRegulationStatus <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Status</em>' attribute.
	 * @see #isRegulationStatus()
	 * @generated
	 */
	void setRegulationStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Regulating Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.RegulatingControl#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Control</em>' reference.
	 * @see #setRegulatingControl(RegulatingControl)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_RegulatingControl()
	 * @see CIM.IEC61970.Wires.RegulatingControl#getTapChanger
	 * @model opposite="TapChanger"
	 * @generated
	 */
	RegulatingControl getRegulatingControl();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#getRegulatingControl <em>Regulating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulating Control</em>' reference.
	 * @see #getRegulatingControl()
	 * @generated
	 */
	void setRegulatingControl(RegulatingControl value);

	/**
	 * Returns the value of the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral Step</em>' attribute.
	 * @see #setNeutralStep(int)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_NeutralStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The neutral tap step position for this winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The neutral tap step position for this winding.'"
	 * @generated
	 */
	int getNeutralStep();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#getNeutralStep <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral Step</em>' attribute.
	 * @see #getNeutralStep()
	 * @generated
	 */
	void setNeutralStep(int value);

	/**
	 * Returns the value of the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral U</em>' attribute.
	 * @see #setNeutralU(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_NeutralU()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Voltage at which the winding operates at the neutral tap setting.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Voltage at which the winding operates at the neutral tap setting.'"
	 * @generated
	 */
	float getNeutralU();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#getNeutralU <em>Neutral U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral U</em>' attribute.
	 * @see #getNeutralU()
	 * @generated
	 */
	void setNeutralU(float value);

	/**
	 * Returns the value of the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Step</em>' attribute.
	 * @see #setLowStep(int)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_LowStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Lowest possible tap step position, retard from neutral'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Lowest possible tap step position, retard from neutral'"
	 * @generated
	 */
	int getLowStep();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#getLowStep <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Step</em>' attribute.
	 * @see #getLowStep()
	 * @generated
	 */
	void setLowStep(int value);

	/**
	 * Returns the value of the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Step</em>' attribute.
	 * @see #setHighStep(int)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_HighStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Highest possible tap step position, advance from neutral'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Highest possible tap step position, advance from neutral'"
	 * @generated
	 */
	int getHighStep();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#getHighStep <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Step</em>' attribute.
	 * @see #getHighStep()
	 * @generated
	 */
	void setHighStep(int value);

	/**
	 * Returns the value of the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Voltage Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Voltage Increment</em>' attribute.
	 * @see #setStepVoltageIncrement(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_StepVoltageIncrement()
	 * @model dataType="CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Tap step increment, in per cent of nominal voltage, per step position.  For a symmetrical PhaseTapChanger, the stepVoltageIncrement is used in the formula for calculation of the phase angle.  For a symmetrical PhaseTapChanger, the voltage magnitude does not change with tap step.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tap step increment, in per cent of nominal voltage, per step position.  For a symmetrical PhaseTapChanger, the stepVoltageIncrement is used in the formula for calculation of the phase angle.  For a symmetrical PhaseTapChanger, the voltage magnitude does not change with tap step.'"
	 * @generated
	 */
	float getStepVoltageIncrement();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Voltage Increment</em>' attribute.
	 * @see #getStepVoltageIncrement()
	 * @generated
	 */
	void setStepVoltageIncrement(float value);

	/**
	 * Returns the value of the '<em><b>Impedance Variation Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.ImpedanceVariationCurve#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance Variation Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance Variation Curve</em>' reference.
	 * @see #setImpedanceVariationCurve(ImpedanceVariationCurve)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_ImpedanceVariationCurve()
	 * @see CIM.IEC61970.Wires.ImpedanceVariationCurve#getTapChanger
	 * @model opposite="TapChanger"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A TapChanger can have an associated ImpedanceVariationCurve to define impedance variations with tap step changes.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A TapChanger can have an associated ImpedanceVariationCurve to define impedance variations with tap step changes.'"
	 * @generated
	 */
	ImpedanceVariationCurve getImpedanceVariationCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#getImpedanceVariationCurve <em>Impedance Variation Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance Variation Curve</em>' reference.
	 * @see #getImpedanceVariationCurve()
	 * @generated
	 */
	void setImpedanceVariationCurve(ImpedanceVariationCurve value);

	/**
	 * Returns the value of the '<em><b>Sv Tap Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.StateVariables.SvTapStep#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv Tap Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv Tap Step</em>' reference.
	 * @see #setSvTapStep(SvTapStep)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_SvTapStep()
	 * @see CIM.IEC61970.StateVariables.SvTapStep#getTapChanger
	 * @model opposite="TapChanger"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The tap step state associated with the tap changer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The tap step state associated with the tap changer.'"
	 * @generated
	 */
	SvTapStep getSvTapStep();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#getSvTapStep <em>Sv Tap Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv Tap Step</em>' reference.
	 * @see #getSvTapStep()
	 * @generated
	 */
	void setSvTapStep(SvTapStep value);

	/**
	 * Returns the value of the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Step</em>' attribute.
	 * @see #setNormalStep(int)
	 * @see CIM.IEC61970.Wires.WiresPackage#getTapChanger_NormalStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The tap step position used in \"normal\" network operation for this winding. For a \"Fixed\" tap changer indicates the current physical tap setting.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The tap step position used in \"normal\" network operation for this winding. For a \"Fixed\" tap changer indicates the current physical tap setting.'"
	 * @generated
	 */
	int getNormalStep();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.TapChanger#getNormalStep <em>Normal Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Step</em>' attribute.
	 * @see #getNormalStep()
	 * @generated
	 */
	void setNormalStep(int value);

} // TapChanger
