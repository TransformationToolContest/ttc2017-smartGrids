/**
 */
package CIM.IEC61968.Metering;

import CIM.IEC61970.Meas.MeasurementValue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.Reading#getEndDeviceAsset <em>End Device Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.Reading#getReadingQualities <em>Reading Qualities</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.Reading#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.Reading#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.Reading#getReadingType <em>Reading Type</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Metering.MeteringPackage#getReading()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specific value measured by a meter or other asset. Each Reading is associated with a specific ReadingType.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Specific value measured by a meter or other asset. Each Reading is associated with a specific ReadingType.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specific value measured by a meter or other asset. Each Reading is associated with a specific ReadingType.' Profile\040documentation='Specific value measured by a meter or other asset. Each Reading is associated with a specific ReadingType.'"
 * @generated
 */
public interface Reading extends MeasurementValue {
	/**
	 * Returns the value of the '<em><b>End Device Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.EndDeviceAsset#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Asset</em>' reference.
	 * @see #setEndDeviceAsset(EndDeviceAsset)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getReading_EndDeviceAsset()
	 * @see CIM.IEC61968.Metering.EndDeviceAsset#getReadings
	 * @model opposite="Readings"
	 * @generated
	 */
	EndDeviceAsset getEndDeviceAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.Reading#getEndDeviceAsset <em>End Device Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Device Asset</em>' reference.
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	void setEndDeviceAsset(EndDeviceAsset value);

	/**
	 * Returns the value of the '<em><b>Reading Qualities</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.ReadingQuality}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.ReadingQuality#getReading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Qualities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Qualities</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getReading_ReadingQualities()
	 * @see CIM.IEC61968.Metering.ReadingQuality#getReading
	 * @model opposite="Reading"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used only if quality of this reading value is different than \'Good\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used only if quality of this reading value is different than \'Good\'.'"
	 * @generated
	 */
	EList<ReadingQuality> getReadingQualities();

	/**
	 * Returns the value of the '<em><b>Meter Readings</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.MeterReading}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.MeterReading#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Readings</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getReading_MeterReadings()
	 * @see CIM.IEC61968.Metering.MeterReading#getReadings
	 * @model opposite="Readings"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All meter readings (sets of values) containing this reading value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All meter readings (sets of values) containing this reading value.'"
	 * @generated
	 */
	EList<MeterReading> getMeterReadings();

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
	 * @see CIM.IEC61968.Metering.MeteringPackage#getReading_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value of this reading.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value of this reading.'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.Reading#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Reading Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.ReadingType#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Type</em>' reference.
	 * @see #setReadingType(ReadingType)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getReading_ReadingType()
	 * @see CIM.IEC61968.Metering.ReadingType#getReadings
	 * @model opposite="Readings"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type information for this reading value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type information for this reading value.'"
	 * @generated
	 */
	ReadingType getReadingType();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.Reading#getReadingType <em>Reading Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading Type</em>' reference.
	 * @see #getReadingType()
	 * @generated
	 */
	void setReadingType(ReadingType value);

} // Reading
