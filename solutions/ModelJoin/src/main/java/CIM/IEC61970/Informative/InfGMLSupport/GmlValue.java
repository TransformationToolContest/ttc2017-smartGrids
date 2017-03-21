/**
 */
package CIM.IEC61970.Informative.InfGMLSupport;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Meas.MeasurementValue;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getGmlObservation <em>Gml Observation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlValue()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used for direct representation of values.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Used for direct representation of values.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used for direct representation of values.' Profile\040documentation='Used for direct representation of values.'"
 * @generated
 */
public interface GmlValue extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Gml Observation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlValues <em>Gml Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Observation</em>' reference.
	 * @see #setGmlObservation(GmlObservation)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlValue_GmlObservation()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlValues
	 * @model opposite="GmlValues"
	 * @generated
	 */
	GmlObservation getGmlObservation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getGmlObservation <em>Gml Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Observation</em>' reference.
	 * @see #getGmlObservation()
	 * @generated
	 */
	void setGmlObservation(GmlObservation value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlValue_DateTime()
	 * @model required="true"
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

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
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlValue_Value()
	 * @model dataType="CIM.IEC61970.Domain.FloatQuantity" required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Period</em>' attribute.
	 * @see #setTimePeriod(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlValue_TimePeriod()
	 * @model required="true"
	 * @generated
	 */
	String getTimePeriod();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getTimePeriod <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' attribute.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(String value);

	/**
	 * Returns the value of the '<em><b>Measurement Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.MeasurementValue#getGmlValues <em>Gml Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value</em>' reference.
	 * @see #setMeasurementValue(MeasurementValue)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlValue_MeasurementValue()
	 * @see CIM.IEC61970.Meas.MeasurementValue#getGmlValues
	 * @model opposite="GmlValues"
	 * @generated
	 */
	MeasurementValue getMeasurementValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getMeasurementValue <em>Measurement Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Value</em>' reference.
	 * @see #getMeasurementValue()
	 * @generated
	 */
	void setMeasurementValue(MeasurementValue value);

} // GmlValue
