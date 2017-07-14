/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCustomers;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61968.Customers.PricingStructure;

import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Quality Pricing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getPricingStructure <em>Pricing Structure</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getValueUninterruptedServiceEnergy <em>Value Uninterrupted Service Energy</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getVoltImbalanceViolCost <em>Volt Imbalance Viol Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getVoltLimitViolCost <em>Volt Limit Viol Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getEmergencyLowVoltLimit <em>Emergency Low Volt Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getValueUninterruptedServiceP <em>Value Uninterrupted Service P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getEmergencyHighVoltLimit <em>Emergency High Volt Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getPowerFactorMin <em>Power Factor Min</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getNormalLowVoltLimit <em>Normal Low Volt Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getNormalHighVoltLimit <em>Normal High Volt Limit</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getPowerQualityPricing()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pricing can be based on power quality.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Pricing can be based on power quality.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pricing can be based on power quality.' Profile\040documentation='Pricing can be based on power quality.'"
 * @generated
 */
public interface PowerQualityPricing extends Document {
	/**
	 * Returns the value of the '<em><b>Pricing Structure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getPowerQualityPricings <em>Power Quality Pricings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Structure</em>' reference.
	 * @see #setPricingStructure(PricingStructure)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getPowerQualityPricing_PricingStructure()
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getPowerQualityPricings
	 * @model opposite="PowerQualityPricings"
	 * @generated
	 */
	PricingStructure getPricingStructure();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getPricingStructure <em>Pricing Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing Structure</em>' reference.
	 * @see #getPricingStructure()
	 * @generated
	 */
	void setPricingStructure(PricingStructure value);

	/**
	 * Returns the value of the '<em><b>Value Uninterrupted Service Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Uninterrupted Service Energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Uninterrupted Service Energy</em>' attribute.
	 * @see #setValueUninterruptedServiceEnergy(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getPowerQualityPricing_ValueUninterruptedServiceEnergy()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value of uninterrupted service (Cost per energy).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value of uninterrupted service (Cost per energy).'"
	 * @generated
	 */
	float getValueUninterruptedServiceEnergy();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getValueUninterruptedServiceEnergy <em>Value Uninterrupted Service Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Uninterrupted Service Energy</em>' attribute.
	 * @see #getValueUninterruptedServiceEnergy()
	 * @generated
	 */
	void setValueUninterruptedServiceEnergy(float value);

	/**
	 * Returns the value of the '<em><b>Volt Imbalance Viol Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volt Imbalance Viol Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volt Imbalance Viol Cost</em>' attribute.
	 * @see #setVoltImbalanceViolCost(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getPowerQualityPricing_VoltImbalanceViolCost()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Voltage imbalance violation cost (Cost per unit Voltage).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Voltage imbalance violation cost (Cost per unit Voltage).'"
	 * @generated
	 */
	float getVoltImbalanceViolCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getVoltImbalanceViolCost <em>Volt Imbalance Viol Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volt Imbalance Viol Cost</em>' attribute.
	 * @see #getVoltImbalanceViolCost()
	 * @generated
	 */
	void setVoltImbalanceViolCost(float value);

	/**
	 * Returns the value of the '<em><b>Volt Limit Viol Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volt Limit Viol Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volt Limit Viol Cost</em>' attribute.
	 * @see #setVoltLimitViolCost(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getPowerQualityPricing_VoltLimitViolCost()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Voltage limit violation cost (Cost per unit Voltage).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Voltage limit violation cost (Cost per unit Voltage).'"
	 * @generated
	 */
	float getVoltLimitViolCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getVoltLimitViolCost <em>Volt Limit Viol Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volt Limit Viol Cost</em>' attribute.
	 * @see #getVoltLimitViolCost()
	 * @generated
	 */
	void setVoltLimitViolCost(float value);

