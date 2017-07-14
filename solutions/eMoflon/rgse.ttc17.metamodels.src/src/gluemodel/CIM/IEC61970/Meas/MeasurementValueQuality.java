/**
 */
package gluemodel.CIM.IEC61970.Meas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Value Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurementValueQuality()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurement quality flags. Bits 0-10 are defined for substation automation in draft IEC 61850 part 7-3. Bits 11-15 are reserved for future expansion by that document. Bits 16-31 are reserved for EMS applications.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Measurement quality flags. Bits 0-10 are defined for substation automation in draft IEC 61850 part 7-3. Bits 11-15 are reserved for future expansion by that document. Bits 16-31 are reserved for EMS applications.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement quality flags. Bits 0-10 are defined for substation automation in draft IEC 61850 part 7-3. Bits 11-15 are reserved for future expansion by that document. Bits 16-31 are reserved for EMS applications.' Profile\040documentation='Measurement quality flags. Bits 0-10 are defined for substation automation in draft IEC 61850 part 7-3. Bits 11-15 are reserved for future expansion by that document. Bits 16-31 are reserved for EMS applications.'"
 * @generated
 */
public interface MeasurementValueQuality extends Quality61850 {
	/**
	 * Returns the value of the '<em><b>Measurement Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value</em>' reference.
	 * @see #setMeasurementValue(MeasurementValue)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getMeasurementValueQuality_MeasurementValue()
	 * @see gluemodel.CIM.IEC61970.Meas.MeasurementValue#getMeasurementValueQuality
	 * @model opposite="MeasurementValueQuality"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A MeasurementValue has a MeasurementValueQuality associated with it.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A MeasurementValue has a MeasurementValueQuality associated with it.'"
	 * @generated
	 */
	MeasurementValue getMeasurementValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Value</em>' reference.
	 * @see #getMeasurementValue()
	 * @generated
	 */
	void setMeasurementValue(MeasurementValue value);

} // MeasurementValueQuality
