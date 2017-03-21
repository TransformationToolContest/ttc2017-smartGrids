/**
 */
package CIM.IEC61970.Meas;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfAssets.ProcedureDataSet;

import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

import CIM.IEC61970.Informative.InfGMLSupport.GmlValue;

import CIM.IEC61970.SCADA.RemoteSource;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.MeasurementValue#getGmlValues <em>Gml Values</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.MeasurementValue#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.MeasurementValue#getErpPerson <em>Erp Person</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.MeasurementValue#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.MeasurementValue#getRemoteSource <em>Remote Source</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getMeasurementValue()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The current state for a measurement. A state value is an instance of a measurement from a specific source. Measurements can be associated with many state values, each representing a different source for the measurement.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The current state for a measurement. A state value is an instance of a measurement from a specific source. Measurements can be associated with many state values, each representing a different source for the measurement.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The current state for a measurement. A state value is an instance of a measurement from a specific source. Measurements can be associated with many state values, each representing a different source for the measurement.' Profile\040documentation='The current state for a measurement. A state value is an instance of a measurement from a specific source. Measurements can be associated with many state values, each representing a different source for the measurement.'"
 * @generated
 */
public interface MeasurementValue extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Gml Values</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getMeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Values</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getMeasurementValue_GmlValues()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getMeasurementValue
	 * @model opposite="MeasurementValue"
	 * @generated
	 */
	EList<GmlValue> getGmlValues();

	/**
	 * Returns the value of the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.ProcedureDataSet}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Data Sets</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getMeasurementValue_ProcedureDataSets()
	 * @see CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getMeasurementValues
	 * @model opposite="MeasurementValues"
	 * @generated
	 */
	EList<ProcedureDataSet> getProcedureDataSets();

	/**
	 * Returns the value of the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Accuracy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Accuracy</em>' attribute.
	 * @see #setSensorAccuracy(float)
	 * @see CIM.IEC61970.Meas.MeasPackage#getMeasurementValue_SensorAccuracy()
	 * @model dataType="CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The limit, expressed as a percentage of the sensor maximum, that errors will not exceed when the sensor is used under  reference conditions.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The limit, expressed as a percentage of the sensor maximum, that errors will not exceed when the sensor is used under  reference conditions.'"
	 * @generated
	 */
	float getSensorAccuracy();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Accuracy</em>' attribute.
	 * @see #getSensorAccuracy()
	 * @generated
	 */
	void setSensorAccuracy(float value);

	/**
	 * Returns the value of the '<em><b>Measurement Value Quality</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value Quality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value Quality</em>' reference.
	 * @see #setMeasurementValueQuality(MeasurementValueQuality)
	 * @see CIM.IEC61970.Meas.MeasPackage#getMeasurementValue_MeasurementValueQuality()
	 * @see CIM.IEC61970.Meas.MeasurementValueQuality#getMeasurementValue
	 * @model opposite="MeasurementValue"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A MeasurementValue has a MeasurementValueQuality associated with it.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A MeasurementValue has a MeasurementValueQuality associated with it.'"
	 * @generated
	 */
	MeasurementValueQuality getMeasurementValueQuality();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Value Quality</em>' reference.
	 * @see #getMeasurementValueQuality()
	 * @generated
	 */
	void setMeasurementValueQuality(MeasurementValueQuality value);

	/**
	 * Returns the value of the '<em><b>Erp Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person</em>' reference.
	 * @see #setErpPerson(ErpPerson)
	 * @see CIM.IEC61970.Meas.MeasPackage#getMeasurementValue_ErpPerson()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getMeasurementValues
	 * @model opposite="MeasurementValues"
	 * @generated
	 */
	ErpPerson getErpPerson();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.MeasurementValue#getErpPerson <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person</em>' reference.
	 * @see #getErpPerson()
	 * @generated
	 */
	void setErpPerson(ErpPerson value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see CIM.IEC61970.Meas.MeasPackage#getMeasurementValue_TimeStamp()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The time when the value was last updated'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time when the value was last updated'"
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.MeasurementValue#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Measurement Value Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value Source</em>' reference.
	 * @see #setMeasurementValueSource(MeasurementValueSource)
	 * @see CIM.IEC61970.Meas.MeasPackage#getMeasurementValue_MeasurementValueSource()
	 * @see CIM.IEC61970.Meas.MeasurementValueSource#getMeasurementValues
	 * @model opposite="MeasurementValues"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A reference to the type of source that updates the MeasurementValue, e.g. SCADA, CCLink, manual, etc. User conventions for the names of sources are contained in the introduction to IEC 61970-301.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reference to the type of source that updates the MeasurementValue, e.g. SCADA, CCLink, manual, etc. User conventions for the names of sources are contained in the introduction to IEC 61970-301.'"
	 * @generated
	 */
	MeasurementValueSource getMeasurementValueSource();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Value Source</em>' reference.
	 * @see #getMeasurementValueSource()
	 * @generated
	 */
	void setMeasurementValueSource(MeasurementValueSource value);

	/**
	 * Returns the value of the '<em><b>Remote Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.SCADA.RemoteSource#getMeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Source</em>' reference.
	 * @see #setRemoteSource(RemoteSource)
	 * @see CIM.IEC61970.Meas.MeasPackage#getMeasurementValue_RemoteSource()
	 * @see CIM.IEC61970.SCADA.RemoteSource#getMeasurementValue
	 * @model opposite="MeasurementValue"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Link to the physical telemetered point associated with this measurement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Link to the physical telemetered point associated with this measurement.'"
	 * @generated
	 */
	RemoteSource getRemoteSource();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.MeasurementValue#getRemoteSource <em>Remote Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Source</em>' reference.
	 * @see #getRemoteSource()
	 * @generated
	 */
	void setRemoteSource(RemoteSource value);

} // MeasurementValue
