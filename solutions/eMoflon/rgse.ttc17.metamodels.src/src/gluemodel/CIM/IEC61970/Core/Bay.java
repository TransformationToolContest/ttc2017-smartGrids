/**
 */
package gluemodel.CIM.IEC61970.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Bay#isBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Bay#getBusBarConfiguration <em>Bus Bar Configuration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Bay#isBayPowerMeasFlag <em>Bay Power Meas Flag</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Bay#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Bay#getBreakerConfiguration <em>Breaker Configuration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.Bay#getSubstation <em>Substation</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getBay()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A collection of power system resources (within a given substation) including conducting equipment, protection relays, measurements, and telemetry.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A collection of power system resources (within a given substation) including conducting equipment, protection relays, measurements, and telemetry.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A collection of power system resources (within a given substation) including conducting equipment, protection relays, measurements, and telemetry.' Profile\040documentation='A collection of power system resources (within a given substation) including conducting equipment, protection relays, measurements, and telemetry.'"
 * @generated
 */
public interface Bay extends EquipmentContainer {
	/**
	 * Returns the value of the '<em><b>Bay Energy Meas Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bay Energy Meas Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bay Energy Meas Flag</em>' attribute.
	 * @see #setBayEnergyMeasFlag(boolean)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getBay_BayEnergyMeasFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Indicates the presence/absence of energy measurements.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Indicates the presence/absence of energy measurements.'"
	 * @generated
	 */
	boolean isBayEnergyMeasFlag();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Bay#isBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bay Energy Meas Flag</em>' attribute.
	 * @see #isBayEnergyMeasFlag()
	 * @generated
	 */
	void setBayEnergyMeasFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Bus Bar Configuration</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Core.BusbarConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Bar Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Bar Configuration</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.BusbarConfiguration
	 * @see #setBusBarConfiguration(BusbarConfiguration)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getBay_BusBarConfiguration()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bus bar configuration.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bus bar configuration.'"
	 * @generated
	 */
	BusbarConfiguration getBusBarConfiguration();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Bay#getBusBarConfiguration <em>Bus Bar Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Bar Configuration</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.BusbarConfiguration
	 * @see #getBusBarConfiguration()
	 * @generated
	 */
	void setBusBarConfiguration(BusbarConfiguration value);

	/**
	 * Returns the value of the '<em><b>Bay Power Meas Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bay Power Meas Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bay Power Meas Flag</em>' attribute.
	 * @see #setBayPowerMeasFlag(boolean)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getBay_BayPowerMeasFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Indicates the presence/absence of active/reactive power measurements.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Indicates the presence/absence of active/reactive power measurements.'"
	 * @generated
	 */
	boolean isBayPowerMeasFlag();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Bay#isBayPowerMeasFlag <em>Bay Power Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bay Power Meas Flag</em>' attribute.
	 * @see #isBayPowerMeasFlag()
	 * @generated
	 */
	void setBayPowerMeasFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Voltage Level</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getBays <em>Bays</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Level</em>' reference.
	 * @see #setVoltageLevel(VoltageLevel)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getBay_VoltageLevel()
	 * @see gluemodel.CIM.IEC61970.Core.VoltageLevel#getBays
	 * @model opposite="Bays"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	VoltageLevel getVoltageLevel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Bay#getVoltageLevel <em>Voltage Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Level</em>' reference.
	 * @see #getVoltageLevel()
	 * @generated
	 */
	void setVoltageLevel(VoltageLevel value);

	/**
	 * Returns the value of the '<em><b>Breaker Configuration</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Core.BreakerConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breaker Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breaker Configuration</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.BreakerConfiguration
	 * @see #setBreakerConfiguration(BreakerConfiguration)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getBay_BreakerConfiguration()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Breaker configuration.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Breaker configuration.'"
	 * @generated
	 */
	BreakerConfiguration getBreakerConfiguration();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Bay#getBreakerConfiguration <em>Breaker Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breaker Configuration</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.BreakerConfiguration
	 * @see #getBreakerConfiguration()
	 * @generated
	 */
	void setBreakerConfiguration(BreakerConfiguration value);

	/**
	 * Returns the value of the '<em><b>Substation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Substation#getBays <em>Bays</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation</em>' reference.
	 * @see #setSubstation(Substation)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getBay_Substation()
	 * @see gluemodel.CIM.IEC61970.Core.Substation#getBays
	 * @model opposite="Bays"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	Substation getSubstation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.Bay#getSubstation <em>Substation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substation</em>' reference.
	 * @see #getSubstation()
	 * @generated
	 */
	void setSubstation(Substation value);

} // Bay
