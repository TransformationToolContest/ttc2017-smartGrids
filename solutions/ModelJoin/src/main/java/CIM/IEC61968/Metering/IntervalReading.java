/**
 */
package CIM.IEC61968.Metering;

import CIM.IEC61970.Meas.MeasurementValue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.IntervalReading#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.IntervalReading#getReadingQualities <em>Reading Qualities</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.IntervalReading#getIntervalBlocks <em>Interval Blocks</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Metering.MeteringPackage#getIntervalReading()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Data captured at regular intervals of time. Interval data could be captured as incremental data, absolute data, or relative data. The source for the data is usually a tariff quantity or an engineering quantity. Data is typically captured in time-tagged, uniform, fixed-length intervals of 5 min, 10 min, 15 min, 30 min, or 60 min.\nNote: Interval Data is sometimes also called \"Interval Data Readings\" (IDR).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Data captured at regular intervals of time. Interval data could be captured as incremental data, absolute data, or relative data. The source for the data is usually a tariff quantity or an engineering quantity. Data is typically captured in time-tagged, uniform, fixed-length intervals of 5 min, 10 min, 15 min, 30 min, or 60 min.\nNote: Interval Data is sometimes also called \"Interval Data Readings\" (IDR).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Data captured at regular intervals of time. Interval data could be captured as incremental data, absolute data, or relative data. The source for the data is usually a tariff quantity or an engineering quantity. Data is typically captured in time-tagged, uniform, fixed-length intervals of 5 min, 10 min, 15 min, 30 min, or 60 min.\nNote: Interval Data is sometimes also called \"Interval Data Readings\" (IDR).' Profile\040documentation='Data captured at regular intervals of time. Interval data could be captured as incremental data, absolute data, or relative data. The source for the data is usually a tariff quantity or an engineering quantity. Data is typically captured in time-tagged, uniform, fixed-length intervals of 5 min, 10 min, 15 min, 30 min, or 60 min.\nNote: Interval Data is sometimes also called \"Interval Data Readings\" (IDR).'"
 * @generated
 */
public interface IntervalReading extends MeasurementValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getIntervalReading_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value of this interval reading.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value of this interval reading.'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.IntervalReading#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Reading Qualities</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.ReadingQuality}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.ReadingQuality#getIntervalReading <em>Interval Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Qualities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Qualities</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getIntervalReading_ReadingQualities()
	 * @see CIM.IEC61968.Metering.ReadingQuality#getIntervalReading
	 * @model opposite="IntervalReading"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used only if quality of this interval reading value is different than \'Good\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used only if quality of this interval reading value is different than \'Good\'.'"
	 * @generated
	 */
	EList<ReadingQuality> getReadingQualities();

	/**
	 * Returns the value of the '<em><b>Interval Blocks</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.IntervalBlock}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.IntervalBlock#getIntervalReadings <em>Interval Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Blocks</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getIntervalReading_IntervalBlocks()
	 * @see CIM.IEC61968.Metering.IntervalBlock#getIntervalReadings
	 * @model opposite="IntervalReadings"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All blocks containing this interval reading.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All blocks containing this interval reading.'"
	 * @generated
	 */
	EList<IntervalBlock> getIntervalBlocks();

} // IntervalReading
