/**
 */
package gluemodel.CIM.IEC61968.Metering;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Domain.UnitMultiplier;
import gluemodel.CIM.IEC61970.Domain.UnitSymbol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getIntervalLength <em>Interval Length</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getDynamicConfiguration <em>Dynamic Configuration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getUnit <em>Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getDefaultQuality <em>Default Quality</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getRegister <em>Register</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getIntervalBlocks <em>Interval Blocks</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getReadings <em>Readings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getChannelNumber <em>Channel Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getDefaultValueDataType <em>Default Value Data Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#isReverseChronology <em>Reverse Chronology</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getPending <em>Pending</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of data conveyed by a specific Reading.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Type of data conveyed by a specific Reading.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of data conveyed by a specific Reading.' Profile\040documentation='Type of data conveyed by a specific Reading.'"
 * @generated
 */
public interface ReadingType extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Interval Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Length</em>' attribute.
	 * @see #setIntervalLength(float)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_IntervalLength()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if incremental reading value) Length of increment interval.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if incremental reading value) Length of increment interval.'"
	 * @generated
	 */
	float getIntervalLength();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getIntervalLength <em>Interval Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Length</em>' attribute.
	 * @see #getIntervalLength()
	 * @generated
	 */
	void setIntervalLength(float value);

	/**
	 * Returns the value of the '<em><b>Dynamic Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Configuration</em>' reference.
	 * @see #setDynamicConfiguration(DynamicDemand)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_DynamicConfiguration()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Demand configuration.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Demand configuration.'"
	 * @generated
	 */
	DynamicDemand getDynamicConfiguration();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getDynamicConfiguration <em>Dynamic Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Configuration</em>' reference.
	 * @see #getDynamicConfiguration()
	 * @generated
	 */
	void setDynamicConfiguration(DynamicDemand value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
	 * @see #setUnit(UnitSymbol)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_Unit()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unit for the reading value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unit for the reading value.'"
	 * @generated
	 */
	UnitSymbol getUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitSymbol
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitSymbol value);

	/**
	 * Returns the value of the '<em><b>Default Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Quality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Quality</em>' attribute.
	 * @see #setDefaultQuality(String)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_DefaultQuality()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Characteristics of a data value conveyed by a specific Reading, which allow an application to understand how a specific Reading is to be interpreted.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Characteristics of a data value conveyed by a specific Reading, which allow an application to understand how a specific Reading is to be interpreted.'"
	 * @generated
	 */
	String getDefaultQuality();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getDefaultQuality <em>Default Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Quality</em>' attribute.
	 * @see #getDefaultQuality()
	 * @generated
	 */
	void setDefaultQuality(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.Metering.ReadingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingKind
	 * @see #setKind(ReadingKind)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of reading.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of reading.'"
	 * @generated
	 */
	ReadingKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ReadingKind value);

	/**
	 * Returns the value of the '<em><b>Register</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.Register#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register</em>' reference.
	 * @see #setRegister(Register)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_Register()
	 * @see gluemodel.CIM.IEC61968.Metering.Register#getReadingType
	 * @model opposite="ReadingType"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Register displaying values with this type information.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Register displaying values with this type information.'"
	 * @generated
	 */
	Register getRegister();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getRegister <em>Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register</em>' reference.
	 * @see #getRegister()
	 * @generated
	 */
	void setRegister(Register value);

	/**
	 * Returns the value of the '<em><b>Interval Blocks</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.IntervalBlock}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.IntervalBlock#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Blocks</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_IntervalBlocks()
	 * @see gluemodel.CIM.IEC61968.Metering.IntervalBlock#getReadingType
	 * @model opposite="ReadingType"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All blocks containing interval reading values with this type information.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All blocks containing interval reading values with this type information.'"
	 * @generated
	 */
	EList<IntervalBlock> getIntervalBlocks();

	/**
	 * Returns the value of the '<em><b>Readings</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.Reading}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.Reading#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_Readings()
	 * @see gluemodel.CIM.IEC61968.Metering.Reading#getReadingType
	 * @model opposite="ReadingType"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All reading values with this type information.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All reading values with this type information.'"
	 * @generated
	 */
	EList<Reading> getReadings();

	/**
	 * Returns the value of the '<em><b>Channel Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Number</em>' attribute.
	 * @see #setChannelNumber(int)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_ChannelNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Logical positioning of this measurement data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Logical positioning of this measurement data.'"
	 * @generated
	 */
	int getChannelNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getChannelNumber <em>Channel Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Number</em>' attribute.
	 * @see #getChannelNumber()
	 * @generated
	 */
	void setChannelNumber(int value);

	/**
	 * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplier</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see #setMultiplier(UnitMultiplier)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_Multiplier()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Multiplier for \'unit\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Multiplier for \'unit\'.'"
	 * @generated
	 */
	UnitMultiplier getMultiplier();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see #getMultiplier()
	 * @generated
	 */
	void setMultiplier(UnitMultiplier value);

	/**
	 * Returns the value of the '<em><b>Default Value Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Data Type</em>' attribute.
	 * @see #setDefaultValueDataType(String)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_DefaultValueDataType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Numeric type to be expected for the associated IntervalBlock.value (e.g. unsignedInteger).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Numeric type to be expected for the associated IntervalBlock.value (e.g. unsignedInteger).'"
	 * @generated
	 */
	String getDefaultValueDataType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getDefaultValueDataType <em>Default Value Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Data Type</em>' attribute.
	 * @see #getDefaultValueDataType()
	 * @generated
	 */
	void setDefaultValueDataType(String value);

	/**
	 * Returns the value of the '<em><b>Reverse Chronology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Chronology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Chronology</em>' attribute.
	 * @see #setReverseChronology(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_ReverseChronology()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True for systems that must operate in \"reverse\" chronological order.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True for systems that must operate in \"reverse\" chronological order.'"
	 * @generated
	 */
	boolean isReverseChronology();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#isReverseChronology <em>Reverse Chronology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Chronology</em>' attribute.
	 * @see #isReverseChronology()
	 * @generated
	 */
	void setReverseChronology(boolean value);

	/**
	 * Returns the value of the '<em><b>Pending</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.Pending#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending</em>' reference.
	 * @see #setPending(Pending)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingType_Pending()
	 * @see gluemodel.CIM.IEC61968.Metering.Pending#getReadingType
	 * @model opposite="ReadingType"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pending conversion that produced this reading type.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pending conversion that produced this reading type.'"
	 * @generated
	 */
	Pending getPending();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getPending <em>Pending</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pending</em>' reference.
	 * @see #getPending()
	 * @generated
	 */
	void setPending(Pending value);

} // ReadingType
