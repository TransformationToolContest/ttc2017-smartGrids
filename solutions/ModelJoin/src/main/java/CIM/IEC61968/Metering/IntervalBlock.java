/**
 */
package CIM.IEC61968.Metering;

import CIM.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.IntervalBlock#getMeterReading <em>Meter Reading</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.IntervalBlock#getIntervalReadings <em>Interval Readings</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.IntervalBlock#getPending <em>Pending</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.IntervalBlock#getReadingType <em>Reading Type</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Metering.MeteringPackage#getIntervalBlock()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time sequence of Readings of the same ReadingType. Contained IntervalReadings may need conversion through the application of an offset and a scalar defined in associated Pending.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Time sequence of Readings of the same ReadingType. Contained IntervalReadings may need conversion through the application of an offset and a scalar defined in associated Pending.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time sequence of Readings of the same ReadingType. Contained IntervalReadings may need conversion through the application of an offset and a scalar defined in associated Pending.' Profile\040documentation='Time sequence of Readings of the same ReadingType. Contained IntervalReadings may need conversion through the application of an offset and a scalar defined in associated Pending.'"
 * @generated
 */
public interface IntervalBlock extends Element {
	/**
	 * Returns the value of the '<em><b>Meter Reading</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.MeterReading#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Reading</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Reading</em>' reference.
	 * @see #setMeterReading(MeterReading)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getIntervalBlock_MeterReading()
	 * @see CIM.IEC61968.Metering.MeterReading#getIntervalBlocks
	 * @model opposite="IntervalBlocks"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Meter reading containing this interval block.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Meter reading containing this interval block.'"
	 * @generated
	 */
	MeterReading getMeterReading();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.IntervalBlock#getMeterReading <em>Meter Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Reading</em>' reference.
	 * @see #getMeterReading()
	 * @generated
	 */
	void setMeterReading(MeterReading value);

	/**
	 * Returns the value of the '<em><b>Interval Readings</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.IntervalReading}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.IntervalReading#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Readings</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getIntervalBlock_IntervalReadings()
	 * @see CIM.IEC61968.Metering.IntervalReading#getIntervalBlocks
	 * @model opposite="IntervalBlocks"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Interval reading contained in this block.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Interval reading contained in this block.'"
	 * @generated
	 */
	EList<IntervalReading> getIntervalReadings();

	/**
	 * Returns the value of the '<em><b>Pending</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.Pending#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending</em>' reference.
	 * @see #setPending(Pending)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getIntervalBlock_Pending()
	 * @see CIM.IEC61968.Metering.Pending#getIntervalBlocks
	 * @model opposite="IntervalBlocks"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pending conversion to apply to interval reading values contained by this block (after which the resulting reading type is different than the original because it reflects the conversion result).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pending conversion to apply to interval reading values contained by this block (after which the resulting reading type is different than the original because it reflects the conversion result).'"
	 * @generated
	 */
	Pending getPending();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.IntervalBlock#getPending <em>Pending</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pending</em>' reference.
	 * @see #getPending()
	 * @generated
	 */
	void setPending(Pending value);

	/**
	 * Returns the value of the '<em><b>Reading Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.ReadingType#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Type</em>' reference.
	 * @see #setReadingType(ReadingType)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getIntervalBlock_ReadingType()
	 * @see CIM.IEC61968.Metering.ReadingType#getIntervalBlocks
	 * @model opposite="IntervalBlocks"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type information for interval reading values contained in this block.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type information for interval reading values contained in this block.'"
	 * @generated
	 */
	ReadingType getReadingType();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.IntervalBlock#getReadingType <em>Reading Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading Type</em>' reference.
	 * @see #getReadingType()
	 * @generated
	 */
	void setReadingType(ReadingType value);

} // IntervalBlock