	/**
	 * Returns the value of the '<em><b>Emergency Low Volt Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emergency Low Volt Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emergency Low Volt Limit</em>' attribute.
	 * @see #setEmergencyLowVoltLimit(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getPowerQualityPricing_EmergencyLowVoltLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Emergency low voltage limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Emergency low voltage limit.'"
	 * @generated
	 */
	float getEmergencyLowVoltLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getEmergencyLowVoltLimit <em>Emergency Low Volt Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency Low Volt Limit</em>' attribute.
	 * @see #getEmergencyLowVoltLimit()
	 * @generated
	 */
	void setEmergencyLowVoltLimit(float value);

	/**
	 * Returns the value of the '<em><b>Value Uninterrupted Service P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Uninterrupted Service P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Uninterrupted Service P</em>' attribute.
	 * @see #setValueUninterruptedServiceP(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getPowerQualityPricing_ValueUninterruptedServiceP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value of uninterrupted service (Cost per active power).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value of uninterrupted service (Cost per active power).'"
	 * @generated
	 */
	float getValueUninterruptedServiceP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getValueUninterruptedServiceP <em>Value Uninterrupted Service P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Uninterrupted Service P</em>' attribute.
	 * @see #getValueUninterruptedServiceP()
	 * @generated
	 */
	void setValueUninterruptedServiceP(float value);

	/**
	 * Returns the value of the '<em><b>Emergency High Volt Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emergency High Volt Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emergency High Volt Limit</em>' attribute.
	 * @see #setEmergencyHighVoltLimit(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getPowerQualityPricing_EmergencyHighVoltLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Emergency high voltage limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Emergency high voltage limit.'"
	 * @generated
	 */
	float getEmergencyHighVoltLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getEmergencyHighVoltLimit <em>Emergency High Volt Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency High Volt Limit</em>' attribute.
	 * @see #getEmergencyHighVoltLimit()
	 * @generated
	 */
	void setEmergencyHighVoltLimit(float value);

	/**
	 * Returns the value of the '<em><b>Power Factor Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Factor Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Factor Min</em>' attribute.
	 * @see #setPowerFactorMin(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getPowerQualityPricing_PowerFactorMin()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Threshold minimum power factor for this PricingStructure, specified in instances where a special charge is levied if the actual power factor for a Service falls below the value specified here.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Threshold minimum power factor for this PricingStructure, specified in instances where a special charge is levied if the actual power factor for a Service falls below the value specified here.'"
	 * @generated
	 */
	float getPowerFactorMin();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getPowerFactorMin <em>Power Factor Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Factor Min</em>' attribute.
	 * @see #getPowerFactorMin()
	 * @generated
	 */
	void setPowerFactorMin(float value);

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPowerQualityPricings <em>Power Quality Pricings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getPowerQualityPricing_ServiceDeliveryPoints()
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPowerQualityPricings
	 * @model opposite="PowerQualityPricings"
	 * @generated
	 */
	EList<ServiceDeliveryPoint> getServiceDeliveryPoints();

	/**
	 * Returns the value of the '<em><b>Normal Low Volt Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Low Volt Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Low Volt Limit</em>' attribute.
	 * @see #setNormalLowVoltLimit(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getPowerQualityPricing_NormalLowVoltLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal low voltage limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal low voltage limit.'"
	 * @generated
	 */
	float getNormalLowVoltLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getNormalLowVoltLimit <em>Normal Low Volt Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Low Volt Limit</em>' attribute.
	 * @see #getNormalLowVoltLimit()
	 * @generated
	 */
	void setNormalLowVoltLimit(float value);

	/**
	 * Returns the value of the '<em><b>Normal High Volt Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal High Volt Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal High Volt Limit</em>' attribute.
	 * @see #setNormalHighVoltLimit(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getPowerQualityPricing_NormalHighVoltLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal high voltage limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal high voltage limit.'"
	 * @generated
	 */
	float getNormalHighVoltLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getNormalHighVoltLimit <em>Normal High Volt Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal High Volt Limit</em>' attribute.
	 * @see #getNormalHighVoltLimit()
	 * @generated
	 */
	void setNormalHighVoltLimit(float value);

} // PowerQualityPricing
