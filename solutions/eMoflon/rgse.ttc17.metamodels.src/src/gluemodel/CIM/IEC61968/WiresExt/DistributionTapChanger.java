/**
 */
package gluemodel.CIM.IEC61968.WiresExt;

import gluemodel.CIM.IEC61970.Core.PhaseCode;

import gluemodel.CIM.IEC61970.Wires.RatioTapChanger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getPtRatio <em>Pt Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getLimitVoltage <em>Limit Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getReverseLineDropR <em>Reverse Line Drop R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getReverseLineDropX <em>Reverse Line Drop X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getCtRating <em>Ct Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getLineDropR <em>Line Drop R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getBandVoltage <em>Band Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getLineDropX <em>Line Drop X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getCtRatio <em>Ct Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#isLineDropCompensation <em>Line Drop Compensation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getMonitoredPhase <em>Monitored Phase</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getTargetVoltage <em>Target Voltage</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Additional ratio tap changer parameters common to distribution line regulators. \'tculControlMode\' would always be \'volt\'.\nIf \'monitoredPhase\' is not specified, then if the controlled DistributionTransformerWinding is single-phase, the PT primary is assumed to be connected across that winding, which is the normal case. If the controlled winding is three-phase, then the \'monitoredPhase\' is assumed to be \'AN\', unless otherwise specified.\nWhenever \'ctRatio\' and \'ptRatio\' are specified, it\'s customary to specify the R and X in \"volts\" referred to the PT secondary circuit, otherwise R and X are in feeder primary ohms.\nIf \'ptRatio\' is not specified, then \'targetVoltage\', \'limitVoltage\', and \'bandVoltage\' are on the feeder primary base, phase-neutral or phase-phase depending on the \'monitoredPhase\'. Otherwise, these attributes are all on the PT secondary base.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Additional ratio tap changer parameters common to distribution line regulators. \'tculControlMode\' would always be \'volt\'.\nIf \'monitoredPhase\' is not specified, then if the controlled DistributionTransformerWinding is single-phase, the PT primary is assumed to be connected across that winding, which is the normal case. If the controlled winding is three-phase, then the \'monitoredPhase\' is assumed to be \'AN\', unless otherwise specified.\nWhenever \'ctRatio\' and \'ptRatio\' are specified, it\'s customary to specify the R and X in \"volts\" referred to the PT secondary circuit, otherwise R and X are in feeder primary ohms.\nIf \'ptRatio\' is not specified, then \'targetVoltage\', \'limitVoltage\', and \'bandVoltage\' are on the feeder primary base, phase-neutral or phase-phase depending on the \'monitoredPhase\'. Otherwise, these attributes are all on the PT secondary base.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Additional ratio tap changer parameters common to distribution line regulators. \'tculControlMode\' would always be \'volt\'.\nIf \'monitoredPhase\' is not specified, then if the controlled DistributionTransformerWinding is single-phase, the PT primary is assumed to be connected across that winding, which is the normal case. If the controlled winding is three-phase, then the \'monitoredPhase\' is assumed to be \'AN\', unless otherwise specified.\nWhenever \'ctRatio\' and \'ptRatio\' are specified, it\'s customary to specify the R and X in \"volts\" referred to the PT secondary circuit, otherwise R and X are in feeder primary ohms.\nIf \'ptRatio\' is not specified, then \'targetVoltage\', \'limitVoltage\', and \'bandVoltage\' are on the feeder primary base, phase-neutral or phase-phase depending on the \'monitoredPhase\'. Otherwise, these attributes are all on the PT secondary base.' Profile\040documentation='Additional ratio tap changer parameters common to distribution line regulators. \'tculControlMode\' would always be \'volt\'.\nIf \'monitoredPhase\' is not specified, then if the controlled DistributionTransformerWinding is single-phase, the PT primary is assumed to be connected across that winding, which is the normal case. If the controlled winding is three-phase, then the \'monitoredPhase\' is assumed to be \'AN\', unless otherwise specified.\nWhenever \'ctRatio\' and \'ptRatio\' are specified, it\'s customary to specify the R and X in \"volts\" referred to the PT secondary circuit, otherwise R and X are in feeder primary ohms.\nIf \'ptRatio\' is not specified, then \'targetVoltage\', \'limitVoltage\', and \'bandVoltage\' are on the feeder primary base, phase-neutral or phase-phase depending on the \'monitoredPhase\'. Otherwise, these attributes are all on the PT secondary base.'"
 * @generated
 */
public interface DistributionTapChanger extends RatioTapChanger {
	/**
	 * Returns the value of the '<em><b>Pt Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pt Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt Ratio</em>' attribute.
	 * @see #setPtRatio(float)
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger_PtRatio()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Built-in voltage transducer ratio.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Built-in voltage transducer ratio.'"
	 * @generated
	 */
	float getPtRatio();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getPtRatio <em>Pt Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt Ratio</em>' attribute.
	 * @see #getPtRatio()
	 * @generated
	 */
	void setPtRatio(float value);

