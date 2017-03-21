/**
 */
package CIM.IEC61968.Metering;

import CIM.IEC61970.Informative.InfMetering.MeteringFunctionConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electric Metering Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.ElectricMeteringFunction#isDemandMultiplierApplied <em>Demand Multiplier Applied</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getTransformerCTRatio <em>Transformer CT Ratio</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getBillingMultiplier <em>Billing Multiplier</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getMeteringFunctionConfiguration <em>Metering Function Configuration</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getCurrentRating <em>Current Rating</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ElectricMeteringFunction#isTransformerRatiosApplied <em>Transformer Ratios Applied</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getKWMultiplier <em>KW Multiplier</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ElectricMeteringFunction#isBillingMultiplierApplied <em>Billing Multiplier Applied</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getDemandMultiplier <em>Demand Multiplier</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getKWhMultiplier <em>KWh Multiplier</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getTransformerVTRatio <em>Transformer VT Ratio</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getVoltageRating <em>Voltage Rating</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Functionality performed by an electric meter.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Functionality performed by an electric meter.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Functionality performed by an electric meter.' Profile\040documentation='Functionality performed by an electric meter.'"
 * @generated
 */
public interface ElectricMeteringFunction extends DeviceFunction {
	/**
	 * Returns the value of the '<em><b>Demand Multiplier Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand Multiplier Applied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand Multiplier Applied</em>' attribute.
	 * @see #setDemandMultiplierApplied(boolean)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction_DemandMultiplierApplied()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if the demandMultiplier ratio has already been applied to the associated quantities.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if the demandMultiplier ratio has already been applied to the associated quantities.'"
	 * @generated
	 */
	boolean isDemandMultiplierApplied();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#isDemandMultiplierApplied <em>Demand Multiplier Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand Multiplier Applied</em>' attribute.
	 * @see #isDemandMultiplierApplied()
	 * @generated
	 */
	void setDemandMultiplierApplied(boolean value);

	/**
	 * Returns the value of the '<em><b>Transformer CT Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer CT Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer CT Ratio</em>' attribute.
	 * @see #setTransformerCTRatio(float)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction_TransformerCTRatio()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current transformer ratio used to convert associated quantities to real measurements.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current transformer ratio used to convert associated quantities to real measurements.'"
	 * @generated
	 */
	float getTransformerCTRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getTransformerCTRatio <em>Transformer CT Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer CT Ratio</em>' attribute.
	 * @see #getTransformerCTRatio()
	 * @generated
	 */
	void setTransformerCTRatio(float value);

	/**
	 * Returns the value of the '<em><b>Billing Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Multiplier</em>' attribute.
	 * @see #setBillingMultiplier(float)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction_BillingMultiplier()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Customer billing value = meter multiplier * transformer ratios * reading value. The multiplier identifies the scaling value to apply to the reported value after delivery of the tagged item.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Customer billing value = meter multiplier * transformer ratios * reading value. The multiplier identifies the scaling value to apply to the reported value after delivery of the tagged item.'"
	 * @generated
	 */
	float getBillingMultiplier();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getBillingMultiplier <em>Billing Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Multiplier</em>' attribute.
	 * @see #getBillingMultiplier()
	 * @generated
	 */
	void setBillingMultiplier(float value);

	/**
	 * Returns the value of the '<em><b>Metering Function Configuration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfMetering.MeteringFunctionConfiguration#getElectricMeteringFunctions <em>Electric Metering Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metering Function Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metering Function Configuration</em>' reference.
	 * @see #setMeteringFunctionConfiguration(MeteringFunctionConfiguration)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction_MeteringFunctionConfiguration()
	 * @see CIM.IEC61970.Informative.InfMetering.MeteringFunctionConfiguration#getElectricMeteringFunctions
	 * @model opposite="ElectricMeteringFunctions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Configuration for this electric metering function.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Configuration for this electric metering function.'"
	 * @generated
	 */
	MeteringFunctionConfiguration getMeteringFunctionConfiguration();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getMeteringFunctionConfiguration <em>Metering Function Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metering Function Configuration</em>' reference.
	 * @see #getMeteringFunctionConfiguration()
	 * @generated
	 */
	void setMeteringFunctionConfiguration(MeteringFunctionConfiguration value);

	/**
	 * Returns the value of the '<em><b>Current Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Rating</em>' attribute.
	 * @see #setCurrentRating(float)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction_CurrentRating()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The current class of the meter. Typical current classes in North America are 10 A, 20 A, 100 A, 200 A, or 320 A.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The current class of the meter. Typical current classes in North America are 10 A, 20 A, 100 A, 200 A, or 320 A.'"
	 * @generated
	 */
	float getCurrentRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getCurrentRating <em>Current Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Rating</em>' attribute.
	 * @see #getCurrentRating()
	 * @generated
	 */
	void setCurrentRating(float value);

