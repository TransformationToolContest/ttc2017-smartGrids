/**
 */
package CIM.IEC61970.Meas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accumulator Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.AccumulatorLimitSet#getLimits <em>Limits</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getAccumulatorLimitSet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An AccumulatorLimitSet specifies a set of Limits that are associated with an Accumulator measurement.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An AccumulatorLimitSet specifies a set of Limits that are associated with an Accumulator measurement.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An AccumulatorLimitSet specifies a set of Limits that are associated with an Accumulator measurement.' Profile\040documentation='An AccumulatorLimitSet specifies a set of Limits that are associated with an Accumulator measurement.'"
 * @generated
 */
public interface AccumulatorLimitSet extends LimitSet {
	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.Accumulator}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.Accumulator#getLimitSets <em>Limit Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getAccumulatorLimitSet_Measurements()
	 * @see CIM.IEC61970.Meas.Accumulator#getLimitSets
	 * @model opposite="LimitSets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Measurements using the LimitSet.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Measurements using the LimitSet.'"
	 * @generated
	 */
	EList<Accumulator> getMeasurements();

	/**
	 * Returns the value of the '<em><b>Limits</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.AccumulatorLimit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.AccumulatorLimit#getLimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limits</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getAccumulatorLimitSet_Limits()
	 * @see CIM.IEC61970.Meas.AccumulatorLimit#getLimitSet
	 * @model opposite="LimitSet"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The limit values used for supervision of Measurements.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The limit values used for supervision of Measurements.'"
	 * @generated
	 */
	EList<AccumulatorLimit> getLimits();

} // AccumulatorLimitSet
