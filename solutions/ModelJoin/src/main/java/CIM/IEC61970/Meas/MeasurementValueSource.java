/**
 */
package CIM.IEC61970.Meas;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Value Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getMeasurementValueSource()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='MeasurementValueSource describes the alternative sources updating a MeasurementValue. User conventions for how to use the MeasurementValueSource attributes are described in the introduction to IEC 61970-301.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='MeasurementValueSource describes the alternative sources updating a MeasurementValue. User conventions for how to use the MeasurementValueSource attributes are described in the introduction to IEC 61970-301.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='MeasurementValueSource describes the alternative sources updating a MeasurementValue. User conventions for how to use the MeasurementValueSource attributes are described in the introduction to IEC 61970-301.' Profile\040documentation='MeasurementValueSource describes the alternative sources updating a MeasurementValue. User conventions for how to use the MeasurementValueSource attributes are described in the introduction to IEC 61970-301.'"
 * @generated
 */
public interface MeasurementValueSource extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Measurement Values</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.MeasurementValue}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Values</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getMeasurementValueSource_MeasurementValues()
	 * @see CIM.IEC61970.Meas.MeasurementValue#getMeasurementValueSource
	 * @model opposite="MeasurementValueSource"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The MeasurementValues updated by the source'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The MeasurementValues updated by the source'"
	 * @generated
	 */
	EList<MeasurementValue> getMeasurementValues();

} // MeasurementValueSource
