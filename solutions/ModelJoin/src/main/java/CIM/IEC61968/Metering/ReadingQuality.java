/**
 */
package CIM.IEC61968.Metering;

import CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.ReadingQuality#getIntervalReading <em>Interval Reading</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ReadingQuality#getQuality <em>Quality</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.ReadingQuality#getReading <em>Reading</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Metering.MeteringPackage#getReadingQuality()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quality of a specific reading value or interval reading value. Note that more than one Quality may be applicable to a given Reading. Typically not used unless problems or unusual conditions occur (i.e., quality for each Reading is assumed to be \'Good\' unless stated otherwise in associated ReadingQuality).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Quality of a specific reading value or interval reading value. Note that more than one Quality may be applicable to a given Reading. Typically not used unless problems or unusual conditions occur (i.e., quality for each Reading is assumed to be \'Good\' unless stated otherwise in associated ReadingQuality).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quality of a specific reading value or interval reading value. Note that more than one Quality may be applicable to a given Reading. Typically not used unless problems or unusual conditions occur (i.e., quality for each Reading is assumed to be \'Good\' unless stated otherwise in associated ReadingQuality).' Profile\040documentation='Quality of a specific reading value or interval reading value. Note that more than one Quality may be applicable to a given Reading. Typically not used unless problems or unusual conditions occur (i.e., quality for each Reading is assumed to be \'Good\' unless stated otherwise in associated ReadingQuality).'"
 * @generated
 */
public interface ReadingQuality extends Element {
	/**
	 * Returns the value of the '<em><b>Interval Reading</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.IntervalReading#getReadingQualities <em>Reading Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Reading</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Reading</em>' reference.
	 * @see #setIntervalReading(IntervalReading)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getReadingQuality_IntervalReading()
	 * @see CIM.IEC61968.Metering.IntervalReading#getReadingQualities
	 * @model opposite="ReadingQualities"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Interval reading value to which this quality applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Interval reading value to which this quality applies.'"
	 * @generated
	 */
	IntervalReading getIntervalReading();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ReadingQuality#getIntervalReading <em>Interval Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Reading</em>' reference.
	 * @see #getIntervalReading()
	 * @generated
	 */
	void setIntervalReading(IntervalReading value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality</em>' attribute.
	 * @see #setQuality(String)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getReadingQuality_Quality()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quality, to be specified if different than \'Good\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quality, to be specified if different than \'Good\'.'"
	 * @generated
	 */
	String getQuality();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ReadingQuality#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality</em>' attribute.
	 * @see #getQuality()
	 * @generated
	 */
	void setQuality(String value);

	/**
	 * Returns the value of the '<em><b>Reading</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.Reading#getReadingQualities <em>Reading Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading</em>' reference.
	 * @see #setReading(Reading)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getReadingQuality_Reading()
	 * @see CIM.IEC61968.Metering.Reading#getReadingQualities
	 * @model opposite="ReadingQualities"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reading value to which this quality applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reading value to which this quality applies.'"
	 * @generated
	 */
	Reading getReading();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.ReadingQuality#getReading <em>Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading</em>' reference.
	 * @see #getReading()
	 * @generated
	 */
	void setReading(Reading value);

} // ReadingQuality