	/**
	 * Returns the value of the '<em><b>Transformer Ratios Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Ratios Applied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Ratios Applied</em>' attribute.
	 * @see #setTransformerRatiosApplied(boolean)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction_TransformerRatiosApplied()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if transformer ratios have been already applied to the associated quantities.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if transformer ratios have been already applied to the associated quantities.'"
	 * @generated
	 */
	boolean isTransformerRatiosApplied();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#isTransformerRatiosApplied <em>Transformer Ratios Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Ratios Applied</em>' attribute.
	 * @see #isTransformerRatiosApplied()
	 * @generated
	 */
	void setTransformerRatiosApplied(boolean value);

	/**
	 * Returns the value of the '<em><b>KW Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KW Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KW Multiplier</em>' attribute.
	 * @see #setKWMultiplier(int)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction_KWMultiplier()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Meter kW (pulse) multiplier, used as a multiplier for a meter register reading to determine the actual amount of usage for which to bill a customer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Meter kW (pulse) multiplier, used as a multiplier for a meter register reading to determine the actual amount of usage for which to bill a customer.'"
	 * @generated
	 */
	int getKWMultiplier();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getKWMultiplier <em>KW Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KW Multiplier</em>' attribute.
	 * @see #getKWMultiplier()
	 * @generated
	 */
	void setKWMultiplier(int value);

	/**
	 * Returns the value of the '<em><b>Billing Multiplier Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Multiplier Applied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Multiplier Applied</em>' attribute.
	 * @see #setBillingMultiplierApplied(boolean)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction_BillingMultiplierApplied()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if the billingMultiplier ratio has already been applied to the associated quantities.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if the billingMultiplier ratio has already been applied to the associated quantities.'"
	 * @generated
	 */
	boolean isBillingMultiplierApplied();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#isBillingMultiplierApplied <em>Billing Multiplier Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Multiplier Applied</em>' attribute.
	 * @see #isBillingMultiplierApplied()
	 * @generated
	 */
	void setBillingMultiplierApplied(boolean value);

	/**
	 * Returns the value of the '<em><b>Demand Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand Multiplier</em>' attribute.
	 * @see #setDemandMultiplier(float)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction_DemandMultiplier()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An additional multiplier that may be used for normalization of the demand value to an hourly value. For example, if the demand interval were set to 15 min, the demand multiplier would be 4. If the meter design is such that the demand value reported and displayed is compensated for by the meter itself and no additional scaling is required outside of the meter, the value of the demand multiplier should be \"1\".'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An additional multiplier that may be used for normalization of the demand value to an hourly value. For example, if the demand interval were set to 15 min, the demand multiplier would be 4. If the meter design is such that the demand value reported and displayed is compensated for by the meter itself and no additional scaling is required outside of the meter, the value of the demand multiplier should be \"1\".'"
	 * @generated
	 */
	float getDemandMultiplier();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getDemandMultiplier <em>Demand Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand Multiplier</em>' attribute.
	 * @see #getDemandMultiplier()
	 * @generated
	 */
	void setDemandMultiplier(float value);

	/**
	 * Returns the value of the '<em><b>KWh Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KWh Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KWh Multiplier</em>' attribute.
	 * @see #setKWhMultiplier(int)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction_KWhMultiplier()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Meter kWh multiplier, used as a multiplier for a meter register reading to determine the actual amount of usage for which to bill a customer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Meter kWh multiplier, used as a multiplier for a meter register reading to determine the actual amount of usage for which to bill a customer.'"
	 * @generated
	 */
	int getKWhMultiplier();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getKWhMultiplier <em>KWh Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KWh Multiplier</em>' attribute.
	 * @see #getKWhMultiplier()
	 * @generated
	 */
	void setKWhMultiplier(int value);

	/**
	 * Returns the value of the '<em><b>Transformer VT Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer VT Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer VT Ratio</em>' attribute.
	 * @see #setTransformerVTRatio(float)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction_TransformerVTRatio()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Voltage transformer ratio used to convert associated quantities to real measurements.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Voltage transformer ratio used to convert associated quantities to real measurements.'"
	 * @generated
	 */
	float getTransformerVTRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getTransformerVTRatio <em>Transformer VT Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer VT Ratio</em>' attribute.
	 * @see #getTransformerVTRatio()
	 * @generated
	 */
	void setTransformerVTRatio(float value);

	/**
	 * Returns the value of the '<em><b>Voltage Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Rating</em>' attribute.
	 * @see #setVoltageRating(float)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction_VoltageRating()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The service voltage at which the meter is designed to operate. Typical voltage ratings in North America are 120 V, 240 V, 277 V or 480 V.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The service voltage at which the meter is designed to operate. Typical voltage ratings in North America are 120 V, 240 V, 277 V or 480 V.'"
	 * @generated
	 */
	float getVoltageRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getVoltageRating <em>Voltage Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Rating</em>' attribute.
	 * @see #getVoltageRating()
	 * @generated
	 */
	void setVoltageRating(float value);

} // ElectricMeteringFunction
