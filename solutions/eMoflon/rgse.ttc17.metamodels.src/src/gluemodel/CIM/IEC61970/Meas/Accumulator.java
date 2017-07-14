/**
 */
package gluemodel.CIM.IEC61970.Meas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accumulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Accumulator#getAccumulatorValues <em>Accumulator Values</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Accumulator#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Accumulator#getLimitSets <em>Limit Sets</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getAccumulator()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Accumulator represents a accumulated (counted) Measurement, e.g. an energy value.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Accumulator represents a accumulated (counted) Measurement, e.g. an energy value.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Accumulator represents a accumulated (counted) Measurement, e.g. an energy value.' Profile\040documentation='Accumulator represents a accumulated (counted) Measurement, e.g. an energy value.'"
 * @generated
 */
public interface Accumulator extends Measurement {
	/**
	 * Returns the value of the '<em><b>Accumulator Values</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.AccumulatorValue}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.AccumulatorValue#getAccumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accumulator Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accumulator Values</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getAccumulator_AccumulatorValues()
	 * @see gluemodel.CIM.IEC61970.Meas.AccumulatorValue#getAccumulator
	 * @model opposite="Accumulator"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The values connected to this measurement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The values connected to this measurement.'"
	 * @generated
	 */
	EList<AccumulatorValue> getAccumulatorValues();

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getAccumulator_MaxValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal value range maximum for any of the MeasurementValue.values. Used for scaling, e.g. in bar graphs or of telemetered raw values.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal value range maximum for any of the MeasurementValue.values. Used for scaling, e.g. in bar graphs or of telemetered raw values.'"
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Accumulator#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

	/**
	 * Returns the value of the '<em><b>Limit Sets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.AccumulatorLimitSet}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Sets</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getAccumulator_LimitSets()
	 * @see gluemodel.CIM.IEC61970.Meas.AccumulatorLimitSet#getMeasurements
	 * @model opposite="Measurements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A measurement may have zero or more limit ranges defined for it.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A measurement may have zero or more limit ranges defined for it.'"
	 * @generated
	 */
	EList<AccumulatorLimitSet> getLimitSets();

} // Accumulator
