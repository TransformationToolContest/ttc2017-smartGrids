/**
 */
package CIM.IEC61970.Informative.InfMetering;

import CIM.IEC61968.Metering.ElectricMeteringFunction;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metering Function Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfMetering.MeteringFunctionConfiguration#getElectricMeteringFunctions <em>Electric Metering Functions</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfMetering.InfMeteringPackage#getMeteringFunctionConfiguration()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The configuration of data for a given meter function.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The configuration of data for a given meter function.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The configuration of data for a given meter function.' Profile\040documentation='The configuration of data for a given meter function.'"
 * @generated
 */
public interface MeteringFunctionConfiguration extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Electric Metering Functions</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.ElectricMeteringFunction}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.ElectricMeteringFunction#getMeteringFunctionConfiguration <em>Metering Function Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electric Metering Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electric Metering Functions</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfMetering.InfMeteringPackage#getMeteringFunctionConfiguration_ElectricMeteringFunctions()
	 * @see CIM.IEC61968.Metering.ElectricMeteringFunction#getMeteringFunctionConfiguration
	 * @model opposite="MeteringFunctionConfiguration"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All electric metering functions with this configuration.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All electric metering functions with this configuration.'"
	 * @generated
	 */
	EList<ElectricMeteringFunction> getElectricMeteringFunctions();

} // MeteringFunctionConfiguration
