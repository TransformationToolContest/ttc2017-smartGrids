/**
 */
package gluemodel.CIM.IEC61970.Domain;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Domain.DomainFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The domain package is a data dictionary of quantities and units that define datatypes for attributes (properties) that may be used by any class in any other package.\n\nThis package contains the definition of primitive datatypes, including units of measure and permissible values. Each datatype contains a value attribute and an optional unit of measure, which is specified as a static variable initialized to the textual description of the unit of measure. The value of the \"units\" string may be country or customer specific. Typical values are given. Permissible values for enumerations are listed in the documentation for the attribute using UML constraint syntax inside curly braces. Lengths of variable strings are listed in the descriptive text where required.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The domain package is a data dictionary of quantities and units that define datatypes for attributes (properties) that may be used by any class in any other package.\n\nThis package contains the definition of primitive datatypes, including units of measure and permissible values. Each datatype contains a value attribute and an optional unit of measure, which is specified as a static variable initialized to the textual description of the unit of measure. The value of the \"units\" string may be country or customer specific. Typical values are given. Permissible values for enumerations are listed in the documentation for the attribute using UML constraint syntax inside curly braces. Lengths of variable strings are listed in the descriptive text where required.'"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Domain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimDomain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Domain.Currency <em>Currency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.Currency
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Domain.UnitSymbol <em>Unit Symbol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getUnitSymbol()
	 * @generated
	 */
	int UNIT_SYMBOL = 1;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Domain.MonetaryAmountPerHeatUnit <em>Monetary Amount Per Heat Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.MonetaryAmountPerHeatUnit
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getMonetaryAmountPerHeatUnit()
	 * @generated
	 */
	int MONETARY_AMOUNT_PER_HEAT_UNIT = 2;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Domain.MonetaryAmountRate <em>Monetary Amount Rate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.MonetaryAmountRate
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getMonetaryAmountRate()
	 * @generated
	 */
	int MONETARY_AMOUNT_RATE = 3;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Domain.MonetaryAmountPerEnergyUnit <em>Monetary Amount Per Energy Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.MonetaryAmountPerEnergyUnit
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getMonetaryAmountPerEnergyUnit()
	 * @generated
	 */
	int MONETARY_AMOUNT_PER_ENERGY_UNIT = 4;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Domain.UnitMultiplier <em>Unit Multiplier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getUnitMultiplier()
	 * @generated
	 */
	int UNIT_MULTIPLIER = 5;

	/**
	 * The meta object id for the '<em>Real Energy</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getRealEnergy()
	 * @generated
	 */
	int REAL_ENERGY = 6;

	/**
	 * The meta object id for the '<em>Water Level</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getWaterLevel()
	 * @generated
	 */
	int WATER_LEVEL = 7;

	/**
	 * The meta object id for the '<em>Susceptance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getSusceptance()
	 * @generated
	 */
	int SUSCEPTANCE = 8;

	/**
	 * The meta object id for the '<em>Voltage Per Reactive Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getVoltagePerReactivePower()
	 * @generated
	 */
	int VOLTAGE_PER_REACTIVE_POWER = 9;

	/**
	 * The meta object id for the '<em>Reactive Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getReactivePower()
	 * @generated
	 */
	int REACTIVE_POWER = 10;

	/**
	 * The meta object id for the '<em>Money</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getMoney()
	 * @generated
	 */
	int MONEY = 11;

	/**
	 * The meta object id for the '<em>PU</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getPU()
	 * @generated
	 */
	int PU = 12;

	/**
	 * The meta object id for the '<em>Pressure</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getPressure()
	 * @generated
	 */
	int PRESSURE = 13;

	/**
	 * The meta object id for the '<em>Apparent Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getApparentPower()
	 * @generated
	 */
	int APPARENT_POWER = 14;

	/**
	 * The meta object id for the '<em>Float Quantity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getFloatQuantity()
	 * @generated
	 */
	int FLOAT_QUANTITY = 15;

	/**
	 * The meta object id for the '<em>Conductance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getConductance()
	 * @generated
	 */
	int CONDUCTANCE = 16;

	/**
	 * The meta object id for the '<em>Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 17;

	/**
	 * The meta object id for the '<em>String Quantity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getStringQuantity()
	 * @generated
	 */
	int STRING_QUANTITY = 18;

	/**
	 * The meta object id for the '<em>Integer Quantity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getIntegerQuantity()
	 * @generated
	 */
	int INTEGER_QUANTITY = 19;

	/**
	 * The meta object id for the '<em>Seconds</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getSeconds()
	 * @generated
	 */
	int SECONDS = 20;

	/**
	 * The meta object id for the '<em>Rotation Speed</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getRotationSpeed()
	 * @generated
	 */
	int ROTATION_SPEED = 21;

	/**
	 * The meta object id for the '<em>Angle Radians</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getAngleRadians()
	 * @generated
	 */
	int ANGLE_RADIANS = 22;

	/**
	 * The meta object id for the '<em>Cost Per Energy Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getCostPerEnergyUnit()
	 * @generated
	 */
	int COST_PER_ENERGY_UNIT = 23;

	/**
	 * The meta object id for the '<em>Minutes</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getMinutes()
	 * @generated
	 */
	int MINUTES = 24;

	/**
	 * The meta object id for the '<em>Frequency</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getFrequency()
	 * @generated
	 */
	int FREQUENCY = 25;

	/**
	 * The meta object id for the '<em>Current Flow</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getCurrentFlow()
	 * @generated
	 */
	int CURRENT_FLOW = 26;

	/**
	 * The meta object id for the '<em>Inductance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getInductance()
	 * @generated
	 */
	int INDUCTANCE = 27;

	/**
	 * The meta object id for the '<em>KW Active Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getKWActivePower()
	 * @generated
	 */
	int KW_ACTIVE_POWER = 28;

	/**
	 * The meta object id for the '<em>Per Cent</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getPerCent()
	 * @generated
	 */
	int PER_CENT = 29;

	/**
	 * The meta object id for the '<em>Impedance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getImpedance()
	 * @generated
	 */
	int IMPEDANCE = 30;

	/**
	 * The meta object id for the '<em>Damping</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getDamping()
	 * @generated
	 */
	int DAMPING = 31;

	/**
	 * The meta object id for the '<em>Volume</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 32;

	/**
	 * The meta object id for the '<em>Resistance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getResistance()
	 * @generated
	 */
	int RESISTANCE = 33;

	/**
	 * The meta object id for the '<em>Active Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getActivePower()
	 * @generated
	 */
	int ACTIVE_POWER = 34;

	/**
	 * The meta object id for the '<em>Temperature</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getTemperature()
	 * @generated
	 */
	int TEMPERATURE = 35;

	/**
	 * The meta object id for the '<em>Reactance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getReactance()
	 * @generated
	 */
	int REACTANCE = 36;

	/**
	 * The meta object id for the '<em>Voltage</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getVoltage()
	 * @generated
	 */
	int VOLTAGE = 37;

	/**
	 * The meta object id for the '<em>Active Power Change Rate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getActivePowerChangeRate()
	 * @generated
	 */
	int ACTIVE_POWER_CHANGE_RATE = 38;

	/**
	 * The meta object id for the '<em>Absolute Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getAbsoluteDate()
	 * @generated
	 */
	int ABSOLUTE_DATE = 39;

	/**
	 * The meta object id for the '<em>Capacitance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getCapacitance()
	 * @generated
	 */
	int CAPACITANCE = 40;

	/**
	 * The meta object id for the '<em>Cost Rate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getCostRate()
	 * @generated
	 */
	int COST_RATE = 41;

	/**
	 * The meta object id for the '<em>Angle Degrees</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getAngleDegrees()
	 * @generated
	 */
	int ANGLE_DEGREES = 42;

	/**
	 * The meta object id for the '<em>Hours</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getHours()
	 * @generated
	 */
	int HOURS = 43;

	/**
	 * The meta object id for the '<em>Weight</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getWeight()
	 * @generated
	 */
	int WEIGHT = 44;


	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Domain.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Currency</em>'.
	 * @see gluemodel.CIM.IEC61970.Domain.Currency
	 * @generated
	 */
	EEnum getCurrency();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Domain.UnitSymbol <em>Unit Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Symbol</em>'.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
	 * @generated
	 */
	EEnum getUnitSymbol();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Domain.MonetaryAmountPerHeatUnit <em>Monetary Amount Per Heat Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monetary Amount Per Heat Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.Domain.MonetaryAmountPerHeatUnit
	 * @generated
	 */
	EEnum getMonetaryAmountPerHeatUnit();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Domain.MonetaryAmountRate <em>Monetary Amount Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monetary Amount Rate</em>'.
	 * @see gluemodel.CIM.IEC61970.Domain.MonetaryAmountRate
	 * @generated
	 */
	EEnum getMonetaryAmountRate();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Domain.MonetaryAmountPerEnergyUnit <em>Monetary Amount Per Energy Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monetary Amount Per Energy Unit</em>'.
	 * @see gluemodel.CIM.IEC61970.Domain.MonetaryAmountPerEnergyUnit
	 * @generated
	 */
	EEnum getMonetaryAmountPerEnergyUnit();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Domain.UnitMultiplier <em>Unit Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Multiplier</em>'.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @generated
	 */
	EEnum getUnitMultiplier();

	/**
	 * Returns the meta object for data type '<em>Real Energy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Real Energy</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Real electrical energy'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Real electrical energy'"
	 * @generated
	 */
	EDataType getRealEnergy();

	/**
	 * Returns the meta object for data type '<em>Water Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Water Level</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reservoir water level referred to a given datum such as mean sea level.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reservoir water level referred to a given datum such as mean sea level.'"
	 * @generated
	 */
	EDataType getWaterLevel();

	/**
	 * Returns the meta object for data type '<em>Susceptance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Susceptance</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Imaginary part of admittance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Imaginary part of admittance.'"
	 * @generated
	 */
	EDataType getSusceptance();

	/**
	 * Returns the meta object for data type '<em>Voltage Per Reactive Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Voltage Per Reactive Power</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Voltage variation with reactive power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Voltage variation with reactive power'"
	 * @generated
	 */
	EDataType getVoltagePerReactivePower();

	/**
	 * Returns the meta object for data type '<em>Reactive Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reactive Power</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Product of RMS value of the voltage and the RMS value of the quadrature component of the current.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Product of RMS value of the voltage and the RMS value of the quadrature component of the current.'"
	 * @generated
	 */
	EDataType getReactivePower();

	/**
	 * Returns the meta object for data type '<em>Money</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Money</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Amount of money'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Amount of money'"
	 * @generated
	 */
	EDataType getMoney();

	/**
	 * Returns the meta object for data type '<em>PU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>PU</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Per Unit - a positive or negative value referred to a defined base. Values typically range from -10 to +10.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Per Unit - a positive or negative value referred to a defined base. Values typically range from -10 to +10.'"
	 * @generated
	 */
	EDataType getPU();

	/**
	 * Returns the meta object for data type '<em>Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pressure</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressure in Pascal.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressure in Pascal.'"
	 * @generated
	 */
	EDataType getPressure();

	/**
	 * Returns the meta object for data type '<em>Apparent Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Apparent Power</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Product of the RMS value of the voltage and the RMS value of the current'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Product of the RMS value of the voltage and the RMS value of the current'"
	 * @generated
	 */
	EDataType getApparentPower();

	/**
	 * Returns the meta object for data type '<em>Float Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float Quantity</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quantity with float value and associated unit information.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quantity with float value and associated unit information.'"
	 * @generated
	 */
	EDataType getFloatQuantity();

	/**
	 * Returns the meta object for data type '<em>Conductance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conductance</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Factor by which voltage must be multiplied to give corresponding power lost from a circuit. Real part of admittance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Factor by which voltage must be multiplied to give corresponding power lost from a circuit. Real part of admittance.'"
	 * @generated
	 */
	EDataType getConductance();

	/**
	 * Returns the meta object for data type '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Length</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unit of length.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unit of length.'"
	 * @generated
	 */
	EDataType getLength();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Quantity</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#string'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quantity with string value (when it is not important whether it is an integral or a floating point number) and associated unit information.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quantity with string value (when it is not important whether it is an integral or a floating point number) and associated unit information.'"
	 * @generated
	 */
	EDataType getStringQuantity();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Integer Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Quantity</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#integer'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quantity with integer value and associated unit information.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quantity with integer value and associated unit information.'"
	 * @generated
	 */
	EDataType getIntegerQuantity();

	/**
	 * Returns the meta object for data type '<em>Seconds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Seconds</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time, in seconds'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time, in seconds'"
	 * @generated
	 */
	EDataType getSeconds();

	/**
	 * Returns the meta object for data type '<em>Rotation Speed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rotation Speed</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of revolutions per second.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of revolutions per second.'"
	 * @generated
	 */
	EDataType getRotationSpeed();

	/**
	 * Returns the meta object for data type '<em>Angle Radians</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle Radians</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase angle in radians'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase angle in radians'"
	 * @generated
	 */
	EDataType getAngleRadians();

	/**
	 * Returns the meta object for data type '<em>Cost Per Energy Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cost Per Energy Unit</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cost, in units of currency, per quantity of electrical energy generated.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cost, in units of currency, per quantity of electrical energy generated.'"
	 * @generated
	 */
	EDataType getCostPerEnergyUnit();

	/**
	 * Returns the meta object for data type '<em>Minutes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Minutes</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time in minutes'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time in minutes'"
	 * @generated
	 */
	EDataType getMinutes();

	/**
	 * Returns the meta object for data type '<em>Frequency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frequency</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cycles per second'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cycles per second'"
	 * @generated
	 */
	EDataType getFrequency();

	/**
	 * Returns the meta object for data type '<em>Current Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Current Flow</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Electrical current (positive flow is out of the ConductingEquipment into the ConnectivityNode)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Electrical current (positive flow is out of the ConductingEquipment into the ConnectivityNode)'"
	 * @generated
	 */
	EDataType getCurrentFlow();

	/**
	 * Returns the meta object for data type '<em>Inductance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Inductance</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Inductance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Inductance.'"
	 * @generated
	 */
	EDataType getInductance();

	/**
	 * Returns the meta object for data type '<em>KW Active Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>KW Active Power</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Active power in kilowatts.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Active power in kilowatts.'"
	 * @generated
	 */
	EDataType getKWActivePower();

	/**
	 * Returns the meta object for data type '<em>Per Cent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Per Cent</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normally 0 - 100 on a defined base'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normally 0 - 100 on a defined base'"
	 * @generated
	 */
	EDataType getPerCent();

	/**
	 * Returns the meta object for data type '<em>Impedance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Impedance</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ratio of voltage to current.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ratio of voltage to current.'"
	 * @generated
	 */
	EDataType getImpedance();

	/**
	 * Returns the meta object for data type '<em>Damping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Damping</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Per-unit active power variation with per-unit frequency referenced on the system apparent power base. Typical values in range 1.0 - 2.0.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Per-unit active power variation with per-unit frequency referenced on the system apparent power base. Typical values in range 1.0 - 2.0.'"
	 * @generated
	 */
	EDataType getDamping();

	/**
	 * Returns the meta object for data type '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Volume</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Volume.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Volume.'"
	 * @generated
	 */
	EDataType getVolume();

	/**
	 * Returns the meta object for data type '<em>Resistance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resistance</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Resistance (real part of impedance).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Resistance (real part of impedance).'"
	 * @generated
	 */
	EDataType getResistance();

	/**
	 * Returns the meta object for data type '<em>Active Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Active Power</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Product of RMS value of the voltage and the RMS value of the in-phase component of the current'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Product of RMS value of the voltage and the RMS value of the in-phase component of the current'"
	 * @generated
	 */
	EDataType getActivePower();

	/**
	 * Returns the meta object for data type '<em>Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Temperature</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value of temperature in degrees Celsius.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value of temperature in degrees Celsius.'"
	 * @generated
	 */
	EDataType getTemperature();

	/**
	 * Returns the meta object for data type '<em>Reactance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reactance</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reactance (imaginary part of impedance), at rated frequency.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reactance (imaginary part of impedance), at rated frequency.'"
	 * @generated
	 */
	EDataType getReactance();

	/**
	 * Returns the meta object for data type '<em>Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Voltage</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Electrical voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Electrical voltage.'"
	 * @generated
	 */
	EDataType getVoltage();

	/**
	 * Returns the meta object for data type '<em>Active Power Change Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Active Power Change Rate</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 * @generated
	 */
	EDataType getActivePowerChangeRate();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Absolute Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Absolute Date</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#string'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time as \"yyyy-mm-dd\", which conforms with ISO 8601. UTC time zone is specified as \"yyyy-mm-dd\".'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time as \"yyyy-mm-dd\", which conforms with ISO 8601. UTC time zone is specified as \"yyyy-mm-dd\".'"
	 * @generated
	 */
	EDataType getAbsoluteDate();

	/**
	 * Returns the meta object for data type '<em>Capacitance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Capacitance</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Farad, the typical unit, is the capacitance in which a charge of 1 coulomb produces 1 volt potential difference between its terminals.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Farad, the typical unit, is the capacitance in which a charge of 1 coulomb produces 1 volt potential difference between its terminals.'"
	 * @generated
	 */
	EDataType getCapacitance();

	/**
	 * Returns the meta object for data type '<em>Cost Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cost Rate</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cost, in units of currency, per hour of elapsed time'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cost, in units of currency, per hour of elapsed time'"
	 * @generated
	 */
	EDataType getCostRate();

	/**
	 * Returns the meta object for data type '<em>Angle Degrees</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle Degrees</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurement of angle in degrees'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement of angle in degrees'"
	 * @generated
	 */
	EDataType getAngleDegrees();

	/**
	 * Returns the meta object for data type '<em>Hours</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hours</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time, in hours'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time, in hours'"
	 * @generated
	 */
	EDataType getHours();

	/**
	 * Returns the meta object for data type '<em>Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Weight</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The weight of an object.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The weight of an object.'"
	 * @generated
	 */
	EDataType getWeight();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Domain.Currency <em>Currency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.Currency
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getCurrency()
		 * @generated
		 */
		EEnum CURRENCY = eINSTANCE.getCurrency();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Domain.UnitSymbol <em>Unit Symbol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getUnitSymbol()
		 * @generated
		 */
		EEnum UNIT_SYMBOL = eINSTANCE.getUnitSymbol();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Domain.MonetaryAmountPerHeatUnit <em>Monetary Amount Per Heat Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.MonetaryAmountPerHeatUnit
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getMonetaryAmountPerHeatUnit()
		 * @generated
		 */
		EEnum MONETARY_AMOUNT_PER_HEAT_UNIT = eINSTANCE.getMonetaryAmountPerHeatUnit();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Domain.MonetaryAmountRate <em>Monetary Amount Rate</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.MonetaryAmountRate
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getMonetaryAmountRate()
		 * @generated
		 */
		EEnum MONETARY_AMOUNT_RATE = eINSTANCE.getMonetaryAmountRate();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Domain.MonetaryAmountPerEnergyUnit <em>Monetary Amount Per Energy Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.MonetaryAmountPerEnergyUnit
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getMonetaryAmountPerEnergyUnit()
		 * @generated
		 */
		EEnum MONETARY_AMOUNT_PER_ENERGY_UNIT = eINSTANCE.getMonetaryAmountPerEnergyUnit();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Domain.UnitMultiplier <em>Unit Multiplier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getUnitMultiplier()
		 * @generated
		 */
		EEnum UNIT_MULTIPLIER = eINSTANCE.getUnitMultiplier();

		/**
		 * The meta object literal for the '<em>Real Energy</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getRealEnergy()
		 * @generated
		 */
		EDataType REAL_ENERGY = eINSTANCE.getRealEnergy();

		/**
		 * The meta object literal for the '<em>Water Level</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getWaterLevel()
		 * @generated
		 */
		EDataType WATER_LEVEL = eINSTANCE.getWaterLevel();

		/**
		 * The meta object literal for the '<em>Susceptance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getSusceptance()
		 * @generated
		 */
		EDataType SUSCEPTANCE = eINSTANCE.getSusceptance();

		/**
		 * The meta object literal for the '<em>Voltage Per Reactive Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getVoltagePerReactivePower()
		 * @generated
		 */
		EDataType VOLTAGE_PER_REACTIVE_POWER = eINSTANCE.getVoltagePerReactivePower();

		/**
		 * The meta object literal for the '<em>Reactive Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getReactivePower()
		 * @generated
		 */
		EDataType REACTIVE_POWER = eINSTANCE.getReactivePower();

		/**
		 * The meta object literal for the '<em>Money</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getMoney()
		 * @generated
		 */
		EDataType MONEY = eINSTANCE.getMoney();

		/**
		 * The meta object literal for the '<em>PU</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getPU()
		 * @generated
		 */
		EDataType PU = eINSTANCE.getPU();

		/**
		 * The meta object literal for the '<em>Pressure</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getPressure()
		 * @generated
		 */
		EDataType PRESSURE = eINSTANCE.getPressure();

		/**
		 * The meta object literal for the '<em>Apparent Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getApparentPower()
		 * @generated
		 */
		EDataType APPARENT_POWER = eINSTANCE.getApparentPower();

		/**
		 * The meta object literal for the '<em>Float Quantity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getFloatQuantity()
		 * @generated
		 */
		EDataType FLOAT_QUANTITY = eINSTANCE.getFloatQuantity();

		/**
		 * The meta object literal for the '<em>Conductance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getConductance()
		 * @generated
		 */
		EDataType CONDUCTANCE = eINSTANCE.getConductance();

		/**
		 * The meta object literal for the '<em>Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getLength()
		 * @generated
		 */
		EDataType LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em>String Quantity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getStringQuantity()
		 * @generated
		 */
		EDataType STRING_QUANTITY = eINSTANCE.getStringQuantity();

		/**
		 * The meta object literal for the '<em>Integer Quantity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getIntegerQuantity()
		 * @generated
		 */
		EDataType INTEGER_QUANTITY = eINSTANCE.getIntegerQuantity();

		/**
		 * The meta object literal for the '<em>Seconds</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getSeconds()
		 * @generated
		 */
		EDataType SECONDS = eINSTANCE.getSeconds();

		/**
		 * The meta object literal for the '<em>Rotation Speed</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getRotationSpeed()
		 * @generated
		 */
		EDataType ROTATION_SPEED = eINSTANCE.getRotationSpeed();

		/**
		 * The meta object literal for the '<em>Angle Radians</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getAngleRadians()
		 * @generated
		 */
		EDataType ANGLE_RADIANS = eINSTANCE.getAngleRadians();

		/**
		 * The meta object literal for the '<em>Cost Per Energy Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getCostPerEnergyUnit()
		 * @generated
		 */
		EDataType COST_PER_ENERGY_UNIT = eINSTANCE.getCostPerEnergyUnit();

		/**
		 * The meta object literal for the '<em>Minutes</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getMinutes()
		 * @generated
		 */
		EDataType MINUTES = eINSTANCE.getMinutes();

		/**
		 * The meta object literal for the '<em>Frequency</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getFrequency()
		 * @generated
		 */
		EDataType FREQUENCY = eINSTANCE.getFrequency();

		/**
		 * The meta object literal for the '<em>Current Flow</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getCurrentFlow()
		 * @generated
		 */
		EDataType CURRENT_FLOW = eINSTANCE.getCurrentFlow();

		/**
		 * The meta object literal for the '<em>Inductance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getInductance()
		 * @generated
		 */
		EDataType INDUCTANCE = eINSTANCE.getInductance();

		/**
		 * The meta object literal for the '<em>KW Active Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getKWActivePower()
		 * @generated
		 */
		EDataType KW_ACTIVE_POWER = eINSTANCE.getKWActivePower();

		/**
		 * The meta object literal for the '<em>Per Cent</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getPerCent()
		 * @generated
		 */
		EDataType PER_CENT = eINSTANCE.getPerCent();

		/**
		 * The meta object literal for the '<em>Impedance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getImpedance()
		 * @generated
		 */
		EDataType IMPEDANCE = eINSTANCE.getImpedance();

		/**
		 * The meta object literal for the '<em>Damping</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getDamping()
		 * @generated
		 */
		EDataType DAMPING = eINSTANCE.getDamping();

		/**
		 * The meta object literal for the '<em>Volume</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getVolume()
		 * @generated
		 */
		EDataType VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em>Resistance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getResistance()
		 * @generated
		 */
		EDataType RESISTANCE = eINSTANCE.getResistance();

		/**
		 * The meta object literal for the '<em>Active Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getActivePower()
		 * @generated
		 */
		EDataType ACTIVE_POWER = eINSTANCE.getActivePower();

		/**
		 * The meta object literal for the '<em>Temperature</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getTemperature()
		 * @generated
		 */
		EDataType TEMPERATURE = eINSTANCE.getTemperature();

		/**
		 * The meta object literal for the '<em>Reactance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getReactance()
		 * @generated
		 */
		EDataType REACTANCE = eINSTANCE.getReactance();

		/**
		 * The meta object literal for the '<em>Voltage</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getVoltage()
		 * @generated
		 */
		EDataType VOLTAGE = eINSTANCE.getVoltage();

		/**
		 * The meta object literal for the '<em>Active Power Change Rate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getActivePowerChangeRate()
		 * @generated
		 */
		EDataType ACTIVE_POWER_CHANGE_RATE = eINSTANCE.getActivePowerChangeRate();

		/**
		 * The meta object literal for the '<em>Absolute Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getAbsoluteDate()
		 * @generated
		 */
		EDataType ABSOLUTE_DATE = eINSTANCE.getAbsoluteDate();

		/**
		 * The meta object literal for the '<em>Capacitance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getCapacitance()
		 * @generated
		 */
		EDataType CAPACITANCE = eINSTANCE.getCapacitance();

		/**
		 * The meta object literal for the '<em>Cost Rate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getCostRate()
		 * @generated
		 */
		EDataType COST_RATE = eINSTANCE.getCostRate();

		/**
		 * The meta object literal for the '<em>Angle Degrees</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getAngleDegrees()
		 * @generated
		 */
		EDataType ANGLE_DEGREES = eINSTANCE.getAngleDegrees();

		/**
		 * The meta object literal for the '<em>Hours</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getHours()
		 * @generated
		 */
		EDataType HOURS = eINSTANCE.getHours();

		/**
		 * The meta object literal for the '<em>Weight</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Domain.impl.DomainPackageImpl#getWeight()
		 * @generated
		 */
		EDataType WEIGHT = eINSTANCE.getWeight();

	}

} //DomainPackage
