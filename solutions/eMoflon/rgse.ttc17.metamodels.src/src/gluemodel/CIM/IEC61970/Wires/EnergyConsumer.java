/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.Core.ConductingEquipment;

import gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic;
import gluemodel.CIM.IEC61970.LoadModel.PowerCutZone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getPfixed <em>Pfixed</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getCustomerCount <em>Customer Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getLoadResponse <em>Load Response</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getQfixed <em>Qfixed</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergyConsumer()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generic user of energy - a  point of consumption on the power system model'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Generic user of energy - a  point of consumption on the power system model'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generic user of energy - a  point of consumption on the power system model' Profile\040documentation='Generic user of energy - a  point of consumption on the power system model'"
 * @generated
 */
public interface EnergyConsumer extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergyConsumer_ServiceDeliveryPoints()
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEnergyConsumer
	 * @model opposite="EnergyConsumer"
	 * @generated
	 */
	EList<ServiceDeliveryPoint> getServiceDeliveryPoints();

	/**
	 * Returns the value of the '<em><b>Power Cut Zone</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.LoadModel.PowerCutZone#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Cut Zone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Cut Zone</em>' reference.
	 * @see #setPowerCutZone(PowerCutZone)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergyConsumer_PowerCutZone()
	 * @see gluemodel.CIM.IEC61970.LoadModel.PowerCutZone#getEnergyConsumers
	 * @model opposite="EnergyConsumers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An energy consumer is assigned to a power cut zone'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An energy consumer is assigned to a power cut zone'"
	 * @generated
	 */
	PowerCutZone getPowerCutZone();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Cut Zone</em>' reference.
	 * @see #getPowerCutZone()
	 * @generated
	 */
	void setPowerCutZone(PowerCutZone value);

	/**
	 * Returns the value of the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pfixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pfixed</em>' attribute.
	 * @see #setPfixed(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergyConsumer_Pfixed()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Active power of the load that is a fixed quantity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Active power of the load that is a fixed quantity.'"
	 * @generated
	 */
	float getPfixed();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getPfixed <em>Pfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pfixed</em>' attribute.
	 * @see #getPfixed()
	 * @generated
	 */
	void setPfixed(float value);

	/**
	 * Returns the value of the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qfixed Pct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qfixed Pct</em>' attribute.
	 * @see #setQfixedPct(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergyConsumer_QfixedPct()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fixed reactive power as per cent of load group fixed reactive power.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fixed reactive power as per cent of load group fixed reactive power.'"
	 * @generated
	 */
	float getQfixedPct();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qfixed Pct</em>' attribute.
	 * @see #getQfixedPct()
	 * @generated
	 */
	void setQfixedPct(float value);

	/**
	 * Returns the value of the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Count</em>' attribute.
	 * @see #setCustomerCount(int)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergyConsumer_CustomerCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of individual customers represented by this Demand'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of individual customers represented by this Demand'"
	 * @generated
	 */
	int getCustomerCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getCustomerCount <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Count</em>' attribute.
	 * @see #getCustomerCount()
	 * @generated
	 */
	void setCustomerCount(int value);

	/**
	 * Returns the value of the '<em><b>Load Response</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Response</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Response</em>' reference.
	 * @see #setLoadResponse(LoadResponseCharacteristic)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergyConsumer_LoadResponse()
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getEnergyConsumer
	 * @model opposite="EnergyConsumer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The load response characteristic of this load.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The load response characteristic of this load.'"
	 * @generated
	 */
	LoadResponseCharacteristic getLoadResponse();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getLoadResponse <em>Load Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Response</em>' reference.
	 * @see #getLoadResponse()
	 * @generated
	 */
	void setLoadResponse(LoadResponseCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pfixed Pct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pfixed Pct</em>' attribute.
	 * @see #setPfixedPct(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergyConsumer_PfixedPct()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fixed active power as per cent of load group fixed active power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fixed active power as per cent of load group fixed active power'"
	 * @generated
	 */
	float getPfixedPct();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pfixed Pct</em>' attribute.
	 * @see #getPfixedPct()
	 * @generated
	 */
	void setPfixedPct(float value);

	/**
	 * Returns the value of the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qfixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qfixed</em>' attribute.
	 * @see #setQfixed(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergyConsumer_Qfixed()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reactive power of the load that is a fixed quantity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reactive power of the load that is a fixed quantity.'"
	 * @generated
	 */
	float getQfixed();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getQfixed <em>Qfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qfixed</em>' attribute.
	 * @see #getQfixed()
	 * @generated
	 */
	void setQfixed(float value);

} // EnergyConsumer