	/**
	 * Returns the value of the '<em><b>Limit Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Voltage</em>' attribute.
	 * @see #setLimitVoltage(float)
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger_LimitVoltage()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum allowed regulated voltage on the PT secondary base, regardless of line drop compensation. Sometimes referred to as first-house protection.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum allowed regulated voltage on the PT secondary base, regardless of line drop compensation. Sometimes referred to as first-house protection.'"
	 * @generated
	 */
	float getLimitVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getLimitVoltage <em>Limit Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Voltage</em>' attribute.
	 * @see #getLimitVoltage()
	 * @generated
	 */
	void setLimitVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Reverse Line Drop R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Line Drop R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Line Drop R</em>' attribute.
	 * @see #setReverseLineDropR(float)
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger_ReverseLineDropR()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Line drop compensator resistance setting for reverse power flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Line drop compensator resistance setting for reverse power flow.'"
	 * @generated
	 */
	float getReverseLineDropR();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getReverseLineDropR <em>Reverse Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Line Drop R</em>' attribute.
	 * @see #getReverseLineDropR()
	 * @generated
	 */
	void setReverseLineDropR(float value);

	/**
	 * Returns the value of the '<em><b>Reverse Line Drop X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Line Drop X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Line Drop X</em>' attribute.
	 * @see #setReverseLineDropX(float)
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger_ReverseLineDropX()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Line drop compensator reactance setting for reverse power flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Line drop compensator reactance setting for reverse power flow.'"
	 * @generated
	 */
	float getReverseLineDropX();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getReverseLineDropX <em>Reverse Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Line Drop X</em>' attribute.
	 * @see #getReverseLineDropX()
	 * @generated
	 */
	void setReverseLineDropX(float value);

	/**
	 * Returns the value of the '<em><b>Ct Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ct Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ct Rating</em>' attribute.
	 * @see #setCtRating(float)
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger_CtRating()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Built-in current transformer primary rating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Built-in current transformer primary rating.'"
	 * @generated
	 */
	float getCtRating();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getCtRating <em>Ct Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ct Rating</em>' attribute.
	 * @see #getCtRating()
	 * @generated
	 */
	void setCtRating(float value);

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
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger_LineDropR()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Line drop compensator resistance setting for normal (forward) power flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Line drop compensator resistance setting for normal (forward) power flow.'"
	 * @generated
	 */
	float getLineDropR();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getLineDropR <em>Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Drop R</em>' attribute.
	 * @see #getLineDropR()
	 * @generated
	 */
	void setLineDropR(float value);

	/**
	 * Returns the value of the '<em><b>Band Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Band Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Band Voltage</em>' attribute.
	 * @see #setBandVoltage(float)
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger_BandVoltage()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Voltage range (max - min) on the PT secondary base, centered on \'targetVoltage\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Voltage range (max - min) on the PT secondary base, centered on \'targetVoltage\'.'"
	 * @generated
	 */
	float getBandVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getBandVoltage <em>Band Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Band Voltage</em>' attribute.
	 * @see #getBandVoltage()
	 * @generated
	 */
	void setBandVoltage(float value);

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
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger_LineDropX()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Line drop compensator reactance setting for normal (forward) power flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Line drop compensator reactance setting for normal (forward) power flow.'"
	 * @generated
	 */
	float getLineDropX();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getLineDropX <em>Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Drop X</em>' attribute.
	 * @see #getLineDropX()
	 * @generated
	 */
	void setLineDropX(float value);

	/**
	 * Returns the value of the '<em><b>Ct Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ct Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ct Ratio</em>' attribute.
	 * @see #setCtRatio(float)
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger_CtRatio()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Built-in current transducer ratio.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Built-in current transducer ratio.'"
	 * @generated
	 */
	float getCtRatio();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getCtRatio <em>Ct Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ct Ratio</em>' attribute.
	 * @see #getCtRatio()
	 * @generated
	 */
	void setCtRatio(float value);

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
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger_LineDropCompensation()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='If true, the line drop compensation is to be applied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If true, the line drop compensation is to be applied.'"
	 * @generated
	 */
	boolean isLineDropCompensation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#isLineDropCompensation <em>Line Drop Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Drop Compensation</em>' attribute.
	 * @see #isLineDropCompensation()
	 * @generated
	 */
	void setLineDropCompensation(boolean value);

	/**
	 * Returns the value of the '<em><b>Monitored Phase</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Phase</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
	 * @see #setMonitoredPhase(PhaseCode)
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger_MonitoredPhase()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase voltage controlling this regulator, measured at regulator location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase voltage controlling this regulator, measured at regulator location.'"
	 * @generated
	 */
	PhaseCode getMonitoredPhase();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getMonitoredPhase <em>Monitored Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Phase</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
	 * @see #getMonitoredPhase()
	 * @generated
	 */
	void setMonitoredPhase(PhaseCode value);

	/**
	 * Returns the value of the '<em><b>Target Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Voltage</em>' attribute.
	 * @see #setTargetVoltage(float)
	 * @see gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTapChanger_TargetVoltage()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Target voltage on the PT secondary base.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Target voltage on the PT secondary base.'"
	 * @generated
	 */
	float getTargetVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTapChanger#getTargetVoltage <em>Target Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Voltage</em>' attribute.
	 * @see #getTargetVoltage()
	 * @generated
	 */
	void setTargetVoltage(float value);

} // DistributionTapChanger
