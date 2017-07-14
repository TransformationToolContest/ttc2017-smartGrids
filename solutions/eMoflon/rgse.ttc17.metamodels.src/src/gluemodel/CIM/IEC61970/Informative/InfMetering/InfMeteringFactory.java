/**
 */
package gluemodel.CIM.IEC61970.Informative.InfMetering;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfMetering.InfMeteringPackage
 * @generated
 */
public interface InfMeteringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfMeteringFactory eINSTANCE = gluemodel.CIM.IEC61970.Informative.InfMetering.impl.InfMeteringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Water Metering Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water Metering Function</em>'.
	 * @generated
	 */
	WaterMeteringFunction createWaterMeteringFunction();

	/**
	 * Returns a new object of class '<em>Gas Metering Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gas Metering Function</em>'.
	 * @generated
	 */
	GasMeteringFunction createGasMeteringFunction();

	/**
	 * Returns a new object of class '<em>Metering Function Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metering Function Configuration</em>'.
	 * @generated
	 */
	MeteringFunctionConfiguration createMeteringFunctionConfiguration();

	/**
	 * Returns a new object of class '<em>Com Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Port</em>'.
	 * @generated
	 */
	ComPort createComPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfMeteringPackage getInfMeteringPackage();

} //InfMeteringFactory
