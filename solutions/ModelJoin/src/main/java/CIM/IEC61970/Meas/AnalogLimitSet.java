/**
 */
package CIM.IEC61970.Meas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.AnalogLimitSet#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.AnalogLimitSet#getLimits <em>Limits</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getAnalogLimitSet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An AnalogLimitSet specifies a set of Limits that are associated with an Analog measurement.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An AnalogLimitSet specifies a set of Limits that are associated with an Analog measurement.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An AnalogLimitSet specifies a set of Limits that are associated with an Analog measurement.' Profile\040documentation='An AnalogLimitSet specifies a set of Limits that are associated with an Analog measurement.'"
 * @generated
 */
public interface AnalogLimitSet extends LimitSet {
	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.Analog}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.Analog#getLimitSets <em>Limit Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalogLimitSet_Measurements()
	 * @see CIM.IEC61970.Meas.Analog#getLimitSets
	 * @model opposite="LimitSets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Measurements using the LimitSet.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Measurements using the LimitSet.'"
	 * @generated
	 */
	EList<Analog> getMeasurements();

	/**
	 * Returns the value of the '<em><b>Limits</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.AnalogLimit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.AnalogLimit#getLimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limits</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalogLimitSet_Limits()
	 * @see CIM.IEC61970.Meas.AnalogLimit#getLimitSet
	 * @model opposite="LimitSet"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The limit values used for supervision of Measurements.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The limit values used for supervision of Measurements.'"
	 * @generated
	 */
	EList<AnalogLimit> getLimits();

} // AnalogLimitSet
